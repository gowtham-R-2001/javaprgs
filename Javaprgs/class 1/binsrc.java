import java.io.* ;

class binsrc
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		int[] arr = { 1,2,4,5,6,7,10,20,99,98 } ;
		
		int i = 0 , k = 1 , key = 0 , mid = 0 , first = 0 , last = 0 ;
		
		/*for( i = 0 ; i < 1 ; i++ )
		{
			System.out.print( "Enter element " + (k++) + " : " ) ;
			
			arr[i] = Integer.parseInt( br.readLine() ) ;
		} */
		
		System.out.print( "\n\nEnter element to search : " ) ;
		
		key = Integer.parseInt( br.readLine() ) ;
		
		first = 0 ;
		
		last = 9 ;
		
		mid = (first + last) / 2 ;
		
		while( first <= last )
		{
			if( arr[mid] < key )
				first = mid + 1 ;
			
			else if( arr[mid] == key )
			{
				System.out.println( "Element found at position : " + (mid + 1) )  ;
				break ;
			}
			
			else
				last = mid - 1 ;
			
			mid = (first + last) / 2 ;
		}
		
		if(  first > last  )
			System.out.println( "Element NOT found *.* " ) ;
	}
}