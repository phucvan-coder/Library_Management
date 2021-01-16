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

public class PanelPlublisherManger extends JPanel {
	private JTextField txtPhoneNumber;
	private JTextField txtAdress;
	private JTextField txtNamePublisher;
	private JTable tblPublisher;

	/**
	 * Create the panel.
	 */
	public PanelPlublisherManger() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(0,0,523, 509);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 11, 503, 241);
		add(panel);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Phone Number");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1.setBounds(10, 170, 110, 32);
		panel.add(lblNewLabel_3_1_1);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(140, 169, 202, 32);
		panel.add(txtPhoneNumber);
		
		txtAdress = new JTextField();
		txtAdress.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAdress.setColumns(10);
		txtAdress.setBounds(140, 103, 202, 32);
		panel.add(txtAdress);
		
		JLabel lblNewLabel_3_1 = new JLabel("Address");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(10, 104, 78, 32);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Name Publisher");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 39, 117, 32);
		panel.add(lblNewLabel_3);
		
		txtNamePublisher = new JTextField();
		txtNamePublisher.setFont(new Font("Arial", Font.BOLD, 18));
		txtNamePublisher.setColumns(10);
		txtNamePublisher.setBounds(137, 39, 205, 32);
		panel.add(txtNamePublisher);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(388, 43, 105, 29);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(388, 107, 105, 30);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(388, 174, 105, 29);
		panel.add(btnUpdate);
		
		JLabel lblNewLabel = new JLabel("Publisher Management");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(175, 11, 167, 14);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		scrollPane.setBounds(10, 263, 503, 235);
		add(scrollPane);
		
		tblPublisher = new JTable();
		scrollPane.setColumnHeaderView(tblPublisher);
		setVisible(false);

	}
}
