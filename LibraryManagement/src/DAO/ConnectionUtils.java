package DAO;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionUtils {
	public static Connection getConnection() {
		try {
			String instance = "SQLEXPRESS";
			String database = "LibraryManagement";
			String userName = "sa";
			String password = "123";
			String connectionURL = "jdbc:sqlserver://localhost;databaseName=" + database + ";instance=" + instance + ";user=" + userName + ";password=" + password;
			Connection conn = DriverManager.getConnection(connectionURL);
			return conn;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
