package car;

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
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;

public class login3 extends JFrame {

	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login3 frame = new login3();
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
	public login3() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 922, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(316, 206, 278, 249);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(login3.class.getResource("/photo/imagesffffff.jpg")));
		lblNewLabel.setBounds(28, 34, 240, 192);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 99, 278, 249);
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(login3.class.getResource("/photo/drrrrrrr.jpg")));
		label.setBounds(20, 11, 248, 227);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(618, 99, 278, 249);
		contentPane.add(panel_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(login3.class.getResource("/photo/downloadpass.png")));
		label_1.setBounds(26, 11, 262, 227);
		panel_2.add(label_1);
		
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			adminLogin.main(null);
			
			}
		});
		btnAdmin.setBounds(406, 466, 128, 43);
		contentPane.add(btnAdmin);
		
		JButton btnDriver = new JButton("DRIVER");
		btnDriver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				dlogin2.main(null);
				
			}
		});
		btnDriver.setBounds(73, 362, 128, 43);
		contentPane.add(btnDriver);
		
		JButton btnPassenger = new JButton("PASSENGER");
		btnPassenger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				plogin2.main(null);
			}
		});
		btnPassenger.setBounds(720, 359, 128, 43);
		contentPane.add(btnPassenger);
		
		JLabel lblCarPooling = new JLabel("CAR POOLING");
		lblCarPooling.setForeground(new Color(0, 51, 102));
		lblCarPooling.setFont(new Font("Incurable Prospect", Font.BOLD, 33));
		lblCarPooling.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarPooling.setBounds(20, 26, 886, 79);
		contentPane.add(lblCarPooling);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(302, 86, 297, 2);
		contentPane.add(separator);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(new Color(0, 51, 102));
		lblLogin.setFont(new Font("Incurable Prospect", Font.BOLD, 33));
		lblLogin.setBounds(10, 116, 886, 79);
		contentPane.add(lblLogin);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(20, 24, 46, 14);
		contentPane.add(label_2);
	}
}
