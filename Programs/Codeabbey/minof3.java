import java.io.* ;

class minof3
{
	public static void main(String args[] )		throws IOException
	{
		int a = 0 , b = 0 , c = 0 , small = 0 ;
		
		BufferedReader br =  new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter number 1 : ") ;
		
		a = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\n\nEnter number 2 : ") ;
		
		b = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\n\nEnter number 3 : ") ;
		
		c = Integer.parseInt( br.readLine() ) ;
		
		small = (a <= b) ? a : b ;
		
		small = (small <= c ) ? small : c ;
		
		System.out.println("\n\nSMALL : " + small ) ;
	}
}