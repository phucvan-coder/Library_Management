package DTO;
import java.io.*;
import java.util.Date;
public class Borrow_ReturnInfoDTO {
	private int id;
	private Date borrowDate;
	private Date returnDate;
	private String bookName;
	private int memberID;
	private String memberName;
	//Constructor
	public Borrow_ReturnInfoDTO() {
		this.id = 0;
		this.borrowDate = null;
		this.returnDate = null;
		this.bookName = "";
		this.memberID = 0;
		this.memberName = "";
	}
	public Borrow_ReturnInfoDTO(int ID,Date BorrowDate,Date ReturnDate,String BookName,int MemberID,String MemberName) {
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
	public Date getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
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
