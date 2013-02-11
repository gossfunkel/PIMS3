package PIMS3;

import java.sql.*;

public class MainClient {

	MainClient() {

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