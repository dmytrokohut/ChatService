package com.dkohut.chatservice.common.interfaces;

import java.util.List;

import com.dkohut.chatservice.common.entity.ChatRoom;

/**
 * 
 * @author Dmytro Kohut
 *
 */
public interface IChatRoomDAOService {

	/**
	 * Select chat rooms in given range.
	 * 
	 * @param Integer firstRow
	 * @param Integer numberOfRows 
	 * @return List<ChatRoom>
	 */
	List<ChatRoom> selectInRange(Integer firstRow, Integer numberOfRows);
	
	/**
	 * Select chat room with given id.
	 * 
	 * @param Integer id 
	 * @return ChatRoom
	 */
	ChatRoom selectById(Integer id);
	
	/**
	 * Create new chat room.
	 * 
	 * @param ChatRoom chatRoom
	 * @return Integer
	 */
	Integer create(ChatRoom chatRoom);
	
	/**
	 * Update existing chat room.
	 * 
	 * @param ChatRoom chatRoom
	 * @return String
	 */
	String update(ChatRoom chatRoom);
	
	/**
	 * Delete chat room.
	 * 
	 * @param Integer id
	 * @return String
	 */
	String delete(Integer id);
	
}
