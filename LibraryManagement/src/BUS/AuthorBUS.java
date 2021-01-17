package BUS;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import DAO.AuthorDAO;
import DTO.AuthorDTO;
import GUI.FormQuanLyAccount;
import GUI.PanelManagerAuthor;
public class AuthorBUS {
	//display Author list
	public static void showAuthorList(JTable table) {
		AuthorDAO AuthorList = new AuthorDAO();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.getDataVector().clear();
		Object[] row = new Object[2];
		ArrayList<AuthorDTO> list = AuthorList.getAuthorList();
		for(int i = 0; i < list.size(); i++) {
			row[0] = list.get(i).getId();
			row[1] = list.get(i).getAuthorName();
			model.addRow(row);
		}
	}
	//add
	public static boolean addAuthor() {
		AuthorDTO a = PanelManagerAuthor.getAuthor();
		int result = 0;
		result = AuthorDAO.addAuthor(a);
		if(result==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//delete
	public static boolean deleteAuthor() {
		AuthorDTO a = PanelManagerAuthor.getAuthor();
		int id = PanelManagerAuthor.getAuthorID();
		int result = 0;
		result = AuthorDAO.deleteAuthor(id);
		if(result==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//update
	public static boolean updateAuthor() {
		AuthorDTO a = PanelManagerAuthor.getAuthor();
		int id = PanelManagerAuthor.getAuthorID();
		int result = 0;
		result = AuthorDAO.updateAuthor(id,a);
		if(result==1) {
			return true;
		}
		else {
			return false;
		}
	}
}
