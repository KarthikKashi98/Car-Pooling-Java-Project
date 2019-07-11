package car;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class proute extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	static String b,h;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					proute frame = new proute();
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
	public proute() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), null, null, null), new CompoundBorder()));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 22, 836, 126);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblWhereIsYour = new JLabel("Locate your car:");
		lblWhereIsYour.setForeground(new Color(0, 51, 153));
		lblWhereIsYour.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblWhereIsYour.setBounds(70, 11, 330, 77);
		panel.add(lblWhereIsYour);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(proute.class.getResource("/photo/d48fbba96a375544faa12565ba68fed2.gif")));
		label.setBounds(597, 0, 250, 126);
		panel.add(label);
		
		JLabel lblEnterYourLocation = new JLabel("Enter your location :");
		lblEnterYourLocation.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		lblEnterYourLocation.setBounds(44, 181, 271, 40);
		contentPane.add(lblEnterYourLocation);
		
		textField = new JTextField();
		textField.setBounds(354, 181, 353, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterYourDestination = new JLabel("Enter your destination :");
		lblEnterYourDestination.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		lblEnterYourDestination.setBounds(44, 248, 306, 40);
		contentPane.add(lblEnterYourDestination);
		
	
		
		JButton btnClickToSearch = new JButton("Click to search Car");
		btnClickToSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					String a=textField.getText();
				    String o=textField_1.getText();
				    
				    b=a.length()<=2 ? a :a.substring(0,3);
				    h=o.length()<=2 ? o :o.substring(0,3);
					
				    dispose();
				    proute2.main(null);
			 
			    
				
			
			}
		});
		btnClickToSearch.setBounds(361, 323, 226, 47);
		contentPane.add(btnClickToSearch);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(354, 246, 353, 42);
		contentPane.add(textField_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 2, 97, 21);
		contentPane.add(menuBar);
		
		JMenu mnOptions = new JMenu("Options");
		mnOptions.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnOptions);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				plogin2.main(null);
			}
		});
		mnOptions.add(mntmLogout);
	}
}
