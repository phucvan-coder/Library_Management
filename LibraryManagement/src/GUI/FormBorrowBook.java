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
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;

public class FormBorrowBook extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumberBook;
	private JLabel lblNewLabel_2;
	private JDateChooser dateBorrow;
	private JTable tblBorrowBook;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormBorrowBook frame = new FormBorrowBook();
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
	public FormBorrowBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
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
					FormBorrowBook.this.dispose();
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
		
		JLabel lblNewLabel = new JLabel("Borrow Book");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(231, 11, 245, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number of books borrowed:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(16, 496, 245, 44);
		contentPane.add(lblNewLabel_1);
		
		txtNumberBook = new JTextField();
		txtNumberBook.setBounds(247, 511, 46, 19);
		contentPane.add(txtNumberBook);
		txtNumberBook.setColumns(10);
		
		JComboBox cmbBookType = new JComboBox();
		cmbBookType.setBounds(108, 101, 208, 22);
		contentPane.add(cmbBookType);
		
		JComboBox cmdIdMember = new JComboBox();
		cmdIdMember.setBounds(108, 201, 208, 22);
		contentPane.add(cmdIdMember);
		
		JComboBox cmbBookName = new JComboBox();
		cmbBookName.setBounds(108, 151, 208, 22);
		contentPane.add(cmbBookName);
		
		lblNewLabel_2 = new JLabel("Type of Book");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(16, 109, 82, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Name of Book");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(25, 159, 73, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("ID Member");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(25, 209, 73, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3 = new JLabel("Borrow Date");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(366, 110, 69, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Return Date");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(366, 163, 69, 14);
		contentPane.add(lblNewLabel_3_1);
		
		dateBorrow = new JDateChooser();
		dateBorrow.setBounds(445, 104, 208, 20);
		contentPane.add(dateBorrow);
		
		JDateChooser dateRefund = new JDateChooser();
		dateRefund.setBounds(445, 157, 208, 20);
		contentPane.add(dateRefund);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(366, 205, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(465, 205, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(564, 205, 89, 23);
		contentPane.add(btnUpdate);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 259, 680, 231);
		contentPane.add(scrollPane);
		
		tblBorrowBook = new JTable();
		scrollPane.setColumnHeaderView(tblBorrowBook);
		
		JButton btnComfirm = new JButton("Confirm");
		btnComfirm.setBounds(564, 509, 89, 23);
		contentPane.add(btnComfirm);
	}
}
