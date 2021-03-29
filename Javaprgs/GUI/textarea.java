import java.awt.* ;
import javax.swing.* ;
import java.awt.event.* ;

class TA extends JFrame
{
	public JTextArea ta ;
	public JScrollPane sc ;
	private String s = "" ;

	public TA()
	{
		super("TextArea") ;
		setLayout(null) ;
		ta = new JTextArea() ;
		sc = new JScrollPane(ta) ;
		sc.setSize(150,200) ;
		add(sc) ;

		for(int i = 0 ; i < 5 ; i++)
			s = s+"bsdxbhjshjsjdg\n" ;

		ta.setText(s) ;
	}
}

class textarea
{
	public static void main(String args[])
	{
		TA t = new TA() ;
		t.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		t.setSize(425,450) ;
		t.setVisible(true) ;
	}
}