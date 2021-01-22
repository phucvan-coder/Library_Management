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
import javax.swing.table.DefaultTableModel;

import BUS.AuthorBUS;
import DTO.AuthorDTO;

import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelManagerAuthor extends JPanel {
	private static JTextField txtNameAuthor;
	private static JTable tblAuthorManager;

	/**
	 * Create the panel.
	 */
	public PanelManagerAuthor() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(0,0,626, 505);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 11, 606, 159);
		add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(73, 50, 60, 32);
		panel.add(lblNewLabel_3);
		
		txtNameAuthor = new JTextField();
		txtNameAuthor.setFont(new Font("Arial", Font.BOLD, 18));
		txtNameAuthor.setColumns(10);
		txtNameAuthor.setBounds(149, 50, 329, 32);
		panel.add(txtNameAuthor);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			//add
			public void actionPerformed(ActionEvent e) {
				boolean result = AuthorBUS.addAuthor();
				if(result) {
					JOptionPane.showMessageDialog(null, "         Add successful","Message",JOptionPane.INFORMATION_MESSAGE);
					AuthorBUS.showAuthorList(tblAuthorManager);
				}
				else {
					JOptionPane.showMessageDialog(null, "          Add failed","Message",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnAdd.setBounds(149, 117, 85, 31);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			//delete
			public void actionPerformed(ActionEvent e) {
				int n = tblAuthorManager.getSelectionModel().getLeadSelectionIndex();
				if(n>=0) {
					boolean result = AuthorBUS.deleteAuthor();
					if(result) {
						JOptionPane.showMessageDialog(null, "         Delete successful","Message",JOptionPane.INFORMATION_MESSAGE);
						AuthorBUS.showAuthorList(tblAuthorManager);
					}
					else {
						JOptionPane.showMessageDialog(null, "          Delete failed","Message",JOptionPane.ERROR_MESSAGE);
					}
				}
				else if(tblAuthorManager.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "         The list is empty","Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(n<0) {
					JOptionPane.showMessageDialog(null, "         Please select a row","Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnDelete.setBounds(269, 116, 85, 32);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			//update
			public void actionPerformed(ActionEvent e) {
				int n = tblAuthorManager.getSelectionModel().getLeadSelectionIndex();
				if(n>=0) {
					boolean result = AuthorBUS.updateAuthor();
					if(result) {
						JOptionPane.showMessageDialog(null, "         Update successful","Message",JOptionPane.INFORMATION_MESSAGE);
						AuthorBUS.showAuthorList(tblAuthorManager);
					}
					else {
						JOptionPane.showMessageDialog(null, "          Update failed","Message",JOptionPane.ERROR_MESSAGE);
					}
				}
				else if(tblAuthorManager.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "         The list is empty","Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(n<0) {
					JOptionPane.showMessageDialog(null, "         Please select a row","Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnUpdate.setBounds(393, 117, 85, 31);
		panel.add(btnUpdate);
		
		JLabel lblNewLabel = new JLabel("Author Management");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(237, 11, 164, 13);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 200, 606, 298);
		add(scrollPane);
		
		tblAuthorManager = new JTable();
		tblAuthorManager.addMouseListener(new MouseAdapter() {
			//click on table
			@Override
			public void mouseClicked(MouseEvent e) {
				int n = tblAuthorManager.getSelectionModel().getLeadSelectionIndex();
				txtNameAuthor.setText(tblAuthorManager.getValueAt(n, 1).toString());
			}
		});
		tblAuthorManager.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "AuthorName"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(tblAuthorManager);
		setVisible(false);
		//display Author List
		AuthorBUS.showAuthorList(tblAuthorManager);
		
		JButton btnReload = new JButton("Reload");
		btnReload.addActionListener(new ActionListener() {
			//reload
			public void actionPerformed(ActionEvent e) {
				AuthorBUS.showAuthorList(tblAuthorManager);
			}
		});
		btnReload.setBounds(10, 174, 86, 24);
		add(btnReload);
	}
	//get Author
		public static AuthorDTO getAuthor() {
			AuthorDTO p = new AuthorDTO();
			p.setAuthorName(txtNameAuthor.getText());
			return p;
		}
		//get id
		public static int getAuthorID() {
			int n = tblAuthorManager.getSelectionModel().getLeadSelectionIndex();
			DefaultTableModel model = (DefaultTableModel) tblAuthorManager.getModel();
			int id = (int) model.getValueAt(n, 0);
			return id;
		}
}
