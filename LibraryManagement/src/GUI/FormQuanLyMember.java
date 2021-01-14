package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class FormQuanLyMember extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtName;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormQuanLyMember frame = new FormQuanLyMember();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormQuanLyMember() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 650);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(95, 158, 160));
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new LineBorder(new Color(95, 158, 160), 3));
		setContentPane(contentPane);
		
		setLocationRelativeTo(null);
		setUndecorated(true);
		contentPane.setLayout(null);
		
		JLabel txtX = new JLabel("X");
		txtX.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Do You Want To Exit ?", "Notification", JOptionPane.YES_NO_OPTION)== 0){
					FormQuanLyMember.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				txtX.setForeground(Color .red);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				txtX.setForeground(Color .BLACK);
			}
		});
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		txtX.setHorizontalAlignment(SwingConstants.CENTER);
		txtX.setFont(new Font("Arial", Font.BOLD, 17));
		txtX.setBounds(815, 10, 35, 28);
		contentPane.add(txtX);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 418, 830, 222);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 70, 830, 307);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(115, 10, 265, 33);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Arial", Font.BOLD, 18));
		txtName.setText("Name");
		txtName.setBounds(0, 0, 224, 33);
		panel_1.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(FormQuanLyMember.class.getResource("/img/name.png")));
		lblNewLabel_3.setBounds(230, 0, 32, 32);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBounds(113, 130, 240, 33);
		panel.add(panel_1_2);
		
		JDateChooser dtpBirthday = new JDateChooser();
		dtpBirthday.setBounds(115, 64, 265, 33);
		panel.add(dtpBirthday);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(140, 130, 240, 33);
		panel.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Name");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(48, 10, 57, 33);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("BirthDay");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4_1.setBounds(48, 64, 57, 33);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Gender");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4_2.setBounds(46, 130, 57, 33);
		panel.add(lblNewLabel_4_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(528, 10, 265, 33);
		panel.add(panel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.BOLD, 18));
		textField.setColumns(10);
		textField.setBounds(0, 0, 224, 33);
		panel_1_1.add(textField);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(FormQuanLyMember.class.getResource("/img/phone-call.png")));
		lblNewLabel_3_1.setBounds(230, 0, 32, 32);
		panel_1_1.add(lblNewLabel_3_1);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBackground(Color.WHITE);
		panel_1_3.setBounds(528, 64, 265, 33);
		panel.add(panel_1_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.BOLD, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(0, 0, 224, 33);
		panel_1_3.add(textField_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setIcon(new ImageIcon(FormQuanLyMember.class.getResource("/img/placeholder.png")));
		lblNewLabel_3_3.setBounds(230, 0, 32, 32);
		panel_1_3.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("TLP number");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4_3.setBounds(434, 10, 84, 33);
		panel.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Address");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4_4.setBounds(434, 64, 57, 33);
		panel.add(lblNewLabel_4_4);
		
		JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setLayout(null);
		panel_1_2_2.setBackground(Color.WHITE);
		panel_1_2_2.setBounds(525, 130, 271, 33);
		panel.add(panel_1_2_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(0, 0, 175, 33);
		panel_1_2_2.add(lblNewLabel_1);
		
		JComboBox cmbRank = new JComboBox();
		cmbRank.setFont(new Font("Arial Black", Font.PLAIN, 15));
		cmbRank.setBounds(0, 0, 271, 33);
		panel_1_2_2.add(cmbRank);
		
		JLabel lblNewLabel_4_4_1 = new JLabel("Rank");
		lblNewLabel_4_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4_4_1.setBounds(434, 130, 57, 33);
		panel.add(lblNewLabel_4_4_1);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(433, 232, 85, 33);
		panel.add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(574, 232, 85, 33);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(708, 232, 85, 33);
		panel.add(btnUpdate);
		
		JLabel lblNewLabel_2 = new JLabel("MemBer Management ");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_2.setBounds(89, 10, 488, 50);
		contentPane.add(lblNewLabel_2);
	}
}
