import java.io.* ;

class middstr
{
	public static void main(String args[])		throws IOException
	{
		String s = "" ;
	
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		String[] str = new String[30] ;
		
		int i = 0 , ln = 0 ;
		
		System.out.print("\nEnter String : ") ;	s = br.readLine() ;
		
		str = s.split(" ") ;
		
		for( String x : str )
			str[i++] = x ;
		
		ln = i ;
		
		for(i = 0 ; i < ln-2 ; i++)
		{
			if( str[i].compareTo(str[i+2]) == 0 )
				System.out.println(str[i+1]) ; 
		}
		
	}
}