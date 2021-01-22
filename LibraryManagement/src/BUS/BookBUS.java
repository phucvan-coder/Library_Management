package BUS;
import java.io.*;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.BookDAO;
import DTO.AccountDTO;
import DTO.BookDTO;
import GUI.FormDangNhap;
import GUI.PanelManagerAccount;
import GUI.PanelManagerBook;
import GUI.PanelSearchingBook;
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
			
			// Display Search Book
			public static void showBookListSearch(JTable table) {
				BookDAO BookList = new BookDAO();
				String book = PanelSearchingBook.getBookName();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.getDataVector().clear();
				Object[] row = new Object[8];
				ArrayList<BookDTO> list = BookList.getBookSearchList(book);
				System.out.print(list.size());
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
			public static boolean CheckArraySearch(JTable table) {
				int result = 0;
				BookDAO BookList = new BookDAO();
				String book = PanelSearchingBook.getBookName();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.getDataVector().clear();
				Object[] row = new Object[8];
				ArrayList<BookDTO> list = BookList.getBookSearchList(book);
				System.out.print(list.isEmpty());
				result = list.size();
				if(result==1) {
					return true;
				}
				else {
					return false;
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
				cmb.removeAllItems();
				BookDAO.loadTypeOfBookToCmb(cmb);
			}
			
			public static void loadAuthorToCmb(JComboBox cmb) {
				cmb.removeAllItems();
				BookDAO.loadAuthorToCmb(cmb);
			}
			
			public static void loadPublisherToCmb(JComboBox cmb) {
				cmb.removeAllItems();
				BookDAO.loadPublisherToCmb(cmb);
			}
}
