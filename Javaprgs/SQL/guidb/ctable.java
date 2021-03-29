import java.sql.* ;

class ctable
{
	public static void main(String args[])
	{
		Connection c = null ;
		Statement stmt  = null ;

		try
		{
			Class.forName("org.sqlite.JDBC") ;
			c = DriverManager.getConnection("JDBC:sqlite:studb.db") ;

			stmt = c.createStatement() ;
			String sql = "CREATE TABLE stutable(roll int primary key not null,name text not null," +
			"m1 int not null,m2 int not null,m3 int not null,m4 int not null,m5 int not null,tot int not null)" ;
			
			// roll,name,m1,m2,m3,m4,m5,tot ;
			
			//String sql = "DROP TABLE stutable";

			stmt.executeUpdate(sql) ;
			stmt.close() ;
			c.close() ;
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName() + " - " + e.getMessage() ) ;
			System.exit(0) ;
		}
		System.out.println("Student table Created Successfully") ;
	}
}