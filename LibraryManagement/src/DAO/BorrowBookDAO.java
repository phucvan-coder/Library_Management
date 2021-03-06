package DAO;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JComboBox;

import DTO.BookDTO;
import DTO.Borrow_ReturnDTO;
import DTO.Borrow_ReturnInfoDTO;
public class BorrowBookDAO {
	//save Borrow_Return
	public static int saveBorrow_Return(Borrow_ReturnDTO a) {
		int result = 0;
		Connection conn;
		ResultSet r;
		try {
			String borrowDate = (new SimpleDateFormat("MM-dd-yyyy")).format(a.getBorrowDate());
			String returnDate = (new SimpleDateFormat("MM-dd-yyyy")).format(a.getReturnDate());
			conn = ConnectionUtils.getConnection();
			String sqlInsert = "INSERT INTO Borrow_Return (BorrowDate, ReturnDate, NumberOfBooks) "
                    + " VALUES ('"+borrowDate+"', '"+returnDate+"', "+a.getNumberOfBooks()+")";
			java.sql.Statement st = conn.createStatement();
			result = st.executeUpdate(sqlInsert);
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	//save Borrow_ReturnInfo
	public static int saveBorrow_ReturnInfo(Borrow_ReturnInfoDTO a) {
		int result = 0;
		Connection conn;
		PreparedStatement ps1,ps2;
		ResultSet r1,r2;
		try {
			String query1 = "SELECT Id FROM Book WHERE BookName=N'"+a.getBookName()+"'";
			String query2 = "SELECT MAX(Id) AS LastID FROM Borrow_Return";
			conn = ConnectionUtils.getConnection();
			ps1 = conn.prepareStatement(query1);
			r1 = ps1.executeQuery();
			ps2 = conn.prepareStatement(query2);
			r2 = ps2.executeQuery();
			int BookID,Borrow_ReturnID;
			if(r1.next()==true&&r2.next()==true) {
				BookID = r1.getInt("Id");
				Borrow_ReturnID = r2.getInt("LastID");
				conn = ConnectionUtils.getConnection();
				String sqlInsert = "INSERT INTO Borrow_ReturnInfo (Borrow_ReturnID, BookID,MemberID) "
	                    + " VALUES ("+Borrow_ReturnID+", "+BookID+", "+a.getMemberID()+")";
				java.sql.Statement st = conn.createStatement();
				result = st.executeUpdate(sqlInsert);
				conn.close();
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	//Load data into combobox Type
	public static void loadTypeOfBookToCmb(JComboBox cmb) {
		Connection conn;
		PreparedStatement ps;
		ResultSet r;
		try {
			String query = "SELECT TypeName FROM TypeOfBook";
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement(query);
			r = ps.executeQuery();
			while(r.next()) {
				String typeName = r.getString("TypeName");
				cmb.addItem(typeName);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//  get id of book type
	public static int getTypeID(String typeName) {
		int typeID=0;
		Connection conn;
		PreparedStatement ps;
		ResultSet r;
		try {
			String query = "SELECT Id FROM TypeOfBook WHERE TypeName=N'"+typeName+"'";
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement(query);
			r = ps.executeQuery();
			if(r.next()) {
				typeID=r.getInt("Id");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return typeID;
	}
	//Load data into combobox Book Name
	public static void loadBookNameToCmb(int typeID,JComboBox cmb) {
		Connection conn;
		PreparedStatement ps;
		ResultSet r;
		try {
			String query = "SELECT BookName FROM Book WHERE TypeID = "+typeID+" AND Book.Status = N'Chưa Mượn'";
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement(query);
			r = ps.executeQuery();
			while(r.next()) {
				String bookName = r.getString("BookName");
				cmb.addItem(bookName);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//Load data into combobox MemberID
		public static void loadMemberIDToCmb(JComboBox cmb) {
			Connection conn;
			PreparedStatement ps;
			ResultSet r;
			try {
				String query = "SELECT Id FROM Member";
				conn = ConnectionUtils.getConnection();
				ps = conn.prepareStatement(query);
				r = ps.executeQuery();
				while(r.next()) {
					String memberID = String.valueOf(r.getInt("Id"));
					cmb.addItem(memberID);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		//update book status 
		public static void updateBook(String bookName) {
			Connection conn;
			PreparedStatement ps;
			ResultSet r;
			try {
				String query = "SELECT Id FROM Book WHERE BookName=N'"+bookName+"'";
				conn = ConnectionUtils.getConnection();
				ps = conn.prepareStatement(query);
				r = ps.executeQuery();
				if(r.next()) {
					int id = r.getInt("Id");
					ps = conn.prepareStatement("UPDATE Book SET Status = ? WHERE Id = ?");
					ps.setString(1, "Đã Mượn");
					ps.setInt(2, id);
					ps.executeUpdate();
				}
				conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
}
