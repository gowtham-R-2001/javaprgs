import java.io.* ;

interface prizDis
{
	public int hasPrize(int cond1,int cond2) ;
}

public class ifcstudent implements prizDis
{
	String name = "" , id = "" ;
	
	int cgp = 0 , prj = 0 ;
	
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;

	void get_data()		throws IOException
	{
		System.out.print("\nEnter name : ") ;	name = br.readLine() ;

		System.out.print("\nEnter id : ") ;		id = br.readLine() ;

		System.out.print("\nEnter cgp : ") ;    cgp = Integer.parseInt( br.readLine() ) ;

		System.out.print("\nEnter projects : ") ;	prj = Integer.parseInt( br.readLine() ) ; 
	}
	
	void put_data()
	{
		int prz = 0 ;
		
		System.out.println("\nName : " + name ) ;		System.out.println("id : " + id ) ;
		
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