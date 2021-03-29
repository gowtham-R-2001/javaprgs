import java.sql.* ;

class JSQL 
{
	Connection c = null ;
	Statement stmt = null ;

	public JSQL()
	{
		try
		{
			Class.forName("org.sqlite.JDBC") ;
			c = DriverManager.getConnection("JDBC:sqlite:studb.db") ;
			c.setAutoCommit(false) ;
			stmt = c.createStatement() ;
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + "-" + e.getMessage() ) ;
			System.exit(0) ;
		}
	}

	public void data(int droll,String dname,int dm1,int dm2,int dm3,int dm4,int dm5,int dtot)	throws SQLException
	{
		String sql = "INSERT INTO stutable(roll,name,m1,m2,m3,m4,m5,tot)"+
		"VALUES('"+ droll + "','" + dname + "','" + dm1 + "','"+dm2 + "','" + dm3 + "','" + dm4 + "','" + dm5 + "','" + dtot +"')" ;

		stmt.executeUpdate(sql) ;
		stmt.close() ;
		c.commit() ;
	}

	public String resultret(int n) throws SQLException
	{
		String s = "" ;
		ResultSet rs = stmt.executeQuery("SELECT * FROM stutable WHERE roll=="+n+";") ;

		int id = rs.getInt("roll") ;
		String name = rs.getString("name") ;
		int m1 = rs.getInt("m1") ;
		int m2 = rs.getInt("m2") ;
		int m3 = rs.getInt("m3") ;
		int m4 = rs.getInt("m4") ;
		int m5 = rs.getInt("m5") ;
		int tot1 = rs.getInt("tot") ;

		//System.out.println( id + "     " + name + "             " + m1 + "     " + m2 + "     " + m3 + "     " + m4 + "     " + m5 + "     " + tot1 ) ;
		s = id + "_" + name + "_" + m1 + "_" + m2 + "_" + m3 + "_" + m4 + "_" + m5 + "_" + tot1 ;
		rs.close() ;

		return(s) ;
	}

	public int rollret() throws SQLException
	{
		ResultSet rs = stmt.executeQuery("SELECT * FROM stutable;") ;
		int id = 0 ;

		while( rs.next() )
			id = rs.getInt("roll") ;

		return(id+1) ;
	}
}