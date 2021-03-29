import java.io.* ;

class odd2
{
	public static void main(String args[])	throws IOException
	{
		int input = 0 , n = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\nEnter number : ") ;
		
		input = Integer.parseInt( br.readLine() ) ;
		
		while(true)
		{
			if(n > input)
				break ;
			
			else if(n == input)
				break ;
			
			n += 2 ;
		}
		
		if(n > input)
			System.out.print("\nODD ") ;
		
		else
			System.out.print("\nEVEN ") ;
	}
}