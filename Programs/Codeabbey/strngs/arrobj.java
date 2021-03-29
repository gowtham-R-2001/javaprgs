import java.io.* ;

class cls{
	
	public String name = "" , id = "" ;
	
	public float salary = 0.0f ;
	
	public char c ;
	
	public void get_data(){
		
		System.out.print( "\nEnter the name : " ) ;
		
		name = br.readLine() ;
		
		System.out.print( "\nEnter the id : " ) ;
		
		id = br.readLine() ;
		
		System.out.print( "Enter gender : " ) ;
		
		age = Integer.parseInt( br.readLine() ) ;
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
		
		
	}
}