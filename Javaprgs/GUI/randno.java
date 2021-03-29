import java.io.* ;

import java.lang.Math ;

class randno
{
	public static void main(String args[])	throws IOException
	{
		int i = 0 , n = 0 ;
		
		for( i = 0 ; i < 10 ; ++i )
		{
			n = (int)( Math.random() * 50 ) + 1 ;
			
			/* 
			
				numbers we get from 0 - 49 ; 
			
			*/
			
			System.out.println( n ) ;
		}
	}
}
