import java.io.* ;

import java.util.Scanner ;

class sivsak
{
	public static void main(String args[]) throws IOException
	{
		int n = 0 , i = 0 ;
	
		Scanner s = new Scanner(System.in) ;
	
		System.out.print("\nEnter Input : ") ;
	
		n = s.nextInt() ;
	
		for( i = 1 ;  i <= n ; i++ )
				System.out.printf("\n%d",i) ;
	}
}

