package com.dkohut.chatservice;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dkohut.chatservice.common.entity.ChatRoom;
import com.dkohut.chatservice.common.interfaces.IChatRoomDAOService;

/**
 * 
 * @author Dmytro Kohut
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ChatRoomDAOServiceIntegrationTest {

	@Autowired
	private IChatRoomDAOService chatRoomDAOService;
	
		
	/**
	 * Selecting of list of chat rooms from DB for testing.
	 */
	@Test
	public void getSpecifiedNumberOfRowsTest() {
		
		List<ChatRoom> listOfChatRoomsCaseOne = chatRoomDAOService.getSpecifiedNumberOfRows(0, 100);
		List<ChatRoom> listOfChatRoomsCaseTwo = chatRoomDAOService.getSpecifiedNumberOfRows(10, 10);
		
		assertThat(listOfChatRoomsCaseOne).as("Whether list is not null").isNotNull();
		assertThat(listOfChatRoomsCaseOne).as("Whether list is not empty").isNotEmpty();
		
		assertThat(listOfChatRoomsCaseTwo).as("Whether list is not null").isNotNull();		
		assertThat(listOfChatRoomsCaseTwo).as("Whether list is not empty").isNotEmpty();
	}
	
	
	/**
	 * Selecting of chat room for testing.
	 */
	@Test
	public void getByIdTest() {
		
		ChatRoom chatRoom = chatRoomDAOService.getById(15);
		
		assertThat(chatRoom).as("Whether object is not null").isNotNull();
		assertThat(chatRoom.getId()).as("Whether id field of object is not null").isNotNull();
		assertThat(chatRoom.getName()).as("Whether name field of object is not null").isNotNull();
		assertThat(chatRoom.getCreatedAt()).as("Whether createdAt field of object is not null").isNotNull();
	}
	
	
	/**
	 * Creation of chat room in DB for testing.
	 */
	@Test
	public void createTest() {
		
		ChatRoom chatRoomCaseOne = chatRoomDAOService.create("Test Name");
		
		assertThat(chatRoomCaseOne).as("Whether object is not null").isNotNull();
		assertThat(chatRoomCaseOne).as("Whether name field of object is not null").isNotNull();
		assertThat(chatRoomCaseOne).as("Whether id field of object is not null").isNotNull();
		assertThat(chatRoomCaseOne).as("Whether createdAt field of object is not null").isNotNull();
	}
	
	
	/**
	 * Updating of chat room for testing.
	 */
	@Test
	public void updateTest() {
		
		ChatRoom chatRoom = new ChatRoom();
		
		chatRoom.setId(13);
		chatRoom.setName("Updated Name");
		ChatRoom returnedChatRoom = chatRoomDAOService.update(chatRoom);
		
		assertThat(returnedChatRoom).as("Whether object is not null").isNotNull();
		assertThat(returnedChatRoom.getId()).as("Whether id field of object is not null").isNotNull();
		assertThat(returnedChatRoom.getName()).as("Whether name field of object is not null").isNotNull();
		assertThat(returnedChatRoom.getCreatedAt()).as("Whether createdAt field of object is not null").isNotNull();		
	}
	
	
	/**
	 * Deleting of chat room for testing.
	 */
	@Test
	public void deleteTest() {
		
		Boolean response = chatRoomDAOService.delete(7);
		assertThat(response).as("Whether object was deleted").isTrue();
	}
	
}
