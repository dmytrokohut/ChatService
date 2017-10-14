package com.dkohut.chatservice.common.interfaces;

import com.dkohut.chatservice.common.entity.User;

/**
 * 
 * @author Dmytro Kohut
 *
 */
public interface IUserDAOService {

	/**
	 * Select user by given id.
	 * 
	 * @param Integer id
	 * @return User
	 */
	User getById(Integer id);
	
	/**
	 * Create new user.
	 * 
	 * @param User user
	 * @return Integer
	 */
	User create(User user);
	
	/**
	 * Update existing user.
	 * 
	 * @param User user
	 * @return String
	 */
	User update(User user);
	
	/**
	 * Delete user with given id.
	 * 
	 * @param Integer id
	 * @return String
	 */
	Boolean delete(Integer id);
	
}
