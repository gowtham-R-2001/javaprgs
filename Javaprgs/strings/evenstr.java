import java.io.* ;

class evenstr
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		String s = "" ;
		
		int i = 0;
		
		System.out.print("\nEnter String : ") ;	s = br.readLine() ;
		
		for(i = 0 ; i < s.length() ; ++i)
		{
			if( i % 2 == 0 )
				System.out.print( s.charAt(i) ) ;
		}
	}
}