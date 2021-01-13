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
	private JTextField txtIdMember;
	private JTextField txtname;
	private JTextField textUsername;
	private JTextField textField_1;

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
		setBounds(100, 100, 1100, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(Color.BLUE, 3));
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
		scrollPane.setBorder(new LineBorder(Color.BLUE, 2));
		scrollPane.setBounds(10, 431, 1080, 209);
		contentPane.add(scrollPane);
		
		tblAccount = new JTable();
		scrollPane.setViewportView(tblAccount);
		
		JLabel lblNewLabel = new JLabel("Account Management");
		lblNewLabel.setForeground(new Color(204, 204, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(410, 10, 317, 43);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 73, 426, 335);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(118, 38, 287, 33);
		panel_1.add(panel);
		panel.setLayout(null);
		
		txtname = new JTextField();
		txtname.setBounds(0, 0, 243, 32);
		panel.add(txtname);
		txtname.setFont(new Font("Arial", Font.BOLD, 18));
		txtname.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(FormQuanLyAccount.class.getResource("/img/name.png")));
		lblNewLabel_2.setBounds(255, 2, 32, 30);
		panel.add(lblNewLabel_2);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setLayout(null);
		panel_2_2.setBounds(118, 161, 287, 32);
		panel_1.add(panel_2_2);
		
		txtIdMember = new JTextField();
		txtIdMember.setBounds(0, 0, 243, 32);
		panel_2_2.add(txtIdMember);
		txtIdMember.setFont(new Font("Arial", Font.BOLD, 18));
		txtIdMember.setColumns(10);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(FormQuanLyAccount.class.getResource("/img/account.png")));
		lblNewLabel_2_1_1.setBounds(253, 0, 32, 32);
		panel_2_2.add(lblNewLabel_2_1_1);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(Color.WHITE);
		panel_2_3.setLayout(null);
		panel_2_3.setBounds(118, 216, 287, 32);
		panel_1.add(panel_2_3);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(0, 0, 243, 32);
		panel_2_3.add(txtPassword);
		txtPassword.setFont(new Font("Arial", Font.BOLD, 18));
		txtPassword.setColumns(10);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1.setIcon(new ImageIcon(FormQuanLyAccount.class.getResource("/img/key.png")));
		lblNewLabel_2_1_1_1.setBounds(253, 0, 32, 32);
		panel_2_3.add(lblNewLabel_2_1_1_1);
		
		JPanel panel_2_3_1 = new JPanel();
		panel_2_3_1.setBackground(Color.WHITE);
		panel_2_3_1.setLayout(null);
		panel_2_3_1.setBounds(118, 272, 287, 32);
		panel_1.add(panel_2_3_1);
		
		JComboBox cmbRank = new JComboBox();
		cmbRank.setBounds(223, 0, 64, 32);
		panel_2_3_1.add(cmbRank);
		
		JLabel lblRank = new JLabel("");
		lblRank.setBounds(0, -2, 206, 32);
		panel_2_3_1.add(lblRank);
		lblRank.setBackground(Color.WHITE);
		lblRank.setFont(new Font("Arial", Font.BOLD, 18));
		lblRank.setForeground(Color.BLACK);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(35, 38, 73, 34);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(118, 99, 287, 33);
		panel_1.add(panel_2);
		
		textUsername = new JTextField();
		textUsername.setFont(new Font("Arial", Font.BOLD, 18));
		textUsername.setColumns(10);
		textUsername.setBounds(0, 0, 243, 32);
		panel_2.add(textUsername);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBounds(255, 2, 32, 30);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblUserName = new JLabel("UserName");
		lblUserName.setBounds(35, 99, 73, 34);
		panel_1.add(lblUserName);
		
		JLabel lblidMember = new JLabel("Id Member");
		lblidMember.setBounds(35, 161, 73, 34);
		panel_1.add(lblidMember);
		
		JLabel lblNewLabel_1_3 = new JLabel("Password");
		lblNewLabel_1_3.setBounds(35, 216, 46, 34);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Rank");
		lblNewLabel_1_4.setBounds(35, 272, 46, 34);
		panel_1.add(lblNewLabel_1_4);
		
		JButton btnUpdate = new JButton("");
		btnUpdate.setIcon(new ImageIcon(FormQuanLyAccount.class.getResource("/img/plus-circular-button.png")));
		btnUpdate.setBackground(Color.CYAN);
		btnUpdate.setBounds(525, 133, 32, 32);
		contentPane.add(btnUpdate);
		
		JButton btnEdit = new JButton("");
		btnEdit.setIcon(new ImageIcon(FormQuanLyAccount.class.getResource("/img/pencil.png")));
		btnEdit.setBackground(Color.CYAN);
		btnEdit.setBounds(525, 208, 32, 32);
		contentPane.add(btnEdit);
		
		JButton btndelete = new JButton("");
		btndelete.setIcon(new ImageIcon(FormQuanLyAccount.class.getResource("/img/delete.png")));
		btndelete.setBackground(Color.CYAN);
		btndelete.setBounds(525, 289, 32, 32);
		contentPane.add(btndelete);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(32, 419, 1022, 2);
		contentPane.add(separator);
		
		textField_1 = new JTextField();
		textField_1.setBounds(562, 351, 150, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSearch = new JButton("");
		btnSearch.setIcon(new ImageIcon(img_Logan));
		btnSearch.setBackground(Color.CYAN);
		btnSearch.setBounds(525, 350, 32, 32);
		contentPane.add(btnSearch);
	}
}
