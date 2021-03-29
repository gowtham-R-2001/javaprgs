import java.io.* ;

class odd
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		int n = 0 ;
		
		System.out.print("\nEnter number : ") ;
		
		n = Integer.parseInt( br.readLine() ) ;
		
		while(n > 0)
		{
			if(n == 1)
				break ;
			
			n -= 2 ;
		}
		
		if(n == 1)
			System.out.print("\nODD\n\n") ;
		
		else
			System.out.print("\nEVEN\n\n") ;
			
	}
}