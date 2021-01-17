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
import javax.swing.ImageIcon;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class PanelCategory extends JPanel {
	private JTextField txtSearch;

	/**
	 * Create the panel.
	 */
	public PanelCategory() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(0,0,523, 524);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 22, 503, 89);
		add(panel);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(375, 42, 85, 21);
		panel.add(btnSearch);
		
		JLabel lblSearch = new JLabel("Book Searching");
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSearch.setBounds(154, 10, 192, 13);
		panel.add(lblSearch);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(78, 43, 277, 19);
		panel.add(txtSearch);
		txtSearch.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		scrollPane.setBounds(10, 134, 503, 350);
		add(scrollPane);
		setVisible(false);

	}
}
