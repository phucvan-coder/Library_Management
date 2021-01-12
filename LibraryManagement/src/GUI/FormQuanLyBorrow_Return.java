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
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class FormQuanLyBorrow_Return extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormQuanLyBorrow_Return frame = new FormQuanLyBorrow_Return();
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
	public FormQuanLyBorrow_Return() {
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
					FormQuanLyBorrow_Return.this.dispose();
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
		scrollPane.setBorder(new LineBorder(Color.BLUE, 2));
		scrollPane.setBounds(10, 391, 1080, 249);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		
		JLabel lblNewLabel = new JLabel("Manage Borrow and Return Books");
		lblNewLabel.setForeground(new Color(204, 204, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(286, 10, 504, 51);
		contentPane.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(654, 189, 373, 32);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setText("Enter keywords ......");
		textField.setFont(new Font("Arial", Font.ITALIC, 18));
		textField.setColumns(10);
		textField.setBounds(0, 0, 308, 33);
		panel_2.add(textField);
		
		JButton btnTim = new JButton("");
		btnTim.setIcon(new ImageIcon(FormQuanLyBorrow_Return.class.getResource("/img/loupe.png")));
		btnTim.setBounds(341, 0, 32, 32);
		panel_2.add(btnTim);
	}
}
