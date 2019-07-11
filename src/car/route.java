package car;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;

public class route extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					route frame = new route();
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
	public route() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setBackground(Color.YELLOW);
		label.setBounds(60, 79, 175, 35);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.BLACK);
		label_1.setBackground(Color.YELLOW);
		label_1.setBounds(60, 155, 175, 35);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.BLACK);
		label_2.setBackground(Color.YELLOW);
		label_2.setBounds(60, 220, 175, 35);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.BLACK);
		label_3.setBackground(Color.YELLOW);
		label_3.setBounds(60, 287, 175, 35);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.BLACK);
		label_4.setBackground(Color.YELLOW);
		label_4.setBounds(60, 356, 175, 35);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.BLACK);
		label_5.setBackground(Color.YELLOW);
		label_5.setBounds(349, 356, 175, 35);
		contentPane.add(label_5);
		
		JLabel label_7 = new JLabel("");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(Color.BLACK);
		label_7.setBackground(Color.YELLOW);
		label_7.setBounds(670, 356, 175, 35);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.BLACK);
		label_8.setBackground(Color.YELLOW);
		label_8.setBounds(670, 287, 175, 35);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.BLACK);
		label_9.setBackground(Color.YELLOW);
		label_9.setBounds(670, 220, 175, 35);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(Color.BLACK);
		label_10.setBackground(Color.YELLOW);
		label_10.setBounds(670, 155, 175, 35);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(Color.BLACK);
		label_11.setBackground(Color.YELLOW);
		label_11.setBounds(688, 79, 175, 35);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setForeground(Color.BLACK);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setIcon(new ImageIcon(route.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-more-details.png")));
		label_12.setBounds(117, 125, 32, 26);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.setForeground(Color.BLACK);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setIcon(new ImageIcon(route.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-more-details.png")));
		label_13.setBounds(117, 190, 32, 26);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setForeground(Color.BLACK);
		label_14.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setIcon(new ImageIcon(route.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-more-details.png")));
		label_14.setBounds(117, 255, 32, 26);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("");
		label_15.setForeground(Color.BLACK);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setIcon(new ImageIcon(route.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-fewer-details.png")));
		label_15.setBounds(740, 125, 32, 26);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setForeground(Color.BLACK);
		label_16.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setIcon(new ImageIcon(route.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-fewer-details.png")));
		label_16.setBounds(740, 190, 32, 26);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("");
		label_17.setForeground(Color.BLACK);
		label_17.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setIcon(new ImageIcon(route.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-fewer-details.png")));
		label_17.setBounds(740, 255, 32, 26);
		contentPane.add(label_17);
		
		JLabel label_6 = new JLabel("");
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setIcon(new ImageIcon(route.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-more-details.png")));
		label_6.setBounds(117, 329, 32, 26);
		contentPane.add(label_6);
		
		JLabel label_18 = new JLabel("");
		label_18.setForeground(Color.BLACK);
		label_18.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setIcon(new ImageIcon(route.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-fewer-details.png")));
		label_18.setBounds(740, 329, 32, 26);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("");
		label_19.setForeground(Color.BLACK);
		label_19.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setIcon(new ImageIcon(route.class.getResource("/com/sun/javafx/webkit/prism/resources/mediaPlayDisabled.png")));
		label_19.setBounds(280, 365, 32, 26);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("");
		label_20.setForeground(Color.BLACK);
		label_20.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setIcon(new ImageIcon(route.class.getResource("/com/sun/javafx/webkit/prism/resources/mediaPlayDisabled.png")));
		label_20.setBounds(577, 356, 32, 26);
		contentPane.add(label_20);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.BLACK);
		separator.setBounds(246, 102, 2, 202);
		contentPane.add(separator);
		
		JLabel lblV = new JLabel("V");
		lblV.setFont(new Font("Eras Bold ITC", Font.BOLD, 19));
		lblV.setBounds(237, 285, 94, 37);
		contentPane.add(lblV);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(713, 120, 2, 202);
		contentPane.add(separator_1);
		
		JLabel label_21 = new JLabel("^");
		label_21.setBounds(703, 95, 46, 14);
		contentPane.add(label_21);
		
try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2","root","");	
		
		
		String sql="select place1,place2,place3,place4,place5,place6,place7,place8,place9,place10 from droute where dname='"+proute2.p+"';";
		Statement stmt=con.createStatement();
		ResultSet rs= stmt.executeQuery(sql);
		ResultSetMetaData rsmd=rs.getMetaData();
		int c=rsmd.getColumnCount();
		
		int i=1;
		int j=2;
		
		while(rs.next()){
			
			label.setText(rs.getString("place1"));
			label_1.setText(rs.getString("place2"));
			label_2.setText(rs.getString("place3"));
			label_3.setText(rs.getString("place4"));
			label_4.setText(rs.getString("place5"));
			label_5.setText(rs.getString("place6"));
			label_7.setText(rs.getString("place7"));
			label_8.setText(rs.getString("place8"));
			label_9.setText(rs.getString("place9"));
			label_10.setText(rs.getString("place10"));

				
			
		
			
			
			
			
		}
		}
		catch(Exception e)
			{
			System.out.println(e);
			
			}
		
	}
}
