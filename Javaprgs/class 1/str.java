import java.io.* ;

class str
{
	public static void main(String args[]) throws IOException
	{
		String s1 = "" , s2 = "" ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.println("Enter 1st string : ") ;
		
		s1 = br.readLine() ;
		
		System.out.println("Enter 2nd string : ") ;
		
		s2 = br.readLine() ;
		
		if( s1.equals(s2) )
			System.out.println( "Equal" ) ;
		
		else
			System.out.println( "Not Equal" ) ;
	}
}