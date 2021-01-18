package BUS;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import DAO.PublisherDAO;
import DTO.PublisherDTO;
import GUI.FormPublisherManager;
import GUI.PanelPlublisherManger;
public class PublisherBUS {
	//display list
	public static void showPublisherList(JTable table) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.getDataVector().clear();
		PublisherDAO publisherList = new PublisherDAO();
		Object[] row = new Object[4];
		ArrayList<PublisherDTO> list = publisherList.getPublisherList();
		for(int i = 0; i < list.size(); i++) {
			row[0] = list.get(i).getId();
			row[1] = list.get(i).getPublisherName();
			row[2] = list.get(i).getAddress();
			row[3] = list.get(i).getPhoneNumber();
			model.addRow(row);
		}
	}
	//add
	public static boolean addPublisher() {
		PublisherDTO a = PanelPlublisherManger.getPublisher();
		int result = 0;
		result = PublisherDAO.addPublisher(a);
		if(result==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//delete
	public static boolean deletePublisher() {
		int id = PanelPlublisherManger.getPublisherID();
		int result = 0;
		result = PublisherDAO.deletePublisher(id);
		if(result==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//update
	public static boolean updatePublisher() {
		PublisherDTO a = PanelPlublisherManger.getPublisher();
		int id = PanelPlublisherManger.getPublisherID();
		int result = 0;
		result = PublisherDAO.updatePublisher(id,a);
		if(result==1) {
			return true;
		}
		else {
			return false;
		}
	}
}
