package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class FormQuanliAuthor extends JFrame {

	private JPanel contentPane;
	private JTable tblAuthor;
	private JTextField textField;
	private JTextField txtAuthor;
	private JTextField txtBook;
	private JTextField txtCategory;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormQuanliAuthor frame = new FormQuanliAuthor();
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
	public FormQuanliAuthor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.BLUE, 3));
		setContentPane(contentPane);
		
		setLocationRelativeTo(null);
		setUndecorated(true);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		tblAuthor = new JTable();
		tblAuthor.setBounds(10, 440, 880, 260);
		contentPane.add(tblAuthor);
		
		JLabel lblNewLabel_2 = new JLabel("Qu\u1EA3n L\u00ED T\u00E1c Gi\u1EA3");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 38));
		lblNewLabel_2.setBounds(276, 10, 348, 51);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(548, 240, 342, 40);
		contentPane.add(panel_5);
		
		textField = new JTextField();
		textField.setText("T\u1EEB Kh\u00F3a........");
		textField.setFont(new Font("Tahoma", Font.ITALIC, 15));
		textField.setColumns(10);
		textField.setBounds(10, 10, 290, 24);
		panel_5.add(textField);
		
		JButton btnFind = new JButton("");
		btnFind.setIcon(new ImageIcon(FormQuanliAuthor.class.getResource("/img/loupe.png")));
		btnFind.setBounds(303, 0, 39, 39);
		panel_5.add(btnFind);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00ECm Ki\u1EBFm");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(627, 204, 172, 26);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 93, 256, 40);
		contentPane.add(panel_2);
		
		txtAuthor = new JTextField();
		txtAuthor.setText("T\u00E1c Gi\u1EA3");
		txtAuthor.setHorizontalAlignment(SwingConstants.CENTER);
		txtAuthor.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtAuthor.setColumns(10);
		txtAuthor.setBounds(10, 10, 175, 25);
		panel_2.add(txtAuthor);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(FormQuanliAuthor.class.getResource("/img/human-resources.png")));
		lblNewLabel_3_1.setBounds(224, 3, 32, 32);
		panel_2.add(lblNewLabel_3_1);
		
		JButton btnAdd = new JButton("");
		btnAdd.setIcon(new ImageIcon(FormQuanliAuthor.class.getResource("/img/plus-circular-button.png")));
		btnAdd.setBounds(409, 122, 32, 32);
		contentPane.add(btnAdd);
		
		JButton btnEdit = new JButton("");
		btnEdit.setIcon(new ImageIcon(FormQuanliAuthor.class.getResource("/img/pencil.png")));
		btnEdit.setBounds(409, 188, 32, 32);
		contentPane.add(btnEdit);
		
		JButton btnSave = new JButton("");
		btnSave.setIcon(new ImageIcon(FormQuanliAuthor.class.getResource("/img/save.png")));
		btnSave.setBounds(409, 250, 32, 32);
		contentPane.add(btnSave);
		
		JButton btnDelete = new JButton("");
		btnDelete.setIcon(new ImageIcon(FormQuanliAuthor.class.getResource("/img/delete.png")));
		btnDelete.setBounds(409, 311, 32, 32);
		contentPane.add(btnDelete);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(10, 222, 256, 40);
		contentPane.add(panel_2_1);
		
		txtBook = new JTextField();
		txtBook.setText("T\u00EAn S\u00E1ch");
		txtBook.setHorizontalAlignment(SwingConstants.CENTER);
		txtBook.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtBook.setColumns(10);
		txtBook.setBounds(10, 10, 175, 25);
		panel_2_1.add(txtBook);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(214, 3, 32, 32);
		panel_2_1.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(FormQuanliAuthor.class.getResource("/img/book.png")));
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(Color.WHITE);
		panel_2_1_1.setBounds(10, 291, 256, 40);
		contentPane.add(panel_2_1_1);
		
		txtCategory = new JTextField();
		txtCategory.setText("Th\u1EC3 Lo\u1EA1i");
		txtCategory.setHorizontalAlignment(SwingConstants.CENTER);
		txtCategory.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtCategory.setColumns(10);
		txtCategory.setBounds(10, 10, 175, 25);
		panel_2_1_1.add(txtCategory);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon(FormQuanliAuthor.class.getResource("/img/2-squares.png")));
		lblNewLabel_3_1_1.setBounds(224, 3, 32, 32);
		panel_2_1_1.add(lblNewLabel_3_1_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBounds(10, 154, 256, 40);
		contentPane.add(panel_2_2);
		
	}
}
