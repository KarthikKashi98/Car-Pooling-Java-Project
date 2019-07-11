package car;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class AdminFeedback extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminFeedback frame = new AdminFeedback();
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
	public AdminFeedback() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1021, 633);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 21, 995, 151);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(AdminFeedback.class.getResource("/photo/giphy.gif")));
		label_1.setBounds(760, 11, 235, 129);
		panel.add(label_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(AdminFeedback.class.getResource("/photo/feedback2.png")));
		label.setBounds(237, 13, 482, 127);
		panel.add(label);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(AdminFeedback.class.getResource("/photo/feed.png")));
		label_2.setBounds(25, 0, 198, 151);
		panel.add(label_2);
		
		JButton btnToViewPositivie = new JButton("TO VIEW POSITIVIE FEED BACK CLICK HERE");
		btnToViewPositivie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
                 try {
	
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2","root","");
				                                     
					
					String u="SELECT `pname`, `dname`,`feedback` FROM `feedback` where type='positive'";
					
					PreparedStatement stmt=con.prepareStatement(u);
					ResultSet rs= stmt.executeQuery();
					
					if(!rs.next()) {
						JOptionPane.showMessageDialog(null,"no positive feedback is present");
					dispose();
						proute.main(null);
					
						
					}
						
					
					
					ResultSet rs1= stmt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs1));
					
					
					
				}
				catch(Exception e) {
					System.out.println(e);
				}}
			
		});
		btnToViewPositivie.setBounds(37, 194, 395, 33);
		contentPane.add(btnToViewPositivie);
		
		JButton btnToViewNegative = new JButton("TO VIEW NEGATIVE FEEDBACK CLICK HERE");
		btnToViewNegative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2","root","");
				                                     
					
					String u="SELECT `pname`, `dname`,`feedback` FROM `feedback` where type='negative'";
					
					PreparedStatement stmt=con.prepareStatement(u);
					ResultSet rs= stmt.executeQuery();
					
					if(!rs.next()) {
						JOptionPane.showMessageDialog(null,"no negative feedback is present");
					
					
						
					}
						
					
					
					ResultSet rs1= stmt.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs1));
					
					
					
				}
				catch(Exception e) {
					System.out.println(e);
				}}
		
			
			
		});
		btnToViewNegative.setBounds(597, 194, 383, 33);
		contentPane.add(btnToViewNegative);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(55, 282, 824, 296);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 0, 97, 21);
		contentPane.add(menuBar);
		
		JMenu mnOptions = new JMenu("Options");
		mnOptions.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnOptions);
		
		JMenuItem mntmBack = new JMenuItem("Back");
		mntmBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminMainPage.main(null);
				dispose();
			}
		});
		mnOptions.add(mntmBack);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adminLogin.main(null);
				dispose();
			}
		});
		mnOptions.add(mntmLogout);
	}
}
