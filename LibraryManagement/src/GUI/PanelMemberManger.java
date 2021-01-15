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

public class PanelMemberManger extends JPanel {
	private JTextField txtBirthdayMember;
	private JTextField txtNameMember;
	private JTable tblMember;
	private JTextField txtTelephoneNumber;
	private JTextField textAdressMember;

	/**
	 * Create the panel.
	 */
	public PanelMemberManger() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(0,0,523, 509);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 11, 503, 241);
		add(panel);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Gender");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_1.setBounds(10, 170, 78, 32);
		panel.add(lblNewLabel_3_1_1);
		
		txtBirthdayMember = new JTextField();
		txtBirthdayMember.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtBirthdayMember.setColumns(10);
		txtBirthdayMember.setBounds(90, 103, 159, 32);
		panel.add(txtBirthdayMember);
		
		JLabel lblNewLabel_3_1 = new JLabel("Birthday");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(10, 104, 70, 32);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Name ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 39, 54, 32);
		panel.add(lblNewLabel_3);
		
		txtNameMember = new JTextField();
		txtNameMember.setFont(new Font("Arial", Font.BOLD, 18));
		txtNameMember.setColumns(10);
		txtNameMember.setBounds(87, 39, 159, 32);
		panel.add(txtNameMember);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(60, 209, 85, 21);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(192, 209, 85, 21);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(317, 209, 85, 21);
		panel.add(btnUpdate);
		
		JComboBox cmbGenderMember = new JComboBox();
		cmbGenderMember.setBounds(90, 177, 159, 22);
		panel.add(cmbGenderMember);
		
		JLabel lblNewLabel_3_2 = new JLabel("TLP");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_2.setBounds(270, 39, 54, 32);
		panel.add(lblNewLabel_3_2);
		
		txtTelephoneNumber = new JTextField();
		txtTelephoneNumber.setFont(new Font("Arial", Font.BOLD, 18));
		txtTelephoneNumber.setColumns(10);
		txtTelephoneNumber.setBounds(334, 39, 159, 32);
		panel.add(txtTelephoneNumber);
		
		JLabel lblNewLabel_3_3 = new JLabel("Adrees");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_3.setBounds(270, 104, 54, 32);
		panel.add(lblNewLabel_3_3);
		
		textAdressMember = new JTextField();
		textAdressMember.setFont(new Font("Arial", Font.BOLD, 18));
		textAdressMember.setColumns(10);
		textAdressMember.setBounds(336, 103, 159, 32);
		panel.add(textAdressMember);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Rank");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_1_1.setBounds(259, 170, 78, 32);
		panel.add(lblNewLabel_3_1_1_1);
		
		JComboBox cmbRankMember = new JComboBox();
		cmbRankMember.setBounds(339, 177, 159, 22);
		panel.add(cmbRankMember);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		scrollPane.setBounds(10, 263, 503, 235);
		add(scrollPane);
		
		tblMember = new JTable();
		scrollPane.setColumnHeaderView(tblMember);
		setVisible(false);

	}
}
