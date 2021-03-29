import java.awt.* ;

import javax.swing.* ;

import java.awt.Color.* ;

import java.awt.event.* ;


class encdec extends JFrame
{
	private String s1 = "" ;
	
	public JTabbedPane tb = new JTabbedPane() ;
	
	public JPanel pnl1 = new JPanel() ;
	
	public JPanel pnl2 = new JPanel() ;
	
	private JLabel lb1 , lb2 ;
	
	private JTextField k1 , k2 , k3 , k4 , k11 , k21 , k31 , k41 , tf1 , tf2 ;
	
	private JButton encr , decr ;
	
	public encdec()
	{
		super("Encryption-Decryption") ;
		
		
		setLayout( null) ;
		
		pnl1.setLayout( null ) ;
		
		pnl2.setLayout( null ) ;
		
		
		
		pnl1.setBackground( Color.WHITE ) ;
		
		pnl2.setBackground( Color.WHITE ) ;
		
		
		
		lb1 = new JLabel("Enter Message ") ;
		
		lb2  = new JLabel("Enter Message ") ;
		
		
		
		tf1 = new JTextField(40) ;
		
		tf2 = new JTextField(40) ;
		
		
		
		k1 = new JTextField(1) ;
		
		k2 = new JTextField(1) ;
		
		k3 = new JTextField(1) ;
		
		k4 = new JTextField(1) ;
		
		
		k11 = new JTextField(1) ;
		
		k21 = new JTextField(1) ;
		
		k31 = new JTextField(1) ;
		
		k41 = new JTextField(1) ;
		
		
		encr = new JButton("Encrypt") ;
		
		decr = new JButton("Decrypt") ;
		
		
		pnl1.add(lb1) ;		pnl1.add(tf1) ;		pnl1.add(encr) ;	
		
		pnl1.add(k1) ;		pnl1.add(k2) ;		pnl1.add(k3) ;
		
		pnl1.add(k4) ;
		
		
		pnl1.add(lb2) ;		pnl1.add(tf2) ;		pnl1.add(decr) ;	
		
		pnl1.add(k11) ;		pnl1.add(k21) ;		pnl1.add(k31) ;
		
		pnl1.add(k41) ;
		
		
		tb.addTab("Encryption",null,pnl1,"panel 1") ;
		
		tb.addTab("Decryption",null,pnl1,"panel 2") ;
		
		
		add(tb) ;
		
		tb.setBounds(0,0,425,450) ;
	}
}

class hillcip
{
	public static void main(String args[])
	{
		encdec ed = new encdec() ;
		
		ed.setSize(425,450) ;
		
		ed.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		
		ed.setVisible( true ) ;
	}
}

