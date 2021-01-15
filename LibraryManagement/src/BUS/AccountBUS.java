package BUS;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import DAO.AccountDAO;
import DTO.AccountDTO;
import GUI.FormQuanLyAccount;


public class AccountBUS {
	//display list
		public static void showAccountList(JTable table) {
			AccountDAO AccountList = new AccountDAO();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			Object[] row = new Object[5];
			ArrayList<AccountDTO> list = AccountList.getAccountList();
			for(int i = 0; i < list.size(); i++) {
				row[0] = list.get(i).getId();
				row[1] = list.get(i).getMemberID();
				row[2] = list.get(i).getMemberName();
				row[3] = list.get(i).getAccountName();
				row[4] = list.get(i).getPassword();
				model.addRow(row);
			}
		}
		//add
		public static boolean addAccount() {
			AccountDTO a = FormQuanLyAccount.getAccount();
			int result = 0;
			result = AccountDAO.addAccount(a);
			if(result==1) {
				return true;
			}
			else {
				return false;
			}
		}
		//delete
		public static boolean deletePublisher() {
			AccountDTO a = FormQuanLyAccount.getAccount();
			int id = FormQuanLyAccount.getAccountID();
			int result = 0;
			result = AccountDAO.deleteAccount(id);
			if(result==1) {
				return true;
			}
			else {
				return false;
			}
		}
		//update
		public static boolean updatePublisher() {
			AccountDTO a = FormQuanLyAccount.getAccount();
			int id = FormQuanLyAccount.getAccountID();
			int result = 0;
			result = AccountDAO.updateAccount(id,a);
			if(result==1) {
				return true;
			}
			else {
				return false;
			}
		}
		//load data into combobox
		public static void loadMemberIDToCmb(JComboBox cmb) {
			cmb = AccountDAO.loadMemberIDToCmb();
		}
		//load data into textfield
		public static void loadMemberNameToTxt(JTextField t,JComboBox cmb) {
			t.setText(AccountDAO.loadMemberNameToTxt(cmb));
		}
}
