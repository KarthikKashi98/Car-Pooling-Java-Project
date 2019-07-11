package car;
import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class driver extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					driver frame = new driver();
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
	public driver() throws SQLException, ClassNotFoundException {
		setResizable(false);
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2","root","");	
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 634);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(-2, 19, 916, 143);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDriverDetails = new JLabel("Driver's Route");
		lblDriverDetails.setForeground(new Color(0, 51, 153));
		lblDriverDetails.setFont(new Font("Incurable Prospect", Font.BOLD, 30));
		lblDriverDetails.setBounds(59, 27, 558, 54);
		panel.add(lblDriverDetails);
		
		JLabel lblS = new JLabel("");
		lblS.setIcon(new ImageIcon(driver.class.getResource("/photo/giphy.gif")));
		lblS.setBounds(655, 0, 331, 144);
		panel.add(lblS);
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(59, 103, 132, 38);
		panel.add(lblName);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(140, 103, 186, 41);
		panel.add(label_1);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		label_1.setText(dlogin2.d);
		
		JLabel lblToUpdateA = new JLabel("To update your details");
		lblToUpdateA.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblToUpdateA.setBounds(48, 173, 279, 48);
		contentPane.add(lblToUpdateA);
		
		JButton btnClickHere = new JButton("CLICK HERE");
		btnClickHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
						
				dispose();
				dupdate.main(null);
				
				
			}
		});
		btnClickHere.setForeground(Color.BLUE);
		btnClickHere.setBounds(327, 182, 122, 31);
		contentPane.add(btnClickHere);
		
		JLabel lblEnterYourWay = new JLabel("ENTER YOUR ROUTE");
		lblEnterYourWay.setBounds(27, 224, 134, 31);
		contentPane.add(lblEnterYourWay);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(27, 273, 178, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(238, 273, 178, 31);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(450, 273, 178, 31);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(Color.BLACK);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(665, 273, 178, 31);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setForeground(Color.BLACK);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_4.setColumns(10);
		textField_4.setBounds(30, 360, 178, 31);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setForeground(Color.BLACK);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_5.setColumns(10);
		textField_5.setBounds(238, 360, 178, 31);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setForeground(Color.BLACK);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_6.setColumns(10);
		textField_6.setBounds(450, 360, 178, 31);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setForeground(Color.BLACK);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_7.setColumns(10);
		textField_7.setBounds(665, 360, 178, 31);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setForeground(Color.BLACK);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_8.setColumns(10);
		textField_8.setBounds(27, 440, 178, 31);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setForeground(Color.BLACK);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_9.setColumns(10);
		textField_9.setBounds(238, 440, 178, 31);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setForeground(Color.BLACK);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_10.setColumns(10);
		textField_10.setBounds(450, 440, 178, 31);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setForeground(Color.BLACK);
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_11.setColumns(10);
		textField_11.setBounds(665, 440, 178, 31);
		contentPane.add(textField_11);
		try {
			String sql="select place1,place2,place3,place4,place5,place6,place7,place8,place9,place10 from droute where dname='"+dlogin2.d+"';";
			Statement stmt=con.createStatement();
			ResultSet rs= stmt.executeQuery(sql);
			ResultSetMetaData rsmd=rs.getMetaData();
			int c=rsmd.getColumnCount();
			
			int i=1;
			int j=2;
			
			while(rs.next()){
				
				textField.setText(rs.getString("place1"));
				textField_1.setText(rs.getString("place2"));
				textField_2.setText(rs.getString("place3"));
				textField_3.setText(rs.getString("place4"));
				textField_4.setText(rs.getString("place5"));
				textField_5.setText(rs.getString("place6"));
				textField_6.setText(rs.getString("place7"));
				textField_7.setText(rs.getString("place8"));
				textField_8.setText(rs.getString("place9"));
				textField_9.setText(rs.getString("place10"));
			}
			}
			catch(Exception e)
				{
				System.out.println(e);
				
				}
			
		
		JButton btnReached = new JButton("REACHED");
		btnReached.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String sql1="UPDATE `droute` SET `present`='"+textField.getText()+"' WHERE `dname`='"+dlogin2.d+"';";
					
					PreparedStatement p;
				
						p = con.prepareStatement(sql1);
					
					p.execute();
					JOptionPane.showMessageDialog(null,"updated");

					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null,e);
					}
					
					
					
				}
				
				
			
		});
		btnReached.setBounds(27, 315, 89, 23);
		contentPane.add(btnReached);
		
		JButton button = new JButton("REACHED");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String sql1="UPDATE `droute` SET `present`='"+textField_1.getText()+"' WHERE `dname`='"+dlogin2.d+"';";
					
					PreparedStatement p;
				
						p = con.prepareStatement(sql1);
					
					p.execute();
					JOptionPane.showMessageDialog(null,"updated");

					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null,e);
					}
					
					
					
				}
			
		});
		button.setBounds(238, 315, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("REACHED");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String sql1="UPDATE `droute` SET `present`='"+textField_2.getText()+"' WHERE `dname`='"+dlogin2.d+"';";
					
					PreparedStatement p;
				
						p = con.prepareStatement(sql1);
					
					p.execute();
					JOptionPane.showMessageDialog(null,"updated");

					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null,e);
					}
					
					
					
				}
			
		});
		button_1.setBounds(450, 315, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("REACHED");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String sql1="UPDATE `droute` SET `present`='"+textField_3.getText()+"' WHERE `dname`='"+dlogin2.d+"';";
					
					PreparedStatement p;
				
						p = con.prepareStatement(sql1);
					
					p.execute();
					JOptionPane.showMessageDialog(null,"updated");

					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null,e);
					}
					
			}
		});
		button_2.setBounds(665, 315, 89, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("REACHED");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String sql1="UPDATE `droute` SET `present`='"+textField_4.getText()+"' WHERE `dname`='"+dlogin2.d+"';";
					
					PreparedStatement p;
				
						p = con.prepareStatement(sql1);
					
					p.execute();
					JOptionPane.showMessageDialog(null,"updated");

					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null,e);
					}
					
			}
		});
		button_3.setBounds(27, 406, 89, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("REACHED");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String sql1="UPDATE `droute` SET `present`='"+textField_5.getText()+"' WHERE `dname`='"+dlogin2.d+"';";
					
					PreparedStatement p;
				
						p = con.prepareStatement(sql1);
					
					p.execute();
					JOptionPane.showMessageDialog(null,"updated");

					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null,e);
					}
					
			}
		});
		button_4.setBounds(238, 402, 89, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("REACHED");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try {
					String sql1="UPDATE `droute` SET `present`='"+textField_6.getText()+"' WHERE `dname`='"+dlogin2.d+"';";
					
					PreparedStatement p;
				
						p = con.prepareStatement(sql1);
					
					p.execute();
					JOptionPane.showMessageDialog(null,"updated");

					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null,e);
					}
					
			}
		});
		button_5.setBounds(450, 402, 89, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("REACHED");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String sql1="UPDATE `droute` SET `present`='"+textField_7.getText()+"' WHERE `dname`='"+dlogin2.d+"';";
					
					PreparedStatement p;
				
						p = con.prepareStatement(sql1);
					
					p.execute();
					JOptionPane.showMessageDialog(null,"updated");

					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null,e);
					}
					
			}
		});
		button_6.setBounds(665, 402, 89, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("REACHED");
		button_7.setBounds(27, 482, 89, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("REACHED");
		button_8.setBounds(238, 482, 89, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("REACHED");
		button_9.setBounds(450, 482, 89, 23);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("REACHED");
		button_10.setBounds(665, 482, 89, 23);
		contentPane.add(button_10);
		
		JButton btnReverse = new JButton("REVERSE");
		btnReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String sql1="UPDATE `droute` SET `direction`='reverse' WHERE `dname`='"+dlogin2.d+"';";
					
					PreparedStatement p;
				
						p = con.prepareStatement(sql1);
					
					p.execute();
					JOptionPane.showMessageDialog(null,"updated");

					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null,e);
					}
					
			
			}
		});
		btnReverse.setForeground(Color.BLUE);
		btnReverse.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReverse.setBounds(773, 546, 125, 38);
		contentPane.add(btnReverse);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(985, 211, -963, 10);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 224, 892, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(22, 518, 892, 2);
		contentPane.add(separator_2);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnClear.setBounds(116, 315, 89, 23);
		contentPane.add(btnClear);
		
		JButton button_11 = new JButton("CLEAR");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
			}
		});
		button_11.setBounds(327, 315, 89, 23);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("CLEAR");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText("");}
		});
		button_12.setBounds(539, 315, 89, 23);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("CLEAR");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_3.setText("");}
		});
		button_13.setBounds(754, 315, 89, 23);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("CLEAR");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_4.setText("");}
		});
		button_14.setBounds(116, 406, 89, 23);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("CLEAR");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_5.setText("");	}
		});
		button_15.setBounds(327, 402, 89, 23);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("CLEAR");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_6.setText("");	}
		});
		button_16.setBounds(539, 402, 89, 23);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("CLEAR");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_7.setText(""); }
		});
		button_17.setBounds(754, 402, 89, 23);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("CLEAR");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setText(""); }
		});
		button_18.setBounds(116, 482, 89, 23);
		contentPane.add(button_18);
		
		JButton button_19 = new JButton("CLEAR");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_9.setText(""); }
		});
		button_19.setBounds(327, 482, 89, 23);
		contentPane.add(button_19);
		
		JButton button_20 = new JButton("CLEAR");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_10.setText(""); }
		});
		button_20.setBounds(539, 482, 89, 23);
		contentPane.add(button_20);
		
		JButton button_21 = new JButton("CLEAR");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_11.setText(""); }
		});
		button_21.setBounds(754, 482, 89, 23);
		contentPane.add(button_21);
		
		JButton btnForward = new JButton("FORWARD");
		btnForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				try {
					String sql1="UPDATE `droute` SET `direction`='forward' WHERE `dname`='"+dlogin2.d+"';";
					
					PreparedStatement p;
				
						p = con.prepareStatement(sql1);
					
					p.execute();
					JOptionPane.showMessageDialog(null,"updated");

					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null,e);
					}
			}
		});
		btnForward.setForeground(Color.BLUE);
		btnForward.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnForward.setBounds(616, 546, 125, 38);
		contentPane.add(btnForward);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 97, 21);
		contentPane.add(menuBar);
		
		JMenu mnOptions = new JMenu("Options");
		mnOptions.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnOptions);
		
		JMenuItem mntmRefresh = new JMenuItem("Refresh");
		mntmRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String sql1="UPDATE `droute` SET `present`='not yet started' WHERE `dname`='"+dlogin2.d+"';";
					
					PreparedStatement p;
				
						p = con.prepareStatement(sql1);
					
					p.execute();
					JOptionPane.showMessageDialog(null,"updated");
					dispose();
					driver.main(null);

					} catch (Exception e) {
						
						JOptionPane.showMessageDialog(null,e);
					}
			}
		});
		mnOptions.add(mntmRefresh);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				dlogin2.main(null);
			}
		});
		mnOptions.add(mntmLogout);
		
		JMenuItem mntmUpdate = new JMenuItem("Update");
		mntmUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String d=dlogin2.d;
				try {
				String sql1="UPDATE `droute` SET `place1`='"+textField.getText()+"',`place2`='"+textField_1.getText()+"',`place3`='"+textField_2.getText()
				+"',`place4`='"+textField_3.getText()+"',`place5`='"+textField_4.getText()+"',`place6`='"+textField_5.getText()
				+"',`place7`='"+textField_6.getText()+"',`place8`='"+textField_7.getText()+"',`place9`='"+textField_8.getText()+"',`place10`='"+textField_9.getText()
				+"' WHERE `dname`='"+dlogin2.d+"';";
				
				PreparedStatement p;
			
					p = con.prepareStatement(sql1);
				
				p.execute();
				JOptionPane.showMessageDialog(null,"login inserted suscces fully");

				} catch (Exception e) {
					
					JOptionPane.showMessageDialog(null,e);
				}
				
			}
		});
		mnOptions.add(mntmUpdate);
	}
}
