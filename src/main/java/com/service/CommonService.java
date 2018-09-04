package com.service;

import java.sql.SQLException;

import com.model.Person;

public interface CommonService {
	
	
	
	
	 <T extends Person> void create(T person) throws SQLException;
	
	void delete() throws SQLException;
	
	void edit() throws SQLException;
	
	void view() throws SQLException;
	
	
	
	
	

}
