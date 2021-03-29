import java.io.* ;

class bigof2
{	
	public static void main(String args[])	throws IOException
	{
		int n1 = 0 , n2 = 0 , n3 = 0 , max = 0 , max1 = 0 ;
		
		bigcls bc = new bigcls() ;
		
		System.out.print("\n\nEnter number 1 : ") ;		n1 = bc.func(n1) ;
		
		System.out.print("\n\nEnter number 2 : ") ;		n2 = bc.func(n2) ;
		
		System.out.print("\n\nEnter number 3 : ") ;		n3 = bc.func(n3) ;
		
		max = bc.big(n1,n2) ;	 	System.out.print("\n\nA : " + n1 + "   B : " + n2 + "\t\t\t BIG : " + max  ) ;
		
		max = bc.big(n2,n3) ;		System.out.print("\n\nA : " + n2 + "   B : " + n3 + "\t\t\t BIG : " + max  ) ;
		
		max = bc.big(n1,n3) ;	 	System.out.print("\n\nA : " + n1 + "   B : " + n3 + "\t\t\t BIG : " + max  ) ;
		
		max1 = bc.big(n1,n2,n3) ;	System.out.print("\n\nA : " + n1 + "   B : " + n2 + "   C : " + n3 + "\t BIG : " + max1 + "\n\n" ) ;
	}		
	
}