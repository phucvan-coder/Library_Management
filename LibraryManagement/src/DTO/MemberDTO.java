package DTO;
import java.io.*;
public class MemberDTO {
	private int id;
	private String memberName;
	private String birthday;
	private String gender;
	private String phoneNumber;
	private String rank;
	//Constructor
	public MemberDTO(){
		this.id = 0;
		this.memberName = "";
		this.birthday = "";
		this.gender = "";
		this.phoneNumber = "";
		this.rank = "";
	}
	public MemberDTO(int ID,String MemberName,String Birthday,String Gender,String PhoneNumber,String Rank){
		this.id = ID;
		this.memberName = MemberName;
		this.birthday = Birthday;
		this.gender = Gender;
		this.phoneNumber = PhoneNumber;
		this.rank = Rank;
	}
	//getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
}
