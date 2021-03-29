import java.io.* ;

class alpsort
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		String[] s = new String[5] ;
		
		String alp = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
		
		String temp = "" ;
		
		int k= 0 ;
		
		for( int i = 0 ; i < 5 ; i++ )
			s[i] = br.readLine() ;
		
		System.out.println() ;
		
		for(int i = 0 ; i < 5; i++)
		{
			for(int j = i+1 ; j < 5 ; j++)
			{
				char c = s[i].charAt(0) ; 
				char d = s[j].charAt(0) ;
				
				int ind1 = alp.indexOf(c) ; // 0
				int ind2 = alp.indexOf(d) ; // 2
				
				
				if( ind1 > ind2 )
				{
					temp = s[i] ;
					s[i] = s[j] ;
					s[j] = temp ;
				}
			}
		}
		
		for( String x : s )
			System.out.println( x ) ;
	}
}