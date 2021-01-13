package DTO;
import java.io.*;
public class AccountDTO {
	private int id;
	private String memberName;
	private String accountName;
	private String password;
	//Constructor
	public AccountDTO() {
		this.id = 0;
		this.memberName = "";
		this.accountName = "";
		this.password = "";
	}
	public AccountDTO(int ID,String MemberName,String AccountName,String Password) {
		this.id = ID;
		this.memberName = MemberName;
		this.accountName = AccountName;
		this.password = Password;
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
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
