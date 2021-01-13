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
	private JTextField txtNumberphone;
	private JTextField txtAddress;
	private JTextField txtTimKiem;

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
		txtX.setBounds(1065, 0, 35, 28);
		contentPane.add(txtX);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 433, 1080, 207);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 70, 363, 353);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(48, 11, 305, 33);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Arial", Font.BOLD, 18));
		txtName.setText("Name");
		txtName.setBounds(0, 0, 239, 33);
		panel_1.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(FormQuanLyMember.class.getResource("/img/name.png")));
		lblNewLabel_3.setBounds(273, 2, 32, 32);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBounds(113, 130, 240, 33);
		panel.add(panel_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(0, 0, 240, 33);
		panel_1_2.add(comboBox);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBackground(Color.WHITE);
		panel_1_3.setBounds(48, 196, 305, 33);
		panel.add(panel_1_3);
		
		txtNumberphone = new JTextField();
		txtNumberphone.setText("NumberPhone");
		txtNumberphone.setFont(new Font("Arial", Font.BOLD, 18));
		txtNumberphone.setColumns(10);
		txtNumberphone.setBounds(0, 0, 263, 33);
		panel_1_3.add(txtNumberphone);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(FormQuanLyMember.class.getResource("/img/phone-call.png")));
		lblNewLabel_3_1.setBounds(273, 1, 32, 32);
		panel_1_3.add(lblNewLabel_3_1);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBackground(Color.WHITE);
		panel_1_4.setBounds(48, 252, 305, 33);
		panel.add(panel_1_4);
		
		txtAddress = new JTextField();
		txtAddress.setText("Address");
		txtAddress.setFont(new Font("Arial", Font.BOLD, 18));
		txtAddress.setColumns(10);
		txtAddress.setBounds(0, 0, 263, 33);
		panel_1_4.add(txtAddress);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon(FormQuanLyMember.class.getResource("/img/placeholder.png")));
		lblNewLabel_3_2.setBounds(273, 0, 32, 32);
		panel_1_4.add(lblNewLabel_3_2);
		
		JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setLayout(null);
		panel_1_2_2.setBackground(Color.WHITE);
		panel_1_2_2.setBounds(48, 309, 305, 33);
		panel.add(panel_1_2_2);
		
		JLabel lblNewLabel_1 = new JLabel("Rank");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(0, 0, 175, 33);
		panel_1_2_2.add(lblNewLabel_1);
		
		JComboBox cmbRank = new JComboBox();
		cmbRank.setFont(new Font("Arial Black", Font.PLAIN, 15));
		cmbRank.setBounds(238, 0, 67, 33);
		panel_1_2_2.add(cmbRank);
		
		JDateChooser dtpBirthday = new JDateChooser();
		dtpBirthday.setBounds(69, 75, 284, 33);
		panel.add(dtpBirthday);
		
		JLabel lblNewLabel = new JLabel("Gender");
		lblNewLabel.setBounds(48, 130, 71, 33);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBackground(Color.WHITE);
		panel_1_2_1.setBounds(668, 188, 363, 33);
		contentPane.add(panel_1_2_1);
		
		txtTimKiem = new JTextField();
		txtTimKiem.setBounds(0, 0, 304, 33);
		panel_1_2_1.add(txtTimKiem);
		txtTimKiem.setText("Enter keywords ......");
		txtTimKiem.setFont(new Font("Arial", Font.ITALIC, 18));
		txtTimKiem.setColumns(10);
		
		JButton btnTim = new JButton("");
		btnTim.setBackground(Color.WHITE);
		btnTim.setIcon(new ImageIcon(FormQuanLyMember.class.getResource("/img/loupe.png")));
		btnTim.setBounds(329, 1, 32, 32);
		panel_1_2_1.add(btnTim);
		
		JButton btnThem = new JButton("");
		btnThem.setIcon(new ImageIcon(FormQuanLyMember.class.getResource("/img/plus-circular-button.png")));
		btnThem.setBounds(482, 117, 32, 32);
		contentPane.add(btnThem);
		
		JButton btnSua = new JButton("");
		btnSua.setIcon(new ImageIcon(FormQuanLyMember.class.getResource("/img/pencil.png")));
		btnSua.setBounds(482, 215, 32, 32);
		contentPane.add(btnSua);
		
		JButton btnXoa = new JButton("");
		btnXoa.setIcon(new ImageIcon(FormQuanLyMember.class.getResource("/img/delete.png")));
		btnXoa.setBounds(482, 305, 32, 32);
		contentPane.add(btnXoa);
		
		JLabel lblNewLabel_2 = new JLabel("MemBer Management ");
		lblNewLabel_2.setForeground(new Color(204, 204, 0));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_2.setBounds(292, 10, 488, 50);
		contentPane.add(lblNewLabel_2);
	}
}
