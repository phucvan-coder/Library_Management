package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import BUS.DangNhapBUS;
import DTO.AccountDTO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Panel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

public class FormDangNhap extends JFrame {

	private JPanel contentPane;
	private static JPasswordField pwdPassword;
	private static JTextField txtUserName;
	protected static int rank;
	//get Account
	public static AccountDTO getAccount() {
		AccountDTO user = new AccountDTO();
		user.setAccountName(txtUserName.getText());
		user.setPassword("123");
		return user;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormDangNhap frame = new FormDangNhap();
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
	public FormDangNhap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.setBackground(new Color(255, 250, 250));
		setContentPane(contentPane);
		
		setLocationRelativeTo(null);
		setUndecorated(true);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(336, 149, 300, 36);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(FormDangNhap.class.getResource("/img/rsz_user.png")));
		lblNewLabel_1.setBounds(270, 0, 30, 30);
		panel.add(lblNewLabel_1);
		
		txtUserName = new JTextField();
		txtUserName.setForeground(SystemColor.textInactiveText);
		txtUserName.setFont(new Font("Arial", Font.BOLD, 18));
		txtUserName.setBounds(10, 0, 219, 30);
		panel.add(txtUserName);
		txtUserName.setColumns(10);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(336, 223, 300, 36);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setForeground(SystemColor.textInactiveText);
		pwdPassword.setBounds(10, 0, 219, 30);
		panel_1.add(pwdPassword);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(FormDangNhap.class.getResource("/img/rsz_lock.png")));
		lblNewLabel_1_1.setBounds(270, 0, 30, 30);
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(DangNhapBUS.CheckAccount()) {
					JOptionPane.showMessageDialog(null,"Login successfully.","Alert",JOptionPane.INFORMATION_MESSAGE);
					rank = DangNhapBUS.checkRank();
					FormHomePage hp = new FormHomePage();
					hp.setVisible(true);
					hp.checkRank = rank;
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null,"Login failed.","Alert",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnNewButton.setBorder(new CompoundBorder());
		btnNewButton.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setBounds(336, 328, 90, 36);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Do You Want To Exit ?", "Notification", JOptionPane.YES_NO_OPTION)== 0){
					FormDangNhap.this.dispose();
				}
			}
		});
		btnCancel.setFont(new Font("Arial", Font.PLAIN, 15));
		btnCancel.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnCancel.setBackground(SystemColor.activeCaptionBorder);
		btnCancel.setBounds(546, 328, 90, 36);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_2 = new JLabel("Forgot password ?");
		lblNewLabel_2.setFont(new Font("Arial", Font.ITALIC, 15));
		lblNewLabel_2.setBounds(336, 271, 129, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel txtX = new JLabel("X");
		txtX.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Do You Want To Exit ?", "Notification", JOptionPane.YES_NO_OPTION)== 0){
						FormDangNhap.this.dispose();
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
		txtX.setHorizontalAlignment(SwingConstants.CENTER);
		txtX.setFont(new Font("Arial", Font.BOLD, 17));
		txtX.setBounds(750, 10, 25, 18);
		contentPane.add(txtX);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setForeground(SystemColor.textHighlight);
		panel_2.setBounds(0, 0, 219, 400);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(55, 80, 98, 129);
		panel_2.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(FormDangNhap.class.getResource("/img/rsz_libirary.png")));
		
		JLabel lblNewLabel_3 = new JLabel("User Name");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_3.setBounds(229, 149, 90, 36);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Password");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_3_1.setBounds(229, 223, 82, 36);
		contentPane.add(lblNewLabel_3_1);
		
		}
	}

