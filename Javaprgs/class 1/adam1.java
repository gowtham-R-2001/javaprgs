import java.io.* ;

import java.lang.* ;

class adam1
{
	public static void main(String args[])  
	{
		int n = 0 ,  m = 0 , r = 0 , sq = 0 , r1 = 0 ;
		
		String s = "" ;
		
		n = Integer.parseInt( args[0] ) ;    // command line arguments // argument 1
		
		s = args[1] ; // argument 2 
		
		System.out.printf("\n%s",s) ;
		
		m = n ;		n = n * n ;
		
		System.out.printf("\n Multiply : %d",n) ;
		
		r = rev(n) ;
		
		System.out.printf("\nreverse : %d",r) ;
		
		sq = (int)Math.sqrt(r) ;
		
		System.out.printf("\nSq : %d",sq) ;
		
		r1 = rev(sq) ;
		
		System.out.printf("\nr1 : %d\n\n",r1) ;
		
		if(m == r1)
			System.out.print( m + " is a adam number \n\n") ;
		
		else
			System.out.print( m + " is not a adam number\n\n" ) ;
	}
	
	public static int rev(int n)
	{
		int s = 0 , r = 0 ;
		
		while(n > 0)
		{
			r = n % 10 ;
			
			s = s * 10 + r ;
			
			n /= 10 ;
		}
		
		return(s) ; 
	}
}