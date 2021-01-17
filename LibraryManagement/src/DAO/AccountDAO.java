package DAO;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import DTO.AccountDTO;
public class AccountDAO {
		//add
		public static int addAccount(AccountDTO a) {
			int result = 0;
			Connection conn;
			try {
				conn = ConnectionUtils.getConnection();
				String sqlInsert = "INSERT INTO Account (MemberID, AccountName, Password) "
	                    + " VALUES (N'"+a.getMemberID()+"', N'"+a.getAccountName()+"', N'"+a.getPassword()+"')";
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
		public static int updateAccount(int id,AccountDTO a) {
			int result = 0;
			Connection conn;
			PreparedStatement ps;
			try {
				conn = ConnectionUtils.getConnection();
				ps = conn.prepareStatement("UPDATE Account SET MemberID = ?, AccountName = ?, Password = ? WHERE Id = ?");
				ps.setInt(1, a.getMemberID());
				ps.setString(2, a.getAccountName());
				ps.setString(3, a.getPassword());
				ps.setInt(4, id);
				result = ps.executeUpdate();
				conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return result;
		}
		//show AccountList
		public static ArrayList<AccountDTO> getAccountList(){
			Connection conn;
			PreparedStatement ps;
			ResultSet r;
			ArrayList<AccountDTO> AccountList = new ArrayList<AccountDTO>();
			try {
				String query = "SELECT * FROM Account,Member WHERE Account.MemberID = Member.Id";
				conn = ConnectionUtils.getConnection();
				ps = conn.prepareStatement(query);
				r = ps.executeQuery();
				AccountDTO p;
				while(r.next()) {
					p = new AccountDTO(r.getInt("Id"), r.getInt("MemberID"), r.getString("MemberName"), r.getString("AccountName"), r.getString("Password"));
					AccountList.add(p);
				}
				conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return AccountList;
		} 
		//Load data into combobox
		public static JComboBox loadMemberIDToCmb() {
			JComboBox cmb = null;
			Connection conn;
			PreparedStatement ps;
			ResultSet r;
			try {
				String query = "SELECT Id FROM Member";
				conn = ConnectionUtils.getConnection();
				ps = conn.prepareStatement(query);
				r = ps.executeQuery();
				while(r.next()) {
					String id = r.getString("MemberID");
					cmb.addItem(id);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return cmb;
		}
		//load data into textfield
		public static String loadMemberNameToTxt(JComboBox cmb) {
			String t = null;
			Connection conn;
			PreparedStatement ps;
			ResultSet r;
			int id = Integer.parseInt(cmb.getSelectedObjects().toString());
			try {
				String query = "SELECT MemberName FROM Member WHERE Id="+id;
				conn = ConnectionUtils.getConnection();
				ps = conn.prepareStatement(query);
				r = ps.executeQuery();
				if(r.next()) {
					String memberName = r.getString("MemberName");
					t = memberName;
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return t;
		}
}
