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

public class FormQuanLyAccount extends JFrame {

	private JPanel contentPane;
	private JTable tblTaiKhoan;
	private JTextField txtPassword;
	private JTextField txtIdMember;
	private JTextField txtname;

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
		contentPane.setBackground(Color.CYAN);
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
		
		tblTaiKhoan = new JTable();
		scrollPane.setViewportView(tblTaiKhoan);
		
		JLabel lblNewLabel = new JLabel("Account Management");
		lblNewLabel.setForeground(new Color(204, 204, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(410, 10, 317, 43);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 73, 338, 319);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 39, 287, 33);
		panel_1.add(panel);
		panel.setLayout(null);
		
		txtname = new JTextField();
		txtname.setText("Name");
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
		panel_2_2.setBounds(10, 104, 287, 32);
		panel_1.add(panel_2_2);
		
		txtIdMember = new JTextField();
		txtIdMember.setBounds(0, 0, 243, 32);
		panel_2_2.add(txtIdMember);
		txtIdMember.setText("ID Member");
		txtIdMember.setFont(new Font("Arial", Font.BOLD, 18));
		txtIdMember.setColumns(10);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon(FormQuanLyAccount.class.getResource("/img/account.png")));
		lblNewLabel_2_1_1.setBounds(253, 0, 32, 32);
		panel_2_2.add(lblNewLabel_2_1_1);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(Color.WHITE);
		panel_2_3.setLayout(null);
		panel_2_3.setBounds(10, 174, 287, 32);
		panel_1.add(panel_2_3);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(0, 0, 243, 32);
		panel_2_3.add(txtPassword);
		txtPassword.setText("Password");
		txtPassword.setFont(new Font("Arial", Font.BOLD, 18));
		txtPassword.setColumns(10);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1.setIcon(new ImageIcon(FormQuanLyAccount.class.getResource("/img/key.png")));
		lblNewLabel_2_1_1_1.setBounds(253, 0, 32, 32);
		panel_2_3.add(lblNewLabel_2_1_1_1);
		
		JPanel panel_2_3_1 = new JPanel();
		panel_2_3_1.setBackground(Color.WHITE);
		panel_2_3_1.setLayout(null);
		panel_2_3_1.setBounds(10, 245, 287, 32);
		panel_1.add(panel_2_3_1);
		
		JComboBox cmbRank = new JComboBox();
		cmbRank.setBounds(223, 0, 64, 32);
		panel_2_3_1.add(cmbRank);
		
		JLabel lblRank = new JLabel(" Rank");
		lblRank.setBounds(0, -2, 206, 32);
		panel_2_3_1.add(lblRank);
		lblRank.setBackground(Color.WHITE);
		lblRank.setFont(new Font("Arial", Font.BOLD, 18));
		lblRank.setForeground(Color.BLACK);
		
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
	}
}
