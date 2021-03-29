import java.io.* ;

class swap
{
	public static void main(String args[]) throws IOException
	{
		int temp = 0 , n1 = 0 , n2 = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\nEnter number 1 : ") ;
		
		n1 = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\nEnter number 2 : ") ;
		
		n2 = Integer.parseInt( br.readLine() ) ;
		
		temp = n1 ;
		
		n1 = n2 ;
		
		n2 = temp ;
		
		System.out.print("\n\n\t\tN1 : " + n1 + " *.*" ) ;
		
		System.out.print("\n\n\t\tN2 : " + n2 + " *.*" ) ;
		
		System.out.print("\n\n\n") ;
	}
}