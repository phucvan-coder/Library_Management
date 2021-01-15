package DAO;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DTO.AccountDTO;
import DTO.PublisherDTO;
public class PublisherDAO {
	//add
	public static int addPublisher(PublisherDTO a) {
		int result = 0;
		Connection conn;
		try {
			conn = ConnectionUtils.getConnection();
			String sqlInsert = "INSERT INTO Publisher (PublisherName, Address, PhoneNumber) "
                    + " VALUES (N'"+a.getPublisherName()+"', N'"+a.getAddress()+"', "+a.getPhoneNumber()+")";
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
	public static int deletePublisher(int id) {
		int result = 0;
		Connection conn;
		PreparedStatement ps;
		try {
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement("DELETE FROM Publisher WHERE Id = ?");
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
	public static int updatePublisher(int id,PublisherDTO a) {
		int result = 0;
		Connection conn;
		PreparedStatement ps;
		try {
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement("UPDATE Publisher SET PublisherName = ?, Address = ?, PhoneNumber = ? WHERE Id = ?");
			ps.setString(1, a.getPublisherName());
			ps.setString(2, a.getAddress());
			ps.setString(3, a.getPhoneNumber());
			ps.setInt(4, id);
			result = ps.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	//show PublisherList
	public static ArrayList<PublisherDTO> getPublisherList(){
		Connection conn;
		PreparedStatement ps;
		ResultSet r;
		ArrayList<PublisherDTO> publisherList = new ArrayList<PublisherDTO>();
		try {
			String query = "SELECT * FROM Publisher";
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement(query);
			r = ps.executeQuery();
			PublisherDTO p;
			while(r.next()) {
				p = new PublisherDTO(r.getInt("Id"), r.getString("PublisherName"), r.getString("Address"), r.getString("PhoneNumber"));
				publisherList.add(p);
			}	
			conn.close();
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		return publisherList;
	}
}
