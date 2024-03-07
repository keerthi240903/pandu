package sample1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class Metroticket {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Metroticket window = new Metroticket();
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
	public Metroticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel mt = new JLabel("loginb");
		mt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mt.setBounds(153, 11, 111, 31);
		frame.getContentPane().add(mt);
		
		JLabel lb2 = new JLabel("user name");
		lb2.setBounds(28, 58, 74, 31);
		frame.getContentPane().add(lb2);
		
		JLabel lb3 = new JLabel("password");
		lb3.setBounds(28, 100, 46, 21);
		frame.getContentPane().add(lb3);
		
		JButton b2 = new JButton("login");
		b2.setBounds(96, 152, 89, 23);
		frame.getContentPane().add(b2);
		
		textField = new JTextField();
		textField.setBounds(132, 73, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(132, 104, 86, 20);
		frame.getContentPane().add(textField_1);
	}
}
