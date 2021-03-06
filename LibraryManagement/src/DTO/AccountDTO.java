package DTO;
import java.io.*;
public class AccountDTO {
	private int id;
	private int memberID;
	private String memberName;
	private String accountName;
	private String password;
	private String rank;
	//Constructor
	public AccountDTO() {
		this.id = 0;
		this.memberID = 0;
		this.memberName = "";
		this.accountName = "";
		this.password = "";
		this.rank = "";
	}
	public AccountDTO(int ID,int MemberID,String MemberName,String AccountName,String Password,String Rank) {
		this.id = ID;
		this.memberID = MemberID;
		this.memberName = MemberName;
		this.accountName = AccountName;
		this.password = Password;
		this.rank = Rank;
	}
	//getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
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
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
}
