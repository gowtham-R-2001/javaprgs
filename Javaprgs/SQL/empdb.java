import java.sql.* ;

class empdb
{
	public static void main(String args[])
	{
		Connection c = null ;
		try
		{
			Class.forName("org.sqlite.JDBC") ;
			c = DriverManager.getConnection("JDBC:sqlite:emp.db") ;
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName() + " - " + e.getMessage() ) ;
			System.exit(0) ;
		}
		System.out.println("Employee Database Created Successfully") ;
	}
}
//java -classpath ".;sqlite-JDBC-3.8.11.2.jar" empdb