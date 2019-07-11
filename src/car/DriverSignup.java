package car;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import java.awt.ScrollPane;
import java.awt.TextField;
import javax.swing.JTextPane;

public class DriverSignup extends JFrame {

	public static JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_7;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	static String co;
	static String t1;
	static String t2;
	static String t3;
	static String t4;
	static String t5;
	static String t6;
	static String t7;
	static String t8;
	static String t9;
	static String t10;
	static DriverSignup frame;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new DriverSignup();
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
	public DriverSignup() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5 , 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(-1, 22, 870, 125);
		contentPane.add(panel);
		panel.setLayout(null);
		JTextPane textField_6 = new JTextPane();
		textField_4 = new JTextField();
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(DriverSignup.class.getResource("/photo/images (1).jpg")));
		label.setBounds(594, 0, 266, 143);
		panel.add(label);
		
		JLabel lblEnterYourDetails = new JLabel("Enter driver details :");
		lblEnterYourDetails.setForeground(new Color(0, 51, 102));
		lblEnterYourDetails.setFont(new Font("Incurable Prospect", Font.BOLD, 26));
		lblEnterYourDetails.setBounds(10, 11, 574, 103);
		panel.add(lblEnterYourDetails);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblName.setBounds(40, 158, 100, 34);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(159, 163, 282, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAge = new JLabel("D.O.B:");
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblAge.setBounds(462, 161, 117, 28);
		contentPane.add(lblAge);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(543, 161, 177, 28);
		contentPane.add(textField_1);
		
		JLabel lblEmail = new JLabel("E-Mail :");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblEmail.setBounds(40, 203, 100, 28);
		contentPane.add(lblEmail);
		
		JLabel lblContactNo = new JLabel("Contact no:");
		lblContactNo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblContactNo.setBounds(40, 242, 100, 28);
		contentPane.add(lblContactNo);
		
		JLabel lblResidentialNo = new JLabel("Residential details:");
		lblResidentialNo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblResidentialNo.setBounds(-1, 281, 170, 34);
		contentPane.add(lblResidentialNo);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(159, 205, 282, 28);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(159, 244, 282, 28);
		contentPane.add(textField_3);
		
		JLabel lblExperiance = new JLabel("Experiance : ");
		lblExperiance.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblExperiance.setBounds(40, 351, 100, 34);
		contentPane.add(lblExperiance);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(159, 356, 177, 28);
		contentPane.add(textField_7);
		
		JButton btnSubmit = new JButton("next");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2","root","");
					Statement stmt=con.createStatement();
					String sql="Select * from ddetails where Dname='"+textField.getText()+"'";
					ResultSet rs= stmt.executeQuery(sql);
					if(rs.next())
					{
						
						JOptionPane.showMessageDialog(null,"username already exist");
	
					
					}
					else if(textField.getText().equals("")||textField_1.getText().equals("")||textField_2.getText().equals("")
							||textField_3.getText().equals("")||
							textField_6.getText().equals("")||textField_7.getText().equals("")||passwordField.getText().equals("")||textField_4.getText().equals("")||
							passwordField_1.getText().equals("")) {
						
						JOptionPane.showMessageDialog(null,"fill up all the details");
					}
					else if(!(passwordField.getText().equals(passwordField_1.getText()))){
						JOptionPane.showMessageDialog(null,"password is wrong");
						
					}
					
					else {
						 
						
						
						
						co=textField.getText();
						t1=textField.getText(); t2=textField_1.getText();t3=textField_2.getText(); t4=textField_3.getText(); 
					 t7=textField_6.getText(); t8=textField_7.getText(); t9=passwordField_1.getText();
						t10=textField_4.getText();
						
						
						cdetails.main(null);
					}
				
			}
				
				catch(Exception e) {
					JOptionPane.showMessageDialog(null,e);
				}
				
				
				
			}
				
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSubmit.setBounds(721, 446, 89, 37);
		contentPane.add(btnSubmit);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPassword.setBounds(40, 396, 100, 34);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(159, 407, 282, 28);
		contentPane.add(passwordField);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblConfirmPassword.setBounds(451, 402, 153, 34);
		contentPane.add(lblConfirmPassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(598, 407, 282, 28);
		contentPane.add(passwordField_1);
		
		JLabel lblyyyymmdd = new JLabel("(YYYY-MM-DD)");
		lblyyyymmdd.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblyyyymmdd.setBounds(721, 158, 175, 29);
		contentPane.add(lblyyyymmdd);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(-1, 3, 117, 21);
		contentPane.add(menuBar);
		
		JMenu mnOptions = new JMenu("Options");
		mnOptions.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnOptions);
		
		JMenuItem mntmBack = new JMenuItem("Back");
		mntmBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				dlogin2.main(null);

			}
		});
		mnOptions.add(mntmBack);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(159, 281, 263, 67);
		contentPane.add(scrollPane);
	
		scrollPane.setViewportView(textField_6);
		
		JLabel lblAdharNo = new JLabel("Adhar no");
		lblAdharNo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblAdharNo.setBounds(462, 203, 89, 28);
		contentPane.add(lblAdharNo);
		
	
		textField_4.setColumns(10);
		textField_4.setBounds(543, 200, 177, 28);
		contentPane.add(textField_4);
		
		
	}
}
