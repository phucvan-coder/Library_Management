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
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import BUS.BookBUS;
import BUS.BorrowBookBUS;

import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import DTO.Borrow_ReturnInfoDTO;
import DTO.Borrow_ReturnDTO;
public class PanelBorrowBook extends JPanel {
	private static JTextField txtNumber;
	private static JTable tblBorrowBook;
	private static JComboBox cmbCategory;
	private static JComboBox cmbBookName;
	private static JComboBox cmbMemberID;
	private static JDateChooser dtcTo;
	private static JDateChooser dtcFrom;
	private static int num=0;
	/**
	 * Create the panel.
	 */
	public PanelBorrowBook() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(0,0,523, 509);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 11, 503, 241);
		add(panel);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Book Name");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1.setBounds(0, 103, 92, 32);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Category");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 39, 72, 32);
		panel.add(lblNewLabel_3);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			//add
			public void actionPerformed(ActionEvent e) {
				if(dtcFrom.getDate()!=null||dtcTo.getDate()!=null) {
					String from = (new SimpleDateFormat("dd-MM-yyyy")).format(dtcFrom.getDate());
					String to = (new SimpleDateFormat("dd-MM-yyyy")).format(dtcTo.getDate());
					Object[] row = { cmbCategory.getSelectedItem().toString(), cmbBookName.getSelectedItem().toString(), cmbMemberID.getSelectedItem().toString(), from, to};
					DefaultTableModel model = (DefaultTableModel) tblBorrowBook.getModel();
					model.addRow(row);
					num++;
					txtNumber.setText(String.valueOf(num));
				}
				else {
					JOptionPane.showMessageDialog(null, "         Please type date","Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnAdd.setBounds(109, 210, 85, 21);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			//delete
			public void actionPerformed(ActionEvent e) {
				int n = tblBorrowBook.getSelectionModel().getLeadSelectionIndex();
				if(n>=0) {
					DefaultTableModel model = (DefaultTableModel) tblBorrowBook.getModel();
					model.removeRow(n);
					num--;
					txtNumber.setText(String.valueOf(num));
				}
				else if(tblBorrowBook.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "         The list is empty","Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(n<0) {
					JOptionPane.showMessageDialog(null, "         Please select a row","Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnDelete.setBounds(212, 210, 85, 21);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			//update
			public void actionPerformed(ActionEvent e) {
				int n = tblBorrowBook.getSelectionModel().getLeadSelectionIndex();
				if(n>=0) {
					String from = (new SimpleDateFormat("dd-MM-yyyy")).format(dtcFrom.getDate());
					String to = (new SimpleDateFormat("dd-MM-yyyy")).format(dtcTo.getDate());
					Object[] row = { cmbCategory.getSelectedItem().toString(), cmbBookName.getSelectedItem().toString(), cmbMemberID.getSelectedItem().toString(), from, to};
					DefaultTableModel model = (DefaultTableModel) tblBorrowBook.getModel();
					model.setValueAt(row[0], n, 0);
					model.setValueAt(row[1], n, 1);
					model.setValueAt(row[2], n, 2);
					model.setValueAt(row[3], n, 3);
					model.setValueAt(row[4], n, 4);
					JOptionPane.showMessageDialog(null, "         Updating success","Message",JOptionPane.DEFAULT_OPTION);
				}
				if(tblBorrowBook.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "         The list is empty","Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(n<0){
					JOptionPane.showMessageDialog(null, "         Please select a row","Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(dtcFrom.getDate()==null||dtcTo.getDate()==null){
					JOptionPane.showMessageDialog(null, "         Please select a row","Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnUpdate.setBounds(307, 210, 85, 21);
		panel.add(btnUpdate);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("To");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1_1.setBounds(307, 109, 39, 32);
		panel.add(lblNewLabel_3_1_1_1);
		
		cmbCategory = new JComboBox();
		cmbCategory.addItemListener(new ItemListener() {
			//after choose item of cmbCategory
			public void itemStateChanged(ItemEvent e) {
				String typeName = cmbCategory.getSelectedItem().toString();
				cmbBookName.removeAllItems();
				BorrowBookBUS.loadBookNameToCmb(typeName, cmbBookName);
			}
		});
		cmbCategory.setBounds(96, 45, 165, 24);
		panel.add(cmbCategory);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("From");
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1_2.setBounds(302, 45, 44, 32);
		panel.add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel = new JLabel("Borrow Book");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(210, 10, 136, 13);
		panel.add(lblNewLabel);
		
		cmbBookName = new JComboBox();
		cmbBookName.setBounds(96, 109, 165, 24);
		panel.add(cmbBookName);
		
		dtcFrom = new JDateChooser();
		dtcFrom.setBounds(351, 47, 142, 24);
		//format dd/MM/yyyy for datechooser
		dtcFrom.setDateFormatString("dd-MM-yyyy");
		panel.add(dtcFrom);
		
		dtcTo = new JDateChooser();
		dtcTo.setBounds(351, 111, 142, 24);
		//format dd/MM/yyyy for datechooser
		dtcTo.setDateFormatString("dd-MM-yyyy");
		panel.add(dtcTo);
		
		JLabel lblNewLabel_3_2 = new JLabel("Member ID");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_2.setBounds(10, 156, 72, 32);
		panel.add(lblNewLabel_3_2);
		
		cmbMemberID = new JComboBox();
		cmbMemberID.setBounds(97, 161, 164, 24);
		panel.add(cmbMemberID);
		
		JLabel lblNumberOfBoook = new JLabel("Number of Books");
		lblNumberOfBoook.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumberOfBoook.setBounds(42, 469, 136, 13);
		add(lblNumberOfBoook);
		
		txtNumber = new JTextField();
		txtNumber.setBounds(172, 469, 36, 19);
		add(txtNumber);
		txtNumber.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			//click on table
			@Override
			public void mouseClicked(MouseEvent e) {
				int n = tblBorrowBook.getSelectionModel().getLeadSelectionIndex();
				cmbCategory.setSelectedItem(tblBorrowBook.getValueAt(n, 1).toString());
				cmbBookName.setSelectedItem(tblBorrowBook.getValueAt(n, 2).toString());
				cmbMemberID.setSelectedItem(tblBorrowBook.getValueAt(n, 3).toString());
				dtcFrom.setDate((Date) (tblBorrowBook.getValueAt(n, 4)));
				dtcTo.setDate((Date) (tblBorrowBook.getValueAt(n, 5)));
			}
		});
		scrollPane.setBounds(10, 263, 503, 196);
		add(scrollPane);
		
		tblBorrowBook = new JTable();
		tblBorrowBook.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"TypOfBook", "BookName", "MemberID", "BorrowDate", "ReturnDate"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(tblBorrowBook);
		setVisible(false);
		BorrowBookBUS.loadTypeOfBookToCmb(cmbCategory);
		String typeName = cmbCategory.getSelectedItem().toString();
		BorrowBookBUS.loadBookNameToCmb(typeName, cmbBookName);
		BorrowBookBUS.loadMemberIDToCmb(cmbMemberID);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(428, 467, 85, 21);
		add(btnConfirm);
		btnConfirm.addActionListener(new ActionListener() {
			//save
			public void actionPerformed(ActionEvent e) {
				boolean result = BorrowBookBUS.saveBorrow_Return();
				if(result) {
					JOptionPane.showMessageDialog(null, "         Save successful","Message",JOptionPane.INFORMATION_MESSAGE);
					DefaultTableModel model = (DefaultTableModel) tblBorrowBook.getModel();
					model.getDataVector().removeAllElements();
					//load cmb bookName
					String typeName = cmbCategory.getSelectedItem().toString();
					cmbBookName.removeAllItems();
					BorrowBookBUS.loadBookNameToCmb(typeName, cmbBookName);
					num=0;
					txtNumber.setText(String.valueOf(num));
				}
				else {
					JOptionPane.showMessageDialog(null, "          Save failed","Message",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}
	//get Borrow_ReturnInfo
	public static ArrayList<Borrow_ReturnInfoDTO> getBorrow_ReturnInfo() {
		ArrayList<Borrow_ReturnInfoDTO> a = new ArrayList<Borrow_ReturnInfoDTO>();
		Borrow_ReturnInfoDTO b;
		for (int i = 0; i < tblBorrowBook.getRowCount(); i++) {
			b = new Borrow_ReturnInfoDTO(0,null,null,tblBorrowBook.getModel().getValueAt(i, 1).toString(),Integer.parseInt(tblBorrowBook.getModel().getValueAt(i, 2).toString()),"");
			a.add(i, b);
		}
		return a;
	}
	//get Borrow_Return
		public static Borrow_ReturnDTO getBorrow_Return() {
			Borrow_ReturnDTO a = new Borrow_ReturnDTO(0,dtcFrom.getDate(),dtcTo.getDate(),Integer.parseInt(txtNumber.getText()));
			return a;
		}
}
