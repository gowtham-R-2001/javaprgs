import java.io.* ;

class studrec	// ARRAY OF OBJECTS
{
	private String id = "" , name = "" ;
	
	private int m1 = 0 , m2 = 0 , m3 = 0 , m4 = 0 , m5 = 0 , tot = 0 ;
	
	private float avg = 0.0f ;
	
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
	
	public void get_data()		throws IOException
	{
		System.out.print("\nEnter id : ") ;
		
		id = br.readLine() ;
		
		System.out.print("\nEnter name : ") ;
		
		name = br.readLine() ;
		
		System.out.print("\nEnter tamil marks : ") ;
		
		m1 = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\nEnter english marks : ") ;
		
		m2 = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\nEnter maths marks : ") ;
		
		m3 = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\nEnter science marks : ") ;
		
		m4 = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\nEnter social marks : ") ;
		
		m5 = Integer.parseInt( br.readLine() ) ;
		
		tot = m1 + m2 + m3 + m4 + m5 ;
		
		avg = tot / 5 ;
	}
	
	public void put_data()
	{
		System.out.print("\nId : " + id ) ;
		
		System.out.print("\nName : " + name ) ;
		
		System.out.print("\nMarks 1 : " + m1 ) ;
		
		System.out.print("\nMarks 2 : " + m2 ) ;
		
		System.out.print("\nMarks 3 : " + m3 ) ;
		
		System.out.print("\nMarks 4 : " + m4 ) ;
		
		System.out.print("\nMarks 5 : " + m5 ) ;
		
		System.out.print("\nTotal : " + tot ) ;
		
		System.out.print("\nAverage : " + avg + "\n\n" ) ;
	}
	
	public static void main(String args[])	throws IOException
	{
		studrec s[] = new studrec[3] ;
		
		int i = 0 ;
		
		for(i = 0 ; i < 3 ; i++)
		{
			s[i] = new studrec() ;
			
			s[i].get_data() ;
		}
		
		for(i = 0 ; i < 3 ; i++)
			s[i].put_data() ;
	}
}