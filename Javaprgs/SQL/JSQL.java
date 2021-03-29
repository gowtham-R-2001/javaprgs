import java.sql.* ;

public class JSQL
{
	public static void main(String args[])
	{
		Connection c = null ;
		try
		{
			Class.forName("org.sqlite.JDBC") ;
			c = DriverManager.getConnection("JDBC:sqlite:test.db") ;
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName() + " - " + e.getMessage() ) ;
			System.exit(0) ;
		}
		System.out.println("Database Successfully opened") ;
	}
}