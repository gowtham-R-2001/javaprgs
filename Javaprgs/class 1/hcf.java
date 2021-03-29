import java.io.* ;

class hcf
{
	public static void main(String args[])	throws IOException
	{
		int n1 = 0 , n2 = 0 , big = 0 , small = 0 , gcd = 0;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\n Enter number 1 : ") ;
		
		n1 = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\n\n Enter number 2 : ") ;
		
		n2 = Integer.parseInt( br.readLine() ) ;
		
		big    = ( n1 > n2 ) ?  n1 : n2 ;
		
		small  = ( n1 < n2 ) ?  n1 : n2 ;
		
		gcd = hcf(big,small) ;
		
		System.out.print("\n\n\t\tHCF : " + gcd ) ;
	}
	
	public static int hcf(int big,int small)
	{
		int  r = 0 ;
		
		r = big % small ;
		
		if( r > 0 )
			small = hcf( small, r ) ;
			
		return(small) ;
	}
}