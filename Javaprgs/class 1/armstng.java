import java.io.* ;

class armstng
{
	public static void main(String args[])	throws IOException
	{
		int i = 0, r = 0 , n = 0 , n1 = 0 , m = 0 , sum = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter input : ") ;
		
		n = Integer.parseInt( br.readLine() ) ;
		
		n1 = n ;
		
		while( n > 0 )
		{
			r = n % 10 ;
			
			m = r * r * r ;
			
			sum += m ;

			n /= 10 ;
		}
		
		if( sum == n1 )
			System.out.print( "\n\n\t\t" + n1 + " is the armstrong number ") ;
		
		else
			System.out.print( "\n\n\t\t" + n1 + " is not the armstrong number ") ;
	}
}