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
	private JTextField txtNameAccount;
	private JTextField ttxtName;
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
		btnAdd.setBounds(109, 210, 85, 21);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(212, 210, 85, 21);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(307, 210, 85, 21);
		panel.add(btnUpdate);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Rank");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1_1.setBounds(271, 103, 92, 32);
		panel.add(lblNewLabel_3_1_1_1);
		
		JComboBox cmbRank = new JComboBox();
		cmbRank.setBounds(359, 110, 134, 22);
		panel.add(cmbRank);
		
		JComboBox cmbMemberID = new JComboBox();
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		scrollPane.setBounds(10, 263, 503, 235);
		add(scrollPane);
		
		tblAccountManager = new JTable();
		scrollPane.setColumnHeaderView(tblAccountManager);
		setVisible(false);

	}
}
