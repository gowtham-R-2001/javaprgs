import java.sql.* ;

class emptbl
{
	public static void main(String args[])
	{
		Connection c = null ;
		Statement stmt  = null ;
		
		try
		{
			Class.forName("org.sqlite.JDBC") ;
			c = DriverManager.getConnection("JDBC:sqlite:emp.db") ;
			
			stmt = c.createStatement() ;
			String sql = "CREATE TABLE emptbl(id int primary key not null,name text not null," +
			"mob_no long not null,salary int not null,address char(30) not null)" ;
			
			stmt.executeUpdate(sql) ;
			stmt.close() ;	
			c.close() ;
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName() + " - " + e.getMessage() ) ;
			System.exit(0) ;
		}
		System.out.println("Employee table Created Successfully") ;
	}
}