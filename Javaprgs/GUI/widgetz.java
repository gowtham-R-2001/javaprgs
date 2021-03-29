import javax.swing.* ;

import java.awt.* ;  // abstract window toolkit

import java.awt.event.* ;

import java.awt.FlowLayout ;

class wid extends JFrame
{
	private JLabel lb1 ;
	
	private JTextField tf1 ;
	
	public wid()
	{
		super( "widgets" ) ;
		
		setLayout( new FlowLayout() ) ; 
		
		lb1 = new JLabel( "Enter name" ) ;
		
		tf1 = new JTextField( 20 ) ;
		
		add(lb1) ;
		
		add(tf1) ;
		
		frmhnd handler = new frmhnd() ;
		
		tf1.addActionListener( handler ) ;
	}
	
	private class frmhnd implements ActionListener // formhandler
	{
		public void actionPerformed(ActionEvent evnt)
		{
			String s1 = "" ;
			
			if( evnt.getSource() == tf1 )
			{
				s1 = evnt.getActionCommand() ;
				
				JOptionPane.showMessageDialog( null,"hello " + s1 ) ;
			}
		}
	}
}

public class widgetz
{
	public static void main(String args[])
	{
		wid w = new wid() ;
		
		w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		
		w.setSize( 500,550 ) ;
		
		w.setVisible( true ) ;
	}
}