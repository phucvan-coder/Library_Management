package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormQuanLyAccount extends JFrame {
	
	private Image img_Logan = new ImageIcon(FormQuanLyAccount.class.getResource("/img/loupe1.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTable tblAccount;
	private JTextField txtPassword;
	private JTextField txtname;
	private JTextField textUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormQuanLyAccount frame = new FormQuanLyAccount();
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
	public FormQuanLyAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new LineBorder(new Color(128, 128, 128), 3));
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
					FormQuanLyAccount.this.dispose();
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
		txtX.setHorizontalAlignment(SwingConstants.CENTER);
		txtX.setFont(new Font("Arial", Font.BOLD, 17));
		txtX.setBounds(1065, 0, 35, 28);
		contentPane.add(txtX);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(new Color(0, 128, 128), 2));
		scrollPane.setBounds(10, 319, 898, 321);
		contentPane.add(scrollPane);
		
		tblAccount = new JTable();
		scrollPane.setViewportView(tblAccount);
		
		JLabel lblNewLabel = new JLabel("Account Management");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(310, 20, 317, 43);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(95, 158, 160));
		panel_1.setForeground(new Color(95, 158, 160));
		panel_1.setBounds(10, 73, 898, 236);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(93, 94, 287, 33);
		panel_1.add(panel);
		panel.setLayout(null);
		
		txtname = new JTextField();
		txtname.setBounds(0, 0, 243, 32);
		panel.add(txtname);
		txtname.setFont(new Font("Arial", Font.BOLD, 18));
		txtname.setColumns(10);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setLayout(null);
		panel_2_2.setBounds(93, 38, 287, 32);
		panel_1.add(panel_2_2);
		
		JComboBox cmbMemberID = new JComboBox();
		cmbMemberID.setBounds(0, 0, 242, 31);
		panel_2_2.add(cmbMemberID);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(Color.WHITE);
		panel_2_3.setLayout(null);
		panel_2_3.setBounds(601, 38, 287, 32);
		panel_1.add(panel_2_3);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(0, 0, 243, 32);
		panel_2_3.add(txtPassword);
		txtPassword.setFont(new Font("Arial", Font.BOLD, 18));
		txtPassword.setColumns(10);
		
		JPanel panel_2_3_1 = new JPanel();
		panel_2_3_1.setBackground(Color.WHITE);
		panel_2_3_1.setLayout(null);
		panel_2_3_1.setBounds(601, 94, 287, 32);
		panel_1.add(panel_2_3_1);
		
		JComboBox cmbRank = new JComboBox();
		cmbRank.setBounds(0, 0, 242, 32);
		panel_2_3_1.add(cmbRank);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 94, 73, 34);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(93, 155, 287, 33);
		panel_1.add(panel_2);
		
		textUsername = new JTextField();
		textUsername.setFont(new Font("Arial", Font.BOLD, 18));
		textUsername.setColumns(10);
		textUsername.setBounds(0, 0, 243, 32);
		panel_2.add(textUsername);
		
		JLabel lblUserName = new JLabel("UserName");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUserName.setBounds(10, 155, 73, 34);
		panel_1.add(lblUserName);
		
		JLabel lblidMember = new JLabel("Id Member");
		lblidMember.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblidMember.setBounds(10, 38, 73, 34);
		panel_1.add(lblidMember);
		
		JLabel lblNewLabel_1_3 = new JLabel("Password");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(518, 38, 64, 34);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Rank");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4.setBounds(518, 94, 46, 34);
		panel_1.add(lblNewLabel_1_4);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAdd.setBounds(518, 155, 95, 30);
		panel_1.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDelete.setBounds(660, 155, 95, 30);
		panel_1.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnUpdate.setBounds(793, 155, 95, 30);
		panel_1.add(btnUpdate);
	}
}
