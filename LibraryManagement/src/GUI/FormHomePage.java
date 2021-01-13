package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;

public class FormHomePage extends JFrame {

	private JPanel contentPane;
	
	private Image img_house = new ImageIcon(FormHomePage.class.getResource("/img/house.png")).getImage().getScaledInstance(27, 25, Image.SCALE_FAST);
	private Image img_Book = new ImageIcon(FormHomePage.class.getResource("/img/open-book.png")).getImage().getScaledInstance(27, 25, Image.SCALE_SMOOTH);
	private Image img_Author = new ImageIcon(FormHomePage.class.getResource("/img/writer.png")).getImage().getScaledInstance(27, 25, Image.SCALE_SMOOTH);
	private Image img_Return = new ImageIcon(FormHomePage.class.getResource("/img/refund.png")).getImage().getScaledInstance(27, 25, Image.SCALE_SMOOTH);
	private Image img_Account = new ImageIcon(FormHomePage.class.getResource("/img/account.png")).getImage().getScaledInstance(27, 25, Image.SCALE_SMOOTH);
	private Image img_Category = new ImageIcon(FormHomePage.class.getResource("/img/category.png")).getImage().getScaledInstance(27, 25, Image.SCALE_SMOOTH);
	private Image img_Member = new ImageIcon(FormHomePage.class.getResource("/img/team-member.png")).getImage().getScaledInstance(27, 25, Image.SCALE_SMOOTH);
	private Image img_Login = new ImageIcon(FormHomePage.class.getResource("/img/login.png")).getImage().getScaledInstance(27, 25, Image.SCALE_SMOOTH);
	private Image img_Statistics = new ImageIcon(FormHomePage.class.getResource("/img/trend.png")).getImage().getScaledInstance(27, 25, Image.SCALE_SMOOTH);
	private Image img_Logan = new ImageIcon(FormHomePage.class.getResource("/img/ebook.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormHomePage frame = new FormHomePage();
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
	public FormHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 533);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.setBackground(new Color(255, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlDkShadow);
		panel.setBounds(0, 47, 238, 486);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHomePage = new JLabel("Welcome");
		lblHomePage.setFont(new Font("Microsoft JhengHei Light", Font.BOLD, 16));
		lblHomePage.setForeground(SystemColor.inactiveCaptionBorder);
		lblHomePage.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomePage.setIcon(null);
		lblHomePage.setBounds(47, 27, 112, 88);
		panel.add(lblHomePage);
		
		JPanel PanelHomePage = new JPanel();
		PanelHomePage.setBackground(SystemColor.controlDkShadow);
		PanelHomePage.setBounds(0, 126, 236, 40);
		panel.add(PanelHomePage);
		PanelHomePage.setLayout(null);
		
		JLabel lblHomePage1 = new JLabel("HomePage");
		lblHomePage1.setBounds(81, 11, 145, 18);
		PanelHomePage.add(lblHomePage1);
		lblHomePage1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblHomePage1.setForeground(new Color(204, 255, 255));
		
		JLabel lblHomePage_p = new JLabel("");
		lblHomePage_p.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomePage_p.setBounds(25, 11, 46, 23);
		PanelHomePage.add(lblHomePage_p);
		lblHomePage_p.setIcon(new ImageIcon((img_house)));
		
		JPanel panelQuanLyAncount = new JPanel();
		panelQuanLyAncount.setBackground(SystemColor.controlDkShadow);
		panelQuanLyAncount.setBounds(0, 166, 236, 40);
		panel.add(panelQuanLyAncount);
		panelQuanLyAncount.setLayout(null);
		
		JLabel lblManagerAncount = new JLabel("Manager Ancount");
		lblManagerAncount.setBounds(81, 11, 145, 18);
		panelQuanLyAncount.add(lblManagerAncount);
		lblManagerAncount.setForeground(new Color(204, 255, 255));
		lblManagerAncount.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel lblManagerAccount_p = new JLabel("");
		lblManagerAccount_p.setHorizontalAlignment(SwingConstants.CENTER);
		lblManagerAccount_p.setBounds(25, 11, 46, 23);
		panelQuanLyAncount.add(lblManagerAccount_p);
		lblManagerAccount_p.setIcon(new ImageIcon((img_Account)));
		
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setBounds(35, 45, 46, 23);
		panelQuanLyAncount.add(lblNewLabel_2_1);
		
		JPanel panelQuanLyAuthor = new JPanel();
		panelQuanLyAuthor.setBackground(SystemColor.controlDkShadow);
		panelQuanLyAuthor.setBounds(0, 206, 236, 37);
		panel.add(panelQuanLyAuthor);
		panelQuanLyAuthor.setLayout(null);
		
		JLabel lblManagerAuthor = new JLabel("Manager Author");
		lblManagerAuthor.setBounds(81, 11, 145, 18);
		panelQuanLyAuthor.add(lblManagerAuthor);
		lblManagerAuthor.setForeground(new Color(204, 255, 255));
		lblManagerAuthor.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel lblManagerAuthor_p = new JLabel("");
		lblManagerAuthor_p.setHorizontalAlignment(SwingConstants.CENTER);
		lblManagerAuthor_p.setBounds(26, 6, 46, 23);
		panelQuanLyAuthor.add(lblManagerAuthor_p);
		lblManagerAuthor_p.setIcon(new ImageIcon((img_Author)));
		
		
		JPanel panelQuanLyBook = new JPanel();
		panelQuanLyBook.setBackground(SystemColor.controlDkShadow);
		panelQuanLyBook.setBounds(0, 242, 236, 40);
		panel.add(panelQuanLyBook);
		panelQuanLyBook.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("Manager  Book");
		lblNewLabel_3_1.setForeground(new Color(204, 255, 255));
		lblNewLabel_3_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(81, 11, 145, 18);
		panelQuanLyBook.add(lblNewLabel_3_1);
		
		JLabel lblManagerBook_p = new JLabel("");
		lblManagerBook_p.setHorizontalAlignment(SwingConstants.CENTER);
		lblManagerBook_p.setBounds(25, 6, 46, 23);
		panelQuanLyBook.add(lblManagerBook_p);
		lblManagerBook_p.setIcon(new ImageIcon((img_Book)));
		
		JPanel panelQuanLyCategory = new JPanel();
		panelQuanLyCategory.setBackground(SystemColor.controlDkShadow);
		panelQuanLyCategory.setBounds(0, 285, 236, 40);
		panel.add(panelQuanLyCategory);
		panelQuanLyCategory.setLayout(null);
		
		JLabel lblManagerCategory = new JLabel("Manager Category");
		lblManagerCategory.setForeground(new Color(204, 255, 255));
		lblManagerCategory.setFont(new Font("Dialog", Font.BOLD, 14));
		lblManagerCategory.setBounds(81, 11, 145, 18);
		panelQuanLyCategory.add(lblManagerCategory);
		
		JLabel lblMangerCategory_p = new JLabel("");
		lblMangerCategory_p.setHorizontalAlignment(SwingConstants.CENTER);
		lblMangerCategory_p.setBounds(25, 6, 46, 23);
		panelQuanLyCategory.add(lblMangerCategory_p);
		lblMangerCategory_p.setIcon(new ImageIcon((img_Category)));
		
		JPanel panelQuanLyMember = new JPanel();
		panelQuanLyMember.setBackground(SystemColor.controlDkShadow);
		panelQuanLyMember.setBounds(0, 325, 236, 40);
		panel.add(panelQuanLyMember);
		panelQuanLyMember.setLayout(null);
		
		JLabel lblNewLabel_3_4 = new JLabel("Manager Member");
		lblNewLabel_3_4.setForeground(new Color(204, 255, 255));
		lblNewLabel_3_4.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_3_4.setBounds(81, 11, 145, 18);
		panelQuanLyMember.add(lblNewLabel_3_4);
		
		JLabel lblMember_p = new JLabel("");
		lblMember_p.setHorizontalAlignment(SwingConstants.CENTER);
		lblMember_p.setBounds(27, 6, 46, 23);
		panelQuanLyMember.add(lblMember_p);
		lblMember_p.setIcon(new ImageIcon((img_Member)));
		
		JPanel panelDangNhap = new JPanel();
		panelDangNhap.setBackground(SystemColor.controlDkShadow);
		panelDangNhap.setBounds(0, 435, 236, 40);
		panel.add(panelDangNhap);
		panelDangNhap.setLayout(null);
		
		JLabel lblNewLabel_3_5 = new JLabel("Logout");
		lblNewLabel_3_5.setForeground(new Color(204, 255, 255));
		lblNewLabel_3_5.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_3_5.setBounds(81, 11, 145, 18);
		panelDangNhap.add(lblNewLabel_3_5);
		
		JLabel lblLogin_P = new JLabel("");
		lblLogin_P.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin_P.setBounds(27, 11, 46, 23);
		panelDangNhap.add(lblLogin_P);
		lblLogin_P.setIcon(new ImageIcon((img_Login)));
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBorder(new LineBorder(new Color(192, 192, 192), 3));
		panel_1.setBounds(0, 32, 781, -30);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Libary Manager softwares app");
		lblNewLabel.setForeground(new Color(128, 128, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
		lblNewLabel.setBounds(278, 7, 257, 29);
		contentPane.add(lblNewLabel);
		
		JPanel panelBorrowBook_1 = new JPanel();
		panelBorrowBook_1.setLayout(null);
		panelBorrowBook_1.setBackground(SystemColor.textHighlight);
		panelBorrowBook_1.setBounds(294, 123, 177, 40);
		contentPane.add(panelBorrowBook_1);
		
		JLabel lblBorrowBook_1 = new JLabel("Borrow Book");
		lblBorrowBook_1.setForeground(new Color(204, 255, 255));
		lblBorrowBook_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblBorrowBook_1.setBounds(61, 11, 116, 18);
		panelBorrowBook_1.add(lblBorrowBook_1);
		
		JLabel lblBorrowBook_p = new JLabel("");
		lblBorrowBook_p.setBounds(10, 11, 46, 23);
		panelBorrowBook_1.add(lblBorrowBook_p);
		lblBorrowBook_p.setHorizontalAlignment(SwingConstants.CENTER);
		lblBorrowBook_p.setIcon(new ImageIcon((img_Book)));
		lblBorrowBook_p.setIcon(new ImageIcon((img_Book)));
		
		JPanel panelBorrow_Return_1 = new JPanel();
		panelBorrow_Return_1.setLayout(null);
		panelBorrow_Return_1.setBackground(new Color(218, 112, 214));
		panelBorrow_Return_1.setBounds(294, 220, 177, 40);
		contentPane.add(panelBorrow_Return_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Borrow,refund");
		lblNewLabel_3_2_1.setForeground(new Color(204, 255, 255));
		lblNewLabel_3_2_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_3_2_1.setBounds(62, 11, 115, 18);
		panelBorrow_Return_1.add(lblNewLabel_3_2_1);
		
		JLabel lblReturn_p = new JLabel("");
		lblReturn_p.setBounds(10, 11, 46, 23);
		panelBorrow_Return_1.add(lblReturn_p);
		lblReturn_p.setHorizontalAlignment(SwingConstants.CENTER);
		lblReturn_p.setIcon(new ImageIcon((img_Return)));
		
		JPanel panelBorrowBook_1_1 = new JPanel();
		panelBorrowBook_1_1.setLayout(null);
		panelBorrowBook_1_1.setBackground(new Color(60, 179, 113));
		panelBorrowBook_1_1.setBounds(549, 123, 177, 40);
		contentPane.add(panelBorrowBook_1_1);
		
		JLabel lblBorrowBook_1_1 = new JLabel("Static");
		lblBorrowBook_1_1.setForeground(new Color(204, 255, 255));
		lblBorrowBook_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblBorrowBook_1_1.setBounds(61, 11, 116, 18);
		panelBorrowBook_1_1.add(lblBorrowBook_1_1);
		
		JLabel lblBorrowBook_p_1 = new JLabel("");
		lblBorrowBook_p_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBorrowBook_p_1.setBounds(10, 11, 46, 23);
		panelBorrowBook_1_1.add(lblBorrowBook_p_1);
		lblBorrowBook_p_1.setIcon(new ImageIcon((img_Statistics)));
		
		JPanel panelBorrowBook_1_1_1 = new JPanel();
		panelBorrowBook_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Do You Want To Exit ?", "Notification", JOptionPane.YES_NO_OPTION)== 0){
					FormHomePage.this.dispose();
			}
			}
		});
		panelBorrowBook_1_1_1.setLayout(null);
		panelBorrowBook_1_1_1.setBackground(new Color(100, 149, 237));
		panelBorrowBook_1_1_1.setBounds(549, 220, 177, 40);
		contentPane.add(panelBorrowBook_1_1_1);
		
		JLabel lblBorrowBook_1_1_1 = new JLabel("Exit");
		lblBorrowBook_1_1_1.setForeground(new Color(204, 255, 255));
		lblBorrowBook_1_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		lblBorrowBook_1_1_1.setBounds(61, 11, 116, 18);
		panelBorrowBook_1_1_1.add(lblBorrowBook_1_1_1);
		
		JLabel lblBorrowBook_p_1_1 = new JLabel("");
		lblBorrowBook_p_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBorrowBook_p_1_1.setBounds(10, 11, 46, 23);
		panelBorrowBook_1_1_1.add(lblBorrowBook_p_1_1);
		
		JLabel lblLogan = new JLabel("");
		lblLogan.setIcon(new ImageIcon((img_Logan)));
		lblLogan.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogan.setBounds(0, 0, 46, 46);
		contentPane.add(lblLogan);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 250, 250));
		panel_2.setBounds(237, 327, 544, 206);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("tags");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(237, 313, 46, 14);
		contentPane.add(lblNewLabel_1);
		
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter{
		@Override
		public void mouseEntered(MouseEvent e) {
			
		}
		@Override
		public void mousePressed(MouseEvent e) {
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			
		}
		
		
	}
}
