import java.io.* ;

class fact
{
	public static void main(String args[]) 	throws IOException
	{
		int f = 1 , n = 0 , i = 0;

		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter input : ") ;
		
		n = Integer.parseInt( br.readLine() ) ;
		
		for(i = 1 ; i <= n ; i++)
		{
			f = f * i ;
		}
		
		System.out.print("\n\t\t\nFactorial : " + f ) ;
	}
}