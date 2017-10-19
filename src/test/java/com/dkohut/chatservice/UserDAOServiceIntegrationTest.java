package com.dkohut.chatservice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dkohut.chatservice.common.entity.User;
import com.dkohut.chatservice.common.interfaces.IUserDAOService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDAOServiceIntegrationTest {

	@Autowired
	private IUserDAOService userDAOService;
		
	
	/**
	 * Selecting user from DB for testing.
	 */
	@Test
	public void getByIdTest() {
		
		User returnedUser = userDAOService.getById(4);
		
		assertThat(returnedUser).as("Whethe object is not null").isNotNull();
		assertThat(returnedUser.getId()).as("Whether if field of object is not null").isNotNull();
		assertThat(returnedUser.getName()).as("Whether name field of object is not null").isNotNull();
		assertThat(returnedUser.getLogin()).as("Whether name login of object is not null").isNotNull();
		assertThat(returnedUser.getPassword()).as("Whether password field of object is not null").isNotNull();
		assertThat(returnedUser.getEmail()).as("Whether email field of object is not null").isNotNull();	
	}
	
	
	/**
	 * Creation user in DB for testing.
	 */
	@Test
	public void createTest() {
		
		User user = new User();
		
		user.setName("Test Name");
		user.setLogin("Test Login");
		user.setPassword("Test Password");
		user.setEmail("test.example@mail.com");
		
		User returnedUser = userDAOService.create(user);
		
		assertThat(returnedUser).as("Whether object is not null").isNotNull();
		assertThat(returnedUser.getId()).as("Whether id field of object is not null").isNotNull();
		assertThat(returnedUser.getName()).as("Whether name field of object is not null").isNotNull();
		assertThat(returnedUser.getLogin()).as("Whether login field of object is not null").isNotNull();
		assertThat(returnedUser.getPassword()).as("Whether password field of object is not null").isNotNull();
		assertThat(returnedUser.getEmail()).as("Whether email field of object is not null").isNotNull();		
	}
	
	
	/**
	 * Updating info about user in DB for testing.
	 */
	@Test
	public void updateTest() {
		
		User user = new User();
		
		user.setId(4);
		user.setName("Updated Test Name");
		user.setLogin("Updated Test Login");
		user.setPassword("Updated Test Password");
		user.setEmail("test.updated@mail.com");
		
		User returnedUser = userDAOService.update(user);
		
		assertThat(returnedUser).as("Whether object is not null").isNotNull();
		assertThat(returnedUser.getId()).as("Whether id field of object is not null").isNotNull();
		assertThat(returnedUser.getName()).as("Whether name field of object is not null").isNotNull();
		assertThat(returnedUser.getLogin()).as("Whether login field of object is not null").isNotNull();
		assertThat(returnedUser.getPassword()).as("Whether password field of object is not null").isNotNull();
		assertThat(returnedUser.getEmail()).as("Whether email field of object is not null").isNotNull();
	}
	
	
	/**
	 * Deleting user in database for testing.
	 */
	@Test
	public void deleteTest() {
		
		Boolean response = userDAOService.delete(9	);
		assertThat(response).as("Whether user was deleted").isTrue();
	}
	
}
