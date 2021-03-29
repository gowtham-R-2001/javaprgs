import java.io.* ;

class strngs1
{
	public static void main( String args[] )	throws IOException
	{
		String s = "" ;
		
		char[] a = new char[10] ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter String : ") ;
		
		s = br.readLine() ;
		
		a = s.toCharArray() ;
		
		for( char x : a )
			System.out.println(x) ; 
	}
}

