package BUS;

import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import DAO.BookDAO;
import DAO.BorrowReturn;
import DTO.Borrow_ReturnDTO;
import DTO.Borrow_ReturnInfoDTO;

public class Book_ReturnBus {
	
	public static void showBookReturnList(JTable table) {
		BorrowReturn BorrowReturnList = new BorrowReturn();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.getDataVector().clear();
		Object[] row = new Object[8];
		ArrayList<Borrow_ReturnDTO> list = BorrowReturnList.getBookReturnList();
		for(int i = 0; i < list.size(); i++) {
			row[0] = list.get(i).getId();
			row[1] = list.get(i).getBorrowDate();
			row[2] = list.get(i).getReturnDate();
			row[3] = list.get(i).getNumberOfBooks();
			
			model.addRow(row);
		}
	}
	public static void showBookReturnInfoList(JTable table) {
		BorrowReturn BorrowReturnInfoList = new BorrowReturn();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.getDataVector().clear();
		Object[] row = new Object[8];
		ArrayList<Borrow_ReturnInfoDTO> list = BorrowReturnInfoList.getBookReturnInfoList();
		for(int i = 0; i < list.size(); i++) {
			row[0] = list.get(i).getId();
			row[1] = list.get(i).getBorrowDate();
			row[2] = list.get(i).getReturnDate();
			row[3] = list.get(i).getBookName();
			row[4] = list.get(i).getMemberID();
			row[5] = list.get(i).getMemberName();
			
			
			model.addRow(row);
		}
	}
	public static void loadDateFrom(JDateChooser d) {
		//BookDAO.loadTypeOfBookToCmb(cmb);
		BorrowReturn.loadDateFromTodate(d);
	}
	
	

}
