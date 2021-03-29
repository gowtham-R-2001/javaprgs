import java.io.* ;
import javax.swing.* ;

class maincls
{
	public static void main(String args[])
	{
		dbGUI shop = new dbGUI() ;
		shop.setSize(950,640) ;
		shop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		shop.setVisible(true) ;
	}
}//java -classpath ".;sqlite-JDBC-3.8.11.2.jar" maincls