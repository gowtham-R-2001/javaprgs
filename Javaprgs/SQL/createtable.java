import java.sql.* ;

public class createtable
{
	public static void main(String args[])
	{
		Connection c = null ;
		Statement stmt = null ;

		try
		{
			Class.forName("org.sqlite.JDBC") ;
			c = DriverManager.getConnection("JDBC:sqlite:test.db") ;
			System.out.println("Database Opened Successfully") ;
			stmt = c.createStatement() ;
			// table name stutbl
			String sql = "CREATE TABLE stutbl" +
			"(ID int primary key not null," +
			"name text not null," +
			"age int not null," +
			"address char(30) ) " ;
			/*	CREATE TABLE stutbl(ID int primary key not null,name text not null,age int not null,address char(30) ) */
			stmt.executeUpdate(sql) ;
			stmt.close() ;
			c.close() ;
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName() + " - " + e.getMessage() ) ;
			System.exit(0) ;
		}
		System.out.println("Table Created Succesfully") ;
	}
}