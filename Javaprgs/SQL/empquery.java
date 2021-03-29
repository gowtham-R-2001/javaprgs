import java.sql.* ;

class empquery
{
	public static void main(String args[])
	{
		Connection c = null ;
		Statement stmt = null ;
		
		try
		{
			Class.forName("org.sqlite.JDBC") ;
			c = DriverManager.getConnection("JDBC:sqlite:emp.db") ;
			//c.setAutoCommit(false) ;
			
			stmt = c.createStatement() ;
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM emptbl;") ;
			
			while( rs.next() )
			{
				int id = rs.getInt("id") ;
				String name = rs.getString("name") ;
				long mob_no = rs.getLong("mob_no") ;
				int salary = rs.getInt("salary") ;
				String address = rs.getString("address") ;
				
				System.out.println(id + "        " + name + "        " + mob_no + "        " + salary + "        " + address) ;
			}
			stmt.close() ;
			rs.close() ;
			c.close() ;
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + " - " + e.getMessage() ) ;
			System.exit(0) ;
		}
	}
}