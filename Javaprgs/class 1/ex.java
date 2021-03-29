import java.io.* ;
import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
import java.awt.Color.* ;
import java.awt.Font.* ;
import java.sql.* ;

class ex1 extends JFrame
{ 
	private JLabel lb  ;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
	
	char c ;
	
	public ex1() throws IOException
	{
		lb = new JLabel("hai") ;
		lb.setBounds(10,20,100,50) ;
		add(lb) ;
		
		c = br.readLine().charAt(0) ;
		
		for(int i = 10 ; i < 50 ; i+=10)
		{
			lb.setBounds(10,20+i,100,50) ;

			c = br.readLine().charAt(0) ;
			
			lb.setText("\\" + i) ;
		}
	}
}

class ex 
{
	public static void main(String args[]) throws Exception
	{
		ex1 g = new ex1() ;
		g.setSize(425,450) ;
		g.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ) ;
		g.setVisible(true) ;
	}
}