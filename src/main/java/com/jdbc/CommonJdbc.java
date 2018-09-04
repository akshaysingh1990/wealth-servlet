package com.jdbc;

import java.sql.Connection;

import com.connection.ConnectionManager;

public class CommonJdbc  {
	
	ConnectionManager connectionManager = new ConnectionManager();
	
	Connection connection = connectionManager.getConnectiond();
	
	
	
	

}
