package PIMS3;

import java.sql.*;

public class PgsInterface {

	private Properties props = new Properties();
	private Connection db;
	private String url = "jdbc:postgresql://localhost/test";

	PgsInterface() {
		// set default properties
		PgsInterface("default", "123456");
	}

	PgsInterface(String user) {
		// set default properties
		PgsInterface(user, "123456");
	}

	PgsInterface(String user, String pass) {
		// set custom properties
		props.setProperty("user", user);
		props.setProperty("password", pass);
		props.setProperty("ssl", "true");
		props.setProperty("ApplicationName", "PIMS3")

		// load postgres driver
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("Postgresql Java driver missing!");
	  		System.exit(1);
	  	}
	  
	}
	
	private void updateDB(String region) {

		// ask the server for a fresh copy of the DB for our region

	}

}