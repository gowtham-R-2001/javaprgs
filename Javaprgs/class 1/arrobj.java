import java.io.* ;

class cls{
	
	public String name = "" , id = "" , gender = "" ;
	
	public float salary = 0.0f ;
	
	public int age = 0 ;
	
	BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ) ;
		
	public void get_data()	throws IOException{
		
		System.out.print( "\nEnter the name : " ) ;
		
		name = br.readLine() ;
		
		System.out.print( "\nEnter the id : " ) ;
		
		id = br.readLine() ;
		
		System.out.print( "\nEnter gender : " ) ;
		
		gender = br.readLine() ;
	}
	
	public void put_data(){
		
		System.out.println( "Name : " + name ) ;
		
		System.out.println( "id : " + id ) ;
		
		System.out.println( "Gender : " + gender ) ;
		
		if( (id.charAt(0) == 'H') || (id.charAt(0) == 'h') ) 
			System.out.println( "hello " + name + " : HR department" ) ;
		
		else
			System.out.println( "hello " + name + " : employee" ) ;
	}

}

class arrobj{
	
	public static void main( String args[] )	throws IOException{
		
		cls c[] = new cls[30] ;
		
		int i = 0 ;
		
		String ch = "Yy" , ch1 = "Yy" ;

		BufferedReader brr = new BufferedReader( new InputStreamReader( System.in ) ) ;
		
		while( ch.contains(ch1) ){
			
			c[i] = new cls() ;
			
			c[i].get_data() ;
			
			System.out.print( "Do you want to continue(Yy | Nn ) : " ) ;

			ch1 = brr.readLine() ;
			
			i++ ;
		}
		
		int ln = i ;
		
		for( i = 0 ; i < ln ; ++i )
			c[i].put_data() ;
	}
}