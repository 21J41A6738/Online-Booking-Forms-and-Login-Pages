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
import java.awt.event.ActionEvent;

public class metrobooking {

	private JFrame frame;
	private JTextField TF1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metrobooking window = new metrobooking();
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
	public metrobooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\online lab\\Downloads\\download (2).jfif"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel LB1 = new JLabel("METRO APP");
		LB1.setFont(new Font("Tahoma", Font.BOLD, 14));
		LB1.setBounds(54, 11, 105, 14);
		frame.getContentPane().add(LB1);
		
		JLabel LB2 = new JLabel(" NAME :");
		LB2.setBounds(23, 45, 46, 14);
		frame.getContentPane().add(LB2);
		
		JLabel LB3 = new JLabel("SOURCE :");
		LB3.setBounds(23, 88, 60, 14);
		frame.getContentPane().add(LB3);
		
		JLabel LB4 = new JLabel("DESTINATION :");
		LB4.setBounds(23, 132, 84, 14);
		frame.getContentPane().add(LB4);
		
		JLabel LB5 = new JLabel("NO.OF.TICKETS :");
		LB5.setBounds(13, 174, 94, 14);
		frame.getContentPane().add(LB5);
		
		TF1 = new JTextField();
		TF1.setBounds(107, 42, 86, 20);
		frame.getContentPane().add(TF1);
		TF1.setColumns(10);
		
		JComboBox CB1 = new JComboBox();
		CB1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "MALKPET", "LB NAGAR", "KOMPALLY", "SURARAM"}));
		CB1.setBounds(107, 84, 77, 22);
		frame.getContentPane().add(CB1);
		
		JComboBox CB2 = new JComboBox();
		CB2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "JBS", "Sec-Bad", "G Hosp", "Musheerabad", "RTC", "MGBS"}));
		CB2.setBounds(107, 128, 77, 22);
		frame.getContentPane().add(CB2);
		
		JComboBox CB3 = new JComboBox();
		CB3.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5"}));
		CB3.setBounds(107, 170, 77, 22);
		frame.getContentPane().add(CB3);
		
		JButton BTN1 = new JButton("SUBMIT");
		BTN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = TF1.getText();
				String source = (String) CB1.getSelectedItem();
				String dest = (String) CB2.getSelectedItem();
				String nt = (String) CB3.getSelectedItem();
				int count = Integer.parseInt(nt);
				int bill = 0;
				if(source.equals(dest))
				{
					JOptionPane.showMessageDialog(BTN1, "Please select station");
				}
				else
				{
					bill = bill+45*count;
					JOptionPane.showConfirmDialog(BTN1, "name :"+name+"\nsource: "+source+"\n destination :"+dest+"\nbill: "+bill);

				}
			}
		});
		BTN1.setBounds(65, 203, 89, 32);
		frame.getContentPane().add(BTN1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(0, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\th.jfif"));
		lblNewLabel.setBounds(203, 0, 241, 261);
		frame.getContentPane().add(lblNewLabel);
	}
}
