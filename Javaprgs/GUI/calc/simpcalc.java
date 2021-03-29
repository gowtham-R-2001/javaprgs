import javax.swing.* ;

import java.awt.* ;

import java.awt.event.* ;

import java.awt.FlowLayout.* ;

class calc11 extends JFrame
{
	private JLabel lb1 , lb2 , lb3 ;
	
	private JTextField tf1 , tf2 ;
	
	private JButton b1 , b2 , b3 , b4 , b5 ;
	
	private String s1 = "" ;
	
	private float num1 = 0.0f , num2 = 0.0f , check = 0.0f ;
	
	public calc11()
	{
		super("simple calculator") ;
		
		setLayout( new FlowLayout() ) ;
		
		lb1 = new JLabel( "Enter number " ) ;
		
		tf1 = new JTextField( 30 ) ;
		
		lb2 = new JLabel( "Enter number " ) ;
		
		tf2 = new JTextField( 30 ) ;
		
		lb3 = new JLabel("") ;
		
		b1 = new JButton( " + " ) ;
		
		b2 = new JButton( " - " ) ;
		
		b3 = new JButton( " * " ) ;
		
		b4 = new JButton( " / " ) ;
		
		b5 = new JButton( " % " ) ;

		add(lb1) ;	add(tf1) ;
		
		add(lb2) ;	add(tf2) ;
		
		add(b1) ; 	add(b2) ;	add(b3) ;	
		
		add(b4) ;	add(b5) ;
	
		frmhnd handler = new frmhnd() ;
		
		tf1.addActionListener( handler ) ;
		
		tf2.addActionListener( handler ) ;
		
		b1.addActionListener( handler ) ;
		
		b2.addActionListener( handler ) ;
		
		b3.addActionListener( handler ) ;
		
		b4.addActionListener( handler ) ;
		
		b5.addActionListener( handler ) ;
	}
	
	private class frmhnd implements ActionListener
	{
		public void actionPerformed( ActionEvent evnt )
		{	
			if( evnt.getSource() == tf1 )
				num1 = Float.parseFloat( tf1.getText() ) ;
			
			if( evnt.getSource() == tf2 )
				num2 = Float.parseFloat( tf2.getText() ) ;
			
			if( evnt.getSource() == b1 )
				lb3.setText( "ANS : " + Float.toString( num1 + num2 ) ) ;
			
			if( evnt.getSource() == b2 )
				lb3.setText( "ANS : " + Float.toString( num1 - num2 ) ) ;
			
			if( evnt.getSource() == b3 )
				lb3.setText( "ANS : " + Float.toString( num1 * num2 ) ) ;
			
			if( evnt.getSource() == b4 )
			{
				check =  Float.parseFloat( tf2.getText() ) ;
				
				if( check <= 0 )
					lb3.setText( "ANS : 0 " ) ;
				
				else
					lb3.setText( "ANS : " + Float.toString( num1 / num2 ) ) ;
			}
			
			if( evnt.getSource() == b5 )
				lb3.setText( "ANS : " + Float.toString( num1 % num2 ) ) ;
			
			add(lb3) ;
		}
	}
}

class simpcalc
{
	public static void main(String args[])
	{
		calc11 c = new calc11() ;
		
		c.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		
		c.setSize(350,350) ;
		
		c.setVisible( true ) ;
	}
}