package BUS;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.MemberDAO;
import DTO.MemberDTO;
public class MemberBUS {
	//display Author list
		public static void showMemberList(JTable table) {
			MemberDAO MemberList = new MemberDAO();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			Object[] row = new Object[2];
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
			MemberDTO a = FormQuanLyMember.getMember();
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
			MemberDTO a = FormQuanLyMember.getMember();
			int id = FormQuanLyMember.getMemberID();
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
			MemberDTO a = FormQuanLyMember.getMember();
			int id = FormQuanLyMember.getMemberID();
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
