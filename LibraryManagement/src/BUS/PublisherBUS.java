package BUS;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import DAO.PublisherDAO;
import DTO.PublisherDTO;
public class PublisherBUS {
	public static void showPublisherList(JTable table) {
		PublisherDAO publisherList = new PublisherDAO();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
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
}
