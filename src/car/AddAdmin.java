package car;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class AddAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAdmin frame = new AddAdmin();
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
	public AddAdmin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 21, 869, 151);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(AddAdmin.class.getResource("/photo/giphy.gif")));
		label_1.setBounds(609, 11, 250, 129);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(AddAdmin.class.getResource("/photo/admin page.png")));
		label_2.setBounds(52, 27, 304, 113);
		panel.add(label_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(AddAdmin.class.getResource("/photo/adminmnn2.png")));
		label.setBounds(130, 173, 145, 164);
		contentPane.add(label);
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		lblName.setBounds(41, 358, 88, 50);
		contentPane.add(lblName);
		
		JLabel label_3 = new JLabel("");
		label_3.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		label_3.setBounds(140, 358, 302, 50);
		contentPane.add(label_3);
		label_3.setText(adminLogin.a);
		
		JLabel lblAdd = new JLabel("Add Admin");
		lblAdd.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblAdd.setBounds(472, 173, 171, 40);
		contentPane.add(lblAdd);
		
		JLabel lblName_1 = new JLabel("Name:");
		lblName_1.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		lblName_1.setBounds(420, 224, 98, 50);
		contentPane.add(lblName_1);
		
		textField = new JTextField();
		textField.setBounds(514, 235, 365, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		lblPassword.setBounds(401, 296, 145, 50);
		contentPane.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(514, 305, 365, 32);
		contentPane.add(textField_1);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2","root","");
				
			String sql1="INSERT INTO `admin`(`name`, `password`) VALUES ('"+textField.getText()+"','"+textField_1.getText()+"');";
					PreparedStatement p= con.prepareStatement(sql1);
					p.execute();
					JOptionPane.showMessageDialog(null,"admin added successfully");
				
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null,e);
				}

				
				
			}
		});
		btnAdd.setBounds(401, 369, 128, 40);
		contentPane.add(btnAdd);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 97, 21);
		contentPane.add(menuBar);
		
		JMenu mnOptions = new JMenu("Options");
		mnOptions.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnOptions);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				adminLogin.main(null);
			}
		});
		
		JMenuItem mntmBack = new JMenuItem("Back");
		mntmBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				AdminMainPage.main(null);
			}
		});
		mnOptions.add(mntmBack);
		mnOptions.add(mntmLogout);
	}
}
