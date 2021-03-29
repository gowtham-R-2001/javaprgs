import java.io.* ;

class camcase{
	
	public static void main(String args[])	throws IOException{
		
		String s = "" ;
		
		int words = 1 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ) ;
		
		System.out.print( "\nEnter string : " ) ;	s = br.readLine() ;
		
		if( s.isEmpty() ){
			
			System.out.println( "EMPTY STRING" ) ;
			System.exit(0) ;
		}
			
		
		for( int i = 0 ; i < s.length() ; ++i ){
			
			if( (s.charAt(i) >= 65) && (s.charAt(i) <= 90) )
				words++ ;
		}
		
		System.out.println( "WORDS : " + words ) ;
	}
}