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
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class FormQuanLyBorrow_Return extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField txtNameLib;
	private JTextField txtBookCode;
	private JTextField txtAmount;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormQuanLyBorrow_Return frame = new FormQuanLyBorrow_Return();
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
	public FormQuanLyBorrow_Return() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 255), 4));
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
					FormQuanLyBorrow_Return.this.dispose();
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
		txtX.setBounds(1065, 10, 25, 18);
		contentPane.add(txtX);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.BLUE, 2));
		scrollPane.setBounds(10, 391, 1080, 249);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		
		JLabel lblNewLabel = new JLabel("Manage Borrow and Return Books");
		lblNewLabel.setForeground(new Color(204, 204, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(286, 10, 504, 51);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(31, 88, 410, 271);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 10, 373, 32);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtBookCode = new JTextField();
		txtBookCode.setFont(new Font("Arial", Font.BOLD, 18));
		txtBookCode.setColumns(10);
		txtBookCode.setBounds(161, 0, 170, 32);
		panel_1.add(txtBookCode);
		
		JLabel lblNewLabel_1 = new JLabel("Book code");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(0, 0, 151, 32);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(FormQuanLyBorrow_Return.class.getResource("/img/coding.png")));
		lblNewLabel_3.setBounds(341, 0, 32, 32);
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(10, 69, 373, 32);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Borrowing Date");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(0, 0, 151, 32);
		panel_1_1.add(lblNewLabel_1_1);
		
		JDateChooser dateBorrow = new JDateChooser();
		dateBorrow.setBounds(161, 0, 212, 32);
		panel_1_1.add(dateBorrow);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(10, 123, 373, 32);
		panel.add(panel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Returning Date");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(0, 0, 151, 32);
		panel_1_2.add(lblNewLabel_1_1_1);
		
		JDateChooser dateReturn = new JDateChooser();
		dateReturn.setBounds(161, 0, 212, 32);
		panel_1_2.add(dateReturn);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(Color.WHITE);
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(10, 176, 373, 32);
		panel.add(panel_1_3);
		
		txtAmount = new JTextField();
		txtAmount.setFont(new Font("Arial", Font.BOLD, 18));
		txtAmount.setColumns(10);
		txtAmount.setBounds(160, 0, 171, 32);
		panel_1_3.add(txtAmount);
		
		JLabel lblNewLabel_2 = new JLabel("Amount");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2.setBounds(0, 0, 136, 32);
		panel_1_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(FormQuanLyBorrow_Return.class.getResource("/img/steps.png")));
		lblNewLabel_3_1.setBounds(341, 0, 32, 32);
		panel_1_3.add(lblNewLabel_3_1);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBackground(Color.WHITE);
		panel_1_4.setLayout(null);
		panel_1_4.setBounds(10, 225, 373, 32);
		panel.add(panel_1_4);
		
		txtNameLib = new JTextField();
		txtNameLib.setFont(new Font("Arial", Font.BOLD, 18));
		txtNameLib.setBounds(161, 0, 170, 32);
		panel_1_4.add(txtNameLib);
		txtNameLib.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Name Libraarian's");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(0, 0, 173, 32);
		panel_1_4.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon(FormQuanLyBorrow_Return.class.getResource("/img/rsz_user.png")));
		lblNewLabel_3_2.setBounds(341, 0, 32, 32);
		panel_1_4.add(lblNewLabel_3_2);
		
		JButton btnThem = new JButton("");
		btnThem.setIcon(new ImageIcon(FormQuanLyBorrow_Return.class.getResource("/img/plus-circular-button.png")));
		btnThem.setBounds(531, 116, 32, 32);
		contentPane.add(btnThem);
		
		JButton btnSua = new JButton("");
		btnSua.setIcon(new ImageIcon(FormQuanLyBorrow_Return.class.getResource("/img/pencil.png")));
		btnSua.setBounds(531, 205, 32, 32);
		contentPane.add(btnSua);
		
		JButton btnXoa = new JButton("");
		btnXoa.setIcon(new ImageIcon(FormQuanLyBorrow_Return.class.getResource("/img/delete.png")));
		btnXoa.setBounds(531, 290, 32, 32);
		contentPane.add(btnXoa);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(654, 189, 373, 32);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setText("Enter keywords ......");
		textField.setFont(new Font("Arial", Font.ITALIC, 18));
		textField.setColumns(10);
		textField.setBounds(0, 0, 308, 33);
		panel_2.add(textField);
		
		JButton btnTim = new JButton("");
		btnTim.setIcon(new ImageIcon(FormQuanLyBorrow_Return.class.getResource("/img/loupe.png")));
		btnTim.setBounds(341, 0, 32, 32);
		panel_2.add(btnTim);
	}
}
