import java.io.* ;

class remndr
{
	public static void main(String args[])	throws IOException
	{
		int input = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		input = Integer.parseInt( br.readLine() ) ;
		
		System.out.println( input % 2 ) ;
	}
}

