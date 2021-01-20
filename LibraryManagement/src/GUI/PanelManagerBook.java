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
import DTO.BookDTO;

import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

public class PanelManagerBook extends JPanel {
	private static JTextField txtBookName;
	private static JTextField txtCondition;
	private static JTable tblBook;
	private static JComboBox cmbAuthor;
	private static JComboBox cmbCategory;
	private static JComboBox cmbPublisher;
	private static JComboBox cmbStatus;
	private static JDateChooser dtcDateIn;
	/**
	 * Create the panel.
	 */
	public PanelManagerBook() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(0,0,523, 509);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 11, 503, 251);
		add(panel);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Category");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1.setBounds(10, 39, 72, 32);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Author");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(10, 92, 63, 32);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 189, 42, 32);
		panel.add(lblNewLabel_3);
		
		txtBookName = new JTextField();
		txtBookName.setFont(new Font("Arial", Font.BOLD, 18));
		txtBookName.setColumns(10);
		txtBookName.setBounds(92, 188, 132, 32);
		panel.add(txtBookName);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			//add
			public void actionPerformed(ActionEvent e) {
				boolean result = BookBUS.addBook();
				if(result) {
					JOptionPane.showMessageDialog(null, "         Add successful","Message",JOptionPane.INFORMATION_MESSAGE);
					BookBUS.showBookList(tblBook);
				}
				else {
					JOptionPane.showMessageDialog(null, "          Add failed","Message",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnAdd.setBounds(359, 172, 132, 33);
		panel.add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			//update
			public void actionPerformed(ActionEvent e) {
				int n = tblBook.getSelectionModel().getLeadSelectionIndex();
				if(n>=0) {
					boolean result = BookBUS.updateBook();
					if(result) {
						JOptionPane.showMessageDialog(null, "         Update successful","Message",JOptionPane.INFORMATION_MESSAGE);
						BookBUS.showBookList(tblBook);
					}
					else {
						JOptionPane.showMessageDialog(null, "          Update failed","Message",JOptionPane.ERROR_MESSAGE);
					}
				}
				else if(tblBook.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "         The list is empty","Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(n<0) {
					JOptionPane.showMessageDialog(null, "         Please select a row","Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnUpdate.setBounds(359, 216, 132, 33);
		panel.add(btnUpdate);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Status");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1_1.setBounds(274, 132, 79, 32);
		panel.add(lblNewLabel_3_1_1_1);
		
		cmbStatus = new JComboBox();
		cmbStatus.setModel(new DefaultComboBoxModel(new String[] {"Ch\u01B0a M\u01B0\u1EE3n", "\u0110\u00E3 M\u01B0\u1EE3n", "Kh\u00F4ng C\u00F2n"}));
		cmbStatus.setBounds(359, 139, 132, 22);
		panel.add(cmbStatus);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("Condition");
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1_2.setBounds(274, 91, 79, 32);
		panel.add(lblNewLabel_3_1_1_2);
		
		txtCondition = new JTextField();
		txtCondition.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtCondition.setColumns(10);
		txtCondition.setBounds(359, 90, 132, 32);
		panel.add(txtCondition);
		
		JLabel lblNewLabel = new JLabel("Book Management");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(194, 10, 159, 13);
		panel.add(lblNewLabel);
		
		cmbAuthor = new JComboBox();
		cmbAuthor.setBounds(92, 98, 132, 22);
		panel.add(cmbAuthor);
		
		cmbCategory = new JComboBox();
		cmbCategory.setBounds(92, 46, 132, 22);
		panel.add(cmbCategory);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Publisher");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1_2.setBounds(10, 139, 63, 32);
		panel.add(lblNewLabel_3_1_2);
		
		cmbPublisher = new JComboBox();
		cmbPublisher.setBounds(92, 139, 132, 22);
		panel.add(cmbPublisher);
		
		JLabel lblNewLabel_3_2 = new JLabel("Date in");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_2.setBounds(274, 40, 63, 32);
		panel.add(lblNewLabel_3_2);
		
		dtcDateIn = new JDateChooser();
		dtcDateIn.setBounds(359, 49, 132, 22);
		//format dd/MM/yyyy for datechooser
		dtcDateIn.setDateFormatString("dd-MM-yyyy");
		panel.add(dtcDateIn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 289, 503, 209);
		add(scrollPane);
		
		tblBook = new JTable();
		tblBook.addMouseListener(new MouseAdapter() {
			//Click on table
			@Override
			public void mouseClicked(MouseEvent e) {
				int n = tblBook.getSelectionModel().getLeadSelectionIndex();
				cmbCategory.setSelectedItem(tblBook.getValueAt(n, 1));
				cmbAuthor.setSelectedItem(tblBook.getValueAt(n, 2));
				cmbPublisher.setSelectedItem(tblBook.getValueAt(n, 3));
				txtBookName.setText(tblBook.getValueAt(n, 4).toString());
				dtcDateIn.setDate((Date) (tblBook.getValueAt(n, 5)));
				txtCondition.setText(tblBook.getValueAt(n, 6).toString());
				cmbStatus.setSelectedItem(tblBook.getValueAt(n, 7));
			}
		});
		tblBook.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "TypeOfBook", "Author", "Publisher", "BookName", "DateIn", "Condition", "Status"
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
		//display book list
		BookBUS.showBookList(tblBook);
		//load data into combobox
		BookBUS.loadTypeOfBookToCmb(cmbCategory);
		BookBUS.loadAuthorToCmb(cmbAuthor);
		BookBUS.loadPublisherToCmb(cmbPublisher);
		
		JButton btnReload = new JButton("Reload");
		btnReload.addActionListener(new ActionListener() {
			//reload
			public void actionPerformed(ActionEvent e) {
				BookBUS.showBookList(tblBook);
			}
		});
		btnReload.setBounds(10, 264, 84, 24);
		add(btnReload);
	}
	//get Book
		public static BookDTO getBook() {
			BookDTO p = new BookDTO();
			p.setTypeName(cmbCategory.getSelectedItem().toString());
			p.setAuthorName(cmbAuthor.getSelectedItem().toString());
			p.setPublisherName(cmbPublisher.getSelectedItem().toString());
			p.setBookName(txtBookName.getText());
			p.setDateIn(dtcDateIn.getDate());
			p.setCondition(txtCondition.getText());
			p.setStatus(cmbStatus.getSelectedItem().toString());
			return p;
		}
		//get id
		public static int getBookID() {
			int n = tblBook.getSelectionModel().getLeadSelectionIndex();
			DefaultTableModel model = (DefaultTableModel) tblBook.getModel();
			int id = (int) model.getValueAt(n, 0);
			return id;
		}
}
