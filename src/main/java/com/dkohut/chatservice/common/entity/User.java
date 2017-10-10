package com.dkohut.chatservice.common.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.dkohut.chatservice.common.interfaces.EntityCreator;

/**
 * 
 * @author Dmytro Kohut
 *
 */
public class User implements EntityCreator {

	private Integer id;
	private String name;
	private String login;
	private String password;
	private String email;
	
	/**
	 * This constructor will be used when receiving an object from HTTP-request.
	 */
	public User() {
		// default constructor
	}	

	/**
	 * @see com.dkohut.chatservice.common.interfaces.EntityCreator#fillFields(ResultSet)
	 */
	@Override
	public void fillFields(ResultSet resultSet) throws SQLException {
		this.id = resultSet.getInt("id");
		this.name = resultSet.getString("name");
		this.login = resultSet.getString("login");
		this.password = resultSet.getString("password");
		this.email = resultSet.getString("email");		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
