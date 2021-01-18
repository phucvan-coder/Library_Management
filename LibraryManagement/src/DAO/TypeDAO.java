package DAO;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DTO.TypeOfBookDTO;
public class TypeDAO {
	//add
	public static int addType(TypeOfBookDTO a) {
		int result = 0;
		Connection conn;
		try {
			conn = ConnectionUtils.getConnection();
			String sqlInsert = "INSERT INTO TypeOfBook (TypeName) "
		    + " VALUES (N'"+a.getTypeName()+"')";
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
	public static int deleteType(int id) {
		int result = 0;
		Connection conn;
		PreparedStatement ps;
		try {
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement("DELETE FROM TypeOfBook WHERE Id = ?");
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
	public static int updateType(int id,TypeOfBookDTO a) {
		int result = 0;
		Connection conn;
		PreparedStatement ps;
		try {
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement("UPDATE TypeOfBook SET TypeName = ? WHERE Id = ?");
			ps.setString(1, a.getTypeName());
			ps.setInt(2, id);
			result = ps.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	//show Type of book
	public static ArrayList<TypeOfBookDTO> getTypeOfBookList(){
		Connection conn;
		PreparedStatement ps;
		ResultSet r;
		ArrayList<TypeOfBookDTO> TypeOfBookList = new ArrayList<TypeOfBookDTO>();
		try {
			String query = "SELECT * FROM TypeOfBook";
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement(query);
			r = ps.executeQuery();
			TypeOfBookDTO p;
			while(r.next()) {
				p = new TypeOfBookDTO(r.getInt("Id"), r.getString("TypeName"));
				TypeOfBookList.add(p);
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return TypeOfBookList;
	} 
}
