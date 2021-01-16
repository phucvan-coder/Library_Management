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

public class PanelManagerBook extends JPanel {
	private JTextField txtPhoneNumber;
	private JTextField txtBookAuthor;
	private JTextField txtBookName;
	private JTable tblBookManager;
	private JTextField txtCondition;

	/**
	 * Create the panel.
	 */
	public PanelManagerBook() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(0,0,523, 509);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 11, 503, 260);
		add(panel);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Category");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1.setBounds(10, 155, 92, 32);
		panel.add(lblNewLabel_3_1_1);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(118, 154, 134, 32);
		panel.add(txtPhoneNumber);
		
		txtBookAuthor = new JTextField();
		txtBookAuthor.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtBookAuthor.setColumns(10);
		txtBookAuthor.setBounds(118, 103, 133, 32);
		panel.add(txtBookAuthor);
		
		JLabel lblNewLabel_3_1 = new JLabel("Book Author");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(10, 104, 92, 32);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 39, 98, 32);
		panel.add(lblNewLabel_3);
		
		txtBookName = new JTextField();
		txtBookName.setFont(new Font("Arial", Font.BOLD, 18));
		txtBookName.setColumns(10);
		txtBookName.setBounds(119, 39, 132, 32);
		panel.add(txtBookName);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(96, 206, 85, 33);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(208, 205, 85, 34);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(337, 206, 85, 33);
		panel.add(btnUpdate);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Status");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1_1.setBounds(261, 103, 92, 32);
		panel.add(lblNewLabel_3_1_1_1);
		
		JComboBox cmbStatus = new JComboBox();
		cmbStatus.setBounds(359, 111, 134, 22);
		panel.add(cmbStatus);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("Condition");
		lblNewLabel_3_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1_2.setBounds(261, 39, 92, 32);
		panel.add(lblNewLabel_3_1_1_2);
		
		txtCondition = new JTextField();
		txtCondition.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtCondition.setColumns(10);
		txtCondition.setBounds(359, 38, 134, 32);
		panel.add(txtCondition);
		
		JLabel lblNewLabel = new JLabel("Book Management");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(194, 10, 159, 13);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		scrollPane.setBounds(10, 281, 503, 217);
		add(scrollPane);
		
		tblBookManager = new JTable();
		scrollPane.setColumnHeaderView(tblBookManager);
		setVisible(false);

	}
}
