package DAO;

import java.awt.Component;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.event.AncestorListener;

import DTO.BookDTO;
import DTO.Borrow_ReturnInfoDTO;
import DTO.Borrow_ReturnDTO;
import com.toedter.calendar.JDateChooser;

public class BorrowReturn {
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
	public static ArrayList<Borrow_ReturnInfoDTO> getBookReturnInfoList(){
		Connection conn;
		PreparedStatement ps;
		ResultSet r;
		ArrayList<Borrow_ReturnInfoDTO> BookReturnInfoList = new ArrayList<Borrow_ReturnInfoDTO>();
		try {
			String query = "select I.Id, I.BorrowDate, I.ReturnDate, a.BookName, B.MemberID, M.MemberName from Borrow_ReturnInfo  As B,Borrow_Return  As I, Book a, Member M  where B.Borrow_ReturnID =  I.Id and M.Id = B.MemberID and B.BookID = a.Id";
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement(query);
			r = ps.executeQuery();
			Borrow_ReturnInfoDTO p;
			while(r.next()) {
				p = new Borrow_ReturnInfoDTO(r.getInt("ID"),r.getDate("BorrowDate"),r.getDate("ReturnDate"),r.getString("BookName"),r.getInt("MemberID"),r.getString("MemberName"));
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
	public static void loadDateFromTodate(JDateChooser dFrom) {
		Connection conn;
		PreparedStatement ps;
		ResultSet r;
		try {
			String query = "select BorrowDate from Borrow_Return";
			conn = ConnectionUtils.getConnection();
			ps = conn.prepareStatement(query);
			r = ps.executeQuery();
			while(r.next()) {
				Date FromDate = r.getDate("BorrowDate");
				dFrom.addAncestorListener((AncestorListener) FromDate);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
	
