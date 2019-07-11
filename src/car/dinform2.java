package car;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class dinform2 extends JFrame {

	public static JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_7;
	
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_4;
	static String co;
	static String t1;
	static String t2;
	static String t3;
	static String t4;
	static String t5;
	static String t6;
	static String t7;
	static String t8;
	static String t9;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dinform2 frame = new dinform2();
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
	public dinform2() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 548);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5 , 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 11, 870, 116);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(dinform2.class.getResource("/photo/images (1).jpg")));
		label.setBounds(591, 0, 269, 143);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setForeground(Color.GREEN);
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label_1.setBounds(34, 23, 174, 41);
		panel.add(label_1);String name,bh=proute2.s;
	
		JLabel lblsInformation = new JLabel("'s information");
		lblsInformation.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		lblsInformation.setBounds(207, 23, 339, 41);
		panel.add(lblsInformation);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblName.setBounds(35, 188, 81, 34);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(159, 193, 282, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAge = new JLabel("D.O.B:");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAge.setBounds(468, 191, 81, 28);
		contentPane.add(lblAge);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(548, 193, 177, 28);
		contentPane.add(textField_1);
		
		JLabel lblEmail = new JLabel("E-Mail :");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(21, 233, 81, 28);
		contentPane.add(lblEmail);
		
		JLabel lblContactNo = new JLabel("Contact no:");
		lblContactNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblContactNo.setBounds(21, 272, 81, 28);
		contentPane.add(lblContactNo);
		
		JLabel lblCarModel = new JLabel("Car model:");
		lblCarModel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCarModel.setBounds(21, 369, 81, 28);
		contentPane.add(lblCarModel);
		
		JLabel lblCarNo = new JLabel("Car No:");
		lblCarNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCarNo.setBounds(468, 369, 81, 28);
		contentPane.add(lblCarNo);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(159, 235, 282, 28);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(159, 274, 282, 28);
		contentPane.add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(159, 371, 282, 28);
		contentPane.add(textField_5);
		
		JLabel lblExperiance = new JLabel("Experiance : ");
		lblExperiance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblExperiance.setBounds(468, 269, 142, 34);
		contentPane.add(lblExperiance);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(548, 278, 177, 28);
		contentPane.add(textField_7);
		
		JButton btnSubmit = new JButton("back");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
			}
				
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSubmit.setBounds(730, 472, 89, 37);
		contentPane.add(btnSubmit);
		
		JLabel lblyyyymmdd = new JLabel("(YYYY-MM-DD)");
		lblyyyymmdd.setBounds(725, 193, 142, 29);
		contentPane.add(lblyyyymmdd);
		
		JLabel lblCaracnonAc = new JLabel("Car(AC/NON AC):");
		lblCaracnonAc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCaracnonAc.setBounds(21, 412, 117, 28);
		contentPane.add(lblCaracnonAc);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(159, 414, 98, 28);
		contentPane.add(textField_6);
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(600, 414, 98, 28);
		contentPane.add(textField_8);
		JLabel lblTotalNoOf = new JLabel("total no of seats:");

		lblTotalNoOf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotalNoOf.setBounds(468, 414, 122, 28);
		contentPane.add(lblTotalNoOf);
		
		
		
		
		
		textField_4 = new JTextField();
		textField_4.setText((String) null);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(603, 371, 187, 28);
		contentPane.add(textField_4);
		
		
		JLabel lblCarDetails = new JLabel("CAR DETAILS");
		lblCarDetails.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblCarDetails.setBounds(21, 330, 357, 28);
		contentPane.add(lblCarDetails);
		
		JLabel lblDriverDetails = new JLabel("DRIVER DETAILS");
		lblDriverDetails.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblDriverDetails.setBounds(26, 149, 177, 28);
		contentPane.add(lblDriverDetails);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(45, 317, 756, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(31, 451, 812, 2);
		contentPane.add(separator_1);
		JLabel lblAdharNo = new JLabel("Adhar no:");
		lblAdharNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAdharNo.setBounds(451, 233, 81, 28);
		contentPane.add(lblAdharNo);
		
		textField_9 = new JTextField();
		textField_9.setText("<dynamic>");
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(548, 235, 242, 28);
		contentPane.add(textField_9);
		
		
		try{
		
			
			PreparedStatement exe,exe1;
			ResultSet rs,rs1;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2","root","");
		     
			exe=con.prepareStatement("SELECT * FROM `ddetails` WHERE Dname='"+AdminsDriver.sa+"'");
			rs=exe.executeQuery();
			
			rs.next();
			String first = rs.getString("Dname");
			String s = rs.getString("age");
			String f = rs.getString("email"),a=rs.getString("ph"),b=rs.getString("experiance");
			
			label_1.setText(AdminsDriver.sa);
			
			textField.setText(first);
			textField_1.setText(s);
			textField_2.setText(f);
			textField_3.setText(a);
			textField_7.setText(b);
			textField_9.setText(rs.getString("adharno"));
			  
			exe1=con.prepareStatement("SELECT * FROM `cardetail` WHERE dname='"+AdminsDriver.sa+"'");
			rs1=exe1.executeQuery();
	
			rs1.next();
			textField_9 = new JTextField();
			textField_5.setText(rs1.getString("car"));
			textField_4.setText(rs1.getString("carno"));
			textField_8.setText(rs1.getString("seats"));
			textField_6.setText(rs1.getString("ac"));

			
		
			
			}
			catch(Exception e){
			System.out.println("error in connection " +e);
			}
		
		
		
	}
}
