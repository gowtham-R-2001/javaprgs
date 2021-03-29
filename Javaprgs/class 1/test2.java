import java.io.* ;

class test2{
	
	public static void main(String args[])	throws IOException
	{	
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ) ;
		
		String s = "" ;
		
		int age = 0 ;
		
		s = args[0] ;
		
		age = Integer.parseInt( args[1] ) ;
		
		System.out.println( "Hello " + s ) ;
		
		System.out.println( "Your age is " + age ) ;
	}
}