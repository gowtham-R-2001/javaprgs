import java.io.* ;

class datetime
{
	public static void main(String args[]) throws IOException
	{
		int h = 1 , m = 48 , s = 60 , x = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\n\t\tSTOP WATCH ^_^") ;
		
		while( x == 0 )
		{
			System.out.print("\n" + h + " : " + m + " : " + s ) ;
			
			s-- ;
			
			if( ( s == 0 ) && (m != 0) )
			{
				s = 59 ;
				m-- ;
			}
			
			if( ( s == 0 ) && (m == 0) && (h != 0) )
			{
				s = 59 ;
				m = 59 ;
				h-- ;
			}
			
			if( ( s == 0 ) && (m == 0) && (h == 0) )
				System.exit(0) ;
		}
	}
}