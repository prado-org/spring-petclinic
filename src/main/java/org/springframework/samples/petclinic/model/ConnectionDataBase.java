package org.springframework.samples.petclinic.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDataBase {

	private static final String URL = "jdbc:mysql://localhost:3306/petclinic";

	private static final String USER = "leandro";

	private static final String PASSWORD = "#P@ssw0rd1234#";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

	public static void main(String[] args) {
		try (Connection connection = getConnection()) {
			if (connection != null) {
				System.out.println("Connected to the database!");
			}
			else {
				System.out.println("Failed to make connection!");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}