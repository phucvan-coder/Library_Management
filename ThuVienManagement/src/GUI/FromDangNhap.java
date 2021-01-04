package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;

import jdk.internal.vm.compiler.libgraal.LibGraalIsolate;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;

public class FromDangNhap extends JFrame {

	private static final String True = null;
	private JPanel contentPane;
	private JTextField txtUserName;
	private JPasswordField txtPassword;
	private JButton btnCancel;
	private JLabel lbliconlogo;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblforgot;
	
	//private Image imglogo = new ImageIcon(FromDangNhap.class.getResource("img/Libirary.png")).getImage().getScaledInstance(90, 90,Image.SCALE_SMOOTH);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FromDangNhap frame = new FromDangNhap();
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
	public FromDangNhap() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 255), 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(163, 127, 300, 41);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUserName = new JTextField();
		txtUserName.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtUserName.setText("UserName");
		txtUserName.setBounds(10, 11, 190, 20);
		panel.add(txtUserName);
		txtUserName.setColumns(10);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(FromDangNhap.class.getResource("/img/rsz_user.png")));
		lblNewLabel.setBounds(245, 0, 45, 41);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(163, 205, 300, 41);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.setText("Password");
		txtPassword.setBounds(10, 10, 190, 20);
		panel_1.add(txtPassword);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(FromDangNhap.class.getResource("/img/rsz_lock.png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(245, 0, 45, 41);
		panel_1.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(245, 10, 45, 41);
		panel_1.add(lblNewLabel_2);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBorder(new LineBorder(Color.BLUE, 2));
		btnLogin.setBackground(Color.YELLOW);
		btnLogin.setFont(new Font("Source Code Pro", Font.BOLD | Font.ITALIC, 18));
		btnLogin.setBounds(198, 301, 86, 41);
		contentPane.add(btnLogin);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Source Code Pro", Font.BOLD | Font.ITALIC, 18));
		btnCancel.setBorder(new LineBorder(Color.BLUE, 2));
		btnCancel.setBackground(Color.YELLOW);
		btnCancel.setBounds(345, 301, 86, 41);
		contentPane.add(btnCancel);
		
		JLabel lblX = new JLabel("X");
		lblX.setVerticalAlignment(SwingConstants.BOTTOM);
		lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(570, 10, 20, 20);
		contentPane.add(lblX);
		
		lbliconlogo = new JLabel("");
		lbliconlogo.setHorizontalAlignment(SwingConstants.CENTER);
		lbliconlogo.setIcon(new ImageIcon(FromDangNhap.class.getResource("/img/rsz_libirary.png")));
		lbliconlogo.setBounds(242,10,132,107);
		contentPane.add(lbliconlogo);
		
		lblforgot = new JLabel("Forgot password ?");
		lblforgot.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblforgot.setHorizontalAlignment(SwingConstants.CENTER);
		lblforgot.setBounds(149, 256, 151, 28);
		contentPane.add(lblforgot);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(128, 116, 368, 2);
		contentPane.add(separator);
		//lbliconlogo.setIcon(new ImageIcon(imglogo));
		setLocationRelativeTo(null);
		
		
	}
}
