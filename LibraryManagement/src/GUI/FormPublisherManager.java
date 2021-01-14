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

import BUS.PublisherBUS;
import DTO.PublisherDTO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class FormPublisherManager extends JFrame {
	
	private Image img_Search = new ImageIcon(FormQuanLyAccount.class.getResource("/img/loupe1.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private static JTextField txtAuthor;
	private static JTextField txtAddress;
	private static JTextField txtPhoneNumber;
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
		setBounds(100, 100, 600, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 128, 128), 3));
		setContentPane(contentPane);
		
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		
		JLabel txtX = new JLabel("X");
		txtX.setBounds(1065, 10, 25, 18);
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
		contentPane.setLayout(null);
		txtX.setHorizontalAlignment(SwingConstants.CENTER);
		txtX.setFont(new Font("Arial", Font.BOLD, 17));
		contentPane.add(txtX);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 359, 556, 271);
		scrollPane.setBorder(new LineBorder(new Color(0, 128, 128), 2));
		contentPane.add(scrollPane);
		
		tblPublisher = new JTable();
		tblPublisher.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		scrollPane.setViewportView(tblPublisher);
		
		JLabel lblNewLabel_2 = new JLabel("Publisher");
		lblNewLabel_2.setBounds(60, 10, 495, 55);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 30));
		contentPane.add(lblNewLabel_2);
		PublisherBUS.showPublisherList(tblPublisher);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(22, 85, 556, 241);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Phone Number");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_1.setBounds(10, 170, 110, 32);
		panel.add(lblNewLabel_3_1_1);
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setBounds(122, 169, 202, 32);
		panel.add(txtPhoneNumber);
		txtPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtPhoneNumber.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(122, 103, 202, 32);
		panel.add(txtAddress);
		txtAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAddress.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Address");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(10, 104, 78, 32);
		panel.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("Name Publisher");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 39, 98, 32);
		panel.add(lblNewLabel_3);
		
		txtAuthor = new JTextField();
		txtAuthor.setBounds(119, 39, 205, 32);
		panel.add(txtAuthor);
		txtAuthor.setFont(new Font("Arial", Font.BOLD, 18));
		txtAuthor.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(413, 47, 85, 21);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(413, 112, 85, 21);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(413, 178, 85, 21);
		panel.add(btnUpdate);
	}
	//get publisher
	public static PublisherDTO getPublisher() {
		PublisherDTO p = new PublisherDTO();
		p.setPublisherName(txtAuthor.getText());
		p.setAddress(txtAddress.getText());
		p.setPhoneNumber(txtPhoneNumber.getText());
		return p;
	}
}
