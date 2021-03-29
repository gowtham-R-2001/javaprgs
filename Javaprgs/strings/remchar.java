import java.io.* ;

class remchar
{
	public static void main(String args[])		throws IOException
	{
		String s1 = "" ;
		
		char[] s = new char[30] ;
		
		int ln = 0 , i = 0 , k = 0 , cnt = 0 ;
	
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\nEnter String : ") ;	s1 = br.readLine() ;
		
		s = s1.toCharArray() ;
		
		for(i = 0 ; i < s.length ; i++)
		{
			if( s[i] != '#' )
				s[k++] = s[i] ;
			
			else
				cnt++ ;
		}
		
		ln = s.length ;
		
		for(i = ln-1 ; i >= ln-cnt ; i--)
			s[i] = '\0' ;
		
		System.out.print("\n\n") ;
		
		for(i = 0 ; i < s.length ; ++i)
			System.out.print( s[i] ) ;
	}
}