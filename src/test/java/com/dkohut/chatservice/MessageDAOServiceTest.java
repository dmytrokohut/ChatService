package com.dkohut.chatservice;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dkohut.chatservice.common.entity.Message;
import com.dkohut.chatservice.common.interfaces.IMessageDAOService;

/**
 * 
 * @author Dmytro Kohut
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageDAOServiceTest {

	@Autowired
	private IMessageDAOService messageDAOService;
	
	
	/**
	 * Selecting messages from DB for testing.
	 */
	@Test
	public void getSpecifiedMessagesOfChatRoomTest() {
		
		List<Message> listOfMessages = messageDAOService.getSpecifiedMessagesOfChatRoom(1, 5, 2);
		
		assertThat(listOfMessages).as("Whether list is not null").isNotNull();
		assertThat(listOfMessages).as("Whether list is not empty").isNotEmpty();
	}
	
	
	/**
	 * Selecting message by id for testing.
	 */
	@Test
	public void getByIdTest() {
		
		Message messageCaseThree = messageDAOService.getById(3);
		
		assertThat(messageCaseThree).as("Whether message is not null").isNotNull();
		assertThat(messageCaseThree.getId()).as("Whether id field of message is not null").isNotNull();
		assertThat(messageCaseThree.getChatRoomId()).as("Whether chatRoomId field of message is not null").isNotNull();
		assertThat(messageCaseThree.getUserId()).as("Whether userId field of message is not null").isNotNull();
		assertThat(messageCaseThree.getMessage()).as("Whether message field of message is not null").isNotNull();
		assertThat(messageCaseThree.getCreatedAt()).as("Whether createdAt field of message is not null").isNotNull();
	}
	
	
	/**
	 * Creation message for testing.
	 */
	@Test
	public void createTest() {
		
		Message message = new Message();
		
		message.setChatRoomId(6);
		message.setUserId(5);
		message.setMessage("Test Message. Test Content Of Message");
		
		Message returnedMessage = messageDAOService.create(message);
		
		assertThat(returnedMessage).as("Whether message is not null").isNotNull();		
		assertThat(returnedMessage.getId()).as("Whether id field of message is not null").isNotNull();
		assertThat(returnedMessage.getChatRoomId()).as("Whether chatRoomId field of message is not null").isNotNull();
		assertThat(returnedMessage.getUserId()).as("Whether userId field of message is not null").isNotNull();
		assertThat(returnedMessage.getMessage()).as("Whether message field of message is not null").isNotNull();
		assertThat(returnedMessage.getCreatedAt()).as("Whether createdAt field of message is not null").isNotNull();		
	}
	
	
	/**
	 * Delete message for testing.
	 */
	@Test
	public void deleteTest() {
		
		Boolean response = messageDAOService.delete(4);		
		assertThat(response).as("Whether message was deleted").isTrue();
	}
	
}
