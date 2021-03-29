import java.io.* ;

class sumofn
{
	public static void main(String args[]) throws IOException
	{
		int n = 0 , sum = 0 , count = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter the number : ") ;
		
		n = Integer.parseInt( br.readLine() ) ;
		
		sum = n * (n+1) / 2 ;
		
		System.out.print("\n\tSum " + (sum) + "\n\n" ) ;
		
	}
}