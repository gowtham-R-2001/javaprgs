import java.io.* ;

class clsmain
{
	public static void main(String args[])		throws IOException
	{
		cls c = new cls() ;
		
		c.set_name() ;
		
		c.set_age()  ;
		
		System.out.print( "\n\nNAME : " + c.get_name() ) ;
		
		System.out.print( "\n\nAGE : " + c.get_age() + "\n" ) ;
	}
}