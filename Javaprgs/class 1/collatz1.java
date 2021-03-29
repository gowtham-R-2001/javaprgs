import java.io.* ;

class collatz1
{
	public static void main(String args[])	throws IOException
	{
		int x = 0 , cnt = 0 , ans = 0;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		System.out.print("\n\nEnter Input : ") ;
		x = Integer.parseInt( br.readLine() ) ;

		ans = cltz(x,cnt) ;

		System.out.println( "\n\t\tANS : " + ans) ;
	}
	
	public static int cltz(int x,int cnt)
	{
		int a = 0 , k = 1 ;
		
		if(x > 1)
		{	
			System.out.print("\n\n") ;
			
			if(x % 2 != 0)
			{
				System.out.print( "( 3 * " + x + " ) + 1 = "  ) ;
				x = (3 * x) + 1 ;
			}
			else
			{
				System.out.print( "        " + x +  " / 2 = "  ) ;
				x /= 2 ;
			}
			System.out.print(x) ;
			cnt++ ;
			cnt = cltz(x,cnt) ;
			
		}
		
		//System.out.println( "\n\t\tCNT : " + cnt ) ;
		
		return(cnt) ;		
	}
}