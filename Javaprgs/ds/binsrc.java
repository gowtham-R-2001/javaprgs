import java.io.* ;

import java.util.Arrays ;

class binsrc
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		int[] a = {10,110,20,14,80,60,70,57,33} ;
		
		int temp = 0 ;
		
		int ln = a.length ;
		
		int key = Integer.parseInt( br.readLine() ) ;
		
		for(int i = 0 ; i < ln ; i++)
		{
			for(int j = i+1 ; j < ln ; j++)
			{
				if( a[i] > a[j] )
				{
					temp = a[i] ;
					a[i] = a[j] ;
					a[j] = temp ;
				}
			}
		}
		
		System.out.println( Arrays.toString(a) ) ;
		
		int first = 0 ;
		
		int last = ln-1 ;
		
		int mid = (first+last) / 2 ;
		
		while( first <= last )
		{
			if( a[mid] == key )
			{
				System.out.println( "Key found at position " + (mid+1) ) ;
				break ;
			}
		
			else if( a[mid] < key )
				first = mid+1 ;
			
			else
				last = mid-1 ;
			
			mid =  (first+last) / 2 ;
		}
		
		if( first > last )
			System.out.println("Not Found ") ;
	}
}