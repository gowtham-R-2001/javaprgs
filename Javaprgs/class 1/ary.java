import java.io.* ;

class ary
{
	public static void main(String args[])	throws IOException
	{
		int[] a = new int[10] ;
		
		int i = 0 ; 
		
		for(i = 0 ; i < 10 ; ++i)
			a[i] = i+1 ;
		
		func(a) ;
		
		for(i = 0 ; i < 10 ; ++i)
			System.out.println(a[i]) ;
	}
	
	public static int[] func( int[] a )
	{
		a[6] = 14 ;
		
		return(a) ;
	}
}