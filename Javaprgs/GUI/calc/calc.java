import javax.swing.* ;

import java.awt.* ;

import java.awt.event.* ;

import java.awt.FlowLayout.* ;

class calc1 extends JFrame
{
	private JLabel lb1 , lb2 , lb3 ;
	
	private JTextField tf1 , tf2 , tf3 ;
	
	private JButton b1 , b2 , b3 , b4 , b5 ;
	
	private int num1 = 0 , num2 = 0 , check1 = 0 , check2 = 0 ;
	
	public calc1()
	{
		super("simple calculator") ;
		
		setLayout( new FlowLayout() ) ;
		
		lb1 = new JLabel( "Enter number " ) ;
		
		tf1 = new JTextField( 30 ) ;
		
		lb2 = new JLabel( "Enter number " ) ;
		
		tf2 = new JTextField( 30 ) ;
		
		lb3 = new JLabel( "ANS " ) ;
		
		tf3 = new JTextField( 30 ) ;
		
		tf3.setEditable( false ) ;
		
		b1 = new JButton( " + " ) ;
		
		b2 = new JButton( " - " ) ;
		
		b3 = new JButton( " * " ) ;
		
		b4 = new JButton( " / " ) ;
		
		b5 = new JButton( " % " ) ;

		add(lb1) ;	add(tf1) ;
		
		add(lb2) ;	add(tf2) ;
		
		add(lb3) ;	add(tf3) ;
		
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
				num1 = Integer.parseInt( tf1.getText() ) ;
			
			if( evnt.getSource() == tf2 )
				num2 = Integer.parseInt( tf2.getText() ) ;
			
			if( evnt.getSource() == b1 )
				tf3.setText( Integer.toString( num1 + num2 ) ) ;
			
			if( evnt.getSource() == b2 )
				tf3.setText( Integer.toString( num1 - num2 ) ) ;
			
			if( evnt.getSource() == b3 )
				tf3.setText( Integer.toString( num1 * num2 ) ) ;
			
			if( evnt.getSource() == b4 )
			{
				check1 = Integer.parseInt( tf1.getText() ) ;
				check2 = Integer.parseInt( tf2.getText() ) ;
				
				if( check2 == 0 )
					tf3.setText("0") ;
				
				else if( check1 < check2 )
					tf3.setText("0") ;
					
				else
					tf3.setText( Integer.toString( num1 / num2 ) ) ;
			}
			
			if( evnt.getSource() == b5 )
				tf3.setText( Integer.toString( num1 % num2 ) ) ;
		}
	}
}

class calc
{
	public static void main(String args[])
	{
		calc1 c = new calc1() ;
		
		c.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		
		c.setSize(350,350) ;
		
		c.setVisible( true ) ;
	}
}