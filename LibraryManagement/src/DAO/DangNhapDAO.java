package DAO;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JLabel;
import javax.swing.JTextField;

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
			ps.setString(1, user.getAccountName());
			ps.setString(2, user.getPassword());
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
	//get user info
	public static void getUserInfo(AccountDTO user,JLabel l1,JLabel l2) {
		Connection conn;
		PreparedStatement ps;
		ResultSet r;
		try {
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement("SELECT MemberName, Rank FROM Account, Member WHERE AccountName = ? AND Password = ? AND MemberID = Member.Id");
			ps.setString(1, user.getAccountName());
			ps.setString(2, user.getPassword());
			r = ps.executeQuery();
			if(r.next()) {
				l1.setText(r.getString("MemberName"));
				l2.setText(r.getString("Rank"));
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
