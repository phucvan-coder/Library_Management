package DTO;
import java.io.*;
public class AuthorDTO {
	private int id;
	private String authorName;
	//Constructor
	public AuthorDTO() {
		this.id = 0;
		this.authorName = "";
	}
	public AuthorDTO(int ID,String AuthorName) {
		this.id = ID;
		this.authorName = AuthorName;
	}
	//getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
}
