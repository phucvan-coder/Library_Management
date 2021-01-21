package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Static {
	public static Connection getConnection() {
		int result = 0;
		Connection conn;
		try {
			conn = ConnectionUtils.getConnection();
    		String query = "select BorrowDate,NumberOfBook from Book";
			java.sql.Statement st = conn.createStatement();
			result = st.executeUpdate(query);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
