package com.dkohut.chatservice.common.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Dmytro Kohut
 *
 */
public class User {

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
	 * This constructor will be using in static method.
	 */
	public User(Integer id, String name, String login, String password, String email) {
		this.id = id;
		this.name = name;
		this.login = login;
		this.password = password;
		this.email = email;
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
	
	/**
	 * Create new object using ResultSet for filling fields.
	 * 
	 * @param ResultSet resultSet
	 * @return User
	 * @throws SQLException 
	 */
	public static User getUser(ResultSet resultSet) throws SQLException {
		return new User(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("login"), 
				resultSet.getString("password"), resultSet.getString("email"));
	}
	
}
