package car;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class plogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					plogin frame = new plogin();
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
	public plogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 803, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(3, 3, 1, 3, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), new LineBorder(new Color(0, 0, 0))));
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 807, 129);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(plogin.class.getResource("/photo/images (2).jpg")));
		label.setBounds(604, 0, 193, 129);
		panel.add(label);
		
		JLabel lblEnterYourDetails = new JLabel("Enter your details");
		lblEnterYourDetails.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		lblEnterYourDetails.setBounds(62, 25, 364, 81);
		panel.add(lblEnterYourDetails);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(38, 191, 102, 29);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("D.O.B:");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAge.setBounds(38, 231, 102, 29);
		contentPane.add(lblAge);
		
		JLabel lblEmail = new JLabel("email :");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmail.setBounds(38, 271, 102, 29);
		contentPane.add(lblEmail);
		
		JLabel lblContactNo = new JLabel("Contact no :");
		lblContactNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblContactNo.setBounds(38, 311, 124, 29);
		contentPane.add(lblContactNo);
		
		textField = new JTextField();
		textField.setBounds(249, 194, 252, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(249, 235, 140, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(249, 274, 252, 29);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(249, 314, 252, 29);
		contentPane.add(textField_3);
		
		JLabel lblPassword = new JLabel("password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(38, 351, 124, 29);
		contentPane.add(lblPassword);
		
		JLabel lblConfi = new JLabel("confirm password :");
		lblConfi.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblConfi.setBounds(38, 391, 180, 29);
		contentPane.add(lblConfi);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(249, 354, 252, 26);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(249, 395, 252, 26);
		contentPane.add(passwordField_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				

				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2","root","");
					Statement stmt=con.createStatement();
					
					String sql12="Select * from plogin where pname='"+textField.getText()+"'";
					ResultSet rs1= stmt.executeQuery(sql12);
					if(rs1.next())
					{
						
						JOptionPane.showMessageDialog(null,"username already exist");
						
						
						
						
	
					
					}
					
					String sql="Select * from pdetails where pname='"+textField.getText()+"'";
					ResultSet rs= stmt.executeQuery(sql);
					
					if(!rs.next())
					{
						
						
	
					
					
					
					 if(textField.getText().equals("")||textField_1.getText().equals("")||textField_2.getText().equals("")||textField_3.getText().equals("")||passwordField.getText().equals("")||passwordField_1.getText().equals("")) {
						
						JOptionPane.showMessageDialog(null,"fill up all the details");
					}
					else if(!(passwordField.getText().equals(passwordField_1.getText()))){
						JOptionPane.showMessageDialog(null,"password nettug hodiyo");
						
					}
					
					else {
						
							
						String sql1="INSERT INTO `pdetails`(`pname`, `age`,`email`, `pph`,`password`) VALUES ('"+textField.getText()+"','"+textField_1.getText()+"','"+textField_2.getText()+"','"+textField_3.getText()+"','"+passwordField_1.getText()+"');";
						
						PreparedStatement p= con.prepareStatement(sql1);
						p.execute();
						
						String s="INSERT INTO `plogin`(`pname`, `password`) VALUES ('"+textField.getText()+"','"+passwordField_1.getText()+"');";
						PreparedStatement q= con.prepareStatement(s);
						q.execute();
						JOptionPane.showMessageDialog(null,"account created successfully");
						plogin2.main(null);
						
						dispose();

						
					}
					}
					
				
			}
				
				catch(Exception e) {
					JOptionPane.showMessageDialog(null,e);
				}
				
				}
				
		});
		btnSubmit.setBounds(530, 518, 124, 36);
		contentPane.add(btnSubmit);
		
		JLabel label_1 = new JLabel("(YYYY-MM-DD)");
		label_1.setBounds(399, 231, 142, 29);
		contentPane.add(label_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 128, 97, 21);
		contentPane.add(menuBar);
		
		JMenu mnOptions = new JMenu("Options");
		mnOptions.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnOptions);
		
		JMenuItem mntmBack = new JMenuItem("Back");
		mntmBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			plogin2.main(null);
			}
		});
		mnOptions.add(mntmBack);
	}
}
