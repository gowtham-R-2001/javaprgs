import java.io.* ;

class cls{
	
	String name = "" , id = "" ;
		
	BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ) ;
	
	public void get_data() throws IOException{
		
		System.out.print("\nEnter name : ") ;	name = br.readLine() ;
		
		System.out.print("\nEnter id : ") ;		id = br.readLine() ;
	}
	
	public void put_data(){
		
		System.out.println("Name : " + name ) ;
		
		System.out.println("Id : " + id ) ;
	}
	
	public class inner_cls{
		
		int sslcmarks = 0 , hscmarks = 0 ;
		
		float cgpa = 0.0f ;
		
		public void get_data() throws IOException{
			
			System.out.print("\nEnter SSLC marks : ") ;		sslcmarks = Integer.parseInt( br.readLine() ) ;
			
			System.out.print("\nEnter HSC marks : ") ;		hscmarks = Integer.parseInt( br.readLine() ) ;
			
			System.out.print("\nEnter CGPA  : ") ;		    cgpa = Float.parseFloat( br.readLine() ) ;
		}
		
		public void put_data(){
			
			System.out.println( "SSLC marks : " + sslcmarks ) ;
			
			System.out.println( "HSC marks : " + hscmarks ) ;
			
			System.out.println( "CGPA : " + cgpa ) ;
		} 
	}
}

class innpri1{
	
	public static void main(String args[])	throws IOException{
		
		int opt = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ) ;
		
		cls c = new cls() ;
		
		c.get_data() ;
	
		System.out.print("\nAre you a student(1-Yes | 2-No) : ") ;
		
		opt = Integer.parseInt( br.readLine() ) ;
		
		if(opt == 1){
			cls.inner_cls ic = c.new inner_cls() ;
			
			ic.get_data() ;
			
			System.out.println( "\n\t\tHello " + c.name + "..." ) ;
			
			c.put_data() ;

			ic.put_data() ;
		}
		
		else{
			System.out.println( "\n\t\tHello " + c.name + "..." ) ;
			
			c.put_data() ;
		}
	}
}