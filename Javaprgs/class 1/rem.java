import java.io.* ;

class rem
{
	public static void main(String args[])	throws IOException
	{
		float input = 0.0f ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter number : ") ;
		
		input = Float.parseFloat( br.readLine() ) ;
		
		System.out.print("" + input % 2) ;
		
		System.out.println("\n\n" + input % 3) ;
	}
}