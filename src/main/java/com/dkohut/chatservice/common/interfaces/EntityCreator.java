package com.dkohut.chatservice.common.interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface EntityCreator {

		/**
		 * This method fill fields inside classes
		 * 
		 * @param resultSet
		 * @throws SQLException 
		 */
		void fillFields(ResultSet resultSet) throws SQLException;
}
