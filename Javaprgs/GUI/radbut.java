import java.awt.* ;
import javax.swing.* ;
import java.awt.event.* ;

class RadButton extends JFrame
{

	private JButton b1 ;
	private JRadioButton r1 ;
	private JRadioButton r2 ;
	public ButtonGroup g ;


	public String s = "" ;

	public RadButton()
	{
		super("RB") ;
		setLayout( new FlowLayout() ) ;

		b1 = new JButton("Show") ;
		
		r1 = new JRadioButton("Male") ;
		r2 = new JRadioButton("Female") ;
		g = new ButtonGroup() ;

		add(r1) ;
		add(r2) ;
		g.add(r1) ;
		g.add(r2) ;
		add(b1) ;
		
		frmhnd handler = new frmhnd() ;
		b1.addActionListener(handler) ;
	}

	private class frmhnd implements ActionListener
	{
		public void actionPerformed(ActionEvent evnt)
		{
			if( evnt.getSource() == b1 )
			{
				if( r1.isSelected() )
                  JOptionPane.showMessageDialog(null,r1.getText() ) ;

				if( r2.isSelected() )
					JOptionPane.showMessageDialog(null,r2.getText() ) ;
			}
		}
	}
}

class radbut
{
	public static void main(String args[])
	{
		RadButton c = new RadButton() ;
		c.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		c.setSize(425,450) ;
		c.setVisible(true) ;
	}
}