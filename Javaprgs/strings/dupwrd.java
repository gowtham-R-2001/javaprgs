import java.io.* ;

class dupwrd{
	
	public static void main(String args[])	throws IOException{
		
		String s = "" ;
		
		String str[] = new String[30] ;
		
		int i = 0 , ln = 0 , j = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ) ;
		
		System.out.print( "Enter String : " ) ;		s = br.readLine() ;
		
		str = s.split(" ") ;
		
		for( String x : str )
			str[i++] = x ;
		
		ln = i ;
		
		for( i = 0 ; i < ln ; ++i ){
			
			for( j = i+1 ; j < ln ; ++j ){
				
				if( str[i].equals( str[j] ) )
					System.out.println( str[i] ) ;
			}
		}
		
	}
}