package DTO;
import java.io.*;
import java.util.Date;
public class Borrow_ReturnInfoDTO {
	private int id;
	private int borrow_ReturnID;
	private String bookName;
	private int memberID;
	private String memberName;
	//Constructor
	public Borrow_ReturnInfoDTO() {
		this.id = 0;
		this.borrow_ReturnID = 0;
		this.bookName = "";
		this.memberID = 0;
		this.memberName = "";
	}
	public Borrow_ReturnInfoDTO(int ID,int Borrow_ReturnID,String BookName,int MemberID,String MemberName) {
		this.id = ID;
		this.borrow_ReturnID = Borrow_ReturnID;
		this.bookName = BookName;
		this.memberID = MemberID;
		this.memberName = MemberName;
	}
	//getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getBorrow_ReturnID() {
		return borrow_ReturnID;
	}
	public void setBorrow_ReturnID(int borrow_ReturnID) {
		this.borrow_ReturnID = borrow_ReturnID;
	}
	
}
