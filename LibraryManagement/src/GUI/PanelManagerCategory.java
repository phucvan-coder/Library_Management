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
import javax.swing.table.DefaultTableModel;

import BUS.MemberBUS;
import BUS.TypeBUS;
import DTO.MemberDTO;
import DTO.TypeOfBookDTO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelManagerCategory extends JPanel {
	private static JTextField txtCategoryName;
	private static JTable tblCategory;

	/**
	 * Create the panel.
	 */
	public PanelManagerCategory() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(0,0,626, 505);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 11, 606, 182);
		add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("Name of category");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(46, 60, 127, 32);
		panel.add(lblNewLabel_3);
		
		txtCategoryName = new JTextField();
		txtCategoryName.setFont(new Font("Arial", Font.BOLD, 18));
		txtCategoryName.setColumns(10);
		txtCategoryName.setBounds(211, 59, 197, 32);
		panel.add(txtCategoryName);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			//add
			public void actionPerformed(ActionEvent e) {
				boolean result = TypeBUS.addType();
				if(result) {
					JOptionPane.showMessageDialog(null, "         Add successful","Message",JOptionPane.INFORMATION_MESSAGE);
					TypeBUS.showTypeOfBookList(tblCategory);
				}
				else {
					JOptionPane.showMessageDialog(null, "          Add failed","Message",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnAdd.setBounds(156, 139, 85, 32);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			//delete
			public void actionPerformed(ActionEvent e) {
				int n = tblCategory.getSelectionModel().getLeadSelectionIndex();
				if(n>=0) {
					boolean result = TypeBUS.deleteType();
					if(result) {
						JOptionPane.showMessageDialog(null, "         Delete successful","Message",JOptionPane.INFORMATION_MESSAGE);
						TypeBUS.showTypeOfBookList(tblCategory);
					}
					else {
						JOptionPane.showMessageDialog(null, "          Delete failed","Message",JOptionPane.ERROR_MESSAGE);
					}
				}
				else if(tblCategory.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "         The list is empty","Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(n<0) {
					JOptionPane.showMessageDialog(null, "         Please select a row","Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnDelete.setBounds(404, 139, 85, 32);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			//update
			public void actionPerformed(ActionEvent e) {
				int n = tblCategory.getSelectionModel().getLeadSelectionIndex();
				if(n>=0) {
					boolean result = TypeBUS.updateType();
					if(result) {
						JOptionPane.showMessageDialog(null, "         Update successful","Message",JOptionPane.INFORMATION_MESSAGE);
						TypeBUS.showTypeOfBookList(tblCategory);
					}
					else {
						JOptionPane.showMessageDialog(null, "          Update failed","Message",JOptionPane.ERROR_MESSAGE);
					}
				}
				else if(tblCategory.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "         The list is empty","Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(n<0) {
					JOptionPane.showMessageDialog(null, "         Please select a row","Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnUpdate.setBounds(279, 139, 85, 32);
		panel.add(btnUpdate);
		
		JLabel lblNewLabel_3_1 = new JLabel("Category Management");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(225, 11, 186, 24);
		panel.add(lblNewLabel_3_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 221, 606, 277);
		add(scrollPane);
		
		tblCategory = new JTable();
		tblCategory.addMouseListener(new MouseAdapter() {
			//click on table
			@Override
			public void mouseClicked(MouseEvent e) {
				int n = tblCategory.getSelectionModel().getLeadSelectionIndex();
				txtCategoryName.setText(tblCategory.getValueAt(n, 1).toString());
			}
		});
		tblCategory.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "TypeName"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(tblCategory);
		setVisible(false);
		//Display Type List
		TypeBUS.showTypeOfBookList(tblCategory);
		
		JButton btnReload = new JButton("Reload");
		btnReload.addActionListener(new ActionListener() {
			//reload
			public void actionPerformed(ActionEvent e) {
				TypeBUS.showTypeOfBookList(tblCategory);
			}
		});
		btnReload.setBounds(10, 196, 85, 24);
		add(btnReload);
	}
	//get Type
		public static TypeOfBookDTO getType() {
			TypeOfBookDTO p = new TypeOfBookDTO();
			p.setTypeName(txtCategoryName.getText());
			return p;
		}
		//get id
		public static int getTypeID() {
			int n = tblCategory.getSelectionModel().getLeadSelectionIndex();
			DefaultTableModel model = (DefaultTableModel) tblCategory.getModel();
			int id = (int) model.getValueAt(n, 0);
			return id;
		}
}
