package com.dkohut.chatservice.common.entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 * 
 * @author Dmytro Kohut
 *
 */
public class Message {

	private Integer id;
	private Integer chatRoomId;
	private Integer userId;
	private String message;
	private Timestamp createdAt;
	
	/**
	 * This constructor will be used when receiving an object from HTTP-request.
	 */
	public Message() {
		// default constructor
	}
	
	/**
	 * This constructor will be used in DAO methods.
	 * 
	 * @param ResultSet resultSet
	 * @throws SQLException 
	 */
	public Message(ResultSet resultSet) throws SQLException {
		this.id = resultSet.getInt("id");
		this.chatRoomId = resultSet.getInt("chat_room_id");
		this.userId = resultSet.getInt("user_id");
		this.message = resultSet.getString("message");
		this.createdAt = resultSet.getTimestamp("created_at");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getChatRoomId() {
		return chatRoomId;
	}

	public void setChatRoomId(Integer chatRoomId) {
		this.chatRoomId = chatRoomId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCreatedAt() {
		return createdAt.toString();
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = Timestamp.valueOf(createdAt);
	}
	
}
