import java.io.* ;

class priv1 	// inner class
{
	String name = "" , id = "" ;
	
	int m1 = 0 , m2 = 0 , m3 = 0 , m4 = 0 , m5 = 0 , tot = 0 ;
	
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
	
	public void get_data() throws IOException
	{
		System.out.print("\nEnter name : ") ;	name = br.readLine() ;
		
		System.out.print("\nEnter id : ") ;		id = br.readLine() ;    
	}
	
	public void put_data()
	{
		System.out.println("\nName : " + name ) ;
		
		System.out.println("id : " + id ) ;
		
		System.out.println("Tamil marks : " + m1 ) ;
		
		System.out.println("English marks : " + m2 ) ;
		
		System.out.println("Maths marks : " + m3 ) ;
		
		System.out.println("Science marks : " + m4 ) ;
		
		System.out.println("Social marks : " + m5 ) ;
		
		System.out.println("Total marks : " + tot ) ;
	}
	
	public class priv_pri // private class which only own for this class
	{
		public void get_marks() throws IOException
		{	
			System.out.print("\nEnter tamil marks : ") ; 	m1 = Integer.parseInt( br.readLine() ) ;
		
			System.out.print("\nEnter english marks : ") ; 	m2 = Integer.parseInt( br.readLine() ) ;
			
			System.out.print("\nEnter maths marks : ") ; 	m3 = Integer.parseInt( br.readLine() ) ;
			
			System.out.print("\nEnter science marks : ") ; 	m4 = Integer.parseInt( br.readLine() ) ;
			
			System.out.print("\nEnter social marks : ") ; 	m5 = Integer.parseInt( br.readLine() ) ;
			
			tot = m1 + m2 + m3 + m4 + m5 ;
		}
	}
}

class priva
{
	public static void main(String args[])	throws IOException
	{
		priv1 pupil = new priv1() ;
		
		pupil.get_data() ;
		
		priv1.priv_pri inner_cls = pupil.new priv_pri() ;
		
		inner_cls.get_marks() ;
		
		pupil.put_data() ;
	}
}