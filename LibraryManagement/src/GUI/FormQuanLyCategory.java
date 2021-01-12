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
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class FormQuanLyCategory extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtTimkiem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormQuanLyCategory frame = new FormQuanLyCategory();
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
	public FormQuanLyCategory() {
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
					FormQuanLyCategory.this.dispose();
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
		contentPane.setLayout(null);
		txtX.setHorizontalAlignment(SwingConstants.CENTER);
		txtX.setFont(new Font("Arial", Font.BOLD, 17));
		txtX.setBounds(1065, 0, 35, 28);
		contentPane.add(txtX);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.BLUE, 2));
		scrollPane.setBounds(10, 412, 1080, 228);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 139, 356, 214);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBounds(10, 152, 262, 33);
		panel.add(panel_1_2);
		
		JLabel lblNewLabel = new JLabel("Catagory");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(0, 0, 164, 33);
		panel_1_2.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(641, 216, 412, 33);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		txtTimkiem = new JTextField();
		txtTimkiem.setText("Enter keywords ......");
		txtTimkiem.setFont(new Font("Arial", Font.ITALIC, 18));
		txtTimkiem.setColumns(10);
		txtTimkiem.setBounds(0, 0, 341, 33);
		panel_2.add(txtTimkiem);
		
		JButton btnTim = new JButton("");
		btnTim.setIcon(new ImageIcon(FormQuanLyCategory.class.getResource("/img/loupe.png")));
		btnTim.setBackground(Color.WHITE);
		btnTim.setBounds(380, 1, 32, 32);
		panel_2.add(btnTim);
		
		JButton btnThem = new JButton("");
		btnThem.setIcon(new ImageIcon(FormQuanLyCategory.class.getResource("/img/plus-circular-button.png")));
		btnThem.setBounds(529, 161, 32, 32);
		contentPane.add(btnThem);
		
		JButton btnSua = new JButton("");
		btnSua.setIcon(new ImageIcon(FormQuanLyCategory.class.getResource("/img/pencil.png")));
		btnSua.setBounds(529, 232, 32, 32);
		contentPane.add(btnSua);
		
		JButton btnXoa = new JButton("");
		btnXoa.setIcon(new ImageIcon(FormQuanLyCategory.class.getResource("/img/delete.png")));
		btnXoa.setBounds(529, 304, 32, 32);
		contentPane.add(btnXoa);
		
		JLabel lblNewLabel_2 = new JLabel("Category");
		lblNewLabel_2.setForeground(new Color(204, 204, 0));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_2.setBounds(364, 24, 364, 73);
		contentPane.add(lblNewLabel_2);
	}

}
