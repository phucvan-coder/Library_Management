package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class FormTypeManager extends JFrame {
	
	private Image img_search = new ImageIcon(FormTypeManager.class.getResource("/img/loupe1.png")).getImage().getScaledInstance(27, 25, Image.SCALE_FAST);
	private Image img_bck = new ImageIcon(FormTypeManager.class.getResource("/img/bckmanager.png")).getImage();
	private JPanel contentPane;
	private JTable tblType;
	private JTextField txtTypeName;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormTypeManager frame = new FormTypeManager();
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
	public FormTypeManager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 353);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//contentPane.setIcon(new ImageIcon((img_bck)));
		
		
		JScrollPane scrpType = new JScrollPane();
		scrpType.setBounds(10, 116, 558, 187);
		contentPane.add(scrpType);
		
		tblType = new JTable();
		scrpType.setColumnHeaderView(tblType);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(47, 79, 79));
		panel.setBounds(10, 51, 558, 35);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtTypeName = new JTextField();
		txtTypeName.setHorizontalAlignment(SwingConstants.CENTER);
		txtTypeName.setBounds(71, 0, 477, 32);
		panel.add(txtTypeName);
		txtTypeName.setColumns(10);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 9, 46, 14);
		panel.add(lblNewLabel_1);
		
		lblNewLabel = new JLabel("Type Manager");
		lblNewLabel.setForeground(new Color(127, 255, 212));
		lblNewLabel.setBackground(new Color(72, 209, 204));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(221, 11, 129, 14);
		contentPane.add(lblNewLabel);
	}
}
