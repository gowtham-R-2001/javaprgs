import java.io.* ;

import java.util.Scanner ;

class oddeven
{
	public static void main(String args[]) throws IOException
	{
		int n = 0 , i = 0 ;
		
		System.out.print("\nEnter Input : ") ;
		
		Scanner s = new Scanner(System.in) ;
		
		n = s.nextInt() ;
		
		System.out.print("\n\nODD NUMBERS...\n") ;
		
		for( i = 1 ; i <= n ; i++ )
		{
				if(i % 2 != 0)
					System.out.printf("%d ",i) ;
					
		}
		
		System.out.print("\n\n EVEN NUMBERS...\n") ;
	
		for( i = 1 ; i <= n ; i++ )
		{
				if(i % 2 == 0)
					System.out.printf("%d ",i) ;
		}
	}
}