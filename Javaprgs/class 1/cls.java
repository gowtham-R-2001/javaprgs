import java.io.* ;

class cls
{
	private int age = 0 ;
	
	private String name = "" ;
	
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
	
	public void set_name()		throws IOException
	{
		System.out.print("\n\n Enter name :  ") ;

		name = br.readLine() ;
	}
	
	public String get_name()	
	{
		return(name) ;
	}
	
	public void set_age()		throws IOException
	{
		System.out.print("\n\n Enter age :  ") ;
		
		age = Integer.parseInt( br.readLine() ) ;
	}
	
	public int get_age()
	{
		return(age) ;
	}
	
	public static void main(String args[])		throws IOException
	{
		cls c = new cls() ;
		
		c.set_name() ;
		
		c.set_age() ;
		
		System.out.print( "\n\nNAME : " + c.get_name() ) ;
		
		System.out.print("\n\nAGE : " + c.get_age() + "\n" ) ;
	}
}