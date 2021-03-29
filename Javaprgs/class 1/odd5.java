import java.io.* ;

class odd5
{
	public static void main(String args[])	throws IOException
	{
		int input = 0 , parity = 1 , ans = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\nEnter number : ") ;
		
		input = Integer.parseInt( br.readLine() ) ;
		
		ans = input & parity ;
		
		if(ans == 1)
			System.out.println("ODD") ;
		
		else
			System.out.println("EVEN") ;
	}	
}