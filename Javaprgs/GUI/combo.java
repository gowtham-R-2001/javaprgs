import java.awt.* ;
import javax.swing.* ;
import java.awt.event.* ;

class ComboBox extends JFrame
{
	public String[] food = {"idly","Dosa","Rava","poori","Upma","Chappathi"} ;
	
	private JButton b1 ;
	private JComboBox<String> cb = new JComboBox<>(food) ;

	public String s = "" ;

	public ComboBox()
	{
		super("TextArea") ;
		setLayout( new FlowLayout() ) ;

		b1 = new JButton("Show") ;
		
		add(cb) ;
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
				s = (String)cb.getSelectedItem() ;
				cb.addItem("KING") ;
				//s = (String)cb.addItem("123");
				JOptionPane.showMessageDialog(null,s) ;
			}
		}
	}
}

class combo
{
	public static void main(String args[])
	{
		ComboBox c = new ComboBox() ;
		c.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		c.setSize(425,450) ;
		c.setVisible(true) ;
	}
}