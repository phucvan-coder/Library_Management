package DTO;
import java.io.*;
import java.util.Date;
public class Borrow_ReturnDTO {
	private int id;
	private Date borrowDate;
	private Date returnDate;
	private int numberOfBooks;
	//Constructor
	public Borrow_ReturnDTO() {
		this.id = 0;
		this.borrowDate = null;
		this.returnDate = null;
		this.numberOfBooks = 0;
	}
	public Borrow_ReturnDTO(int ID,Date BorrowDate,Date ReturnDate,int NumberOfBooks) {
		this.id = ID;
		this.borrowDate = BorrowDate;
		this.returnDate = ReturnDate;
		this.numberOfBooks = NumberOfBooks;
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
	public int getNumberOfBooks() {
		return numberOfBooks;
	}
	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}
	
}
