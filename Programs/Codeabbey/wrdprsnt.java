import java.io.* ;

class wrdprsnt
{
	public static void main(String args[])	throws IOException
	{
		String s = "sivasakthi" ;
		
		String s1 = "" ;
		
		int i = 0 , j = 0 , ln = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\nEnter string : ") ;
		
		s1 = br.readLine() ;
		
		char[] a = new char[100] ;
		
		char[] b = new char[100] ;
		
		a = s.toCharArray() ;
		
		b = s1.toCharArray() ;
		
		ln = s1.length() ;
		
		j = 0 ;
		
		for(i = 0 ; i < ln+1 ; i++)
		{
			if( b[i] == a[j] )
				j++ ;
		}
		
		if(j == s.length() )
			System.out.print("\n\nPRESENT ") ;
		
		else
			System.out.print("\n\nNOT PRESENT ") ;
	}
}