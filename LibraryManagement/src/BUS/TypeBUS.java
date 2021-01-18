package BUS;
import java.io.*;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.AccountDAO;
import DAO.TypeDAO;
import DTO.AccountDTO;
import DTO.TypeOfBookDTO;
import GUI.PanelManagerAccount;
import GUI.PanelManagerCategory;
import GUI.PanelSearchingBook;
public class TypeBUS {
	//display list
	public static void showTypeOfBookList(JTable table) {
		TypeDAO TypeOfBookList = new TypeDAO();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.getDataVector().clear();
		Object[] row = new Object[6];
		ArrayList<TypeOfBookDTO> list = TypeOfBookList.getTypeOfBookList();
		for(int i = 0; i < list.size(); i++) {
			row[0] = list.get(i).getId();
			row[1] = list.get(i).getTypeName();
			model.addRow(row);
		}
	}
	//add
	public static boolean addType() {
		TypeOfBookDTO a = PanelManagerCategory.getType();
		int result = 0;
		result = TypeDAO.addType(a);
		if(result==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//delete
	public static boolean deleteType() {
		int id = PanelManagerCategory.getTypeID();
		int result = 0;
		result = TypeDAO.deleteType(id);
		if(result==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//update
	public static boolean updateType() {
		TypeOfBookDTO a = PanelManagerCategory.getType();
		int id = PanelManagerCategory.getTypeID();
		int result = 0;
		result = TypeDAO.updateType(id, a);
		if(result==1) {
			return true;
		}
		else {
			return false;
		}
	}
}
