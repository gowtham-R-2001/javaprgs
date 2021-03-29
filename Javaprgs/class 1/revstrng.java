import java.io.* ;

class revstrng
{
	public static void main( String args[] )	throws IOException
	{
		String a = "" ;
		
		char x[] = new char[50] ;
		
		char[][] b = new char[50][50] ;
		
		char[][] c = new char[50][50] ;
		
		int ln = 0 , i = 0 , words = 1 , j = 0 , k = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter string : ") ;
		
		a = br.readLine() ;
		
		x = a.toCharArray() ; 
	
		ln = a.length() ;
		
		i = 0 ;
		
		for(i = 0 ; x[i] != '\0' ; i++)
		{	
			if(x[i] == 32)
					words++ ;
		}
		
		i = 0 ;
		
		for( i = 0 ; i < words ; i++ )
		{
			for( j = 0 ; j < ln ; j++ )
			{
				b[i][j] = x[k] ;
				
				if(x[k] == 32 )
				{
					k++ ;
					break ;
				}
				k++ ;
			}
			
			b[i][j] = '\0' ;
		}
		
		System.out.print("\n\nReversed String is ...\n\n\t\t") ;
		
		for(i =  words - 1 ; i >= 0 ; i-- )
				System.out.print( + b[i][j] ) ;
	}
}