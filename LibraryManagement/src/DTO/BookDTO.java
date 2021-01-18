package DTO;
import java.io.*;
import java.util.Date;

public class BookDTO {
	private int id;
	private String typeName;
	private String authorName;
	private String publisherName;
	private String bookName;
	private Date dateIn;
	private String condition;
	private String status;
	//Constructor
	public BookDTO() {
		this.id = 0;
		this.typeName = "";
		this.authorName = "";
		this.publisherName = "";
		this.bookName = "";
		this.dateIn = null;
		this.condition = "";
		this.status = "";
	}
	public BookDTO(int ID,String TypeName,String AuthorName,String PublisherName,String BookName,Date DateIn,String Condition,String Status) {
		this.id = ID;
		this.typeName = TypeName;
		this.authorName = AuthorName;
		this.publisherName = PublisherName;
		this.bookName = BookName;
		this.dateIn = DateIn;
		this.condition = Condition;
		this.status = Status;
	}
	//getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Date getDateIn() {
		return dateIn;
	}
	public void setDateIn(Date dateIn) {
		this.dateIn = dateIn;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
