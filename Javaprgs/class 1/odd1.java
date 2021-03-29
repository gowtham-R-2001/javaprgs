import java.io.* ;

class odd1
{
	public static void main(String args[])	throws IOException
	{
		int input = 0 , n = 0 , rem = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter number : ") ;
		
		input = Integer.parseInt( br.readLine() ) ;
		
		rem = n % 10 ;
		
		if( (rem != 2) && (rem != 4) && (rem != 6) || (rem != 8) && (rem != 0) )
			System.out.print("\nODD ") ;
		
		else
			System.out.print("\nEVEN ") ;
	}
}