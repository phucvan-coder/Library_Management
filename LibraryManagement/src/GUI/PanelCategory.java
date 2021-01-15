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

public class PanelCategory extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public PanelCategory() {
		setBackground(Color.PINK);
		setLayout(null);
		setBounds(0,0,523, 524);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(204, 204, 255));
		panel_1.setBounds(10, 11, 339, 195);
		add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 311, 173);
		panel_1.add(scrollPane);
		
		JLabel lblNewLabel_1 = new JLabel("Product Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(361, 11, 97, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Supplier");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(361, 65, 37, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Quantity");
		lblNewLabel_3.setBounds(361, 124, 49, 14);
		add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(430, 11, 83, 20);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(404, 62, 109, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(404, 121, 109, 20);
		add(textField_2);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAdd.setBounds(350, 152, 69, 23);
		add(btnAdd);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(444, 152, 69, 23);
		add(btnSave);
		setVisible(false);

	}
}
