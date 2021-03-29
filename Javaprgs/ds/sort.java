import java.io.* ;

class sort
{
	public static void main(String args[])	throws IOException
	{
		int[] a = {22,34,2,78,89,99} ;
		
		int ans = isSort(a,a.length) ;
		
		if(ans != -1 )
			System.out.println( "Sorted order" ) ;

		else
			System.out.println( "Not in Sorted order" ) ;
	}

	public static int isSort(int[] a,int ln) 
	{
		if( ln <= 1 )
			return(0) ;

		if( a[ln-1] < a[ln-2] )
			return(-1) ;

		return( isSort(a,ln-1) ) ;
	}
}