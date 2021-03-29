import java.sql.* ;

class selctprg
{
	public static void main(String args[])
	{
		Connection c = null ;
		Statement stmt = null ;
		try
		{
			Class.forName("org.sqlite.JDBC") ;
			c = DriverManager.getConnection("JDBC:sqlite:studb.db") ;
			c.setAutoCommit(false) ;
			System.out.println("Opened Database successfully") ;
			stmt = c.createStatement() ;
			ResultSet rs = stmt.executeQuery("SELECT * FROM stutable;") ;

			while( rs.next() )
			{
				int roll = rs.getInt("roll") ;
				String name = rs.getString("name") ; 
				int m1 = rs.getInt("m1") ;
				int m2 = rs.getInt("m2") ;
				int m3 = rs.getInt("m3") ;
				int m4 = rs.getInt("m4") ;
				int m5 = rs.getInt("m5") ;
				int tot = rs.getInt("tot") ;
				
				System.out.println( roll + "  " + name + "  " + m1 + "  " + m2 + "  " + m3 + "  " + m4 + "  " + m5 + "  " + tot ) ;
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