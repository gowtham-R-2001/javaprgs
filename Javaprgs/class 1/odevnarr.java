import java.io.* ;

import java.util.Scanner ;

class odevnarr
{
	public static void main(String args[]) throws IOException
	{
		int n = 0 , i = 0 ;
		
		int a[] = new int[10] ;
				
		System.out.print("\nEnter Input : ") ;
		
		Scanner s = new Scanner(System.in) ;
		
		System.out.print("\n\nODD NUMBERS...\n") ;
		
		for( i = 0 ; i < 10 ; i++ )
		{
			System.out.print("Number  " + (i+1) + " : " ) ;
			
			n = s.nextInt() ;
			
			a[i] = n ;
			
				if(a[i] % 2 != 0)
					System.out.printf("%d ",a[i]) ;
					
		}
		
		System.out.print("\n\n EVEN NUMBERS...\n") ;
	
		for( i = 0 ; i < 10 ; i++ )
		{
				if(a[i] % 2 == 0)
					System.out.printf("%d ",a[i]) ;
		}
	}
}