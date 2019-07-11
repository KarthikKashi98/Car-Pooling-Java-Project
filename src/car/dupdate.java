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
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class dupdate extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dupdate frame = new dupdate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public dupdate() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2","root","");	
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 603);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5 , 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 21, 870, 125);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(dupdate.class.getResource("/photo/images (1).jpg")));
		label.setBounds(591, 0, 269, 143);
		panel.add(label);
		
		JLabel lblEnterYourDetails = new JLabel("update your details :");
		lblEnterYourDetails.setForeground(new Color(0, 51, 102));
		lblEnterYourDetails.setFont(new Font("Incurable Prospect", Font.BOLD, 22));
		lblEnterYourDetails.setBounds(10, 0, 560, 91);
		panel.add(lblEnterYourDetails);
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblName.setBounds(10, 71, 129, 43);
		panel.add(lblName);
		
		JLabel label_1 = new JLabel("");
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_1.setBounds(123, 59, 310, 55);
		panel.add(label_1);
		label_1.setText(dlogin2.d);
		JLabel lblEmail = new JLabel("E-Mail :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(63, 247, 81, 28);
		contentPane.add(lblEmail);
		
		JLabel lblContactNo = new JLabel("Contact no:");
		lblContactNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblContactNo.setBounds(35, 304, 81, 28);
		contentPane.add(lblContactNo);
		
		JLabel lblResidentialNo = new JLabel("Residential details:");
		lblResidentialNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResidentialNo.setBounds(10, 374, 142, 34);
		contentPane.add(lblResidentialNo);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(159, 249, 282, 28);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(159, 306, 282, 28);
		contentPane.add(textField_3);
		
		JLabel lblExperiance = new JLabel("Experience : ");
		lblExperiance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblExperiance.setBounds(50, 447, 142, 34);
		contentPane.add(lblExperiance);
		
		TextArea textField_6 = new TextArea();
		textField_6.setBounds(158, 360, 460, 56);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(160, 452, 177, 28);
		contentPane.add(textField_7);
		System.out.println(dlogin2.d);
		
		JButton button = new JButton("UPDATE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String sql1="UPDATE `ddetails` SET `email`='"+textField_2.getText()+"' WHERE `dname`='"+dlogin2.d+"';";
					
					PreparedStatement p;
				
						p = con.prepareStatement(sql1);
					
					p.execute();
					JOptionPane.showMessageDialog(null,"updated");

					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null,e);
					}
				
			}
		});
		button.setBounds(649, 252, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("UPDATE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String sql1="UPDATE `ddetails` SET `ph`='"+textField_3.getText()+"' WHERE `dname`='"+dlogin2.d+"';";
					
					PreparedStatement p;
				
						p = con.prepareStatement(sql1);
					
					p.execute();
					JOptionPane.showMessageDialog(null,"updated");

					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null,e);
					}
				
			}
			
		});
		button_1.setBounds(649, 309, 89, 23);
		contentPane.add(button_1);
		
		JButton button_3 = new JButton("UPDATE");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String sql1="UPDATE `ddetails` SET `home`='"+textField_6.getText()+"' WHERE `dname`='"+dlogin2.d+"';";
					
					PreparedStatement p;
				
						p = con.prepareStatement(sql1);
					
					p.execute();
					JOptionPane.showMessageDialog(null,"updated");

					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null,e);
					}
			}
		});
		button_3.setBounds(649, 367, 89, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("UPDATE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String sql1="UPDATE `ddetails` SET `experiance`='"+textField_7.getText()+"' WHERE `dname`='"+dlogin2.d+"';";
					
					PreparedStatement p;
				
						p = con.prepareStatement(sql1);
					
					p.execute();
					JOptionPane.showMessageDialog(null,"updated");

					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null,e);
					}
			}
		});
		button_4.setBounds(649, 447, 89, 23);
		contentPane.add(button_4);
		
		JLabel lblToUpdateCar = new JLabel("To update car details click here");
		lblToUpdateCar.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblToUpdateCar.setBounds(10, 524, 498, 39);
		contentPane.add(lblToUpdateCar);
		
		JButton btnClickHere = new JButton("CLICK HERE");
		btnClickHere.setBounds(370, 531, 170, 28);
		contentPane.add(btnClickHere);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 97, 21);
		contentPane.add(menuBar);
		
		JMenu mnOptions = new JMenu("Options");
		mnOptions.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnOptions);
		
		JMenuItem mntmHome = new JMenuItem("back");
		mntmHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				driver.main(null);
				dispose();
			}
		});
		mnOptions.add(mntmHome);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				dlogin2.main(null);
			}
		});
		mnOptions.add(mntmLogout);
		
		
	}
}
