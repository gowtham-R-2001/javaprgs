import java.io.* ;

class piglatin
{
	public static void main(String args[])	throws IOException
	{
		String s = "" ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\nEnter String : ") ;
		
		s = br.readLine() ;
		
		func(s) ; 
	}
	
	public static void func( String s )
	{
		String[] a = new String[40] ;
		
		int ln = 0 ;
		
		a = s.split(" ") ;
		
		for( String x : a )
		{
			ln = x.length() ;
			
			if( ln == 1 )
				System.out.print( "ay" + x ) ;
			
			else
			{
				for( int i = 1 ; i < ln ; i++ )
					System.out.print( x.charAt(i) ) ;
				
				System.out.print( x.charAt(0) + "ay" ) ;
			}
			
			System.out.print(" ") ;
		}
	}
}