package DAO;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DTO.AccountDTO;
public class DangNhapDAO {
	//Check Account
	public static int checkAccount(AccountDTO user) {
		int result = 0;
		Connection conn;
		PreparedStatement ps;
		ResultSet r;
		try {
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement("SELECT AccountName, Password FROM Account WHERE AccountName = ? AND Password = ?");
			ps.setString(3, user.getAccountName());
			ps.setString(4, user.getPassword());
			r = ps.executeQuery();
			if(r.next()) {
				result = 1;
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	//Check Rank
	public static int checkRank(AccountDTO user) {
		int result = 0;
		Connection conn;
		PreparedStatement ps;
		ResultSet r;
		try {
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement("SELECT AccountName, Password,  FROM Account, Member WHERE AccountName = ? AND Password = ? AND Rank = ?");
			ps.setString(1, user.getAccountName());
			ps.setString(2, user.getPassword());
			ps.setString(3, "Thủ Thư");
			r = ps.executeQuery();
			if(r.next()) {
				result = 1;
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
