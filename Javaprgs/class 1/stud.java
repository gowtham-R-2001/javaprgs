import java.io.* ;

import java.util.Scanner ;

class stud
{
	public static void main(String args[]) throws IOException
	{
		String name = "" ;
		
		int roll = 0 , m1 = 0 , m2 = 0 , m3 = 0 , tot = 0 ;
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("Enter roll : ") ;
		
		roll = sc.nextInt() ;
		
		sc.nextLine() ;
		
		System.out.print("Enter name : ") ;
		
		name = sc.nextLine() ;
		
		System.out.print("Enter marks 1 : ") ;
		
		m1 = sc.nextInt() ;
		
		System.out.print("Enter marks 2 : ") ;
		
		m2 = sc.nextInt() ;
		
		System.out.print("Enter marks 3 : ") ;
		
		m3 = sc.nextInt() ;
		
		tot = m1 + m2 + m3 ;
		
		System.out.printf("\n\nTOTAL : %d",tot ) ;
	}
}