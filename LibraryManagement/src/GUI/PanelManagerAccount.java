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

public class PanelManagerAccount extends JPanel {
	private static JTextField txtNameAccount;
	private static JTextField ttxtName;
	private static JTextField txtPassword;
	private static JTable tblAccountManager;
	private static JComboBox cmbMemberID;
	private static JTextField txtRank;
	/**
	 * Create the panel.
	 */
	public PanelManagerAccount() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(0,0,523, 509);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 11, 503, 241);
		add(panel);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Username");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1.setBounds(0, 155, 92, 32);
		panel.add(lblNewLabel_3_1_1);
		
		txtNameAccount = new JTextField();
		txtNameAccount.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNameAccount.setColumns(10);
		txtNameAccount.setBounds(96, 154, 165, 32);
		panel.add(txtNameAccount);
		
		ttxtName = new JTextField();
		ttxtName.setFont(new Font("Tahoma", Font.BOLD, 18));
		ttxtName.setColumns(10);
		ttxtName.setBounds(96, 102, 165, 32);
		panel.add(ttxtName);
		
		JLabel lblNewLabel_3_1 = new JLabel("Name");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(10, 104, 49, 32);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Id Member");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 39, 72, 32);
		panel.add(lblNewLabel_3);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Arial", Font.BOLD, 18));
		txtPassword.setColumns(10);
		txtPassword.setBounds(361, 39, 132, 32);
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
		btnAdd.setBounds(109, 210, 85, 21);
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
				if(tblAccountManager.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "         The list is empty","Message",JOptionPane.INFORMATION_MESSAGE);
				}
				if(n<0) {
					JOptionPane.showMessageDialog(null, "         Please select a row","Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnDelete.setBounds(212, 210, 85, 21);
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
				if(tblAccountManager.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "         The list is empty","Message",JOptionPane.INFORMATION_MESSAGE);
				}
				if(n<0) {
					JOptionPane.showMessageDialog(null, "         Please select a row","Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnUpdate.setBounds(307, 210, 85, 21);
		panel.add(btnUpdate);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Rank");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1_1.setBounds(271, 103, 92, 32);
		panel.add(lblNewLabel_3_1_1_1);
		
		cmbMemberID = new JComboBox();
		cmbMemberID.setBounds(96, 45, 165, 22);
		panel.add(cmbMemberID);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("Pasword");
		lblNewLabel_3_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1_2.setBounds(271, 38, 92, 32);
		panel.add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel = new JLabel("Account Management");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(160, 10, 203, 13);
		panel.add(lblNewLabel);
		
		txtRank = new JTextField();
		txtRank.setFont(new Font("Arial", Font.BOLD, 18));
		txtRank.setColumns(10);
		txtRank.setBounds(361, 102, 132, 32);
		panel.add(txtRank);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 263, 503, 235);
		add(scrollPane);
		
		tblAccountManager = new JTable();
		tblAccountManager.addMouseListener(new MouseAdapter() {
			//click on table
			@Override
			public void mouseClicked(MouseEvent e) {
				int n = tblAccountManager.getSelectionModel().getLeadSelectionIndex();
				cmbMemberID.setSelectedItem(tblAccountManager.getValueAt(n, 1));
				ttxtName.setText(tblAccountManager.getValueAt(n, 2).toString());
				txtNameAccount.setText(tblAccountManager.getValueAt(n, 3).toString());
				txtPassword.setText(tblAccountManager.getValueAt(n, 4).toString());
				txtRank.setText(tblAccountManager.getValueAt(n, 5).toString());
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
		AccountBUS.loadMemberNameToTxt(txtRank,cmbMemberID);
	}
	//get Member
		public static AccountDTO getMember() {
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
