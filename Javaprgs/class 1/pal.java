import java.io.* ;

class pal
{
	public static void main(String args[])	throws IOException
	{
		int i = 0 , n = 0 , s = 0 , m = 0 , r = 0 ;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter number : ") ;

		n = Integer.parseInt( br.readLine() ) ;
		
		m = n ;
		
		while(n > 0)
		{
			r = n % 10 ;
			
			s = s * 10 + r ;
			
			n /= 10 ;
		}
		
		if( m == s )
			System.out.print( m + " is a palindrome" ) ;
		
		else
			System.out.print( m + " is not a palindrome" ) ;

	}
}