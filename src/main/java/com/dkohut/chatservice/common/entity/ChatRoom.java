package com.dkohut.chatservice.common.entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.dkohut.chatservice.common.interfaces.EntityCreator;

/**
 * 
 * @author Dmytro Kohut
 *
 */
public class ChatRoom implements EntityCreator {
	
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
	 * @see com.dkohut.chatservice.common.interfaces.EntityCreator#fillFields(ResultSet)
	 */
	@Override
	public void fillFields(ResultSet resultSet) throws SQLException {
		this.id = resultSet.getInt("id");
		this.name = resultSet.getString("name");
		this.createdAt = resultSet.getTimestamp("created_at");
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
	
}
