package BUS;
import java.io.*;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.BookDAO;
import DTO.BookDTO;
import GUI.PanelManagerAccount;
import GUI.PanelManagerBook;
public class BookBUS {
	//display Book list
			public static void showBookList(JTable table) {
				BookDAO BookList = new BookDAO();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.getDataVector().clear();
				Object[] row = new Object[8];
				ArrayList<BookDTO> list = BookList.getBookList();
				for(int i = 0; i < list.size(); i++) {
					row[0] = list.get(i).getId();
					row[1] = list.get(i).getTypeName();
					row[2] = list.get(i).getAuthorName();
					row[3] = list.get(i).getPublisherName();
					row[4] = list.get(i).getBookName();
					row[5] = list.get(i).getDateIn();
					row[6] = list.get(i).getCondition();
					row[7] = list.get(i).getStatus();
					model.addRow(row);
				}
			}
			//add
			public static boolean addBook() {
				BookDTO a = PanelManagerBook.getBook();
				int result = 0;
				result = BookDAO.addBook(a);
				if(result==1) {
					return true;
				}
				else {
					return false;
				}
			}
			//update
			public static boolean updateBook() {
				BookDTO a = PanelManagerBook.getBook();
				int id = PanelManagerBook.getBookID();
				int result = 0;
				result = BookDAO.updateBook(id,a);
				if(result==1) {
					return true;
				}
				else {
					return false;
				}
			}
			//load data into combobox
			public static void loadTypeOfBookToCmb(JComboBox cmb) {
				BookDAO.loadTypeOfBookToCmb(cmb);
			}
			
			public static void loadAuthorToCmb(JComboBox cmb) {
				BookDAO.loadAuthorToCmb(cmb);
			}
			
			public static void loadPublisherToCmb(JComboBox cmb) {
				BookDAO.loadPublisherToCmb(cmb);
			}
}
