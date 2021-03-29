import java.sql.* ;

class empval
{
	public static void main(String args[])
	{
		Connection c = null ;
		Statement stmt = null ;
		
		try
		{
			Class.forName("org.sqlite.JDBC") ;
			c = DriverManager.getConnection("JDBC:sqlite:emp.db") ;
			c.setAutoCommit(false) ;
			
			stmt = c.createStatement() ;
			
			String sql = "INSERT INTO emptbl(id,name,mob_no,salary,address)"+
			"VALUES(11,'siva',7010531836,25000,'sukrawarpet');" ;
			stmt.executeUpdate(sql) ;
			
			sql = "INSERT INTO emptbl(id,name,mob_no,salary,address)"+
			"VALUES(12,'sakthi',9566862873,28000,'RG street');" ;
			stmt.executeUpdate(sql) ;

			sql = "INSERT INTO emptbl(id,name,mob_no,salary,address)"+
			"VALUES(13,'vishnu',9629105961,26000,'RS puram');" ;
			stmt.executeUpdate(sql) ;
			
			sql = "INSERT INTO emptbl(id,name,mob_no,salary,address)"+
			"VALUES(14,'saraswathi',9894185273,29000,'mylapur');" ;
			stmt.executeUpdate(sql) ;
			
			sql = "INSERT INTO emptbl(id,name,mob_no,salary,address)"+
			"VALUES(15,'lakshmi',9790385268,20000,'vellore');" ;
			stmt.executeUpdate(sql) ;

			stmt.close() ;	c.commit() ;	c.close() ;
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName() + " -  "+ e.getMessage() ) ;
			System.exit(0) ;
		}
		System.out.println("Employee Table Updated.") ;
	}
}