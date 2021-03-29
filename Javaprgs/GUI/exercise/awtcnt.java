import java.awt.* ;

import javax.swing.* ;

import java.awt.event.* ;

import java.awt.FlowLayout.* ;

class test extends JFrame
{	
	private JLabel lb1 ;
	
	private JTextField tf1 ;
	
	private JButton b1 ;
	
	private static int cnt = 0 ;
	
	public test()
	{
		super( "AWT Counter" ) ;
		
		setLayout( new FlowLayout() ) ;
		
		lb1 = new JLabel( "Counter" ) ;
		
	    tf1 = new JTextField( 20 ) ;
		
		b1 = new JButton( "Count" ) ;
		
		tf1.setText( Integer.toString(cnt) ) ;
		
		tf1.setEditable( false ) ;
		
		add(lb1) ;	
		
		add(tf1) ;

		add(b1) ;
		
		frmhnd handler = new frmhnd() ;
		
		tf1.addActionListener( handler ) ;
		
		b1.addActionListener( handler ) ;
	}
	
	private class frmhnd implements ActionListener
	{
		public void actionPerformed( ActionEvent evnt )
		{
			if( evnt.getSource() == b1 )
				tf1.setText( " " + Integer.toString(++cnt) ) ;
		}
	}
}

class awtcnt
{
	public static void main(String args[])
	{
		test t = new test() ;
	
		t.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		
		t.setSize(350,350) ;
		
		t.setVisible( true ) ;
	}
}