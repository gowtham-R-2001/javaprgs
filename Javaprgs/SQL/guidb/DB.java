import java.sql.* ;

class DB
{
	public static void main(String args[])
	{
		Connection c = null ;
		try
		{
			Class.forName("org.sqlite.JDBC") ;
			c = DriverManager.getConnection("JDBC:sqlite:studb.db") ;
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + "-" + e.getMessage() ) ;
			System.exit(0) ;
		}
		System.out.println("\n\tStudent Database Created Successfully") ;
	}
}

//java -classpath ".;sqlite-JDBC-3.8.11.2.jar" DB