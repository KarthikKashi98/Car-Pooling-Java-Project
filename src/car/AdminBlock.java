package car;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminBlock extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminBlock frame = new AdminBlock();
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
	public AdminBlock() throws SQLException, ClassNotFoundException {
		setResizable(false);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2","root","");
	       
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDriverNams = new JLabel("Driver names");
		lblDriverNams.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDriverNams.setBounds(10, 11, 126, 34);
		contentPane.add(lblDriverNams);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText((String) comboBox.getSelectedItem());
			}
		});
		comboBox.setBounds(146, 20, 158, 20);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(314, 20, 195, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBlock = new JButton("Block");
		btnBlock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					String sql1="UPDATE `ddetails` SET `IsBlocked`= 'yes' WHERE Dname='"+textField.getText()+"'";
					
					PreparedStatement p;
				
						p = con.prepareStatement(sql1);
					
					p.execute();
					JOptionPane.showMessageDialog(null,"updated");
					setVisible(false);

					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null,e);
					}
				
				
			}
		});
		btnBlock.setBounds(378, 56, 89, 23);
		contentPane.add(btnBlock);
		
		
		                              
		
		JButton btnUnblock = new JButton("Unblock");
		btnUnblock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String sql1="UPDATE `ddetails` SET `IsBlocked`= 'no' WHERE Dname='"+textField.getText()+"'";
					
					PreparedStatement p;
				
						p = con.prepareStatement(sql1);
					
					p.execute();
					JOptionPane.showMessageDialog(null,"updated");
					setVisible(false);

					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null,e);
					}
				
				
				
				
			}
		});
		btnUnblock.setBounds(378, 90, 89, 23);
		contentPane.add(btnUnblock);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnBack.setBounds(378, 126, 89, 23);
		contentPane.add(btnBack);
		try {
			
            
			
			String sql="SELECT Dname FROM `ddetails`";
			PreparedStatement stmt=con.prepareStatement(sql);
					ResultSet rs11= stmt.executeQuery(sql);
			
			while(rs11.next()) {
				String name=rs11.getString("dname");
				comboBox.addItem(name);
			}
		}
	catch(Exception e) {
	
	}
	}
}
