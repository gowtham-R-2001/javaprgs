import java.sql.* ;
import java.io.* ;

class ins
{
	Connection c = null ;
	Statement stmt = null ;
	
	public ins()
	{
		try
		{
			Class.forName("org.sqlite.JDBC") ;
			c = DriverManager.getConnection("JDBC:sqlite:test.db") ;
			
			c.setAutoCommit(false) ;
			stmt = c.createStatement() ;
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName() + " - " + e.getMessage() ) ;
			System.exit(0) ;
		}
	}
	public void data(int id,String name,int age,String address) throws SQLException
	{
		String sql = "INSERT INTO stutbl(ID,name,age,address)VALUES('" + id + "','" + name + "','" + age + "','" + address +"');" ;
		
		stmt.executeUpdate(sql) ;
		stmt.close() ;	c.commit() ;  c.close() ;
	}
}


class insvarval
{
	
	/*public static void main(String args[]) throws IOException
	{

	Connection c = null ;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;

		String name = "" , address = "" ;
		int id = 0 , age = 0 ;
		

		try
		{
			Class.forName("org.sqlite.JDBC") ;
			c = DriverManager.getConnection("JDBC:sqlite:test.db") ;
			
	
		Statement stmt = null ;
		c.setAutoCommit(false) ;
		stmt = c.createStatement() ;	
		
		System.out.print("Enter name : ") ;				name = br.readLine() ;
		System.out.print("Enter id : ") ;				id = Integer.parseInt(br.readLine()) ;
		System.out.print("Enter age : ") ;				age = Integer.parseInt(br.readLine()) ;
		System.out.print("Enter address : ") ;			address = br.readLine() ;

		String sql = "INSERT INTO stutbl(ID,name,age,address)VALUES('" + id + "','" + name + "','" + age + "','" + address +"');" ;
		
		stmt.executeUpdate(sql) ;
		stmt.close() ;	c.commit() ;  c.close() ;
		}
		catch(Exception e)
		{
			System.err.println(e.getClass().getName() + " - " + e.getMessage() ) ;
			System.exit(0) ;
		}
	} */
	
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		ins i = new ins() ;

		String name = "" , address = "" ;
		int id = 0 , age = 0 ;
		
		System.out.print("Enter name : ") ;				name = br.readLine() ;
		System.out.print("Enter id : ") ;				id = Integer.parseInt(br.readLine()) ;
		System.out.print("Enter age : ") ;				age = Integer.parseInt(br.readLine()) ;
		System.out.print("Enter address : ") ;			address = br.readLine() ;
		
		i.data(id,name,age,address) ;
	}
}
