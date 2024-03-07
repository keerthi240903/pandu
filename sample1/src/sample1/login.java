package sample1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField t2;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE");
		lblNewLabel.setBounds(146, 11, 89, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBounds(63, 81, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel tb2 = new JLabel("PASSWORD");
		tb2.setBounds(63, 153, 64, 14);
		frame.getContentPane().add(tb2);
		
		tb1 = new JTextField();
		tb1.setBounds(171, 78, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String password=t2.getText();
				try {  
			         java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecom","root","mrec");
			         PreparedStatement stn=con.prepareStatement("select name,password from users where name=? and password=?");
			         stn.setString(1, name);
			         stn.setString(2, password);
			         ResultSet rs=stn.executeQuery();
			         if(rs.next())
			         {
			        	 JOptionPane.showMessageDialog(btnNewButton, "valid user");
		
			         }
			         else
			         {
			        	 JOptionPane.showMessageDialog(btnNewButton, "invalid user");
			         }
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(146, 212, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		t2 = new JPasswordField();
		t2.setBounds(171, 147, 86, 20);
		frame.getContentPane().add(t2);
	}
}
