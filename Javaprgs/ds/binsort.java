import java.io.* ;

import java.util.Arrays;

class binsort
{
	public static void main(String args[])	
	{
		int[] a = { 0,1,1,0,1,0,1,1,0,1,0,1 } ;
		
		sort(a) ;
	
		System.out.println( Arrays.toString(a) ) ;
	}
	
	public static void sort(int[] a)
	{
		int ln = a.length , zeros = 0 ;
		
		for(int i = 0 ; i < ln ; i++)
		{
			if( a[i] == 0 )
				zeros++ ;
		}
		
		for(int i = 0 ; i < zeros ; i++ )
			a[i] = 0 ;
		
		for(int i = zeros ; i < a.length ; i++)
			a[i] = 1 ;
	}
}