import java.io.* ;

class reverse
{
	public static void main(String args[]) throws IOException
	{
		int i = 0 , r = 0 , s = 0 , n = 0 ;

		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter input : ") ;
		
		n = Integer.parseInt( br.readLine() ) ;
		
		while(n > 0)
		{
			r = n % 10 ;
			
			s = s * 10 + r ;

			n /= 10 ;
		}
		
		System.out.print("\n\nReversed number is : " + s ) ;
	}
}