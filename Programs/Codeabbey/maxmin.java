import java.io.* ;

import java.lang.* ;

class maxmin
{
	public static void main(String args[])	throws IOException
	{
		int[] a = new int[10] ;
		
		int i = 0 , l = 0 , s = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		for(i = 0 ; i < 10 ; i++)
		{
			a[i] = Integer.parseInt( br.readLine() ) ;
		}
		
		l = a[0] ;
		
		s = a[0] ;
		
		for(i = 1 ; i < 10 ; i++)
		{
			if( a[i] >= l )
				l = a[i] ;
			
			if(a[i] <= s )
				s = a[i] ;
		}
		
		System.out.println(l + " " + s ) ;
	}
}