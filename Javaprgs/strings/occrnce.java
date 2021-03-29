import java.io.* ;

class occrnce
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		String s1 = "" , s2 = "" , x = "" ;
		
		int ln = 0 , i = 0 , cnt = 0 ;
		
		System.out.print("\nEnter String 1 : ") ;		
		
		s1 = br.readLine() ;
		
		System.out.print("\nEnter String 2 : ") ;

		s2 = br.readLine() ;
		
		ln = s2.length() ;

		for(i = 0 ; i < s1.length()-(ln-1) ; ++i)
		{
			x = s1.substring(i,i+ln) ;
			
			if( s2.contains(x) )
				cnt++ ;
		}
		
		System.out.println("Occurences : " + cnt ) ;
	}
}