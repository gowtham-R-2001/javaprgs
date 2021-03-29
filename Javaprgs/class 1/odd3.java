import java.io.* ;

class odd3
{
	public static void main(String args[])	throws IOException
	{
		int input = 0 , quotient = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\nEnter number : ") ;
		
		input = Integer.parseInt( br.readLine() ) ;	//11
		
		quotient = input / 2 ;	// 5
		
		if( ( input - (quotient * 2) ) == 1 )	//10 - 11 == 1
			System.out.print("\nODD") ;
		
		else
			System.out.print("\nEVEN") ;
	}
}