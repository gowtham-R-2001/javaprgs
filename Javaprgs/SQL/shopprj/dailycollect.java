import java.sql.* ;

class dailycollect
{
	public static void main(String args[])
	{
		Connection c = null ;
		Statement stmt = null ;
		try
		{
			Class.forName("org.sqlite.JDBC") ;
			c = DriverManager.getConnection("JDBC:sqlite:shop.db") ;

			stmt = c.createStatement() ;
			String sql = "CREATE TABLE dailycollecttbl(no float primary key not null,date text,pn int,prdct text,prdsale int,totsale int)" ;
			//String sql = "DROP TABLE dailycollecttbl" ;
			stmt.executeUpdate(sql) ;
			stmt.close() ;
			c.close() ;
		}
		catch(Exception e)
		{
			System.out.println( e.getClass().getName() + " - " + e.getMessage() ) ;
			System.exit(0) ;
		}
		System.out.println("Daily Collection Table Success") ;
	}
}