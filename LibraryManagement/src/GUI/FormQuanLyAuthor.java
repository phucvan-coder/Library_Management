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
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class FormQuanLyAuthor extends JFrame {

	private JPanel contentPane;
	private JTable tblTacGia;
	private JTextField txtTacGia;
	private JTextField txtTenSach;
	private JTextField txtTimKiem;

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
		setBounds(100, 100, 1100, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
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
		scrollPane.setBounds(10, 349, 1080, 291);
		contentPane.add(scrollPane);
		
		tblTacGia = new JTable();
		tblTacGia.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		scrollPane.setViewportView(tblTacGia);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(72, 120, 252, 32);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtTacGia = new JTextField();
		txtTacGia.setFont(new Font("Arial", Font.BOLD, 18));
		txtTacGia.setText("Name Author...");
		txtTacGia.setBounds(0, 0, 205, 32);
		panel.add(txtTacGia);
		txtTacGia.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(215, 2, 32, 32);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(FormQuanLyAuthor.class.getResource("/img/human-resources.png")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(72, 199, 252, 32);
		contentPane.add(panel_1);
		
		txtTenSach = new JTextField();
		txtTenSach.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTenSach.setText("Name Book...");
		txtTenSach.setBounds(0, 0, 202, 32);
		panel_1.add(txtTenSach);
		txtTenSach.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(FormQuanLyAuthor.class.getResource("/img/book.png")));
		lblNewLabel_1.setBounds(216, 0, 32, 32);
		panel_1.add(lblNewLabel_1);
		
		JButton btnThem = new JButton("");
		btnThem.setIcon(new ImageIcon(FormQuanLyAuthor.class.getResource("/img/plus-circular-button.png")));
		btnThem.setBounds(475, 97, 31, 31);
		contentPane.add(btnThem);
		
		JButton btnSua = new JButton("");
		btnSua.setIcon(new ImageIcon(FormQuanLyAuthor.class.getResource("/img/pencil.png")));
		btnSua.setBounds(475, 162, 31, 31);
		contentPane.add(btnSua);
		
		JButton btnXoa = new JButton("");
		btnXoa.setIcon(new ImageIcon(FormQuanLyAuthor.class.getResource("/img/delete.png")));
		btnXoa.setBounds(475, 229, 31, 31);
		contentPane.add(btnXoa);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(72, 313, 954, 8);
		contentPane.add(separator);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(698, 162, 328, 32);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		txtTimKiem = new JTextField();
		txtTimKiem.setFont(new Font("Arial", Font.ITALIC, 18));
		txtTimKiem.setText("Enter keywords ......");
		txtTimKiem.setBounds(0, 0, 269, 32);
		panel_2.add(txtTimKiem);
		txtTimKiem.setColumns(10);
		
		JButton btnXoa_1 = new JButton("");
		btnXoa_1.setBackground(Color.WHITE);
		btnXoa_1.setIcon(new ImageIcon(FormQuanLyAuthor.class.getResource("/img/loupe.png")));
		btnXoa_1.setBounds(296, 0, 33, 32);
		panel_2.add(btnXoa_1);
		
		JLabel lblNewLabel_2 = new JLabel("Author ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(204, 204, 0));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_2.setBounds(148, 10, 696, 55);
		contentPane.add(lblNewLabel_2);
	}
}
