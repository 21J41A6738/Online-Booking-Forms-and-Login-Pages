package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class login {

	private JFrame frame;
	private JTextField tb1;
	/**
	 * @wbp.nonvisual location=337,-11
	 */
	private final JButton button = new JButton("New button");
	private JTextField tb2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame =  new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(100, 100, 450, 294);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox cmb1 = new JComboBox();
		cmb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "DS", "IT", "IOT", "CS", "AIML"}));
		cmb1.setBounds(224, 186, 70, 20);
		frame.getContentPane().add(cmb1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(205, 25, -22, -9);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lb2 = new JLabel("Name :");
		lb2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lb2.setForeground(new Color(0, 0, 0));
		lb2.setBounds(115, 57, 68, 14);
		lb2.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lb2);
		
		tb1 = new JTextField();
		tb1.setBackground(new Color(255, 255, 255));
		tb1.setForeground(new Color(0, 0, 0));
		tb1.setBounds(220, 55, 91, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JButton btn1 = new JButton("SUBMIT");
		btn1.setForeground(new Color(0, 0, 255));
		btn1.setBackground(new Color(192, 192, 192));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tb1.getText();
				String rollno = tb2.getText();
				String branch= (String) cmb1.getSelectedItem();
				String gender=" ";
				AbstractButton rb1;
				if(rb1.isSelected())
				JOptionPane.showMessageDialog(btn1,"Welcome Mr/Mrs " +name+"\n Your rollno is "+rollno+"\n Your Branch is:"+branch);
			}
		});
		btn1.setBounds(179, 217, 115, 33);
		frame.getContentPane().add(btn1);
		
		JLabel p = new JLabel("roll no :");
		p.setFont(new Font("Times New Roman", Font.BOLD, 13));
		p.setBounds(115, 82, 68, 27);
		frame.getContentPane().add(p);
		
		JLabel lb4 = new JLabel("Gender :");
		lb4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lb4.setBounds(115, 120, 104, 20);
		frame.getContentPane().add(lb4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(-22, 147, 241, -16);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rb1 = new JRadioButton("Male");
		buttonGroup.add(rb1);
		rb1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rb1.setBackground(new Color(95, 160, 139));
		rb1.setForeground(new Color(0, 0, 0));
		rb1.setBounds(220, 117, 55, 23);
		frame.getContentPane().add(rb1);
		
		JRadioButton radioButton = new JRadioButton("New radio button");
		radioButton.setBounds(0, 159, 246, -64);
		frame.getContentPane().add(radioButton);
		
		JRadioButton rb2 = new JRadioButton("Female");
		buttonGroup.add(rb2);
		rb2.setForeground(new Color(0, 0, 0));
		lb4.setLabelFor(rb2);
		rb2.setBackground(new Color(91, 164, 143));
		rb2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rb2.setBounds(287, 118, 75, 20);
		frame.getContentPane().add(rb2);
		
		JLabel lb1 = new JLabel("Application Form");
		lb1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb1.setBounds(149, 25, 157, 14);
		frame.getContentPane().add(lb1);
		
		JCheckBox cb1 = new JCheckBox("Python");
		cb1.setForeground(new Color(0, 0, 0));
		cb1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		cb1.setBackground(new Color(91, 164, 143));
		cb1.setBounds(214, 150, 68, 23);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb3 = new JCheckBox("Java");
		cb3.setForeground(new Color(0, 0, 0));
		cb3.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		cb3.setBackground(new Color(91, 164, 143));
		cb3.setBounds(324, 150, 55, 23);
		frame.getContentPane().add(cb3);
		
		JLabel lb5 = new JLabel("Course :");
		lb5.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lb5.setBounds(115, 151, 55, 20);
		frame.getContentPane().add(lb5);
		
		tb2 = new JTextField();
		tb2.setForeground(Color.BLACK);
		tb2.setColumns(10);
		tb2.setBackground(Color.WHITE);
		tb2.setBounds(220, 86, 91, 20);
		frame.getContentPane().add(tb2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(31, 147, 22, -23);
		frame.getContentPane().add(comboBox);
		
		JCheckBox cb2 = new JCheckBox("C");
		cb2.setForeground(new Color(0, 0, 0));
		cb2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		cb2.setBackground(new Color(91, 164, 143));
		cb2.setBounds(284, 150, 33, 23);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel_1 = new JLabel("Branch :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1.setBounds(115, 188, 55, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(66, 188, -1, -3);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lb2_1 = new JLabel("");
		lb2_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\OIP.jfif"));
		lb2_1.setForeground(Color.BLACK);
		lb2_1.setFont(new Font("Tahoma", Font.PLAIN, 99));
		lb2_1.setBackground(Color.BLACK);
		lb2_1.setBounds(0, 0, 434, 255);
		frame.getContentPane().add(lb2_1);
		
		JLabel lb5_1 = new JLabel("Course :");
		lb5_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lb5_1.setBounds(115, 151, 55, 20);
		frame.getContentPane().add(lb5_1);
		
		JLabel lb5_2 = new JLabel("Course :");
		lb5_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lb5_2.setBounds(115, 154, 55, 20);
		frame.getContentPane().add(lb5_2);
	}
}
