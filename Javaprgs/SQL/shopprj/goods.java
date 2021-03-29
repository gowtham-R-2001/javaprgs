import java.sql.* ;

class goods
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
			String sql = "CREATE TABLE goodstbl(pn int primary key not null,prdct text,tot_prdct int,rpp float)" ;
			stmt.executeUpdate(sql) ;
			stmt.close() ;
			c.close() ;
		}
		catch(Exception e)
		{
			System.out.println( e.getClass().getName() + " - " + e.getMessage() ) ;
			System.exit(0) ;
		}
		System.out.println("Goods Table Success") ;
	}
}