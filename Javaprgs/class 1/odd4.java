import java.io.* ;

class odd4
{
	public static void main(String args[])	throws IOException
	{
		int input = 0 , quotient = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\nEnter number : ") ;
		
		input = Integer.parseInt( br.readLine() ) ;	// 3
		
		input *= input ;	// 9
		
		quotient = input / 2 ;	// 4
		
		if( (input - quotient * 2) == 1)	// 9-8 == 1
			 System.out.print("\nODD") ;

		else
			System.out.print("\nEVEN") ;
	}
}