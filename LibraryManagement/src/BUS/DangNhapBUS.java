package BUS;
import java.io.*;

import javax.swing.JLabel;

import DAO.DangNhapDAO;
import DTO.AccountDTO;
import GUI.FormDangNhap;
public class DangNhapBUS {
	//check account
	public static boolean CheckAccount() {
		AccountDTO user = FormDangNhap.getAccount();
		int a = DangNhapDAO.checkAccount(user);
		if(a == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	//get UserInfo
	public static void getUserInfo(JLabel l1,JLabel l2) {
		AccountDTO user = FormDangNhap.getAccount();
		DangNhapDAO.getUserInfo(user, l1, l2);;
	}
}
