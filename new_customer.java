package Electricity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

@SuppressWarnings("serial")
public class new_customer extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JButton b1,b2;
	
	new_customer(){
		super("New Customer");
		setLocation(250,100);
		setSize(650,600);
		JPanel p = new JPanel();
		
		// In GridLayout we need to pass number of rows and column...like below 9 <- no.of rows 2 <- no.of columns
		// 3 <- breadth of row and column
		p.setLayout(new GridLayout(9,2,3,3));
		
		p.setBackground(Color.WHITE);
		 l1 = new JLabel("Name");
		 t1 = new JTextField();
		 p.add(l1);
		 p.add(t1);
		 
		 l2 = new JLabel("Meter No.");
		 t2 = new JTextField();
		 p.add(l2);
		 p.add(t2);
		 
		 l3 = new JLabel("Address");
		 t3 = new JTextField();
		 p.add(l3);
		 p.add(t3);
		 
		 l4 = new JLabel("State");
		 t4 = new JTextField();
		 p.add(l4);
		 p.add(t4);
		 
		 l5 = new JLabel("City");
		 t5 = new JTextField();
		 p.add(l5);
		 p.add(t5);
		 
		 l6 = new JLabel("Email");
		 t6 = new JTextField();
		 p.add(l6);
		 p.add(t6);
		 
		 l7 = new JLabel("Phone No.");
		 t7 = new JTextField();
		 p.add(l7);
		 p.add(t7);
		 
		b1 = new JButton("Submit");
		b2 = new JButton("Cancel");
		
		b1.setBackground(Color.ORANGE);
		b1.setForeground(Color.BLACK); //forground is for font color
		 
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.ORANGE);
		
		 p.add(b1);
		 p.add(b2);
		 
		 setLayout(new BorderLayout());
		 add(p,"Center");
		 
		 ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("customer1.png"));
		 Image i3 = ic1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		 ImageIcon ic2 = new ImageIcon(i3);
		 l8 = new JLabel(ic2);
		 
		 add(l8,"West");
		 getContentPane().setBackground(Color.WHITE); 
		 
		 b1.addActionListener(this);
		 b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String a = t1.getText();
		String c = t2.getText();
		String d = t3.getText();
		String e = t4.getText();
		String f = t5.getText();
		String g = t6.getText();
		String h = t7.getText();
		
		String q1 = "INSERT INTO emp VALUES ('"+a+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"')";
		try {
			conn c1 = new conn();
			c1.s.executeUpdate(q1);
			JOptionPane.showMessageDialog(null, "New Customer Created");
			this.setVisible(false);
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
	
	public static void main(String[] args) {
	 new new_customer().setVisible(true);
	
	}

}
