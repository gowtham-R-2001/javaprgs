import java.io.* ;

class sort
{
	public static void main( String args[] )	throws IOException
	{
		int i = 0 , n = 0 , temp = 0 , j = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter input : ") ;

		n = Integer.parseInt( br.readLine() ) ;

		int a[] = new int[n] ;
		
		for( i = 0 ; i < n ; i++ )
		{
			System.out.print("\n\nEnter input : ") ;
			
			a[i] = Integer.parseInt( br.readLine() ) ;
		}
		
		for( i = 0 ; i < n ; i++ )
		{
			for( j = i+1 ; j < n ; j++ )
			{
				if(a[i] > a[j] )
				{
					temp = a[i] ;
					a[i] = a[j] ;
					a[j] = temp ;
				}
			}
		}
		
		System.out.println("\n\n\t\t") ;
		
		for( i = 0 ; i < n ; i++ )
		{
			System.out.println(a[i]) ;
		}
		
		
	}
}