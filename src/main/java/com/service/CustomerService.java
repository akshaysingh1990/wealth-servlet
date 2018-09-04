package com.service;

import java.sql.SQLException;

import java.util.Scanner;

import com.jdbc.AdvisorJdbc;
import com.jdbc.CustomerJdbc;
import com.model.Customer;
import com.model.Person;

public class CustomerService {
	
private Scanner scanner = new Scanner(System.in);
	
CustomerJdbc customerJdbc = new CustomerJdbc();

	public  void create(Customer customer) throws SQLException{
		
	
		
		
		customerJdbc.create(customer);
		customerJdbc.totalTransactionAmount(customer.getAdvisorId());



		
		
	}
	
	public	void delete(int id) throws SQLException{

		
		customerJdbc.delete(id);
		
	}
	
	
	public	void edit() throws SQLException{
		
		System.out.println("Enter Customer Id you want to edit");

		int id = scanner.nextInt();
		
		
		customerJdbc.edit(id);
		customerJdbc.getCustomerById(id);
		
		customerJdbc.totalTransactionAmount(customerJdbc.getCustomerById(id).getAdvisorId())
;

		
	}
	
	public	void view() throws SQLException{
		
		
		customerJdbc.view();
		
	}
	
	
	
	
	
	

}
