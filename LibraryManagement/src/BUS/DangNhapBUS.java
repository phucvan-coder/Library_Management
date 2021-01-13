package BUS;
import java.io.*;

import DAO.DangNhapDAO;
import DTO.AccountDTO;
import GUI.FormDangNhap;
public class DangNhapBUS {
	//check account
	public static boolean CheckAccount() {
		AccountDTO user = FormDangNhap.getAccount();
		int a = DangNhapDAO.CheckAccount(user);
		if(a == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	//check rank
	public static String CheckRank() {
		AccountDTO user = FormDangNhap.getAccount();
		int a = DangNhapDAO.CheckRank(user);
		String rank = "";
		if(a == 1) {
			rank = "Thủ Thư";
		}
		else {
			rank = "Người Đọc";
		}
		return rank;
	}
}
