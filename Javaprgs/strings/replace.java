import java.io.* ;

class replace
{
	public static void main(String args[]) throws IOException
	{
		String s = "" ;
		
		char[] a = new char[30] ;
		
		int i = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\nEnter String : ") ;  s = br.readLine() ;
		
		a = s.toCharArray() ;
		
		for(i = 0 ; i < a.length ; ++i )
		{
			if( (a[i] >= 65) && (a[i] <= 91 ) )
				a[i] += 32 ;
			
			else
				a[i] -= 32 ;    
		}
	
		for(i = 0 ; i < a.length ; ++i )
			System.out.print(a[i]) ;
	}
}