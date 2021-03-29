import java.sql.* ;

class selctstmt
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
			System.out.println("Opened Database successfully") ;
			stmt = c.createStatement() ;
			ResultSet rs = stmt.executeQuery("SELECT * FROM stutbl;") ;

			while( rs.next() )
			{
				int id = rs.getInt("ID") ;
				String name = rs.getString("name") ; 
				int age = rs.getInt("age") ;
				String address = rs.getString("address") ; 
				System.out.print(id + " " + name + " " + age + " " + address + "\n" ) ;
				//System.out.print(name + " " + age ) ;
			}
			rs.close() ;
			stmt.close() ;
			c.close() ;
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName() + " - " + e.getMessage() ) ;
			System.exit(0) ;
		}
	//java -classpath ".;sqlite-JDBC-3.8.11.2.jar" selctstmt
	}
}