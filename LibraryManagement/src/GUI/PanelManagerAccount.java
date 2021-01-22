package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

import BUS.AccountBUS;
import BUS.MemberBUS;
import DTO.AccountDTO;
import DTO.MemberDTO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class PanelManagerAccount extends JPanel {
	private static JTextField txtNameAccount;
	private static JTextField txtName;
	private static JTextField txtPassword;
	private static JTable tblAccountManager;
	private static JComboBox cmbMemberID;
	/**
	 * Create the panel.
	 */
	public PanelManagerAccount() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(0,0,626, 505);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 11, 606, 235);
		add(panel);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Accountname");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1.setBounds(20, 159, 96, 32);
		panel.add(lblNewLabel_3_1_1);
		
		txtNameAccount = new JTextField();
		txtNameAccount.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNameAccount.setColumns(10);
		txtNameAccount.setBounds(126, 158, 165, 32);
		panel.add(txtNameAccount);
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtName.setColumns(10);
		txtName.setBounds(126, 104, 165, 32);
		panel.add(txtName);
		
		JLabel lblNewLabel_3_1 = new JLabel("Name");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(22, 106, 49, 32);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Id Member");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(20, 47, 72, 32);
		panel.add(lblNewLabel_3);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Arial", Font.BOLD, 18));
		txtPassword.setColumns(10);
		txtPassword.setBounds(417, 40, 167, 32);
		panel.add(txtPassword);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			//add
			public void actionPerformed(ActionEvent e) {
				boolean result = AccountBUS.addAccount();
				if(result) {
					JOptionPane.showMessageDialog(null, "         Add successful","Message",JOptionPane.INFORMATION_MESSAGE);
					AccountBUS.showAccountList(tblAccountManager);
				}
				else {
					JOptionPane.showMessageDialog(null, "          Add failed","Message",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnAdd.setBounds(462, 96, 122, 33);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			//delete
			public void actionPerformed(ActionEvent e) {
				int n = tblAccountManager.getSelectionModel().getLeadSelectionIndex();
				if(n>=0) {
					boolean result = AccountBUS.deleteAccount();
					if(result) {
						JOptionPane.showMessageDialog(null, "         Delete successful","Message",JOptionPane.INFORMATION_MESSAGE);
						AccountBUS.showAccountList(tblAccountManager);
					}
					else {
						JOptionPane.showMessageDialog(null, "          Delete failed","Message",JOptionPane.ERROR_MESSAGE);
					}
				}
				else if(tblAccountManager.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "         The list is empty","Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(n<0) {
					JOptionPane.showMessageDialog(null, "         Please select a row","Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnDelete.setBounds(462, 147, 122, 32);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			//update
			public void actionPerformed(ActionEvent e) {
				int n = tblAccountManager.getSelectionModel().getLeadSelectionIndex();
				if(n>=0) {
					boolean result = AccountBUS.updateAccount();
					if(result) {
						JOptionPane.showMessageDialog(null, "         Update successful","Message",JOptionPane.INFORMATION_MESSAGE);
						AccountBUS.showAccountList(tblAccountManager);
					}
					else {
						JOptionPane.showMessageDialog(null, "          Update failed","Message",JOptionPane.ERROR_MESSAGE);
					}
				}
				else if(tblAccountManager.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "         The list is empty","Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(n<0) {
					JOptionPane.showMessageDialog(null, "         Please select a row","Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnUpdate.setBounds(462, 195, 122, 32);
		panel.add(btnUpdate);
		
		cmbMemberID = new JComboBox();
		cmbMemberID.addItemListener(new ItemListener() {
			//click on cmbMemberID
			public void itemStateChanged(ItemEvent e) {
				//load data into textfield
				AccountBUS.loadMemberNameToTxt(txtName,cmbMemberID);
			}
		});
		cmbMemberID.addMouseListener(new MouseAdapter() {
		});
		cmbMemberID.setBounds(126, 53, 165, 22);
		panel.add(cmbMemberID);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("Pasword");
		lblNewLabel_3_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1_2.setBounds(327, 39, 92, 32);
		panel.add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel = new JLabel("Account Management");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(230, 11, 203, 13);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 270, 606, 228);
		add(scrollPane);
		
		tblAccountManager = new JTable();
		tblAccountManager.addMouseListener(new MouseAdapter() {
			//click on table
			@Override
			public void mouseClicked(MouseEvent e) {
				int n = tblAccountManager.getSelectionModel().getLeadSelectionIndex();
				cmbMemberID.setSelectedItem(tblAccountManager.getValueAt(n, 1));
				txtName.setText(tblAccountManager.getValueAt(n, 2).toString());
				txtNameAccount.setText(tblAccountManager.getValueAt(n, 3).toString());
				txtPassword.setText(tblAccountManager.getValueAt(n, 4).toString());
			}
		});
		tblAccountManager.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "MemberID", "Name", "AccountName", "Password", "Rank"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(tblAccountManager);
		setVisible(false);
		//load data into cbm
		AccountBUS.loadMemberIDToCmb(cmbMemberID);
		//load data into textfield
		AccountBUS.loadMemberNameToTxt(txtName,cmbMemberID);
		//display Account list
		AccountBUS.showAccountList(tblAccountManager);
		
		JButton btnReload = new JButton("Reload");
		btnReload.addActionListener(new ActionListener() {
			//reload
			public void actionPerformed(ActionEvent e) {
				AccountBUS.loadMemberIDToCmb(cmbMemberID);
				AccountBUS.showAccountList(tblAccountManager);
			}
		});
		btnReload.setBounds(10, 246, 86, 24);
		add(btnReload);
		
		int rank = GUI.FormHomePage.checkRank;
		if(rank!=1) {
			btnAdd.setEnabled(false);
			btnDelete.setEnabled(false);
			btnUpdate.setEnabled(false);
		}
	}
	//get Member
		public static AccountDTO getAccount() {
			AccountDTO p = new AccountDTO();
			p.setMemberID(Integer.parseInt(cmbMemberID.getSelectedItem().toString()));
			p.setAccountName(txtNameAccount.getText());
			p.setPassword(txtPassword.getText());
			return p;
		}
		//get id
		public static int getAccountID() {
			int n = tblAccountManager.getSelectionModel().getLeadSelectionIndex();
			DefaultTableModel model = (DefaultTableModel) tblAccountManager.getModel();
			int id = (int) model.getValueAt(n, 0);
			return id;
		}
}
