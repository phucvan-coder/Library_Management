package DAO;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DTO.AccountDTO;
import DTO.PublisherDTO;
public class AccountDAO {
		//add
		public static int addAccount(AccountDTO a) {
			int result = 0;
			Connection conn;
			try {
				conn = ConnectionUtils.getConnection();
				String sqlInsert = "INSERT INTO Publisher (MemberID, AccountName, Password) "
	                    + " VALUES (N'"+a.getMemberID()+"', N'"+a.getAccountName()+"', "+a.getPassword()+")";
				java.sql.Statement st = conn.createStatement();
				result = st.executeUpdate(sqlInsert);
				conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return result;
		}
		//delete
		public static int deleteAccount(int id) {
			int result = 0;
			Connection conn;
			PreparedStatement ps;
			try {
				conn = ConnectionUtils.getConnection();
				ps = conn.prepareStatement("DELETE FROM Account WHERE Id = ?");
				ps.setInt(1, id);
				result = ps.executeUpdate();
				conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return result;
		}
		//update
		public static int updateAccount(AccountDTO a) {
			int result = 0;
			Connection conn;
			PreparedStatement ps;
			try {
				conn = ConnectionUtils.getConnection();
				ps = conn.prepareStatement("UPDATE Publisher SET MemberID = ?, AccountName = ?, Password = ? WHERE Id = ?");
				ps.setInt(1, a.getMemberID());
				ps.setString(2, a.getAccountName());
				ps.setString(3, a.getPassword());
				ps.setInt(4, a.getId());
				result = ps.executeUpdate();
				conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return result;
		}
		//show PublisherList
		public static ArrayList<AccountDTO> getAccountList(){
			Connection conn;
			PreparedStatement ps;
			ResultSet r;
			ArrayList<AccountDTO> AccountList = new ArrayList<AccountDTO>();
			try {
				String query = "SELECT * FROM Account";
				conn = ConnectionUtils.getConnection();
				ps = conn.prepareStatement(query);
				r = ps.executeQuery();
				AccountDTO p;
				while(r.next()) {
					p = new AccountDTO(r.getInt("Id"), r.getInt("MemberID"), r.getString("AccountName"), r.getString("Password"));
					AccountList.add(p);
				}
				int result = AccountList.size();
				if(result>0) {
					return AccountList;
				}
				conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
}
