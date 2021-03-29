import java.io.* ;

class rep
{
	public static void main(String args[])	throws IOException
	{
		String s = "" , replace = "" , new_word = "" , new_string = "" ;
		
		String[] str = new String[40] ;
		
		int i = 0 , ln = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("Enter String : ") ;
		
		s = br.readLine() ;
		
		System.out.print("\nEnter word to replace : ") ;
		
		replace = br.readLine() ;
		
		if( s.contains(replace) )
		{
			System.out.print("\nEnter new word : ") ;		

			new_word = br.readLine() ;
		
			str = s.split(" ") ;
			
			for( String x : str )
			{
				if( x.equals(replace) )
					str[i++] = new_word ;
				
				else
					str[i++] = x ;
			}
			
			ln = i ;
			
			/*for( i = 0 ; i < ln ; i++ )
				System.out.print( str[i] + " " ) ;  */
			
			new_string = String.valueOf(str) ;
			
			System.out.println( "STRING : " + new_string) ; 
		}
		
		else
			System.out.println( replace + " is not present in the string *.*\n") ;
	}
}