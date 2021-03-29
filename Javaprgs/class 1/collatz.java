import java.io.* ;

class collatz
{
	public static void main(String args[])	throws IOException
	{
		int x = 0 , cnt = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter Input : ") ;
		
		x = Integer.parseInt( br.readLine() ) ;
		
		while(true)
		{
			if(x == 1)
				break ;
			
			if( (x % 2) != 0)
				x = (3 * x) + 1 ;
			
			else
				x /= 2 ;
			
			System.out.println(x) ;
			
			cnt++ ;
		}
		
		System.out.print("\n\n\t\t ANS :  " + cnt ) ;
	}
}