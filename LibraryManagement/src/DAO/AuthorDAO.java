package DAO;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import DTO.AuthorDTO;

public class AuthorDAO {
	//add
	public static int addAuthor(AuthorDTO a) {
		int result = 0;
		Connection conn;
		try {
			conn = ConnectionUtils.getConnection();
			String sqlInsert = "INSERT INTO Author (AuthorName) "
                    + " VALUES (N'"+a.getAuthorName()+"')";
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
	public static int deleteAuthor(int id) {
		int result = 0;
		Connection conn;
		PreparedStatement ps;
		try {
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement("DELETE FROM Author WHERE Id = ?");
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
	public static int updateAuthor(int id,AuthorDTO a) {
		int result = 0;
		Connection conn;
		PreparedStatement ps;
		try {
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement("UPDATE Author SET AuthorName = ? WHERE Id = ?");
			ps.setString(1, a.getAuthorName());
			ps.setInt(2, id);
			result = ps.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	//display Author list
	public static ArrayList<AuthorDTO> getAuthorList(){
		Connection conn;
		PreparedStatement ps;
		ResultSet r;
		ArrayList<AuthorDTO> AuthorList = new ArrayList<AuthorDTO>();
		try {
			String query = "SELECT * FROM Author";
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement(query);
			r = ps.executeQuery();
			AuthorDTO p;
			while(r.next()) {
				p = new AuthorDTO(r.getInt("Id"), r.getString("AuthorName"));
				AuthorList.add(p);
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return AuthorList;
	} 
}
