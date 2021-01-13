package DTO;
import java.io.*;
public class PublisherDTO {
	private int id;
	private String publisherName;
	private String address;
	private String phoneNumber;
	//Constructor
	public PublisherDTO(){
		this.id = 0;
		this.publisherName = "";
		this.address = "";
		this.phoneNumber = "";
	}
	public PublisherDTO(int ID,String PublisherName,String Address,String PhoneNumber){
		this.id = ID;
		this.publisherName = PublisherName;
		this.address = Address;
		this.phoneNumber = PhoneNumber;
	}
	//getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
