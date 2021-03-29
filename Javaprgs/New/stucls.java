import java.io.* ;

class stucls
{
	private int roll = 0 , m1 = 0 , m2 = 0 , m3 = 0 , m4 = 0 , m5 = 0 , tot = 0 ;
	
	private float avg = 0.0f ;
	
	private String name = "" ;
	
	private char g ;
	
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
	
	public void set_name()		throws IOException
	{
		System.out.print("\nEnter name : ") ;
		
		name = br.readLine() ;
	}
	
	public void set_roll()		throws IOException
	{
		System.out.print("\nEnter Roll : ") ;
		
		roll = Integer.parseInt( br.readLine() ) ;
	}
	
	public void set_m1()		throws IOException
	{
		System.out.print("\nEnter Tamil marks : ") ;
		
		m1 = Integer.parseInt( br.readLine() ) ;
	}
		
	public void set_m2()		throws IOException
	{
		System.out.print("\nEnter English marks : ") ;
		
		m2 = Integer.parseInt( br.readLine() ) ;
	}
	
	public void set_m3()		throws IOException
	{
		System.out.print("\nEnter Maths marks : ") ;
		
		m3 = Integer.parseInt( br.readLine() ) ;
	}
	
	public void set_m4()		throws IOException
	{
		System.out.print("\nEnter Science marks : ") ;
		
		m4 = Integer.parseInt( br.readLine() ) ;
	}
		
	public void set_m5()		throws IOException
	{
		System.out.print("\nEnter Social marks : ") ;
		
		m5 = Integer.parseInt( br.readLine() ) ;
	}	
		
	public void set_tot()		
	{
		tot =  m1 + m2 + m3 + m4 + m5 ;
	}
		
	public void set_avg()		
	{
		avg = tot / 5 ;
	}
	
	public void set_grade()		
	{
		if( (avg > 90) && (avg >= 100) )
			g = 'O' ;
		
		else if( avg > 80 )
			g = 'A' ;
		
		else if( avg > 70 )
			g = 'B' ;
		
		else if( avg > 60 )
			g = 'C' ;
		
		else
			g = 'R' ;
	}
	
	public void func()	throws IOException
	{
		set_name() ;  	set_roll() ;	set_m1() ;	set_m2() ;	set_m3() ;
		
		set_m4() ;		set_m5() ;		set_tot() ;	set_avg() ;	set_grade() ;
	}
	
	public String get_name()
	{
		return(name) ;
	}
	
	public int get_roll()
	{
		return(roll) ;
	}
	
	public int get_m1()
	{
		return(m1) ;
	}
	
	public int get_m2()
	{
		return(m2) ;
	}
	
	public int get_m3()
	{
		return(m3) ;
	}
	
	public int get_m4()
	{
		return(m4) ;
	}
	
	public int get_m5()
	{
		return(m5) ;
	}
	
	public int get_tot()
	{
		return(tot) ;
	}
	
	public float get_avg()
	{
		return(avg) ;
	}
	
	public char get_grade()
	{
		return(g) ;
	}
	
}