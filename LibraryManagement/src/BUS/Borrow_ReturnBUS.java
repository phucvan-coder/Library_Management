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

import java.io.File;
//
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Borrow_ReturnBUS {
	
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
	//export excel file
	public static void exportFile(int num,JTable tbl1,JTable tbl2) {
		try {
			XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet spreadsheet = workbook.createSheet("Borrow Return books");

	        XSSFRow row = null;
	        Cell cell = null;

	        row = spreadsheet.createRow((short) 2);
	        row.setHeight((short) 500);
	        cell = row.createCell(0, CellType.STRING);
	        cell.setCellValue("INFORMATION ABOUT BORROWING AND RETURNING BOOKS");

	        row = spreadsheet.createRow((short) 3);
	        row.setHeight((short) 500);
	        cell = row.createCell(0, CellType.STRING);
	        cell.setCellValue("Id");
	        cell = row.createCell(1, CellType.STRING);
	        cell.setCellValue("Borrow Date");
	        cell = row.createCell(2, CellType.STRING);
	        cell.setCellValue("Return Date");
	        cell = row.createCell(3, CellType.STRING);
	        cell.setCellValue("Number of books");
	        
	        row = spreadsheet.createRow((short) 4);
	        row.setHeight((short) 400);
	        row.createCell(0).setCellValue(Integer.parseInt(tbl1.getValueAt(num, 0).toString()));
	        row.createCell(1).setCellValue(Date.valueOf(tbl1.getValueAt(num, 1).toString()));
	        row.createCell(2).setCellValue(Date.valueOf(tbl1.getValueAt(num, 2).toString()));
	        row.createCell(3).setCellValue(Integer.parseInt(tbl1.getValueAt(num, 3).toString()));
	        
	        row = spreadsheet.createRow((short) 6);
	        row.setHeight((short) 500);
	        cell = row.createCell(0, CellType.STRING);
	        cell.setCellValue("DETAILS");
	       
	        row = spreadsheet.createRow((short) 7);
	        row.setHeight((short) 500);
	        cell = row.createCell(0, CellType.STRING);
	        cell.setCellValue("Id");
	        cell = row.createCell(1, CellType.STRING);
	        cell.setCellValue("Borrow_Return Id");
	        cell = row.createCell(2, CellType.STRING);
	        cell.setCellValue("Name of Book");
	        cell = row.createCell(3, CellType.STRING);
	        cell.setCellValue("Member Id");
	        cell = row.createCell(4, CellType.STRING);
	        cell.setCellValue("Name of Member");
	        
	        for (int i = 0; i < tbl2.getRowCount(); i++) {
	            row = spreadsheet.createRow((short) 8 + i);
	            row.setHeight((short) 400);
	            row.createCell(0).setCellValue(Integer.parseInt(tbl2.getValueAt(i, 0).toString()));
	            row.createCell(1).setCellValue(Integer.parseInt(tbl2.getValueAt(i, 1).toString()));
	            row.createCell(2).setCellValue(tbl2.getValueAt(i, 2).toString());
	            row.createCell(3).setCellValue(Integer.parseInt(tbl2.getValueAt(i, 3).toString()));
	            row.createCell(4).setCellValue(tbl2.getValueAt(i, 4).toString());
	        }
	        
	        FileOutputStream out = new FileOutputStream(new File("C:\\Users\\phucvan\\Desktop\\Final_Project_Java_Tech\\borrow_return.xlsx"));
	        workbook.write(out);
	        out.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
