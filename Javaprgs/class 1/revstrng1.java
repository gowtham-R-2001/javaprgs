import java.io.* ;

class revstrng1
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		String s = "" ;
		
		int i = 0 , ln = 0 ;
	
		String[] s1 = new String[10] ;
		
		System.out.print("\n\nEnter String : ") ;
		
		s = br.readLine() ;
		
		s1 = s.split(" ") ;
		
		System.out.print("\n\n") ;
		
		for(i = ln ; i >= 0 ; i-- )
			System.out.print( s1[i] + " ") ;
		
		System.out.print("\n\n") ;
	}
}

