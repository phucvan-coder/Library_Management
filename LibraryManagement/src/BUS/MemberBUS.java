package BUS;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.MemberDAO;
import DTO.MemberDTO;
import GUI.PanelMemberManger;
public class MemberBUS {
	//display Author list
		public static void showMemberList(JTable table) {
			MemberDAO MemberList = new MemberDAO();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.getDataVector().clear();
			Object[] row = new Object[6];
			ArrayList<MemberDTO> list = MemberList.getMemberList();
			for(int i = 0; i < list.size(); i++) {
				row[0] = list.get(i).getId();
				row[1] = list.get(i).getMemberName();
				row[2] = list.get(i).getBirthday();
				row[3] = list.get(i).getGender();
				row[4] = list.get(i).getPhoneNumber();
				row[5] = list.get(i).getRank();
				model.addRow(row);
			}
		}
		//add
		public static boolean addMember() {
			MemberDTO a = PanelMemberManger.getMember();
			int result = 0;
			result = MemberDAO.addMember(a);
			if(result==1) {
				return true;
			}
			else {
				return false;
			}
		}
		//delete
		public static boolean deleteMember() {
			MemberDTO a = PanelMemberManger.getMember();
			int id = PanelMemberManger.getMemberID();
			int result = 0;
			result = MemberDAO.deleteMember(id);
			if(result==1) {
				return true;
			}
			else {
				return false;
			}
		}
		//update
		public static boolean updateMember() {
			MemberDTO a = PanelMemberManger.getMember();
			int id = PanelMemberManger.getMemberID();
			int result = 0;
			result = MemberDAO.updateMember(id,a);
			if(result==1) {
				return true;
			}
			else {
				return false;
			}
		}
}
