import java.sql.* ;

class insrtval
{
	public static void main(String args[])
	{
		Connection c = null ;
		Statement stmt = null ;
		
		try
		{
			Class.forName("org.sqlite.JDBC") ;
			c = DriverManager.getConnection("JDBC:sqlite:test.db") ;
			c.setAutoCommit(false) ;
			stmt = c.createStatement() ;

			String sql = "INSERT INTO stutbl(ID,name,age,address)" +
			"VALUES(1,'siva',22,'kailasa');" ;
			stmt.executeUpdate(sql) ;

			sql = "INSERT INTO stutbl(ID,name,age,address)" +
			"VALUES(2,'sakthi',23,'kailasa');" ;
			stmt.executeUpdate(sql) ;

			sql = "INSERT INTO stutbl(ID,name,age,address)" +
			"VALUES(3,'ganesh',20,'kailasa');" ;
			stmt.executeUpdate(sql) ;

			sql = "INSERT INTO stutbl(ID,name,age,address)" +
			"VALUES(4,'karthi',19,'kailasa');" ;
			stmt.executeUpdate(sql) ;

			stmt.close() ;  c.commit() ; c.close() ;
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName() + " - " + e.getMessage() ) ;
			System.exit(0) ;
		}
		System.out.println("Data Successfully Updated") ;
	}
}