import java.awt.* ;

import javax.swing.* ;

import java.awt.event.* ;

import java.awt.FlowLayout.* ;

class rand extends JFrame
{
	private String s1 = "" ;
	
	private JTextField tf1 ;
	
	public rand()
	{
		super( "random" ) ;
		
		setLayout( new FlowLayout() ) ;
		
		tf1 = new JTextField( 20 ) ;
		
		add(tf1) ;
		
		frmhnd handler = new frmhnd() ;
		
		tf1.addActionListener( handler ) ;
	}
	
	private class frmhnd implements ActionListener  
	{
		public void actionPerformed( ActionEvent evnt )
		{
			if( evnt.getSource() == tf1 )
			{
				s1 = tf1.getText() ;
	
				if( s1.isEmpty() )
					JOptionPane.showMessageDialog( null,"Don't leave it empty !" ) ;
			}
		}
	}
}


class randnum
{
	public static void main(String args[])	
	{
		rand r = new rand() ;
	
		r.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		
		r.setSize(350,350) ;
		
		r.setVisible( true ) ;
	}
}