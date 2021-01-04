package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;

public class FormQuanliBook extends JFrame {

	private JPanel contentPane;
	private JTable tblBook;
	private JTextField txtNameBook;
	private JTextField txtCategory;
	private JTextField txtAuthor;
	private JTextField txtQuantity;
	private JLabel lblNewLabel;
	private JButton btnAdd;
	private JButton btnEdit;
	private JButton btnDelete;
	private JButton btnSave;
	private JPanel panel_4;
	private JPanel panel_5;
	private JLabel lblNewLabel_1;
	private JTextField txtFind;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormQuanliBook frame = new FormQuanliBook();
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
	public FormQuanliBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 255), 3));
		setContentPane(contentPane);
		
		setLocationRelativeTo(null);
		setUndecorated(true);
		contentPane.setLayout(null);
		
		
		
		JLabel lblX = new JLabel("X");
		lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(860, 10, 30, 30);
		contentPane.add(lblX);
		
		tblBook = new JTable();
		tblBook.setBounds(10, 430, 880, 260);
		contentPane.add(tblBook);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(29, 80, 256, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtNameBook = new JTextField();
		txtNameBook.setBounds(10, 10, 175, 25);
		panel.add(txtNameBook);
		txtNameBook.setHorizontalAlignment(SwingConstants.CENTER);
		txtNameBook.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtNameBook.setText("T\u00EAn S\u00E1ch");
		txtNameBook.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(FormQuanliBook.class.getResource("/img/book.png")));
		lblNewLabel_3.setBounds(214, 3, 32, 32);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(29, 153, 256, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtCategory = new JTextField();
		txtCategory.setText("Th\u1EC3 Lo\u1EA1i");
		txtCategory.setHorizontalAlignment(SwingConstants.CENTER);
		txtCategory.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtCategory.setColumns(10);
		txtCategory.setBounds(10, 10, 175, 25);
		panel_1.add(txtCategory);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(FormQuanliBook.class.getResource("/img/2-squares.png")));
		lblNewLabel_3_1.setBounds(214, 3, 32, 32);
		panel_1.add(lblNewLabel_3_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(29, 227, 256, 40);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		txtAuthor = new JTextField();
		txtAuthor.setBounds(10, 10, 175, 25);
		panel_2.add(txtAuthor);
		txtAuthor.setHorizontalAlignment(SwingConstants.CENTER);
		txtAuthor.setText("T\u00E1c Gi\u1EA3");
		txtAuthor.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtAuthor.setColumns(10);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon(FormQuanliBook.class.getResource("/img/human-resources.png")));
		lblNewLabel_3_1_1.setBounds(214, 3, 32, 32);
		panel_2.add(lblNewLabel_3_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(29, 298, 256, 40);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		txtQuantity = new JTextField();
		txtQuantity.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtQuantity.setText("S\u1ED1 L\u01B0\u1EE3ng");
		txtQuantity.setHorizontalAlignment(SwingConstants.CENTER);
		txtQuantity.setColumns(10);
		txtQuantity.setBounds(10, 10, 175, 25);
		panel_3.add(txtQuantity);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1.setIcon(new ImageIcon(FormQuanliBook.class.getResource("/img/steps.png")));
		lblNewLabel_3_1_1_1.setBounds(214, 3, 32, 32);
		panel_3.add(lblNewLabel_3_1_1_1);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setBounds(29, 369, 256, 40);
		contentPane.add(panel_3_1);
		
		JComboBox cmbStatus = new JComboBox();
		cmbStatus.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		cmbStatus.setModel(new DefaultComboBoxModel(new String[] {"C\u00F2n", "H\u1EBFt", "M\u1EA5t"}));
		cmbStatus.setBounds(185, 10, 61, 21);
		panel_3_1.add(cmbStatus);
		
		lblNewLabel = new JLabel("T\u00ECnh Tr\u1EA1ng");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(48, 7, 113, 20);
		panel_3_1.add(lblNewLabel);
		
		btnAdd = new JButton("");
		btnAdd.setIcon(new ImageIcon(FormQuanliBook.class.getResource("/img/plus-circular-button.png")));
		btnAdd.setBounds(420, 132, 32, 32);
		contentPane.add(btnAdd);
		
		btnEdit = new JButton("");
		btnEdit.setIcon(new ImageIcon(FormQuanliBook.class.getResource("/img/pencil.png")));
		btnEdit.setBounds(420, 198, 32, 32);
		contentPane.add(btnEdit);
		
		btnDelete = new JButton("");
		btnDelete.setIcon(new ImageIcon(FormQuanliBook.class.getResource("/img/delete.png")));
		btnDelete.setBounds(420, 321, 32, 32);
		contentPane.add(btnDelete);
		
		btnSave = new JButton("");
		btnSave.setIcon(new ImageIcon(FormQuanliBook.class.getResource("/img/save.png")));
		btnSave.setBounds(420, 260, 32, 32);
		contentPane.add(btnSave);
		
		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(10, 66, 305, 356);
		contentPane.add(panel_4);
		
		panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(516, 252, 342, 40);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		txtFind = new JTextField();
		txtFind.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtFind.setText("T\u1EEB Kh\u00F3a........");
		txtFind.setBounds(10, 10, 290, 24);
		panel_5.add(txtFind);
		txtFind.setColumns(10);
		
		JButton btnFind = new JButton("");
		btnFind.setIcon(new ImageIcon(FormQuanliBook.class.getResource("/img/loupe.png")));
		btnFind.setBounds(303, 0, 39, 39);
		panel_5.add(btnFind);
		
		lblNewLabel_1 = new JLabel("T\u00ECm Ki\u1EBFm");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(595, 216, 172, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Qu\u1EA3n L\u00ED S\u00E1ch");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 38));
		lblNewLabel_2.setBounds(301, 10, 286, 51);
		contentPane.add(lblNewLabel_2);
	}
}
