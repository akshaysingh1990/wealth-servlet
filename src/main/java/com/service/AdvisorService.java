package com.service;

import java.sql.SQLException;

import java.util.Scanner;

import com.jdbc.AdvisorJdbc;
import com.model.Advisor;
import com.model.Person;

public class AdvisorService {

	private Scanner scanner = new Scanner(System.in);

	// public void create(Advisor advisor) throws SQLException {
	//
	// AdvisorJdbc advisorJdbc = new AdvisorJdbc();
	//
	// advisorJdbc.create(advisor);
	//
	// }

	public void delete(int id) throws SQLException {

		

		AdvisorJdbc advisorJdbc = new AdvisorJdbc();

		advisorJdbc.delete(id);

	}

	public void edit() throws SQLException {

		System.out.println("Enter Advisor Id you want to edit");

		int id = scanner.nextInt();

		AdvisorJdbc advisorJdbc = new AdvisorJdbc();

		advisorJdbc.edit(id);

		// System.out.println("Press 1 to change advisor name OR");
		// System.out.println("Press 2 to change advisor age ");
		// int option = scanner

	}

	public void view() throws SQLException {
		AdvisorJdbc advisorJdbc = new AdvisorJdbc();

		advisorJdbc.view();

	}

	public void create(Advisor advisor) throws SQLException {
		// TODO Auto-generated method stub

		AdvisorJdbc advisorJdbc = new AdvisorJdbc();
		advisorJdbc.create(advisor);
	}

}
