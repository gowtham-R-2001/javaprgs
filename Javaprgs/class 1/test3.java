import java.io.* ;

class test3
{
	
	public static void main(String args[])	throws IOException
	{	
		int n = 0 , c = 0 , flg = 0 , i = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ) ;
		
		System.out.print( "\nEnter number of chocolates : " ) ;
		
		n = Integer.parseInt( br.readLine() ) ;
		
		System.out.print( "\nEnter number of children : " ) ;
		
		c = Integer.parseInt( br.readLine() ) ;
		
		while(true)
		{	
			for( i = 1 ; i <= c ; ++i )
			{
				n -= i ;
				
				System.out.println( n ) ;
				
				if( n <= 0 )
				{
					if( n == 0 )
					{
						flg = 1 ;
						break ;
					}
					else
					{
						flg = 1 ;
						n += i ;
						break ;
					}
				}
			}
			
			if( flg == 1 )
				break ;
		}
		
		System.out.println( " ANS : " + n  ) ;
		
		
	}
}