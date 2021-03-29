class cls
{
	private int age = 0 ;
	
	private String name = "" ;
	
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
	
	public void set_name()		throws IOException
	{
		System.out.print("\n\n Enter name :  ") ;

		name = br.readLine() ;
	}
	
	public String get_name()	
	{
		return(name) ;
	}
	
	public void set_age()		throws IOException
	{
		System.out.print("\n\n Enter age :  ") ;
		
		age = Integer.parseInt( br.readLine() ) ;
	}
	
	public int get_age()
	{
		return(age) ;
	}
	
	
}
