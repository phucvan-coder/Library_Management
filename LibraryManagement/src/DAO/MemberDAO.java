package DAO;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import DTO.MemberDTO;
public class MemberDAO {
	//add
		public static int addMember(MemberDTO a) {
			int result = 0;
			Connection conn;
			try {
				String date = (new SimpleDateFormat("dd-MM-yyyy")).format(a.getBirthday());
				conn = ConnectionUtils.getConnection();
				String sqlInsert = "INSERT INTO Member (MemberName, Birthday, Gender, PhoneNumber, Rank) "
	                    + " VALUES (N'"+a.getMemberName()+"', '"+date+"', N'"+a.getGender()+"', N'"+a.getPhoneNumber()+"', N'"+a.getRank()+"')";
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
		public static int deleteMember(int id) {
			int result = 0;
			Connection conn;
			PreparedStatement ps;
			try {
				conn = ConnectionUtils.getConnection();
				ps = conn.prepareStatement("DELETE FROM Member WHERE Id = ?");
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
		public static int updateMember(int id,MemberDTO a) {
			int result = 0;
			Connection conn;
			PreparedStatement ps;
			try {
				conn = ConnectionUtils.getConnection();
				ps = conn.prepareStatement("UPDATE Member SET MemberName = ?, Birthday = ?, Gender = ?, PhoneNumber = ?, Rank = ? WHERE Id = ?");
				//turn date into String
				String date = (new SimpleDateFormat("dd-MM-yyyy")).format(a.getBirthday());
				ps.setString(1, a.getMemberName());
				ps.setString(2, date);
				ps.setString(3, a.getGender());
				ps.setString(4, a.getPhoneNumber());
				ps.setString(5, a.getRank());
				ps.setInt(6, id);
				result = ps.executeUpdate();
				conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return result;
		}
		//show PublisherList
		public static ArrayList<MemberDTO> getMemberList(){
			Connection conn;
			PreparedStatement ps;
			ResultSet r;
			ArrayList<MemberDTO> MemberList = new ArrayList<MemberDTO>();
			try {
				String query = "SELECT * FROM Member";
				conn = ConnectionUtils.getConnection();
				ps = conn.prepareStatement(query);
				r = ps.executeQuery();
				MemberDTO p;
				while(r.next()) {
					p = new MemberDTO(r.getInt("Id"), r.getString("MemberName"), r.getDate("Birthday"), r.getString("Gender"), r.getString("PhoneNumber"), r.getString("Rank"));
					MemberList.add(p);
				}	
				conn.close();
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, e);
			}
			return MemberList;
		}
}
