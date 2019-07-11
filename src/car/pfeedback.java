package car;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class pfeedback extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pfeedback frame = new pfeedback();
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
	public pfeedback() throws ClassNotFoundException, SQLException {
		setResizable(false);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2","root","");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 922, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 21, 896, 128);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(pfeedback.class.getResource("/photo/feeeeeeeeeeeeeeeeed.png")));
		label.setBounds(10, 0, 233, 127);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(pfeedback.class.getResource("/photo/feedback2.png")));
		label_1.setBounds(205, 11, 469, 116);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(pfeedback.class.getResource("/photo/feeeeeeeeeeeeeeeeed.png")));
		label_2.setBounds(679, 0, 233, 127);
		panel.add(label_2);
		
		JButton btnNegative = new JButton("NEGATIVE");
		btnNegative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("negative");
			}
		});
		btnNegative.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNegative.setBounds(216, 225, 157, 41);
		contentPane.add(btnNegative);
		
		JButton btnPositive = new JButton("POSITIVE");
		btnPositive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText("positive");
			}
		});
		btnPositive.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPositive.setBounds(398, 225, 157, 41);
		contentPane.add(btnPositive);
		
		JLabel lblFeedBack = new JLabel("FEEDBACK :");
		lblFeedBack.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblFeedBack.setBounds(10, 309, 165, 25);
		contentPane.add(lblFeedBack);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(185, 293, 552, 58);
		contentPane.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			 if(textPane.getText().equals("") ) {
						JOptionPane.showMessageDialog(null,"fill up the details");
					}
			 else if( textField.getText().equals(""))
					JOptionPane.showMessageDialog(null,"select your feedback type");
					 else {
				try {
					String u=textField.getText();
					
					String sql1="INSERT INTO `feedback`(`pname`, `dname`, `type`, `feedback`) VALUES ('"+plogin2.p+"','"+proute2.s+"','"+u+"','"+textPane.getText()+"');";
					PreparedStatement p= con.prepareStatement(sql1);
					p.execute();
					JOptionPane.showMessageDialog(null,"feedback is submitted suucceffully");
					
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null,e);
				}
					
				
				
					 }}
		});
		btnSubmit.setBounds(630, 371, 107, 31);
		contentPane.add(btnSubmit);
		
		textField = new JTextField();
		textField.setBounds(581, 230, 270, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSelectedType = new JLabel("selected type");
		lblSelectedType.setBounds(581, 199, 121, 25);
		contentPane.add(lblSelectedType);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 97, 21);
		contentPane.add(menuBar);
		
		JMenu mnOptions = new JMenu("Options");
		mnOptions.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnOptions);
		
		JMenuItem mntmBack = new JMenuItem("back");
		mntmBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				
			}
		});
		mnOptions.add(mntmBack);
		proute2 p=new proute2();
		JMenuItem mntmLogout = new JMenuItem("logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dinform.frame.dispose();
				
				proute2.frame.dispose();

				dispose();
			
				
			
				
				plogin2.main(null);
			
			}
		});
		mnOptions.add(mntmLogout);
	}
}
