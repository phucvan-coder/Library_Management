package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import BUS.BookBUS;
import BUS.Book_ReturnBUS;
import BUS.BorrowBookBUS;

public class PanelBorrowReturnBook extends JPanel {
	private static JTable tblBorrowReturnBookList;
	private static JTable tblBorrowReturnBookDetails;
	private static JDateChooser dateFrom;
	private static JDateChooser dateTo;

	/**
	 * Create the panel.
	 */
	public PanelBorrowReturnBook() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(0,0,523, 509);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 11, 503, 208);
		add(panel);
		
		JButton btnFilter = new JButton("Filter");
		btnFilter.addActionListener(new ActionListener() {
			//filter
			public void actionPerformed(ActionEvent e) {
				Book_ReturnBUS.filterBorrow_Return(dateFrom, dateTo,tblBorrowReturnBookList);
			}
		});
		btnFilter.setBounds(408, 35, 85, 32);
		panel.add(btnFilter);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("To");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1_1.setBounds(10, 98, 65, 32);
		panel.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("From");
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1_2.setBounds(10, 33, 65, 32);
		panel.add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel = new JLabel("Borrow of reutn Book");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(180, 5, 192, 13);
		panel.add(lblNewLabel);
		
		dateFrom = new JDateChooser();
		dateFrom.setBounds(80, 34, 266, 24);
		//format dd/MM/yyyy for datechooser
		dateFrom.setDateFormatString("dd-MM-yyyy");
		panel.add(dateFrom);
		
		dateTo = new JDateChooser();
		dateTo.setBounds(80, 99, 266, 24);
		//format dd/MM/yyyy for datechooser
		dateTo.setDateFormatString("dd-MM-yyyy");
		panel.add(dateTo);
		
		JButton btnReload = new JButton("Reload");
		btnReload.addActionListener(new ActionListener() {
			//reload
			public void actionPerformed(ActionEvent e) {
				Book_ReturnBUS.reloadTable(tblBorrowReturnBookList);
			}
		});
		btnReload.setBounds(408, 98, 85, 30);
		panel.add(btnReload);
		
		JButton btnExport = new JButton("Export File");
		btnExport.addActionListener(new ActionListener() {
			//Export file
			public void actionPerformed(ActionEvent e) {
				int n = tblBorrowReturnBookList.getSelectionModel().getLeadSelectionIndex();
				Book_ReturnBUS.exportFile(n, tblBorrowReturnBookList, tblBorrowReturnBookDetails);
				JOptionPane.showMessageDialog(null, "         Export file successful","Message",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnExport.setBounds(408, 153, 85, 32);
		panel.add(btnExport);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		scrollPane.setBounds(10, 244, 249, 254);
		add(scrollPane);
		
		tblBorrowReturnBookList = new JTable();
		tblBorrowReturnBookList.addMouseListener(new MouseAdapter() {
			//Click on table
			@Override
			public void mouseClicked(MouseEvent e) {
				int n = tblBorrowReturnBookList.getSelectionModel().getLeadSelectionIndex();
				int id = Integer.parseInt(tblBorrowReturnBookList.getValueAt(n, 0).toString());
				//display Borrow_returnInfo list
				Book_ReturnBUS.showBookReturnInfoList(id,tblBorrowReturnBookDetails);
			}
		});
		//scrollPane.setColumnHeaderView(tblBorrowReturnBookList);
		tblBorrowReturnBookList.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Id", "BorrowDate", "ReturnDate","NumberOfBooks"
				}
			) {
				boolean[] columnEditables = new boolean[] {
					false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			scrollPane.setViewportView(tblBorrowReturnBookList);
			setVisible(false);
			
			//display Borrow_returnInfo list
			Book_ReturnBUS.showBookReturnList(tblBorrowReturnBookList);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new LineBorder(Color.LIGHT_GRAY, 2));
		scrollPane_1.setBounds(269, 244, 244, 254);
		add(scrollPane_1);
		
		tblBorrowReturnBookDetails = new JTable();
		//scrollPane_1.setColumnHeaderView(tblBorrowReturnBookDetails);
		tblBorrowReturnBookDetails.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Borrow_ReturnID", "BookName", "MemberID", "MemberName"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
			scrollPane_1.setViewportView(tblBorrowReturnBookDetails);
			setVisible(false);
			
			
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 229, 249, 13);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Borrow of Return Book Lists");
		lblNewLabel_1.setBounds(0, 0, 180, 13);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(269, 229, 244, 13);
		add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Borrow of Return Book Details");
		lblNewLabel_1_1.setBounds(0, 0, 180, 13);
		panel_1_1.add(lblNewLabel_1_1);
		setVisible(false);

	}
}
