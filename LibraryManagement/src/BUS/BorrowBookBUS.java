package BUS;
import java.io.*;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.BookDAO;
import DAO.BorrowBookDAO;
import DTO.Borrow_ReturnDTO;
import DTO.Borrow_ReturnInfoDTO;
import GUI.PanelBorrowBook;
public class BorrowBookBUS {
	//s
	public static boolean saveBorrow_Return(JTable t) {
		Borrow_ReturnDTO a = PanelBorrowBook.getBorrow_Return();
		ArrayList<Borrow_ReturnInfoDTO> b = PanelBorrowBook.getBorrow_ReturnInfo();
		int flag = 0,result = 0;
		flag=BorrowBookDAO.saveBorrow_Return(a);
		if(flag==1) {
			for (int i = 0; i < b.size(); i++) {
				result+=BorrowBookDAO.saveBorrow_ReturnInfo(b.get(i));
				BorrowBookDAO.updateBook(b.get(i).getBookName());
			}
		}
		if(result>0&&result==b.size()) {
			DefaultTableModel model = (DefaultTableModel) t.getModel();
			model.getDataVector().clear();
			return true;
		}
		else {
			return false;
		}
	}
	//load data into cmb Type of book
	public static void loadTypeOfBookToCmb(JComboBox cmb) {
		BorrowBookDAO.loadTypeOfBookToCmb(cmb);
	}
	//load data into cmb book name
	public static void loadBookNameToCmb(String typeOfBook,JComboBox cmb) {
		int typeID = BorrowBookDAO.getTypeID(typeOfBook);
		BorrowBookDAO.loadBookNameToCmb(typeID,cmb);
	}
	//load data into cmb MemberID
	public static void loadMemberIDToCmb(JComboBox cmb) {
		BorrowBookDAO.loadMemberIDToCmb(cmb);
	}
}
