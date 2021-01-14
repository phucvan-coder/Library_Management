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
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class FormQuanLyAuthor extends JFrame {
	
	private Image img_Search = new ImageIcon(FormQuanLyAccount.class.getResource("/img/loupe1.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTable tblTacGia;
	private JTextField txtTacGia;
	private JTextField txtAddress;
	private JTextField txtPhoneNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormQuanLyAuthor frame = new FormQuanLyAuthor();
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
	public FormQuanLyAuthor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
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
						FormQuanLyAuthor.this.dispose();
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
		txtX.setBounds(1065, 10, 25, 18);
		contentPane.add(txtX);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.BLUE, 2));
		scrollPane.setBounds(10, 360, 392, 280);
		contentPane.add(scrollPane);
		
		tblTacGia = new JTable();
		tblTacGia.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		scrollPane.setViewportView(tblTacGia);
		
		JLabel lblNewLabel_2 = new JLabel("Author ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_2.setBounds(73, 10, 392, 55);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 75, 392, 275);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(98, 24, 252, 32);
		panel_2.add(panel);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		txtTacGia = new JTextField();
		txtTacGia.setFont(new Font("Arial", Font.BOLD, 18));
		txtTacGia.setBounds(0, 0, 205, 32);
		panel.add(txtTacGia);
		txtTacGia.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(215, 2, 32, 32);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(FormQuanLyAuthor.class.getResource("/img/human-resources.png")));
		
		JLabel lblNewLabel_3 = new JLabel("Name Author");
		lblNewLabel_3.setBounds(10, 24, 78, 32);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Address");
		lblNewLabel_3_1.setBounds(10, 77, 78, 32);
		panel_2.add(lblNewLabel_3_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(98, 77, 252, 32);
		panel_2.add(panel_1);
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAddress.setBounds(0, 0, 202, 32);
		panel_1.add(txtAddress);
		txtAddress.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(FormQuanLyAuthor.class.getResource("/img/book.png")));
		lblNewLabel_1.setBounds(216, 0, 32, 32);
		panel_1.add(lblNewLabel_1);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(10, 220, 85, 21);
		panel_2.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(146, 220, 85, 21);
		panel_2.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(266, 220, 85, 21);
		panel_2.add(btnUpdate);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Phone number");
		lblNewLabel_3_1_1.setBounds(10, 129, 78, 32);
		panel_2.add(lblNewLabel_3_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(98, 129, 252, 32);
		panel_2.add(panel_1_1);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(0, 0, 202, 32);
		panel_1_1.add(txtPhoneNumber);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(216, 0, 32, 32);
		panel_1_1.add(lblNewLabel_1_1);
	}
}
