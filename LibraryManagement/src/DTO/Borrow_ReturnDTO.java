package DTO;
import java.io.*;
public class Borrow_ReturnDTO {
	private int id;
	private String borrowDate;
	private String returnDate;
	private int numberOfBooks;
	//Constructor
	public Borrow_ReturnDTO() {
		this.id = 0;
		this.borrowDate = "";
		this.returnDate = "";
		this.numberOfBooks = 0;
	}
	public Borrow_ReturnDTO(int ID,String BorrowDate,String ReturnDate,int NumberOfBooks) {
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
	public int getNumberOfBooks() {
		return numberOfBooks;
	}
	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}
	
}
