import java.io.* ;

abstract class abs
{	
	String name = "" , id  = "" ;
	
	int cri1 = 0 , cri2 = 0 ;
	
	char a ;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
	
	public void get_name_id() 		throws IOException
	{	
			System.out.print("\nEnter id : ") ;		id = br.readLine() ;
			
			a = id.charAt(0) ;
			
			if( (a == 's') || (a == 'S') ) 
			{
				System.out.print("\nEnter student name : ") ;	name = br.readLine() ;
			}
			
			if( (a == 't') || (a == 'T') )
			{
					System.out.print("\nEnter teacher name : ") ;	name = br.readLine() ;
			}
	}
	
	public void get_data()		 	throws IOException  
	{
			if( (a == 's') || (a == 'S') ) 
			{
				System.out.print("\nEnter cgp : ") ;    		cri1 = Integer.parseInt( br.readLine() ) ;
			
				System.out.print("\nEnter projects : ") ;		cri2 = Integer.parseInt( br.readLine() ) ;
			}
				
			else if( (a == 't') || (a == 'T') )
			{
				System.out.print("\nEnter books published : ") ;    	cri1 = Integer.parseInt( br.readLine() ) ;
			
				System.out.print("\nEnter papers : ") ;					cri2 = Integer.parseInt( br.readLine() ) ; 
			}
	}
	
	abstract public void put_data() ;
	
	abstract public int hasPrize(int cond1,int cond2) ;
}

class student extends abs
{	
	public void put_data()
	{
		int prz = 0 ;
		
		System.out.println("\nStudent name : " + name ) ;		System.out.println("student id : " + id ) ;
		
		System.out.println("cgp : " + cri1 ) ;					System.out.println("projects : " + cri2 ) ;
		
		prz = hasPrize(cri1,cri2) ;
		
		if(prz == 1)
			System.out.println("You have WON a prize O_O") ;
		
		else
			System.out.println("NO prize *.*") ;
	}
	
	public int hasPrize(int cond1,int cond2) 
	{
		int ret = 0 ;
	
		ret = ( (cond1 > 6) && (cond2 > 1) )  ?   1  :  0 ;
		
		return( ret ) ;
	}
	
}

class teacher extends abs
{	
	int books = 0 , presentation = 0 ;
	
	public void put_data()
	{
		int prz = 0 ;
		
		System.out.println("\nTeacher Name : " + name ) ;		System.out.println("id : " + id ) ;
		
		System.out.println("books : " + cri1 ) ;				System.out.println("presentation : " + cri2 ) ;
		
		prz = hasPrize(cri1,cri2) ;    
		
		if(prz == 1)
			System.out.println("You have WON a prize O_O") ;
	
		else
			System.out.println("NO prize *.*") ;
	}
	
	public int hasPrize(int cond1,int cond2)
	{
		int ret = 0 ;
		
		ret = ( (cond1 > 3) && (cond2 > 2) ) ? 1 : 0 ;
		
		return(ret) ;
	}
}

class abscls1
{
	public static void main(String args[])			throws IOException
	{
		int opt = 0 ;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		
		teacher t = new teacher() ;
		
		student s = new student() ;
		
		s.get_name_id() ;	s.get_data() ;	s.put_data() ;
	
		t.get_name_id() ;	t.get_data() ;	t.put_data() ;
	}
}