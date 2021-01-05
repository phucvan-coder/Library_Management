package DAO;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtils {
	public static Connection getConnection() {
		try {
			String instace = "SQLEXPRESS";
			String database = "LibraryManagement";
			String userName = "sa";
			String password = "java";
			String connectionURL = "jdbc:sqlserver://localhost;databaseName=" + database + ";instance=" + instace + ";user=" + userName + ";password=" + password;
			Connection conn = DriverManager.getConnection(connectionURL);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
