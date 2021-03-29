import java.io.* ;

class sbig
{
	public static void main(String args[])	throws IOException
	{
		int[] a = {5,3,1,101,102,89,100,77,89} ;
		
		int big1 = a[0] > a[1] ? a[0] : a[1] ;
		
		int big2 = a[0] < a[1] ? a[0] : a[1] ;
		
		for( int n : a )
		{
			if( n > big1 )
			{
				big2 = big1 ;
				big1 = n ;
			}
			
			if( (n < big1) && (n > big2) )
				big2 = n ;
		}
		
		System.out.println( "Second biggest : " +  big2 ) ;
	}
}