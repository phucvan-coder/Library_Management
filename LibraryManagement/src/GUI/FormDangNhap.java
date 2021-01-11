package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
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

public class FormDangNhap extends JFrame {

	private JPanel contentPane;
	private JPasswordField pwdPassword;
	private JTextField txtUserName;

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
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 255), 3));
		setContentPane(contentPane);
		
		setLocationRelativeTo(null);
		setUndecorated(true);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FormDangNhap.class.getResource("/img/rsz_libirary.png")));
		lblNewLabel.setBounds(252, 10, 90, 90);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(98, 123, 400, 3);
		contentPane.add(separator);
		
		Panel panel = new Panel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(145, 148, 300, 36);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(FormDangNhap.class.getResource("/img/rsz_user.png")));
		lblNewLabel_1.setBounds(270, 0, 30, 30);
		panel.add(lblNewLabel_1);
		
		txtUserName = new JTextField();
		txtUserName.setFont(new Font("Arial", Font.BOLD, 18));
		txtUserName.setText("Username");
		txtUserName.setBounds(10, 0, 219, 30);
		panel.add(txtUserName);
		txtUserName.setColumns(10);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(145, 222, 300, 36);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("Password");
		pwdPassword.setBounds(10, 0, 219, 30);
		panel_1.add(pwdPassword);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(FormDangNhap.class.getResource("/img/rsz_lock.png")));
		lblNewLabel_1_1.setBounds(270, 0, 30, 30);
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBorder(new LineBorder(Color.BLUE, 2));
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(184, 311, 90, 36);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		btnCancel.setBorder(new LineBorder(Color.BLUE, 2));
		btnCancel.setBackground(Color.YELLOW);
		btnCancel.setBounds(310, 311, 90, 36);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_2 = new JLabel("Forgot password ?");
		lblNewLabel_2.setFont(new Font("Arial", Font.ITALIC, 15));
		lblNewLabel_2.setBounds(155, 264, 129, 29);
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
		txtX.setBounds(565, 10, 25, 18);
		contentPane.add(txtX);
		
		}
	}

