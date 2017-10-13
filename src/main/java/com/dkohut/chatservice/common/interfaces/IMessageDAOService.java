package com.dkohut.chatservice.common.interfaces;

import java.util.List;

import com.dkohut.chatservice.common.entity.Message;

/**
 * 
 * @author Dmytro Kohut
 *
 */
public interface IMessageDAOService {

	/**
	 * Select messages of one chat in given range, sorted by created_at column.
	 * 
	 * @param Integer firstRow
	 * @param Integer numberOfRows
	 * @param Integer chatRoomId
	 * @return List<Messages> 
	 */
	List<Message> selectSpecifiedMessagesOfChatRoom(Integer firstRow, Integer numberOfRows, Integer chatRoomId);
	
	/**
	 * Create new message.
	 * 
	 * @param Message message
	 * @return Message
	 */
	Message create(Message message);
	
	/**
	 * Delete existing message.
	 * 
	 * @param Integer id
	 * @return Boolean
	 */
	Boolean delete(Integer id);
	
}
