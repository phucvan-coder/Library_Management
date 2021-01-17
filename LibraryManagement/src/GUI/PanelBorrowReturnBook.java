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

public class PanelBorrowReturnBook extends JPanel {
	private JTable tblBorrowReturnBookList;
	private JTable tblBorrowReturnBookDetails;

	/**
	 * Create the panel.
	 */
	public PanelBorrowReturnBook() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(0,0,523, 509);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 11, 503, 208);
		add(panel);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(154, 152, 85, 21);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(261, 152, 85, 21);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(371, 152, 85, 21);
		panel.add(btnUpdate);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("To");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1_1.setBounds(10, 98, 65, 32);
		panel.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("From");
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1_2.setBounds(10, 33, 65, 32);
		panel.add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel = new JLabel("Borrow of reutn Book");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(154, 10, 192, 13);
		panel.add(lblNewLabel);
		
		JDateChooser dateFrom = new JDateChooser();
		dateFrom.setBounds(80, 34, 266, 24);
		panel.add(dateFrom);
		
		JDateChooser dateTo = new JDateChooser();
		dateTo.setBounds(80, 99, 266, 24);
		panel.add(dateTo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		scrollPane.setBounds(10, 244, 249, 229);
		add(scrollPane);
		
		tblBorrowReturnBookList = new JTable();
		scrollPane.setColumnHeaderView(tblBorrowReturnBookList);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		scrollPane_1.setBounds(269, 244, 244, 229);
		add(scrollPane_1);
		
		tblBorrowReturnBookDetails = new JTable();
		scrollPane_1.setColumnHeaderView(tblBorrowReturnBookDetails);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 229, 249, 13);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Borrow of Return Book Lists");
		lblNewLabel_1.setBounds(0, 0, 180, 13);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(269, 229, 244, 13);
		add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Borrow of Return Book Details");
		lblNewLabel_1_1.setBounds(0, 0, 180, 13);
		panel_1_1.add(lblNewLabel_1_1);
		
		JButton btnRepload = new JButton("Repload");
		btnRepload.setBounds(395, 478, 85, 21);
		add(btnRepload);
		setVisible(false);

	}
}
