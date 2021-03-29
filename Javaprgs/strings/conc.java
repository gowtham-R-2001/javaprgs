import java.io.* ;

class conc
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		String s = "" ;
		
		int i = 0 , n = 0 , ln = 0 , cnt = 0 ;
		
		System.out.print("\nEnter String : ") ;	
		
		s = br.readLine() ;
		
		ln = s.length() ;
		
		System.out.print("\nEnter number of times : ") ;
		
		n = Integer.parseInt( br.readLine() ) ;
		
		while(cnt < n)
		{
			System.out.print( s.charAt(i++) ) ;
			
			if(i == ln)
			{
				i = 0 ;
				cnt++ ;
			}
		}
	}
}
