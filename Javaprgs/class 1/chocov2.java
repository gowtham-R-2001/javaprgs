import java.io.* ;

class chocov2
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		int n = 0 , c = 0 , ans = 0 ,i = 0 , num = 0 ;

		System.out.print("Enter the number of chocolates : ") ;
		
		c = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\nEnter the number of children : ") ;
		
		n = Integer.parseInt( br.readLine() ) ;

		ans = ( n*(n+1) ) / 2  ;
		ans = c % ans ;

		for( i = 1 ; i < n ; ++i )
		{
			num = ans - (  ( i * ( i + 1 )) / 2 ) ;
			
			if ( ! ( num >= i + 1  ) )  
				break ;
		}
		
		num = ans - ( i * ( i + 1 )) / 2 ;
		System.out.println("\nChocolates for you : " + num ) ;
	}
   
}
