import java.io.* ;

class member
{
	private String name = "" ;
	
	private int price = 0 ;
	
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
	
	public void get_data()	throws IOException
	{
		System.out.print("\n\nEnter name : ") ;		name = br.readLine() ;
		
		System.out.print("\n\nEnter price : ") ;	price = Integer.parseInt( br.readLine() ) ;
	}
	
	public void put_data()
	{
		System.out.print("\n\nName : " + name ) ;
		
		System.out.print("\n\nPrice : " + price ) ;
	}
	
	public static void main(String args[])	throws IOException
	{
		member m = new member() ;
		
		member s = new member() ;
		
		s.get_data() ;	m.get_data() ;
		
		s.put_data() ;	m.put_data() ;
		
		if( instanceOf(s) == instanceOf(m) )
			System.out.print("\n\nS is an object of member") ;
	}
}