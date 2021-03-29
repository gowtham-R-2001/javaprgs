import java.io.* ;

class strngs
{
	public static void main(String args[])	throws IOException
	{
		String s = "" ;
		
		char c ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\nEnter String : ") ;
		
		s = br.readLine() ;
		
		c = s.charAt(5) ;
		
		System.out.println(c) ;
		
	}
}