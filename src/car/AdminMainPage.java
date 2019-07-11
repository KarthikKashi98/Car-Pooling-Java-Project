package car;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.sql.*;
public class AdminMainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMainPage frame = new AdminMainPage();
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
	public AdminMainPage() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 21, 869, 151);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(AdminMainPage.class.getResource("/photo/giphy.gif")));
		label_1.setBounds(609, 11, 250, 129);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(AdminMainPage.class.getResource("/photo/admin page.png")));
		label_2.setBounds(51, 27, 304, 113);
		panel.add(label_2);
		
		JButton btnAddAnotheAdmin = new JButton("TO ADD ANOTHER ADMIN CLICK HERE");
		btnAddAnotheAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			AddAdmin.main(null);
			}
		});
		btnAddAnotheAdmin.setBounds(488, 205, 391, 36);
		contentPane.add(btnAddAnotheAdmin);
		
		JButton btnToViewPassenger = new JButton("TO VIEW PASSENGER FEED BACK CLICK HERE");
		btnToViewPassenger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				AdminFeedback.main(null);
			}
		});
		btnToViewPassenger.setBounds(488, 256, 391, 36);
		contentPane.add(btnToViewPassenger);
		
		JButton btnToAddDriver = new JButton("TO ADD DRIVER TO BLOCKLIST CLICK HERE");
		btnToAddDriver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AdminBlock.main(null);
				
				
				
			}
		});
		btnToAddDriver.setBounds(488, 303, 391, 36);
		contentPane.add(btnToAddDriver);
		
		JButton btnToViewThe = new JButton("TO VIEW THE DEIVER AND THERE ROUTES CLICK HERE");
		btnToViewThe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			dispose();
			AdminsDriver.main(null);
				
			}
		});
		btnToViewThe.setBounds(488, 347, 391, 36);
		contentPane.add(btnToViewThe);
		
		JButton btnToChangeYour = new JButton("TO CHANGE YOUR PASSWORD CLICK HERE");
		btnToChangeYour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				AdminsPassword.main(null);
			}
		});
		btnToChangeYour.setBounds(488, 394, 391, 36);
		contentPane.add(btnToChangeYour);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(AdminMainPage.class.getResource("/photo/adminmnn2.png")));
		label.setBounds(130, 173, 312, 164);
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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, -1, 97, 21);
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
		mnOptions.add(mntmLogout);
	}
}
