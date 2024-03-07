package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class std {

	private JFrame frmMrec;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					std window = new std();
					window.frmMrec.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public std() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMrec = new JFrame();
		frmMrec.setFont(new Font("Dialog", Font.BOLD, 12));
		frmMrec.setTitle("MREC");
		frmMrec.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\online lab\\Downloads\\MREC.jpg"));
		frmMrec.setBounds(100, 100, 450, 300);
		frmMrec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMrec.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("STUDENT REGISTRATION FORM");
		lb1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lb1.setBounds(111, 11, 218, 14);
		frmMrec.getContentPane().add(lb1);
		
		JLabel lblNewLabel_1 = new JLabel("ID :");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(153, 49, 46, 14);
		frmMrec.getContentPane().add(lblNewLabel_1);
		
		JLabel lb3 = new JLabel("NAME: ");
		lb3.setBackground(new Color(0, 0, 0));
		lb3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lb3.setBounds(153, 92, 46, 14);
		frmMrec.getContentPane().add(lb3);
		
		JLabel lb4 = new JLabel("BRANCH :");
		lb4.setBackground(new Color(0, 0, 0));
		lb4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lb4.setBounds(153, 136, 65, 14);
		frmMrec.getContentPane().add(lb4);
		
		tf1 = new JTextField();
		tf1.setBounds(228, 46, 86, 20);
		frmMrec.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(228, 89, 86, 20);
		frmMrec.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JComboBox cmb = new JComboBox();
		cmb.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "DS", "IT", "EEE", "ECE", "AIML"}));
		cmb.setBounds(228, 132, 86, 22);
		frmMrec.getContentPane().add(cmb);
		
		JButton btn = new JButton("SUBMIT");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roll=tf1.getText();
				int id=Integer.parseInt(roll);
				String name=tf2.getText();
				String branch=(String) cmb.getSelectedItem();
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbms","root","mrec");
					String q="insert into student values('"+id+"','"+name+"','"+branch+"')";
					Statement stn=con.createStatement();
					stn.executeUpdate(q);
					JOptionPane.showMessageDialog(btn, "record inserted");
					con.close();
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();  
				}
			}
		});
		btn.setBounds(191, 187, 89, 31);
		frmMrec.getContentPane().add(btn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\OIP.jfif"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frmMrec.getContentPane().add(lblNewLabel);
	}
}
