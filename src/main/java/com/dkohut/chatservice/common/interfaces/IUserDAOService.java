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
	User select(Integer id);
	
	/**
	 * Create new user.
	 * 
	 * @param User user
	 * @return Integer
	 */
	Integer create(User user);
	
	/**
	 * Update existing user.
	 * 
	 * @param User user
	 * @return String
	 */
	String update(User user);
	
	/**
	 * Delete user with given id.
	 * 
	 * @param Integer id
	 * @return String
	 */
	String delete(Integer id);
	
}
