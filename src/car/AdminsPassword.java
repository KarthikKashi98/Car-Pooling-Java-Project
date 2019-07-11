package car;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class AdminsPassword extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminsPassword frame = new AdminsPassword();
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
	public AdminsPassword() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOldPassword = new JLabel("old password");
		lblOldPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOldPassword.setBounds(21, 27, 85, 22);
		contentPane.add(lblOldPassword);
		
		JLabel lblNewPassWord = new JLabel("new pass word");
		lblNewPassWord.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewPassWord.setBounds(21, 73, 85, 22);
		contentPane.add(lblNewPassWord);
		
		JLabel lblConfirmPassWord = new JLabel("confirm pass word");
		lblConfirmPassWord.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblConfirmPassWord.setBounds(10, 121, 129, 22);
		contentPane.add(lblConfirmPassWord);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2","root","");
				                                     
					
					String u="SELECT * FROM `admin` WHERE name='"+adminLogin.a+"' and password='"+passwordField.getText()+"';";
					
					PreparedStatement stmt=con.prepareStatement(u);
					ResultSet rs= stmt.executeQuery();
					
					if(!rs.next()) {
						JOptionPane.showMessageDialog(null,"old password is wrong");
						
					}
					else if(!passwordField_1.getText().equals(passwordField_2.getText())) {
						JOptionPane.showMessageDialog(null,"please check your password");
					}
					else
					{
						try {
							String sql1="UPDATE `admin` SET `password`='"+passwordField_2.getText()+"' WHERE `name`='"+adminLogin.a+"';";
							
							PreparedStatement p;
						
								p = con.prepareStatement(sql1);
							
							p.execute();
							JOptionPane.showMessageDialog(null,"updated");
							setVisible(false);

							} catch (Exception e) {
								
								JOptionPane.showMessageDialog(null,e);
							}
						
						
						
						
					}
				}
				catch(Exception e) {
				}
				}
			
		});
		btnSubmit.setBounds(309, 170, 89, 23);
		contentPane.add(btnSubmit);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(134, 28, 282, 28);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(134, 74, 282, 28);
		contentPane.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(134, 113, 282, 28);
		contentPane.add(passwordField_2);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnBack.setBounds(180, 170, 89, 23);
		contentPane.add(btnBack);
	}
}
