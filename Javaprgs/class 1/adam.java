import java.io.* ;

import java.lang.* ;

class adam
{
	public static void main(String args[])  throws IOException
	{
		int n = 0 ,  m = 0 , r = 0 , sq = 0 , r1 = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter number : ") ;
		
		n = Integer.parseInt( br.readLine() ) ;
		
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