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
	List<Message> getSpecifiedMessagesOfChatRoom(Integer firstRow, Integer numberOfRows, Integer chatRoomId);
	
	/**
	 * Select message by given id.
	 * 
	 * @param Integer id
	 * @return Message
	 */
	Message getById(Integer id);
	
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
