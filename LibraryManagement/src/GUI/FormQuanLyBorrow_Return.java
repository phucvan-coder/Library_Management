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
		setBounds(100, 100, 700, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 128, 128), 4));
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
		txtX.setBounds(663, 10, 25, 18);
		contentPane.add(txtX);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.BLUE, 2));
		scrollPane.setBounds(10, 391, 678, 249);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		
		JLabel lblNewLabel = new JLabel("Manage Borrow and Return Books");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(79, 10, 504, 51);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 94, 678, 195);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("From Date");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 37, 79, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("To Date");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 92, 79, 13);
		panel.add(lblNewLabel_1_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(99, 37, 243, 22);
		panel.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(99, 86, 243, 22);
		panel.add(dateChooser_1);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(284, 129, 85, 21);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(414, 129, 85, 21);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(555, 129, 85, 21);
		panel.add(btnUpdate);
	}
}
