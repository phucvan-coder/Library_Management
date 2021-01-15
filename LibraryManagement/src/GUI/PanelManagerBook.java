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
		panel.setBounds(10, 11, 503, 241);
		add(panel);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Category");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_1.setBounds(261, 40, 92, 32);
		panel.add(lblNewLabel_3_1_1);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(359, 39, 134, 32);
		panel.add(txtPhoneNumber);
		
		txtBookAuthor = new JTextField();
		txtBookAuthor.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtBookAuthor.setColumns(10);
		txtBookAuthor.setBounds(122, 103, 129, 32);
		panel.add(txtBookAuthor);
		
		JLabel lblNewLabel_3_1 = new JLabel("Book Author");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(10, 104, 78, 32);
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
		btnAdd.setBounds(20, 213, 85, 21);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(132, 212, 85, 21);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(261, 213, 85, 21);
		panel.add(btnUpdate);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Status");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_1_1.setBounds(261, 103, 92, 32);
		panel.add(lblNewLabel_3_1_1_1);
		
		JComboBox cmbStatus = new JComboBox();
		cmbStatus.setBounds(359, 111, 134, 22);
		panel.add(cmbStatus);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		scrollPane.setBounds(10, 263, 503, 235);
		add(scrollPane);
		
		tblBookManager = new JTable();
		scrollPane.setColumnHeaderView(tblBookManager);
		setVisible(false);

	}
}
