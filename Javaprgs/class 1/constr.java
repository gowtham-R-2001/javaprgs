import java.io.* ;

class constr
{
	private int roll = 0 ;
	
	private String name = "" ;
	
	public constr(int roll,String name)
	{
		this.roll = roll ;		this.name = name ;
	}
	
	public void print()
	{
		System.out.println("Name : " + name ) ;
		
		System.out.print("Roll : " + roll ) ;
	}
	
	public static void main(String args[])	throws IOException
	{
		int input = 0 ;
		
		constr c = new constr(1,"siva") ;
		
		c.print() ;
	}
}