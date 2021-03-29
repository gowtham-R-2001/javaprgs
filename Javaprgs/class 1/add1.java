import java.io.* ;

import java.util.Scanner ;

class add1
{
	public static void main(String args[])	throws IOException
	{
		int n1 = 0 , n2 = 0 ;
		
		Scanner s = new Scanner(System.in) ;
		
		System.out.print("\nEnter number 1 : ") ;
		
		n1 = s.nextInt() ;
		
		System.out.print("\nEnter number 2 : ") ;
		
		n2 = s.nextInt() ;
		
		System.out.print("\nANS : " + (n1+n2) ) ;
	}
}