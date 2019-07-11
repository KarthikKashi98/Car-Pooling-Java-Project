package car;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class proute2 extends JFrame {
	static int a=0;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	JComboBox<String> comboBox = new JComboBox();
	static String s,p;
static proute2 frame;
	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new proute2();
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
	 
	public proute2() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1123, 674);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.GRAY);
		panel.setBounds(0, 23, 1097, 125);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("where is your car ?");
		label.setForeground(new Color(0, 51, 102));
		label.setFont(new Font("Incurable Prospect", Font.BOLD, 30));
		label.setBounds(98, 25, 631, 77);
		panel.add(label);
		
		JLabel lblListOfTaxie = new JLabel("list of available taxie for your covineance");
		lblListOfTaxie.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblListOfTaxie.setBounds(41, 162, 640, 54);
		contentPane.add(lblListOfTaxie);
		
		JButton btnNewButton = new JButton("click to view");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
	
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2","root","");
				                                     
					
					String u="SELECT * FROM `droute` WHERE ( `place1` LIKE '%"+proute.b+"%' or `place2` LIKE '%"+proute.b+"%' or `place3` LIKE '%"+proute.b+"%' or `place4` LIKE '%"+proute.b+"%' or `place5` LIKE '%"+proute.b+"%' or `place6` LIKE '%"+proute.b+"%' or `place7` LIKE '%"+proute.b+"%' or `place8` LIKE '%"+proute.b+"%' or `place9` LIKE '%"+proute.b+"%' or `place10` LIKE '%"+proute.b+"%') and" + 
                             " (`place1` LIKE '%"+proute.h+"%' or `place2` LIKE '%"+proute.h+"%' or `place3` LIKE '%"+proute.h+"%' or `place4` LIKE '%"+proute.h+"%' or `place5` LIKE '%"+proute.h+"%' or `place6` LIKE '%"+proute.h+"%' or `place7` LIKE '%"+proute.h+"%' or `place8` LIKE '%"+proute.h+"%' or `place9` LIKE '%"+proute.h+"%' or `place10` LIKE '%"+proute.h+"%' "
                             		+ ");";
		
					
					PreparedStatement stmt=con.prepareStatement(u);
					ResultSet rs= stmt.executeQuery();
					
					if(!rs.next()) {
						JOptionPane.showMessageDialog(null,"no car is available");
					dispose();
						proute.main(null);
					
						
					}
						
					
					
					ResultSet rs1= stmt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs1));
					
					try {
						
						                                                
						
						String sql="SELECT * FROM `droute` WHERE ( `place1` LIKE '%"+proute.b+"%' or `place2` LIKE '%"+proute.b+"%' or `place3` LIKE '%"+proute.b+"%' or `place4` LIKE '%"+proute.b+"%' or `place5` LIKE '%"+proute.b+"%' or `place6` LIKE '%"+proute.b+"%' or `place7` LIKE '%"+proute.b+"%' or `place8` LIKE '%"+proute.b+"%' or `place9` LIKE '%"+proute.b+"%' or `place10` LIKE '%"+proute.b+"%' ) and" + 
							                                    " (`place1` LIKE '%"+proute.h+"%' or `place2` LIKE '%"+proute.h+"%' or `place3` LIKE '%"+proute.h+"%' or `place4` LIKE '%"+proute.h+"%' or `place5` LIKE '%"+proute.h+"%' or `place6` LIKE '%"+proute.h+"%' or `place7` LIKE '%"+proute.h+"%' or `place8` LIKE '%"+proute.h+"%' or `place9` LIKE '%"+proute.h+"%' or `place10` LIKE '%"+proute.h+"%' );";
						ResultSet rs11= stmt.executeQuery(sql);
						
						while(rs11.next()) {
							String name=rs11.getString("dname");
							comboBox.addItem(name);
							
						}
					}
				catch(Exception e) {
				
				}

					
					
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		});
		btnNewButton.setBounds(640, 180, 134, 30);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 212, 1066, 183);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		
		JLabel lblSelectToGet = new JLabel("select to get a above mentioned drivers and there cars information");
		lblSelectToGet.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblSelectToGet.setBounds(22, 417, 1029, 54);
		contentPane.add(lblSelectToGet);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s=(String) comboBox.getSelectedItem();
				textField.setText(s);
				p=s;
				
			}
		});
		
		
		comboBox.setBounds(10, 482, 213, 23);
		contentPane.add(comboBox);
				
		textField = new JTextField();
		textField.setBounds(234, 482, 213, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dinform.main(null);
			}
		});
		btnSubmit.setBounds(358, 527, 89, 30);
		contentPane.add(btnSubmit);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, -6, 97, 30);
		contentPane.add(menuBar);
		
		JMenu mnOptions = new JMenu("Options");
		mnOptions.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnOptions);
		
		JMenuItem mntmBack = new JMenuItem("Back");
		mntmBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				proute.main(null);
			}
		});
		mnOptions.add(mntmBack);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				plogin2.main(null);
			}
		});
		mnOptions.add(mntmLogout);
	}
	
}
