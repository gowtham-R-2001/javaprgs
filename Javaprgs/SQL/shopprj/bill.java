import java.sql.* ;

class bill
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
			String sql = "CREATE TABLE billtbl(date text,bn text not null,pn int,prdct text,tot_prdct int,rpp int,cost int)" ;
			//String sql = "DROP TABLE billtbl" ;
			stmt.executeUpdate(sql) ;
			stmt.close() ;
			c.close() ;
		}
		catch(Exception e)
		{
			System.out.println( e.getClass().getName() + " - " + e.getMessage() ) ;
			System.exit(0) ;
		}
		System.out.println("BILL Table Success") ;
	}
}