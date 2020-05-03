package Electricity;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Project extends JFrame implements ActionListener{
	Project()
	{
		super("Electricity Billing System");
		setSize(1900,1000);
		
		//-----Adding Image -----
		
		ImageIcon ic= new ImageIcon(ClassLoader.getSystemResource("elect1.png"));
		Image i3=ic.getImage().getScaledInstance(1700, 900, Image.SCALE_DEFAULT);
		ImageIcon icc3 = new ImageIcon(i3);
		JLabel l1 = new JLabel(icc3);
		add(l1); 	
		
		
//-----Creating Menu Bar --------------------------------------------------------------------------------------
		JMenuBar mb = new JMenuBar();
		JMenu master = new JMenu("Master");
		JMenuItem m1 = new JMenuItem("New Customer");
		JMenuItem m2 = new JMenuItem("Customer Details");
		master.setForeground(Color.blue);
		
		//-----new customer-----
		m1.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon1.png"));
		Image image1 = icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m1.setIcon(new ImageIcon(image1)); 
		
		// -----to add shortcut key-----
		m1.setMnemonic('C');
		m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);
        
        //-----Customer details-----
        m2.setFont(new Font("monospaced",Font.PLAIN,12));
		ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icon12.png"));
		Image image2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		m2.setIcon(new ImageIcon(image2)); 
		
		// -----to add shortcut key-----
		m2.setMnemonic('D');
		m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);
        
        m1.addActionListener(this);
        m2.addActionListener(this);
		
        
 //-----Second Column------------------------------------------------------------------------
        
      //-----Creating Menu Bar for second column named as USER -----
      		JMenu user = new JMenu("User");
      		JMenuItem u1 = new JMenuItem("Pay Bill");
      		JMenuItem u2 = new JMenuItem("Calculate Bill");
      		JMenuItem u3 = new JMenuItem("Last Bill");
      		user.setForeground(Color.GREEN);
      		
      		//-----PAY BILL-----
      		u1.setFont(new Font("monospaced",Font.PLAIN,12));
      		ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("iconproj.png"));
      		Image image4 = icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
      		u1.setIcon(new ImageIcon(image4)); 
      		
      		// -----to add shortcut key-----
      		u1.setMnemonic('P');
      		u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
              u1.setBackground(Color.WHITE);
              
              //-----CALCULATE BILL-----
              u2.setFont(new Font("monospaced",Font.PLAIN,12));
      		ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("cash.png"));
      		Image image5 = icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
      		u2.setIcon(new ImageIcon(image5)); 
      		
      		// -----to add shortcut key-----
      		u2.setMnemonic('U');
      		u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
            u2.setBackground(Color.WHITE);
              
              
              //-----LAST BILL-----
            u3.setFont(new Font("monospaced",Font.PLAIN,12));
    		ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("iconproj1.png"));
      		Image image6 = icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
      		u3.setIcon(new ImageIcon(image6));
      		
      		// -----to add shortcut key-----
      		u3.setMnemonic('L');
      		u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
            u3.setBackground(Color.WHITE);
              
              
              u1.addActionListener(this);
              u2.addActionListener(this);
              u3.addActionListener(this);
              
              
  // ------------ THIRD COLUMN FOR MENU BAR-------------------------------------------------------------------
              
      		JMenu report = new JMenu("Report");
      		JMenuItem r1 = new JMenuItem("Generate Bill");
      		report.setForeground(Color.BLACK);
      		
      		//-----GENERATE BILL-----
      		r1.setFont(new Font("monospaced",Font.PLAIN,12));
     		ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("budget.png"));
      		Image image7 = icon7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
      		r1.setIcon(new ImageIcon(image7)); 
      		
      		// -----to add shortcut key-----
      		r1.setMnemonic('G');
      		r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
            r1.setBackground(Color.WHITE);
              
           
            r1.addActionListener(this);
              
 
 //----------------------------FOURTH COLUMN--------------------------------------------------
              
      		JMenu exit = new JMenu("Exit");
      		JMenuItem ex = new JMenuItem("Exit");
      		exit.setForeground(Color.RED);
      		
      		//-----EXIT-----
      		ex.setFont(new Font("monospaced",Font.PLAIN,12));
      		ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("cart.png"));
      		Image image11 = icon11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
      		ex.setIcon(new ImageIcon(image11)); 
      		
      	// -----to add shortcut key-----
      		ex.setMnemonic('E');
      		ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
            ex.setBackground(Color.WHITE);
              
              
            ex.addActionListener(this);
              
 //-------------------------------------------------------------------------------------------------------------------------
              master.add(m1);
              master.add(m2);
          
              
              user.add(u1);
              user.add(u2);
              user.add(u3);
              
              report.add(r1);
              
              exit.add(ex);
              
              mb.add(master);
              mb.add(report);
              mb.add(exit);
              mb.add(user);
              
              setJMenuBar(mb);
              
              setFont(new Font("Sensarif",Font.BOLD,15));
              setLayout(new FlowLayout());
              setVisible(false);
	}
              
           
		public void actionPerformed(ActionEvent ae) {
            	  String msg = ae.getActionCommand();
            	  if(msg.equals("Customer Details")){
                      new customer_details().setVisible(true);
                      
                  }else if(msg.equals("New Customer")){
                      new new_customer().setVisible(true);
                      
                  }else if(msg.equals("Calculate Bill")){
                      new calculate_bill().setVisible(true);
                      
                  }else if(msg.equals("Pay Bill")){
                      new pay_bill().setVisible(true);
                     
                  } 
                  else if(msg.equals("Generate Bill")){
                      new generate_bill().setVisible(true);
                      
                  }   
                  else if(msg.equals("Exit")){
                      System.exit(0);
              }
                  else if(msg.equals("Last Bill")){
                      new last_bill().setVisible(true);
              }
            	  }
		public static void main(String[] args){
			new Project().setVisible(true);
		}


}
