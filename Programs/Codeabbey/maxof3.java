import java.io.* ;

class maxof3
{
	public static void main(String args[] )		throws IOException
	{
		int a = 0 , b = 0 , c = 0 , big = 0 ;
		
		BufferedReader br =  new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter number 1 : ") ;
		
		a = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\n\nEnter number 2 : ") ;
		
		b = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\n\nEnter number 3 : ") ;
		
		c = Integer.parseInt( br.readLine() ) ;
		
		big = (a >= b) ? a : b ;
		
		big = (big >= c ) ? big : c ;
		
		System.out.println("\n\nBIG : " + big ) ;
	}
}