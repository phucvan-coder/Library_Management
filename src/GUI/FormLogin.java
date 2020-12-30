package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class FormLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormLogin frame = new FormLogin();
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
	public FormLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 286);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button btnLogin = new Button("Login");
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnLogin.setBounds(new Rectangle(83, 166, 117, 36));
		contentPane.add(btnLogin);
		
		Button btnCancel = new Button("Cancel");
		btnCancel.setBounds(new Rectangle(173, 86, 117, 36));
		btnCancel.setBounds(289, 166, 117, 36);
		contentPane.add(btnCancel);
		
		textField = new JTextField();
		textField.setBounds(186, 54, 178, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(186, 99, 178, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("User Name:");
		lblNewLabel.setBounds(115, 57, 61, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(121, 102, 55, 14);
		contentPane.add(lblNewLabel_1);
	}
}
