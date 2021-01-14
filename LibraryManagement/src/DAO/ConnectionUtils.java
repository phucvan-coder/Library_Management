package DAO;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionUtils {
	public static Connection getConnection() {
		try {
			String instace = "MISASME2017";
			String database = "LibraryManagement";
			String userName = "sa";
			String password = "123";
			String connectionURL = "jdbc:sqlserver://localhost;databaseName=" + database + ";instance=" + instace + ";user=" + userName + ";password=" + password;
			Connection conn = DriverManager.getConnection(connectionURL);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
