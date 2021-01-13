package DTO;
import java.io.*;
public class Borrow_ReturnInfoDTO {
	private int id;
	private String borrowDate;
	private String returnDate;
	private String bookName;
	private int memberID;
	private String memberName;
	//Constructor
	public Borrow_ReturnInfoDTO() {
		this.id = 0;
		this.borrowDate = "";
		this.returnDate = "";
		this.bookName = "";
		this.memberID = 0;
		this.memberName = "";
	}
	public Borrow_ReturnInfoDTO(int ID,String BorrowDate,String ReturnDate,String BookName,int MemberID,String MemberName) {
		this.id = ID;
		this.borrowDate = BorrowDate;
		this.returnDate = ReturnDate;
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
	public String getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
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
	
}
