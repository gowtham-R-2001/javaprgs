import java.io.* ;

class altchar{
	
	public static void main(String args[]) throws IOException{
		
		String[] s = new String[30] ;
		
		int n = 0 , k = 1 , str = 0 , cnt = 0 , min = 100 , mindex = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ) ;
		
		System.out.print( "\nNumber of test cases ? : " ) ;		n = Integer.parseInt( br.readLine() ) ;
		
		for( int i = 0 ; i < n ; ++i ){
			
			System.out.print("\nEnter string " + (k++) + " : " ) ;
			
			s[i] = br.readLine() ;
		}
		
		System.out.println("") ;
		
		while( str < n ){
			
			for( int i = 0 ; i < s[str].length()-1 ; i++ ){
				
				if( s[str].charAt(i) == s[str].charAt(i+1)  )
					cnt++ ;
			}
			
			if( cnt < min ){
				
				min = cnt ;
				mindex = str ;
			}
				
			
			str++ ;
			System.out.println( cnt ) ;
			cnt = 0 ;
		}
		System.out.println( "MIN : " + min + " Mindex : " + mindex ) ;
	}
}