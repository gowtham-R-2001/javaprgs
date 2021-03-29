import java.io.* ;

class fib
{
	static int i = 0 , end = 0  ;
	
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		int a = -1 , b = 1 ;
		
		end = Integer.parseInt( br.readLine() ) ;
		
		System.out.println() ;
		
		fibonacci(a,b) ;
	}
	
	public static int fibonacci( int a ,int b )
	{
		int temp = 0 ;
		
		if( i == end )
			return(0) ;
		
		temp = a + b ;
		System.out.println(temp) ;
		i++ ;
		return( fibonacci( b,temp ) ) ;
	}
}