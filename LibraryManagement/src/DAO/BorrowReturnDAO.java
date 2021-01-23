package DAO;

import java.awt.Component;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.event.AncestorListener;

import DTO.BookDTO;
import DTO.Borrow_ReturnInfoDTO;
import DTO.Borrow_ReturnDTO;
import com.toedter.calendar.JDateChooser;

public class BorrowReturnDAO {
	//show Book_return List
	public static ArrayList<Borrow_ReturnDTO> getBookReturnList(){
		Connection conn;
		PreparedStatement ps;
		ResultSet r;
		ArrayList<Borrow_ReturnDTO> BookReturnList = new ArrayList<Borrow_ReturnDTO>();
		try {
			String query = "select * from Borrow_Return";
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement(query);
			r = ps.executeQuery();
			Borrow_ReturnDTO p;
			while(r.next()) {
				p = new Borrow_ReturnDTO(r.getInt("ID"),r.getDate("BorrowDate"),r.getDate("ReturnDate"), r.getInt("NumberOfBooks"));
				BookReturnList.add(p);
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return BookReturnList;
		
	}
	public static ArrayList<Borrow_ReturnInfoDTO> getBookReturnInfoList(int id){
		Connection conn;
		PreparedStatement ps;
		ResultSet r;
		ArrayList<Borrow_ReturnInfoDTO> BookReturnInfoList = new ArrayList<Borrow_ReturnInfoDTO>();
		try {
			String query = "SELECT DISTINCT Borrow_ReturnInfo.Id AS Borrow_ReturnInfoID,Borrow_ReturnID,BookName,Borrow_ReturnInfo.MemberID AS MemberID, MemberName FROM Borrow_Return,Borrow_ReturnInfo,Member,Book WHERE Borrow_ReturnID = "+id+" AND Borrow_ReturnInfo.MemberID=Member.Id AND Borrow_ReturnInfo.BookID=Book.Id";
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement(query);
			r = ps.executeQuery();
			Borrow_ReturnInfoDTO p;
			while(r.next()) {
				p = new Borrow_ReturnInfoDTO(r.getInt("Borrow_ReturnInfoID"),r.getInt("Borrow_ReturnID"),r.getString("BookName"),r.getInt("MemberID"),r.getString("MemberName"));
				BookReturnInfoList.add(p);
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return BookReturnInfoList;
		
	}
	//Load data into Date Type
	public static ArrayList<Borrow_ReturnDTO> filterBorrow_Return(JDateChooser dFrom,JDateChooser dTo) {
		Connection conn;
		PreparedStatement ps;
		ResultSet r;
		ArrayList<Borrow_ReturnDTO> BookReturnList = new ArrayList<Borrow_ReturnDTO>();
		String borrowDate = (new SimpleDateFormat("dd-MM-yyyy")).format(dFrom.getDate());
		String returnDate = (new SimpleDateFormat("dd-MM-yyyy")).format(dTo.getDate());
		try {
			String query = "SELECT * FROM Borrow_Return WHERE BorrowDate >='"+borrowDate+"' AND BorrowDate <= '"+returnDate+"'";
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement(query);
			r = ps.executeQuery();
			Borrow_ReturnDTO p;
			while(r.next()) {
				p = new Borrow_ReturnDTO(r.getInt("ID"),r.getDate("BorrowDate"),r.getDate("ReturnDate"), r.getInt("NumberOfBooks"));
				BookReturnList.add(p);
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return BookReturnList;
	}

}
	
