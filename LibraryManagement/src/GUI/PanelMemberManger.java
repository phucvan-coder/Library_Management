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

import DTO.MemberDTO;

import javax.swing.JTable;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import BUS.MemberBUS;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PanelMemberManger extends JPanel {
	private static JTextField txtNameMember;
	private static JTextField txtTelephoneNumber;
	private static JDateChooser dtcBirthday;
	private static JComboBox cmbGenderMember;
	private static JComboBox cmbRankMember;
	private static JTable tblMember;

	/**
	 * Create the panel.
	 */
	public PanelMemberManger() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(0,0,523, 509);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(10, 11, 503, 241);
		add(panel);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Gender");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3_1_1.setBounds(10, 170, 78, 32);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Birthday");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(10, 104, 70, 32);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Name ");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 39, 54, 32);
		panel.add(lblNewLabel_3);
		
		txtNameMember = new JTextField();
		txtNameMember.setFont(new Font("Arial", Font.PLAIN, 13));
		txtNameMember.setColumns(10);
		txtNameMember.setBounds(87, 39, 159, 32);
		panel.add(txtNameMember);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			//add
			public void actionPerformed(ActionEvent e) {
				boolean result = MemberBUS.addMember();
				if(result) {
					JOptionPane.showMessageDialog(null, "         Add successful","Message",JOptionPane.INFORMATION_MESSAGE);
					MemberBUS.showMemberList(tblMember);
				}
				else {
					JOptionPane.showMessageDialog(null, "          Add failed","Message",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnAdd.setBounds(87, 213, 85, 21);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			//delete
			public void actionPerformed(ActionEvent e) {
				int n = tblMember.getSelectionModel().getLeadSelectionIndex();
				if(n>=0) {
					boolean result = MemberBUS.deleteMember();
					if(result) {
						JOptionPane.showMessageDialog(null, "         Delete successful","Message",JOptionPane.INFORMATION_MESSAGE);
						MemberBUS.showMemberList(tblMember);
					}
					else {
						JOptionPane.showMessageDialog(null, "          Delete failed","Message",JOptionPane.ERROR_MESSAGE);
					}
				}
				else if(tblMember.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "         The list is empty","Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(n<0) {
					JOptionPane.showMessageDialog(null, "         Please select a row","Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnDelete.setBounds(209, 213, 85, 21);
		panel.add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			//update
			public void actionPerformed(ActionEvent e) {
				int n = tblMember.getSelectionModel().getLeadSelectionIndex();
				if(n>=0) {
					boolean result = MemberBUS.updateMember();
					if(result) {
						JOptionPane.showMessageDialog(null, "         Update successful","Message",JOptionPane.INFORMATION_MESSAGE);
						MemberBUS.showMemberList(tblMember);
					}
					else {
						JOptionPane.showMessageDialog(null, "          Update failed","Message",JOptionPane.ERROR_MESSAGE);
					}
				}
				else if(tblMember.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "         The list is empty","Message",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(n<0) {
					JOptionPane.showMessageDialog(null, "         Please select a row","Message",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnUpdate.setBounds(334, 213, 85, 21);
		panel.add(btnUpdate);
		
		cmbGenderMember = new JComboBox();
		cmbGenderMember.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nữ", "Khác"}));
		cmbGenderMember.setFont(new Font("Arial", Font.PLAIN, 13));
		cmbGenderMember.setBounds(90, 177, 159, 22);
		panel.add(cmbGenderMember);
		
		JLabel lblNewLabel_3_2 = new JLabel("Phone");
		lblNewLabel_3_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3_2.setBounds(270, 39, 54, 32);
		panel.add(lblNewLabel_3_2);
		
		txtTelephoneNumber = new JTextField();
		txtTelephoneNumber.setFont(new Font("Arial", Font.PLAIN, 13));
		txtTelephoneNumber.setColumns(10);
		txtTelephoneNumber.setBounds(334, 39, 159, 32);
		panel.add(txtTelephoneNumber);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Rank");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3_1_1_1.setBounds(256, 104, 78, 32);
		panel.add(lblNewLabel_3_1_1_1);
		
		cmbRankMember = new JComboBox();
		cmbRankMember.setModel(new DefaultComboBoxModel(new String[] {"Thủ Thư", "Người Đọc"}));
		cmbRankMember.setFont(new Font("Arial", Font.PLAIN, 13));
		cmbRankMember.setBounds(334, 110, 159, 22);
		panel.add(cmbRankMember);
		
		
		JLabel lblNewLabel_3_4 = new JLabel("Member Management");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_4.setBounds(175, 0, 178, 32);
		panel.add(lblNewLabel_3_4);
		
		dtcBirthday = new JDateChooser();
		dtcBirthday.setBounds(90, 104, 156, 32);
		//format dd/MM/yyyy for datechooser
		dtcBirthday.setDateFormatString("dd-MM-yyyy");
		panel.add(dtcBirthday);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 281, 503, 217);
		add(scrollPane);
		
		tblMember = new JTable();
		tblMember.addMouseListener(new MouseAdapter() {
			//click on table
			@Override
			public void mouseClicked(MouseEvent e) {
				int n = tblMember.getSelectionModel().getLeadSelectionIndex();
				txtNameMember.setText(tblMember.getValueAt(n, 1).toString());
				dtcBirthday.setDate((Date) (tblMember.getValueAt(n, 2)));
				cmbGenderMember.setSelectedItem(tblMember.getValueAt(n, 3));
				txtTelephoneNumber.setText(tblMember.getValueAt(n, 4).toString());
				cmbRankMember.setSelectedItem(tblMember.getValueAt(n, 5));
			}
		});
		tblMember.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "MemberName", "Birthday", "Gender", "PhoneNumber", "Rank"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(tblMember);
		setVisible(false);
		//display Member list
		MemberBUS.showMemberList(tblMember);
		
		JButton btnReload = new JButton("Reload");
		btnReload.addActionListener(new ActionListener() {
			//reload
			public void actionPerformed(ActionEvent e) {
				MemberBUS.showMemberList(tblMember);
			}
		});
		btnReload.setBounds(10, 255, 77, 24);
		add(btnReload);
		
		int rank = GUI.FormHomePage.checkRank;
		if(rank!=1) {
			btnAdd.setEnabled(false);
			btnDelete.setEnabled(false);
			btnUpdate.setEnabled(false);
		}
	}
	//get Member
	public static MemberDTO getMember() {
		MemberDTO p = new MemberDTO();
		p.setMemberName(txtNameMember.getText());
		p.setBirthday(dtcBirthday.getDate());
		p.setGender(cmbGenderMember.getSelectedItem().toString());;
		p.setPhoneNumber(txtTelephoneNumber.getText());
		p.setRank(cmbRankMember.getSelectedItem().toString());
		return p;
	}
	//get id
	public static int getMemberID() {
		int n = tblMember.getSelectionModel().getLeadSelectionIndex();
		DefaultTableModel model = (DefaultTableModel) tblMember.getModel();
		int id = (int) model.getValueAt(n, 0);
		return id;
	}
}
