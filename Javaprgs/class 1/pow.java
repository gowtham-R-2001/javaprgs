import java.io.* ;

class pow
{
	public static void main( String args[] )	throws IOException
	{
		int n = 0 , i = 0 , m = 1 , flg = 0 ;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter input : ") ;
		
		n = Integer.parseInt( br.readLine() ) ;
		
		for(i = 0 ; i < n ; i++)
		{
			m = m * 2 ;
			
			System.out.println(m) ;
			
			if(m == n )
			{
				
				System.out.print( "\n\n\t\t" + n + " is the power of 2 ") ;
				flg = 1 ;
				break ;
			}
		}
		
		if(flg == 0)
				System.out.print( "\n\n\t\t" + n + " is not the power of 2 " ) ;
	}
}