package com.dkohut.chatservice.common.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;



/**
 * This class controls activity with database connection.
 * 
 * @author Dmytro Kohut
 *
 */
public class ConnectionResource {

	private static final String URL = "jdbc:mysql://localhost:3306/chats";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	private static final Logger logger = Logger.getLogger(ConnectionResource.class);
	
	private static Connection connection;
	

	static {		
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		} catch(SQLException e) {
			logger.error(e);
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * Give created to database connection.
	 * 
	 * @return Connection
	 */
	public static Connection getConnection() {
		return ConnectionResource.connection;
	}
	
}
