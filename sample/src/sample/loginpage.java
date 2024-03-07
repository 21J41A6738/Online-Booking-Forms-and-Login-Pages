package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class loginpage {

	private JFrame frame;
	private JTextField tf1;
	private JPasswordField pf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage window = new loginpage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(138, 244, 173));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(177, 11, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel LB1 = new JLabel("NAME :");
		LB1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		LB1.setBounds(151, 64, 46, 14);
		frame.getContentPane().add(LB1);
		
		JLabel lb2 = new JLabel("PASSWORD :");
		lb2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lb2.setBounds(132, 133, 80, 14);
		frame.getContentPane().add(lb2);
		
		tf1 = new JTextField();
		tf1.setBounds(235, 61, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JButton btn = new JButton("LOGIN");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tf1.getText();
				String password = pf.getText();
				try {
					java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbms","root","mrec");
					
					PreparedStatement stn=con.prepareStatement("select name,password from users where name=? and password=?");
					stn.setString(1, name);
					stn.setString(2, password);
					ResultSet rs=stn.executeQuery();
					if(rs.next())
					{
						JOptionPane.showMessageDialog(btn,"valid user");
					}
					else {
						JOptionPane.showMessageDialog(btn,"invalid user");
						
					}
					con.close();
				
				}
				
				catch(SQLException e1)
				{
					e1.printStackTrace();				}
			}
		});
		btn.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn.setBounds(177, 194, 89, 23);
		frame.getContentPane().add(btn);
		
		pf = new JPasswordField();
		pf.setBounds(235, 130, 86, 20);
		frame.getContentPane().add(pf);
	}
}
