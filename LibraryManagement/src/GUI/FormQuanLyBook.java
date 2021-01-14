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
	private JTextField txtLoai;
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
		txtX.setBounds(1065, 10, 25, 18);
		contentPane.add(txtX);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBorder(new LineBorder(Color.BLUE, 2));
		scrollPane.setBounds(10, 335, 1080, 305);
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(40, 112, 258, 33);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(FormQuanLyBook.class.getResource("/img/2-squares.png")));
		lblNewLabel_2.setBounds(221, 0, 39, 32);
		panel_1.add(lblNewLabel_2);
		
		txtLoai = new JTextField();
		txtLoai.setText("Category Book.....");
		txtLoai.setFont(new Font("Arial", Font.BOLD, 20));
		txtLoai.setColumns(10);
		txtLoai.setBounds(0, 0, 221, 32);
		panel_1.add(txtLoai);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(40, 163, 258, 33);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(FormQuanLyBook.class.getResource("/img/human-resources.png")));
		lblNewLabel_2_1.setBounds(220, 0, 40, 33);
		panel_2.add(lblNewLabel_2_1);
		
		txtTacGia = new JTextField();
		txtTacGia.setText("Book Author.....");
		txtTacGia.setFont(new Font("Arial", Font.BOLD, 20));
		txtTacGia.setColumns(10);
		txtTacGia.setBounds(0, 0, 220, 33);
		panel_2.add(txtTacGia);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(151, 324, 800, 2);
		contentPane.add(separator);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.BLUE, 2));
		panel_5.setBounds(10, 54, 345, 259);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(40, 153, 258, 33);
		panel_5.add(panel);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		txtSach = new JTextField();
		txtSach.setBounds(0, 0, 224, 33);
		panel.add(txtSach);
		txtSach.setFont(new Font("Arial", Font.BOLD, 20));
		txtSach.setText("Book title.....");
		txtSach.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(219, 0, 39, 32);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(FormQuanLyBook.class.getResource("/img/book.png")));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(40, 196, 258, 33);
		panel_5.add(panel_4);
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Still ", "Out ", "Damaged "}));
		comboBox.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		comboBox.setBounds(202, 0, 56, 30);
		panel_4.add(comboBox);
		
		JLabel lblStatus = new JLabel("Book Status\r\n");
		lblStatus.setBounds(0, 0, 157, 30);
		panel_4.add(lblStatus);
		lblStatus.setFont(new Font("Arial", Font.BOLD, 20));
		
		JLabel lblNewLabel_1 = new JLabel("Book Management");
		lblNewLabel_1.setForeground(new Color(204, 204, 0));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(273, 10, 500, 63);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSua = new JButton("");
		btnSua.setIcon(new ImageIcon(FormQuanLyBook.class.getResource("/img/pencil.png")));
		btnSua.setBounds(501, 163, 30, 30);
		contentPane.add(btnSua);
		
		JButton btnThem = new JButton("");
		btnThem.setIcon(new ImageIcon(FormQuanLyBook.class.getResource("/img/plus-circular-button.png")));
		btnThem.setBounds(501, 83, 30, 30);
		contentPane.add(btnThem);
	}
}
