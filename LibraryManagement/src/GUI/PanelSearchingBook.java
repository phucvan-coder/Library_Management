package GUI;

import javax.swing.JPanel;
import BUS.BookBUS;
import DTO.AccountDTO;
import DTO.BookDTO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelSearchingBook extends JPanel {
	private static JTextField txtSearch;
	private static JTable tblBook;
	
	//get Searching Book
		public static String getBookName() {
			String bookName = txtSearch.getText();
			return bookName;
		}

	/**
	 * Create the panel.
	 */
	public PanelSearchingBook() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(0,0,523, 524);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 22, 503, 89);
		add(panel);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(BookBUS.CheckArraySearch(tblBook)) {
					BookBUS.showBookListSearch(tblBook);
				}
				else {
					JOptionPane.showMessageDialog(null,"Khong tim thay Book","Alert",JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		btnSearch.setBounds(375, 42, 85, 21);
		panel.add(btnSearch);
		
		JLabel lblSearch = new JLabel("Book Searching");
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSearch.setBounds(154, 10, 192, 13);
		panel.add(lblSearch);
		
		txtSearch = new JTextField();
		txtSearch.setBounds(78, 43, 277, 19);
		panel.add(txtSearch);
		txtSearch.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		scrollPane.setBounds(10, 159, 503, 325);
		add(scrollPane);
		
		tblBook = new JTable();
		tblBook.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Id", "TypeOfBook", "Author", "Publisher", "BookName","DateIn","Condition", "Status"
				}
			) {
				boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			scrollPane.setViewportView(tblBook);
			setVisible(false);
			//if(txtSearch.getText()==null) {
				BookBUS.showBookList(tblBook);
				
				JButton btnReload = new JButton("Reload");
				btnReload.addActionListener(new ActionListener() {
					//reload
					public void actionPerformed(ActionEvent e) {
						BookBUS.showBookList(tblBook);
					}
				});
				btnReload.setBounds(10, 122, 85, 21);
				add(btnReload);
			//}
		

	}
}
