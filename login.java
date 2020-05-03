package Electricity;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;




@SuppressWarnings("serial")
public class login extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2;
    JPanel p1,p2,p3,p4;
    login() {
        super("Login Page");
        
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        tf1 = new JTextField(15);
        pf2 = new JPasswordField(15);
        
        //-----Adding image to the login Button-----
        
        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("login.png"));
        Image i1 = ic1.getImage().getScaledInstance(16, 16,Image.SCALE_DEFAULT);
        b1 = new JButton("Login", new ImageIcon(i1));
        
        
        // -----Adding image to the cancel button-----
        
        ImageIcon ic2 = new ImageIcon(ClassLoader.getSystemResource("cancel.png"));
        Image i2 = ic2.getImage().getScaledInstance(16, 16,Image.SCALE_DEFAULT);
        b2 = new JButton("Cancel",new ImageIcon(i2));
        
        b1.addActionListener(this);
        b2.addActionListener(this);

        //-----image for the login page------
        
        ImageIcon ic3 = new ImageIcon(ClassLoader.getSystemResource("pop.png"));
        Image i3 = ic3.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        l3 = new JLabel(icc3);
        
        setLayout(new BorderLayout());
        
                
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        
        
        add(l3,BorderLayout.WEST);
        p2.add(l1);
        p2.add(tf1);
        p2.add(l2);
        p2.add(pf2);
        add(p2,BorderLayout.CENTER);
        
        p4.add(b1);
        p4.add(b2);
        add(p4,BorderLayout.SOUTH);
        
        p2.setBackground(Color.WHITE);
        p4.setBackground(Color.WHITE);
        
       
        setSize(440,250);
        setLocation(600,400);
        setVisible(true);
        

        
    }
    
    public void actionPerformed(ActionEvent ae) {
    	String msg = ae.getActionCommand();
        
        try{        
        	//-----creating a connection to DB------
            conn c1 = new conn();
            
            //-----getting username and password from user-----
            
            String a  = tf1.getText();
            String b  = String.valueOf(pf2.getPassword()); //pf2.getPassword();
            
            
            //-----running query for DB to check username and password-----
            
            String q  = "SELECT * FROM login WHERE username = '"+a+"' and password = '"+b+"'";
            ResultSet rs = c1.s.executeQuery(q);
            
            //-----Check if username and password matched to the one stored in DB-----
            
            if(rs.next()){
                new Project().setVisible(true);
                
                //-----Login page will be closed
                this.setVisible(false);
                
            }else{
            	
            	//-----if Credential does'nt match show error message-----
                JOptionPane.showMessageDialog(null, "Invalid login");
                setVisible(false);
            }
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("error: "+e);
        }
    
        //-----after clicking cancel button-----
    if(msg.equals("Cancel")) {
    	
    	this.setVisible(false);
    }
}
 
    public static void main(String[] args){
        new login().setVisible(true);
    }
}