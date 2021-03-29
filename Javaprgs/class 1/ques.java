import java.io.* ;

class ques{

	public static void main(String args[])	throws IOException{
		
		float i = 0.0f , j = 0.0f , m = 0.0f , n = 0.0f ; 
		
		for( i = 1 ; i <= 20 ; i += 0.5 ) 
		{
			for( j = 1 ; j <= 20 ; j += 0.5 ) 
			{	
				if( i + j == 8.0 )
				{	
					for( m = 1 ; m <= 20 ; m += 0.5 )
					{
						for( n = 1 ; n <= 20 ; n += 0.5 )
						{
							if( (i + j == 8) && (m - n == 6) && ( i + m == 13 ) && (j + n == 8) )
								System.out.println( "\n   I : " + i + "   J : " + j + "\n   M : " + m + "   n : " + n ) ;
						}
					}
				}
			}
		} 
	}
}