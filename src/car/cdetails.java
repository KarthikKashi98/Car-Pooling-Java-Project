package car;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class cdetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cdetails frame = new cdetails();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public cdetails() throws SQLException, ClassNotFoundException {
		setResizable(false);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2","root","");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 21, 910, 147);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblcardetail = new JLabel("Enter your Car Details ");
		lblcardetail.setForeground(new Color(0, 51, 153));
		lblcardetail.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		lblcardetail.setBounds(20, 0, 464, 86);
		panel.add(lblcardetail);
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblName.setForeground(Color.YELLOW);
		lblName.setBounds(20, 90, 120, 39);
		panel.add(lblName);
		
		JLabel CNAME = new JLabel("");
		CNAME.setText(DriverSignup.co);
		CNAME.setForeground(Color.YELLOW);
		CNAME.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		CNAME.setBounds(124, 79, 430, 50);
		panel.add(CNAME);
		
		JLabel lblCarNo = new JLabel("Car no :");
		lblCarNo.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		lblCarNo.setBounds(65, 236, 124, 30);
		contentPane.add(lblCarNo);
		
		JLabel lblCarModel = new JLabel("Car Model :");
		lblCarModel.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		lblCarModel.setBounds(65, 195, 172, 30);
		contentPane.add(lblCarModel);
		
		JLabel lblAcnonAc = new JLabel("ac/non ac:");
		lblAcnonAc.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		lblAcnonAc.setBounds(65, 318, 124, 30);
		contentPane.add(lblAcnonAc);
		
		JLabel lblNoOfSeats = new JLabel("no of seats :");
		lblNoOfSeats.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		lblNoOfSeats.setBounds(65, 277, 156, 30);
		contentPane.add(lblNoOfSeats);
		
		textField = new JTextField();
		textField.setBounds(211, 195, 222, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(211, 236, 222, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(211, 277, 222, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(211, 318, 222, 30);
		contentPane.add(textField_3);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 if(textField.getText().equals("")||textField_1.getText().equals("")||textField_2.getText().equals("")||textField_3.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"fill up all the details");
				}
				 
				 
		
				 else {
					 
					 
	 try {
						 
						 String s="Select `carno` from ddetails,cardetail where ddetails.dname=cardetail.Dname and IsBlocked ='yes' and carno='"+textField_1.getText()+"';";
							
							PreparedStatement stmt=con.prepareStatement(s);
							ResultSet rs= stmt.executeQuery();
							
							if(rs.next()) {
								JOptionPane.showMessageDialog(null,"this car is blocked by the admin u can not signup with this car");
								DriverSignup.frame.dispose();
								dispose();
								dlogin2.main(null);
								
							}
						 
							else {
			
				String sql1="INSERT INTO `ddetails` (`Dname`, `age`,`email`,`ph`,`home`,`experiance`,`Dpassword`,`adharno`) VALUES ('"+DriverSignup.t1+"', '"+DriverSignup.t2+"','"+DriverSignup.t3+"','"+DriverSignup.t4+"','"+DriverSignup.t7+"','"+DriverSignup.t8+"','"+DriverSignup.t9+ "','"+DriverSignup.t10+"');";
				
				PreparedStatement p= con.prepareStatement(sql1);
				p.execute();
				JOptionPane.showMessageDialog(null,"login inserted suscces fully");
				String s1="INSERT INTO `dlogin`(`dname`, `password`) VALUES ('"+DriverSignup.t1+"','"+DriverSignup.t9+"');";
				PreparedStatement q= con.prepareStatement(s1);
				q.execute();
				String sq="INSERT INTO `DROUTE`(`dname`) VALUES ('"+DriverSignup.t1+"');";
				PreparedStatement qq= con.prepareStatement(sq);
				qq.execute();
				
				
				
				
				
				
			String sql11="INSERT INTO `cardetail`(`dname`, `car`, `carno`, `ac`, `seats`) VALUES ('"+DriverSignup.co+"','"+textField.getText()+"','"+textField_1.getText()+
					"','"+textField_3.getText()+"','"+textField_2.getText()+"');";
				//Statement stmt11=con.createStatement();
				
				PreparedStatement q1= con.prepareStatement(sql11);
				q1.execute();
				dispose();
				DriverSignup.frame.dispose();
				dlogin2.main(null);
							}
			}
			catch(Exception e) {
				int e1=Integer.parseInt(DriverSignup.t8);
				if(e1<5 && e1>40)
				JOptionPane.showMessageDialog(null," your experiance is less than 5 and more than 40 u can not create your account Sql exception is \n"+e);
				else
					JOptionPane.showMessageDialog(null,e);	
			}
				
				 }
			}
		});
		btnSubmit.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		btnSubmit.setBounds(454, 416, 115, 39);
		contentPane.add(btnSubmit);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				
			}
		});
		btnBack.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		btnBack.setBounds(605, 416, 103, 39);
		contentPane.add(btnBack);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 0, 97, 21);
		contentPane.add(menuBar);
		
		JMenu mnOptions = new JMenu("Options");
		mnOptions.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnOptions);
		
		JMenuItem mntmBack = new JMenuItem("Back");
		mntmBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				DriverSignup.main(null);
				
			}
		});
		mnOptions.add(mntmBack);
		
		JMenuItem mntmHome = new JMenuItem("Home");
		mnOptions.add(mntmHome);
	}
}
