package DTO;
import java.io.*;
public class TypeOfBookDTO {
	private int id;
	private String typeName;
	//Constructor
	public TypeOfBookDTO() {
		this.id = 0;
		this.typeName = "";
	}
	public TypeOfBookDTO(int ID,String TypeName) {
		this.id = ID;
		this.typeName = TypeName;
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
}
