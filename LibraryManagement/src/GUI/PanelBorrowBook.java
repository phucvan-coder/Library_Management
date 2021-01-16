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
import com.toedter.calendar.JDateChooser;

public class PanelBorrowBook extends JPanel {
	private JTable tblAccountManager;
	private JTextField txtNumber;

	/**
	 * Create the panel.
	 */
	public PanelBorrowBook() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(0,0,523, 509);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 11, 503, 241);
		add(panel);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Book Name");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1.setBounds(0, 155, 92, 32);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Author");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(10, 104, 49, 32);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Category");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 39, 72, 32);
		panel.add(lblNewLabel_3);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(109, 210, 85, 21);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(212, 210, 85, 21);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(307, 210, 85, 21);
		panel.add(btnUpdate);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("To");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1_1.setBounds(281, 103, 39, 32);
		panel.add(lblNewLabel_3_1_1_1);
		
		JComboBox cmbMemberID = new JComboBox();
		cmbMemberID.setBounds(96, 45, 165, 24);
		panel.add(cmbMemberID);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("From");
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1_2.setBounds(281, 38, 60, 32);
		panel.add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel = new JLabel("Borrow Book");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(210, 10, 136, 13);
		panel.add(lblNewLabel);
		
		JComboBox cmbAuthor = new JComboBox();
		cmbAuthor.setBounds(96, 104, 165, 24);
		panel.add(cmbAuthor);
		
		JComboBox cmbBookName = new JComboBox();
		cmbBookName.setBounds(96, 163, 165, 24);
		panel.add(cmbBookName);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(351, 39, 142, 24);
		panel.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(351, 104, 142, 24);
		panel.add(dateChooser_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Member ID");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_2.setBounds(281, 156, 72, 32);
		panel.add(lblNewLabel_3_2);
		
		JComboBox cmbMemberID_1 = new JComboBox();
		cmbMemberID_1.setBounds(357, 161, 136, 24);
		panel.add(cmbMemberID_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		scrollPane.setBounds(10, 263, 503, 196);
		add(scrollPane);
		
		tblAccountManager = new JTable();
		scrollPane.setColumnHeaderView(tblAccountManager);
		
		JLabel lblNumberOfBoook = new JLabel("Number of Books");
		lblNumberOfBoook.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumberOfBoook.setBounds(42, 469, 136, 13);
		add(lblNumberOfBoook);
		
		txtNumber = new JTextField();
		txtNumber.setBounds(172, 469, 36, 19);
		add(txtNumber);
		txtNumber.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(411, 467, 85, 21);
		add(btnConfirm);
		setVisible(false);

	}
}
