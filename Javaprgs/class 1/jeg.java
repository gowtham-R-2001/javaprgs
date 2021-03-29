import java.io.* ;

import java.util.Scanner ;

class jeg
{
	public static void main(String args[]) throws IOException
	{
		int n1 = 0 , n2 = 0 , sum = 0 ;
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("Enter Number : ") ;
		
		n1 = sc.nextInt() ;
		
		System.out.println("Enter number 2 : ") ;
		
		n2 = sc.nextInt() ;
		
		sum = n1 + n2 ;
		
		System.out.println("Sum =  " + sum ) ;
		
		System.out.printf("SUM = %d  " , sum ) ;
	}
}