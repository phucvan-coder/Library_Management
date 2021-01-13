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

public class FormPublisherManager extends JFrame {
	
	private Image img_Search = new ImageIcon(FormQuanLyAccount.class.getResource("/img/loupe1.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTextField txtTacGia;
	private JTextField txtTenSach;
	private JTextField textSearch;
	private JTextField txtPhoneNumber;
	private JTable tblPublisher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormPublisherManager frame = new FormPublisherManager();
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
	public FormPublisherManager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
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
						FormPublisherManager.this.dispose();
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
		scrollPane.setBounds(10, 349, 1080, 291);
		contentPane.add(scrollPane);
		
		tblPublisher = new JTable();
		tblPublisher.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		scrollPane.setViewportView(tblPublisher);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(140, 97, 252, 32);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtTacGia = new JTextField();
		txtTacGia.setFont(new Font("Arial", Font.BOLD, 18));
		txtTacGia.setBounds(0, 0, 205, 32);
		panel.add(txtTacGia);
		txtTacGia.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(215, 2, 32, 32);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(FormPublisherManager.class.getResource("/img/human-resources.png")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(140, 162, 252, 32);
		contentPane.add(panel_1);
		
		txtTenSach = new JTextField();
		txtTenSach.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTenSach.setBounds(0, 0, 202, 32);
		panel_1.add(txtTenSach);
		txtTenSach.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(FormPublisherManager.class.getResource("/img/book.png")));
		lblNewLabel_1.setBounds(216, 0, 32, 32);
		panel_1.add(lblNewLabel_1);
		
		JButton btnThem = new JButton("");
		btnThem.setIcon(new ImageIcon(FormPublisherManager.class.getResource("/img/plus-circular-button.png")));
		btnThem.setBounds(475, 97, 31, 31);
		contentPane.add(btnThem);
		
		JButton btnSua = new JButton("");
		btnSua.setIcon(new ImageIcon(FormPublisherManager.class.getResource("/img/pencil.png")));
		btnSua.setBounds(475, 162, 31, 31);
		contentPane.add(btnSua);
		
		JButton btnXoa = new JButton("");
		btnXoa.setIcon(new ImageIcon(FormPublisherManager.class.getResource("/img/delete.png")));
		btnXoa.setBounds(475, 229, 31, 31);
		contentPane.add(btnXoa);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(72, 330, 954, 8);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Publisher");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(204, 204, 0));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_2.setBounds(148, 10, 696, 55);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name Publisher");
		lblNewLabel_3.setBounds(52, 97, 78, 32);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Addres");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(52, 162, 78, 32);
		contentPane.add(lblNewLabel_3_1);
		
		JButton btnSearch = new JButton("");
		btnSearch.setIcon(new ImageIcon(img_Search));
		btnSearch.setBackground(Color.CYAN);
		btnSearch.setBounds(475, 271, 32, 32);
		contentPane.add(btnSearch);
		
		textSearch = new JTextField();
		textSearch.setColumns(10);
		textSearch.setBounds(517, 271, 150, 31);
		contentPane.add(textSearch);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Phone Number");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setBounds(52, 228, 78, 32);
		contentPane.add(lblNewLabel_3_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(140, 228, 252, 32);
		contentPane.add(panel_1_1);
		
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
