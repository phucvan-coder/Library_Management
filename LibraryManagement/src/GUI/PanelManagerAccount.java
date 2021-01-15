package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
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

public class PanelManagerAccount extends JPanel {
	private JTextField txtUserName;
	private JTextField txtNameAccount;
	private JTextField txtPassword;
	private JTable tblAccountManager;

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
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_1.setBounds(261, 40, 92, 32);
		panel.add(lblNewLabel_3_1_1);
		
		txtUserName = new JTextField();
		txtUserName.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtUserName.setColumns(10);
		txtUserName.setBounds(359, 39, 134, 32);
		panel.add(txtUserName);
		
		txtNameAccount = new JTextField();
		txtNameAccount.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNameAccount.setColumns(10);
		txtNameAccount.setBounds(86, 103, 165, 32);
		panel.add(txtNameAccount);
		
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
		txtPassword.setBounds(361, 92, 132, 32);
		panel.add(txtPassword);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(20, 213, 85, 21);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(132, 212, 85, 21);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(261, 213, 85, 21);
		panel.add(btnUpdate);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Rank");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_1_1.setBounds(261, 154, 92, 32);
		panel.add(lblNewLabel_3_1_1_1);
		
		JComboBox cmbRank = new JComboBox();
		cmbRank.setBounds(359, 161, 134, 22);
		panel.add(cmbRank);
		
		JComboBox cmbMemberID = new JComboBox();
		cmbMemberID.setBounds(86, 47, 165, 22);
		panel.add(cmbMemberID);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("Pasword");
		lblNewLabel_3_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_1_2.setBounds(261, 103, 92, 32);
		panel.add(lblNewLabel_3_1_1_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		scrollPane.setBounds(10, 263, 503, 235);
		add(scrollPane);
		
		tblAccountManager = new JTable();
		scrollPane.setColumnHeaderView(tblAccountManager);
		setVisible(false);

	}
}
