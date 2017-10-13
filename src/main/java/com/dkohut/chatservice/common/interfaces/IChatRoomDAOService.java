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
	 * Select chat rooms in given range, sorted by created_at column.
	 * 
	 * @param Integer firstRow
	 * @param Integer numberOfRows 
	 * @return List<ChatRoom>
	 */
	List<ChatRoom> selectSpecifiedNumberOfRows(Integer firstRow, Integer numberOfRows);
	
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
	 * @return ChatRoom
	 */
	ChatRoom create(ChatRoom chatRoom);
	
	/**
	 * Update existing chat room.
	 * 
	 * @param ChatRoom chatRoom
	 * @return ChatRoom
	 */
	ChatRoom update(ChatRoom chatRoom);
	
	/**
	 * Delete chat room with given id.
	 * 
	 * @param Integer id
	 * @return Boolean
	 */
	Boolean delete(Integer id);
	
}
