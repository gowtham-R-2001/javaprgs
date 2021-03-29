import java.io.* ;

class bigpalind{
	
	public static void main( String args[] ) throws IOException{
		
		String s = "" , m = "" ;
		
		String[] str , str1 = new String[30] ;
		
		int i = 0 , ln = 0 , words = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ) ;
		
		System.out.print( "Enter String : " ) ;		s = br.readLine() ;
		
		str = s.split(" ") ;
		
		for( String x : str )
			str[i++] = x ;
		
		ln = s.length() - 1 ;
	}
}

