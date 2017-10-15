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
	 * This constructor will be using in static method.
	 */
	public Message(Integer id, Integer chatRoomId, Integer userId, String message, Timestamp createdAt) {
		this.id = id;
		this.chatRoomId = chatRoomId;
		this.userId = userId;
		this.message = message;
		this.createdAt = createdAt;
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
	
	/**
	 * Create new object using ResultSet for filling fields.
	 * 
	 * @param ResultSet resultSet
	 * @return Message
	 * @throws SQLException 
	 */
	public static Message getMessage(ResultSet resultSet) throws SQLException {
		return new Message(resultSet.getInt("id"), resultSet.getInt("chat_room_id"), resultSet.getInt("user_id"),
				resultSet.getString("message"), resultSet.getTimestamp("created_at"));
	}
	
}
