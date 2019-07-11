package car;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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


public class AdminsDriver extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	JComboBox<String> comboBox = new JComboBox();
	static String sa;

	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminsDriver frame = new AdminsDriver();
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
	public AdminsDriver() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1123, 674);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.LIGHT_GRAY);
		panel.setBounds(0, 22, 1087, 125);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDriverAndDriver = new JLabel("Driver Details and Driver's routes");
		lblDriverAndDriver.setLabelFor(this);
		lblDriverAndDriver.setForeground(new Color(0, 51, 102));
		lblDriverAndDriver.setFont(new Font("Incurable Prospect", Font.BOLD, 30));
		lblDriverAndDriver.setBounds(10, 24, 1067, 77);
		panel.add(lblDriverAndDriver);
		
		JLabel lblListOfTaxie = new JLabel("Click to view Drivers and Driver's routs");
		lblListOfTaxie.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblListOfTaxie.setBounds(41, 147, 640, 54);
		contentPane.add(lblListOfTaxie);
		try {
			
            
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2","root","");
		    
			String sql="SELECT * FROM `droute` where droute.dname IN (SELECT ddetails.Dname FROM `ddetails` WHERE IsBlocked='NO');";
			PreparedStatement stmt=con.prepareStatement(sql);
					ResultSet rs11= stmt.executeQuery();
			
			while(rs11.next()) {
				String name=rs11.getString("dname");
				comboBox.addItem(name);
			}
		}
	catch(Exception e) {
	
	}

		
		JButton btnNewButton = new JButton("click to view");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2","root","");
				                                     
					
					String u="SELECT * FROM `droute` where droute.dname IN (SELECT ddetails.Dname FROM `ddetails` WHERE IsBlocked='NO');";
					
					PreparedStatement stmt=con.prepareStatement(u);
					ResultSet rs= stmt.executeQuery();
					
					if(!rs.next()) {
						JOptionPane.showMessageDialog(null,"no car is available");
					dispose();
						proute.main(null);
					
						
					}
						
					
					
					ResultSet rs1= stmt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs1));
					
				
					
					
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		});
		btnNewButton.setBounds(638, 169, 125, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 212, 1097, 183);
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
				sa=(String) comboBox.getSelectedItem();
				textField.setText(sa);
				
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
				dinform2.main(null);
			}
		});
		btnSubmit.setBounds(358, 527, 89, 30);
		contentPane.add(btnSubmit);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 1, 97, 21);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Options");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmBack = new JMenuItem("Back");
		mntmBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminMainPage.main(null);
				dispose();
			}
		});
		mnNewMenu.add(mntmBack);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adminLogin.main(null);
				dispose();
			}
		});
		mnNewMenu.add(mntmLogout);
	}
}
