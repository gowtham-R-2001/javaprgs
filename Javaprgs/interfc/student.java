import java.io.* ;

interface prizDis
{
	public int hasPrize(int cond1,int cond2) ;
}

class student implements prizDis
{
	String name = "" , id = "" ;
	
	int cgp = 0 , prj = 0 ;
	
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;

	void get_student_data()		throws IOException
	{
		System.out.print("\nEnter student name : ") ;	name = br.readLine() ;

		System.out.print("\nEnter student id : ") ;		id = br.readLine() ;

		System.out.print("\nEnter cgp : ") ;    cgp = Integer.parseInt( br.readLine() ) ;

		System.out.print("\nEnter projects : ") ;	prj = Integer.parseInt( br.readLine() ) ; 
	}
	
	void put_student_data()
	{
		int prz = 0 ;
		
		System.out.println("\nStudent name : " + name ) ;		System.out.println("student id : " + id ) ;
		
		System.out.println("cgp : " + cgp ) ;		System.out.println("projects : " + prj ) ;
		
		prz = hasPrize(cgp,prj) ;
		
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

class teacher implements prizDis
{
	String name = "" , id = "" ;
	
	int books = 0 , presentation = 0 ;
	
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
	
	void get_teacher_data()		throws IOException
	{
		System.out.print("\nEnter teacher name : ") ;	name = br.readLine() ;
		
		System.out.print("\nEnter teacher id : ") ;		id = br.readLine() ;
	
		System.out.print("\nEnter books : ") ;	books = Integer.parseInt( br.readLine() ) ;
	
		System.out.print("\nEnter presentation : ") ;	presentation = Integer.parseInt( br.readLine() ) ;
	}
	
	void put_teacher_data()
	{
		int prz = 0 ;
		
		System.out.println("\nTeacher Name : " + name ) ;		System.out.println("id : " + id ) ;
		
		System.out.println("books : " + books ) ;		System.out.println("presentation : " + presentation ) ;
		
		prz = hasPrize(books,presentation) ;
		
		if(prz == 1)
			System.out.println("You have WON a prize O_O") ;
	
		else
			System.out.println("NO prize *.*") ;
	}
	
	public int hasPrize(int books,int presentation)
	{
		int ret = 0 ;
		
		ret = ( (books > 3) && (presentation > 2) ) ? 1 : 0 ;
		
		return(ret) ;
	}
}