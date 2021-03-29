import java.awt.* ;

import javax.swing.* ;

import java.awt.event.* ;

import java.awt.FlowLayout.* ;

class test1 extends JFrame
{
	private JLabel lb1 , lb2 , lb3 ;
	
	private JTextField tf1 , tf2 , tf3 ;
	
	private JButton b1 ;
	
	private String s1 = "" , s2 = "" , s3 = "" ;
	
	public test1()
	{
		super( "window" ) ;
		
		setLayout( new FlowLayout() ) ;
		
		lb1 = new JLabel( "Enter name " ) ;
		
		tf1 = new JTextField( 20 ) ;
		
		lb2 = new JLabel( "Enter age " ) ;
		
		tf2 = new JTextField( 5 ) ;	
		
		lb3 = new JLabel( "ANS" ) ;
		
		tf3 = new JTextField( 10 ) ;
		
		tf3.setEnabled( false ) ;
		
		b1 = new JButton( "click" ) ;
		
		add(lb1) ;	  add(tf1) ;	
		
		add(lb2) ;	  add(tf2) ;
		
		add(lb3) ;    add(tf3) ;

		add(b1) ;
		
		frmhnd handler = new frmhnd() ;
		
		tf1.addActionListener( handler ) ;
		
		tf2.addActionListener( handler ) ;
		
		tf3.addActionListener( handler ) ;
		
		b1.addActionListener( handler ) ;
 	}
	
	private class frmhnd implements ActionListener
	{
		public void actionPerformed( ActionEvent evnt )
		{
			if( evnt.getSource() == tf1 )
			{
				//s1 = evnt.getActionCommand() ;
				
				s1 = tf1.getText()  ;
			}
				
			
			if( evnt.getSource() == tf2 )
			{
				//s2 = evnt.getActionCommand() ;
				
				s2 = tf2.getText() ;
			}
			
			
			if( evnt.getSource() == b1)
			{
				tf3.setText( s1 + " - " + s2  ) ;
				
				JOptionPane.showMessageDialog( null, s1 + " - " + s2  ) ;
			}
		}
	} 
}

public class test
{
	public static void main(String args[])
	{
		test1 t = new test1() ;
	
		t.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		
		t.setSize( 300,350 ) ;
		
		t.setVisible( true ) ;
	}
}