package BUS;

import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import DAO.BookDAO;
import DAO.BorrowReturnDAO;
import DTO.Borrow_ReturnDTO;
import DTO.Borrow_ReturnInfoDTO;

public class Book_ReturnBUS {
	
	public static void showBookReturnList(JTable table) {
		BorrowReturnDAO BorrowReturnList = new BorrowReturnDAO();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.getDataVector().clear();
		Object[] row = new Object[4];
		ArrayList<Borrow_ReturnDTO> list = BorrowReturnList.getBookReturnList();
		for(int i = 0; i < list.size(); i++) {
			row[0] = list.get(i).getId();
			row[1] = list.get(i).getBorrowDate();
			row[2] = list.get(i).getReturnDate();
			row[3] = list.get(i).getNumberOfBooks();
			model.addRow(row);
		}
	}
	public static void showBookReturnInfoList(int id,JTable table) {
		BorrowReturnDAO BorrowReturnInfoList = new BorrowReturnDAO();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.getDataVector().clear();
		Object[] row = new Object[5];
		ArrayList<Borrow_ReturnInfoDTO> list = BorrowReturnInfoList.getBookReturnInfoList(id);
		for(int i = 0; i < list.size(); i++) {
			row[0] = list.get(i).getId();
			row[1] = list.get(i).getBorrow_ReturnID();
			row[2] = list.get(i).getBookName();
			row[3] = list.get(i).getMemberID();
			row[4] = list.get(i).getMemberName();
			model.addRow(row);
		}
	}
	public static void filterBorrow_Return(JDateChooser f,JDateChooser t,JTable table) {
		BorrowReturnDAO BorrowReturnList = new BorrowReturnDAO();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.getDataVector().clear();
		Object[] row = new Object[4];
		ArrayList<Borrow_ReturnDTO> list = BorrowReturnList.filterBorrow_Return(f, t);
		for(int i = 0; i < list.size(); i++) {
			row[0] = list.get(i).getId();
			row[1] = list.get(i).getBorrowDate();
			row[2] = list.get(i).getReturnDate();
			row[3] = list.get(i).getNumberOfBooks();
			model.addRow(row);
		}
	}
	public static void reloadTable(JTable table1) {
		showBookReturnList(table1);
	}
}
