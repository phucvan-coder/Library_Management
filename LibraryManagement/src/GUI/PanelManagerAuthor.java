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

public class PanelManagerAuthor extends JPanel {
	private JTextField txtNameAuthor;
	private JTable tblAuthorManager;

	/**
	 * Create the panel.
	 */
	public PanelManagerAuthor() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(0,0,523, 509);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 11, 503, 178);
		add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(91, 51, 53, 32);
		panel.add(lblNewLabel_3);
		
		txtNameAuthor = new JTextField();
		txtNameAuthor.setFont(new Font("Arial", Font.BOLD, 18));
		txtNameAuthor.setColumns(10);
		txtNameAuthor.setBounds(167, 50, 249, 32);
		panel.add(txtNameAuthor);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(91, 121, 85, 31);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(203, 120, 85, 32);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(332, 121, 85, 31);
		panel.add(btnUpdate);
		
		JLabel lblNewLabel = new JLabel("Author Management");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(192, 10, 164, 13);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		scrollPane.setBounds(10, 215, 503, 283);
		add(scrollPane);
		
		tblAuthorManager = new JTable();
		scrollPane.setColumnHeaderView(tblAuthorManager);
		setVisible(false);

	}
}
