package com.dkohut.chatservice.common.entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 * 
 * @author Dmytro Kohut
 *
 */
public class ChatRoom {
	
	private Integer id;
	private String name;
	private Timestamp createdAt;
	
	/**
	 * This constructor will be used when receiving an object from HTTP-request. 
	 */
	public ChatRoom() {
		// default constructor
	}
	
	/**
	 * This constructor will be using in static method.
	 */
	public ChatRoom(Integer id, String name, Timestamp createdAt) {
		this.id = id;
		this.name = name;
		this.createdAt = createdAt;
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

	public String getCreatedAt() {
		return createdAt.toString();
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = Timestamp.valueOf(createdAt);
	}	
	
	/**
	 * Create new object using ResultSet for filling fields.
	 * 
	 * @param ResultSet resultSet
	 * @return ChatRoom
	 * @throws SQLException 
	 */
	public static ChatRoom getChatRoom(ResultSet resultSet) throws SQLException {
		return new ChatRoom(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getTimestamp("created_at"));
	}
	
}
