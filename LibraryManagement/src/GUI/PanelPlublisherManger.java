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
import javax.swing.table.DefaultTableModel;

import BUS.PublisherBUS;
import DTO.PublisherDTO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelPlublisherManger extends JPanel {
	private static JTextField txtPhoneNumber;
	private static JTextField txtAdrress;
	private static JTextField txtNamePublisher;
	private static JTable tblPublisher;

	/**
	 * Create the panel.
	 */
	public PanelPlublisherManger() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(0,0,523, 509);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 11, 503, 241);
		add(panel);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Phone Number");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3_1_1.setBounds(10, 170, 110, 32);
		panel.add(lblNewLabel_3_1_1);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setFont(new Font("Arial", Font.PLAIN, 12));
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(140, 169, 202, 32);
		panel.add(txtPhoneNumber);
		
		txtAdrress = new JTextField();
		txtAdrress.setFont(new Font("Arial", Font.PLAIN, 12));
		txtAdrress.setColumns(10);
		txtAdrress.setBounds(140, 103, 202, 32);
		panel.add(txtAdrress);
		
		JLabel lblNewLabel_3_1 = new JLabel("Address");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(10, 104, 78, 32);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Name Publisher");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 39, 117, 32);
		panel.add(lblNewLabel_3);
		
		txtNamePublisher = new JTextField();
		txtNamePublisher.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNamePublisher.setColumns(10);
		txtNamePublisher.setBounds(137, 39, 205, 32);
		panel.add(txtNamePublisher);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			//add
			public void actionPerformed(ActionEvent e) {
				boolean result = PublisherBUS.addPublisher();
				if(result) {
					JOptionPane.showMessageDialog(null, "         Add successful","Message",JOptionPane.INFORMATION_MESSAGE);
					PublisherBUS.showPublisherList(tblPublisher);
				}
				else {
					JOptionPane.showMessageDialog(null, "          Add failed","Message",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnAdd.setBounds(388, 43, 105, 29);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			//delete
			public void actionPerformed(ActionEvent e) {
				int n = tblPublisher.getSelectionModel().getLeadSelectionIndex();
				if(n>=0) {
					boolean result = PublisherBUS.deletePublisher();
					if(result) {
						JOptionPane.showMessageDialog(null, "         Delete successful","Message",JOptionPane.INFORMATION_MESSAGE);
						PublisherBUS.showPublisherList(tblPublisher);
					}
					else {
						JOptionPane.showMessageDialog(null, "          Delete failed","Message",JOptionPane.ERROR_MESSAGE);
					}
				}
				if(tblPublisher.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "         The list is empty","Message",JOptionPane.INFORMATION_MESSAGE);
				}
				if(n<0) {
					JOptionPane.showMessageDialog(null, "         Please select a row","Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnDelete.setBounds(388, 107, 105, 30);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			//update
			public void actionPerformed(ActionEvent e) {
				int n = tblPublisher.getSelectionModel().getLeadSelectionIndex();
				if(n>=0) {
					boolean result = PublisherBUS.updatePublisher();
					if(result) {
						JOptionPane.showMessageDialog(null, "         Update successful","Message",JOptionPane.INFORMATION_MESSAGE);
						PublisherBUS.showPublisherList(tblPublisher);
					}
					else {
						JOptionPane.showMessageDialog(null, "          Update failed","Message",JOptionPane.ERROR_MESSAGE);
					}
				}
				if(tblPublisher.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "         The list is empty","Message",JOptionPane.INFORMATION_MESSAGE);
				}
				if(n<0) {
					JOptionPane.showMessageDialog(null, "         Please select a row","Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnUpdate.setBounds(388, 174, 105, 29);
		panel.add(btnUpdate);
		
		JLabel lblNewLabel = new JLabel("Publisher Management");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(175, 11, 167, 14);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 265, 503, 233);
		add(scrollPane);
		
		tblPublisher = new JTable();
		tblPublisher.addMouseListener(new MouseAdapter() {
			//click on table
			@Override
			public void mouseClicked(MouseEvent e) {
				int n = tblPublisher.getSelectionModel().getLeadSelectionIndex();
				txtNamePublisher.setText(tblPublisher.getValueAt(n, 1).toString());
				txtAdrress.setText(tblPublisher.getValueAt(n, 2).toString());
				txtPhoneNumber.setText(tblPublisher.getValueAt(n, 3).toString());
			}
		});
		tblPublisher.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "PublisherName", "Address", "PhoneNumber"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(tblPublisher);
		setVisible(false);
		PublisherBUS.showPublisherList(tblPublisher);
	}
	//get publisher
		public static PublisherDTO getPublisher() {
			PublisherDTO p = new PublisherDTO();
			p.setPublisherName(txtNamePublisher.getText());
			p.setAddress(txtAdrress.getText());
			p.setPhoneNumber(txtPhoneNumber.getText());
			return p;
		}
		//get id
		public static int getPublisherID() {
			int n = tblPublisher.getSelectionModel().getLeadSelectionIndex();
			DefaultTableModel model = (DefaultTableModel) tblPublisher.getModel();
			int id = (int) model.getValueAt(n, 0);
			return id;
		}
}
