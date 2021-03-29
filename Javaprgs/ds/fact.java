import java.io.* ;

class fact
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		int input = 0 , ans = 1 ;
		
		input = Integer.parseInt( br.readLine() ) ;

		ans = factorial( input,ans ) ;

		System.out.println("Factorial of " + input + " is : " + ans ) ;
	}

	public static int factorial(int input,int ans)
	{
		if( input == 1 )
			return(ans) ;
		
		ans = ans * input ;
			
		return( factorial(input-1 ,ans) ) ;
	}
}