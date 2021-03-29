
/*

 *
 *  *  *
 *  *  *  *  *
 *  *  *
 *
 
 */
 
import java.io.* ;

class pattern1
{
	public static void main( String args[])		throws IOException
	{
		int i = 0 , j = 0 , n = 0 , x = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter input : ") ;
		
		n = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\n\n") ;
		
		for(i = 1 ; i <= n ; i += 2)
		{
			for(j = i ; j >= 1 ; j--)
			{
				if(i % 2 != 0 )
					System.out.print(" * ") ;
			}
				System.out.print("\n") ;
		}
		
		if(n % 2 == 0)
				x = n - 3 ;
		else
				x = n - 2 ;
		
		for(i = x ; i >= 1 ; i -= 2)
		{
			for(j = 1 ; j <= i ; j++)
			{
				if(i % 2 != 0 )
					System.out.print(" * ") ;
			}
			System.out.print("\n") ;
		}
	}
}