package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

public class FormQuanLyBook extends JFrame {

	private JPanel contentPane;
	private JTextField txtSach;
	private JTextField txtCategory;
	private JTextField txtTacGia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormQuanLyBook frame = new FormQuanLyBook();
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
	public FormQuanLyBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 128, 128), 3));
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
						FormQuanLyBook.this.dispose();
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
		txtX.setBounds(765, 10, 25, 18);
		contentPane.add(txtX);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(Color.BLUE, 2));
		scrollPane.setBounds(10, 360, 780, 280);
		contentPane.add(scrollPane);
		
		JTable tblBook = new JTable();
		tblBook.setBackground(Color.WHITE);
		tblBook.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Book Name", "Type of Book", "Author", "Borrow Date", "Return Date"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tblBook.setFont(new Font("Arial", Font.BOLD, 20));
		scrollPane.setViewportView(tblBook);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(95, 158, 160));
		panel_5.setBorder(new LineBorder(Color.BLUE, 2));
		panel_5.setBounds(10, 86, 780, 236);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(106, 35, 258, 33);
		panel_5.add(panel);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		txtSach = new JTextField();
		txtSach.setBounds(0, 0, 224, 33);
		panel.add(txtSach);
		txtSach.setFont(new Font("Arial", Font.BOLD, 20));
		txtSach.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(219, 0, 39, 32);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(FormQuanLyBook.class.getResource("/img/book.png")));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(490, 99, 258, 33);
		panel_5.add(panel_4);
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Still ", "Out ", "Damaged "}));
		comboBox.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		comboBox.setBounds(202, 0, 56, 30);
		panel_4.add(comboBox);
		
		JLabel lblStatus = new JLabel("");
		lblStatus.setBounds(0, 0, 157, 30);
		panel_4.add(lblStatus);
		lblStatus.setFont(new Font("Arial", Font.BOLD, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(490, 35, 258, 33);
		panel_5.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(FormQuanLyBook.class.getResource("/img/2-squares.png")));
		lblNewLabel_2.setBounds(221, 0, 37, 32);
		panel_1.add(lblNewLabel_2);
		
		txtCategory = new JTextField();
		txtCategory.setFont(new Font("Arial", Font.BOLD, 20));
		txtCategory.setColumns(10);
		txtCategory.setBounds(0, 0, 221, 32);
		panel_1.add(txtCategory);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(106, 99, 258, 33);
		panel_5.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(FormQuanLyBook.class.getResource("/img/human-resources.png")));
		lblNewLabel_2_1.setBounds(220, 0, 38, 33);
		panel_2.add(lblNewLabel_2_1);
		
		txtTacGia = new JTextField();
		txtTacGia.setFont(new Font("Arial", Font.BOLD, 20));
		txtTacGia.setColumns(10);
		txtTacGia.setBounds(0, 0, 220, 33);
		panel_2.add(txtTacGia);
		
		JLabel lblNewLabel_3 = new JLabel("Name Book");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 35, 86, 33);
		panel_5.add(lblNewLabel_3);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(412, 160, 85, 33);
		panel_5.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(532, 160, 85, 33);
		panel_5.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(653, 160, 85, 33);
		panel_5.add(btnUpdate);
		
		JLabel lblNewLabel_3_1 = new JLabel("Book Author");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(10, 99, 86, 33);
		panel_5.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Category");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_2.setBounds(390, 35, 86, 33);
		panel_5.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Status");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_3.setBounds(390, 99, 86, 33);
		panel_5.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_1 = new JLabel("Book Management");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(148, 10, 439, 63);
		contentPane.add(lblNewLabel_1);
	}
}
