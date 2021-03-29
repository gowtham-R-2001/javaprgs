import mymath.*  ;
import java.io.* ;

class mathpckg
{
	public static void main(String args[])	throws IOException
	{
		mymathx my = new mymathx() ;

		int n1 = 0 , n2 = 0 , v = 0 , f = 0 , n = 0 , m = 0 ;

		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;

		System.out.print("\n\nEnter number 1 : ") ;	n1 = Integer.parseInt( br.readLine() ) ;

		System.out.print("\n\nEnter number 2 : ") ;	n2 = Integer.parseInt( br.readLine() ) ;

		System.out.print("\n\t\tAddition : ") ;	

		v = my.add(n1,n2) ;

		System.out.println( v ) ;

		System.out.print("\n\t\tSubtraction : ") ;	

		v = mymathx.sub(n1,n2) ;

		System.out.println( v ) ;

		System.out.print("\n\t\tMultiplication : ") ;

		System.out.println("" + mymathx.mul(n1,n2)) ;

		System.out.print("\n\t\tDivision(Quotient) : ") ;

		System.out.println("" + mymathx.div_q(n1,n2)) ;

		System.out.print("\n\t\tDivision(Remainder) : ") ;

		System.out.println("" + mymathx.div_r(n1,n2)) ;

		System.out.print("\n\t\tFactorial : ") ;

		System.out.print("\n\t\t Enter number :  ") ;

		f = Integer.parseInt( br.readLine() ) ;

		System.out.println("" + mymathx.fact(f)) ;

		System.out.print("\n\t\tGCD : ") ;

		System.out.print("\n\nEnter number 1 : ") ;

		n = Integer.parseInt( br.readLine() ) ;

		System.out.print("Enter number 2 : ") ;

		m = Integer.parseInt( br.readLine() ) ;

		System.out.println("" + mymathx.gcd(n,m)) ;		
	}
}