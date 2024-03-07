package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movie {

	private JFrame frame;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movie window = new movie();
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
	public movie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Movie App");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(262, 11, 95, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lb1 = new JLabel("Name");
		lb1.setBackground(new Color(240, 240, 240));
		lb1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lb1.setBounds(227, 36, 46, 14);
		frame.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("Movies");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lb2.setBounds(227, 71, 46, 14);
		frame.getContentPane().add(lb2);
		
		JLabel lb3 = new JLabel("Tickets Count");
		lb3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lb3.setBounds(227, 96, 90, 14);
		frame.getContentPane().add(lb3);
		
		tf1 = new JTextField();
		tf1.setBounds(323, 36, 101, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JComboBox cmb1 = new JComboBox();
		cmb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "RRR", "Salaar", "KGF", "DJ", "Chhota Bheem"}));
		cmb1.setBounds(323, 67, 90, 22);
		frame.getContentPane().add(cmb1);
		
		JComboBox cmb2 = new JComboBox();
		cmb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cmb2.setBounds(323, 96, 90, 22);
		frame.getContentPane().add(cmb2);
		
		JButton btn1 = new JButton("Submit");
		btn1.setBackground(new Color(255, 128, 0));
		btn1.setForeground(new Color(0, 0, 0));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tf1.getText();
				String movie = (String) cmb1.getSelectedItem();
				String count = (String) cmb2.getSelectedItem();
				int numbertickets=Integer.parseInt(count);
				int bill=0;
				if(movie.equals("RRR"))
				{
					bill=bill+450*numbertickets;
				}
				if(movie.equals("Salaar"))
				{
					bill=bill+850*numbertickets;
				}
				if(movie.equals("KGF"))
				{
					bill=bill+600*numbertickets;
				}
				if(movie.equals("DJ"))
				{
					bill=bill+250*numbertickets;
				}
				if(movie.equals("Chhota Bheem"))
				{
					bill=bill+150*numbertickets;
				}
				if(movie.equals("SELECT"))
				{
					JOptionPane.showMessageDialog(btn1, "Please select a movie");
				}
				
				int res=0;
				res=JOptionPane.showConfirmDialog(btn1,"Hi "+name+"\n Movie "+movie+"\n Number of tickets :"+count+"\n amount: "+bill);
				if(res == 0)
				{
					JOptionPane.showMessageDialog(btn1, "booking confirmed");
				}
				else
				{
					JOptionPane.showMessageDialog(btn1, "Booking Cancelled");
				}
			}
		});
		btn1.setBounds(262, 140, 77, 23);
		frame.getContentPane().add(btn1);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 11));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\OIP (4).jfif"));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
