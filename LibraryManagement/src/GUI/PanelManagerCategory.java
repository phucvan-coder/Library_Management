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

public class PanelManagerCategory extends JPanel {
	private JTextField txtCategoryName;
	private JTable tblCategoryManager;

	/**
	 * Create the panel.
	 */
	public PanelManagerCategory() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(0,0,523, 509);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 11, 503, 199);
		add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("Name of category");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(65, 60, 136, 32);
		panel.add(lblNewLabel_3);
		
		txtCategoryName = new JTextField();
		txtCategoryName.setFont(new Font("Arial", Font.BOLD, 18));
		txtCategoryName.setColumns(10);
		txtCategoryName.setBounds(211, 59, 225, 32);
		panel.add(txtCategoryName);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(61, 130, 85, 32);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(201, 130, 85, 32);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(351, 130, 85, 32);
		panel.add(btnUpdate);
		
		JLabel lblNewLabel_3_1 = new JLabel("Category Management");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(169, 10, 158, 24);
		panel.add(lblNewLabel_3_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		scrollPane.setBounds(10, 220, 503, 278);
		add(scrollPane);
		
		tblCategoryManager = new JTable();
		scrollPane.setColumnHeaderView(tblCategoryManager);
		setVisible(false);

	}
}
