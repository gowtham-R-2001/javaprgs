import java.io.* ;

class studprz		//clss starts
{
	private String stu_id = "" , stu_name = "" ;
	
	private int min_proj = 0 , proj = 0 , flg = 0 , stu_price = 0 ;
	
	private String sta_id = "" , sta_name = "" ;
	
	private int books = 0 , presentation = 0 , sta_price = 0;
	
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
	
	public studprz(int flg)		// constructor
	{
		this.flg = flg ;
	}
	
	public int has_price(int input1,int input2)
	{
		int ret = 0 ; 
		
		if(flg == 0)
		{
			if( (input1 >= 2) && (input2 >= 1) )	// input1 : min_proj input2 : proj
				ret = 1 ;
		}
		
		else
		{
			if( (input1 >= 1) && (input2 >= 1) )	// input1 : books input2 : presentation
				ret = 1 ;
		}
		
		return(ret) ;
	}
	
	public void put_output()		// to display the output
	{
		if(flg == 0)
		{	
			System.out.print("\n\nStudent id : " + stu_id ) ;
		
			System.out.print("\t\tStudent name : " + stu_name ) ;
		
			System.out.print("\n\nNumber of mini projects :  " + min_proj ) ;
		
			System.out.print("\n\nNumber of Projects : " + proj ) ;
			
			if(stu_price == 1 )
					System.out.print("\n\n\t\tYou have a price O_O\n\n" ) ;
				
			else
				System.out.print("\n\n\t\tYou don't have a price *.*\n\n" ) ;
		}
		
		else
		{	
			System.out.print("\n\nStaff id : " + sta_id ) ;
		
			System.out.print("\t\tStaff name : " + sta_name ) ;
		
			System.out.print("\n\nNumber of books published :  " + books ) ;
		
			System.out.print("\n\nNumber of presentations presented : " + presentation ) ;
			
			if(sta_price == 1 )
					System.out.print("\n\n\t\tYou have a price O_O\n\n" ) ;
				
			else
				System.out.print("\n\n\t\tYou don't have a price *.*\n\n" ) ;
		}
	}
	
	public void get_input()	throws IOException		// to get input from the user
	{	
		int x = 0 ;
		
		if(flg == 0)
		{
			System.out.println("\n\n\t\t\tSTUDENT DATA") ;
			
			System.out.println("\t\t\t-------------") ;
			
			System.out.print("\nEnter student id : ") ;	stu_id = br.readLine() ;

			System.out.print("\nEnter student name : ") ;	stu_name = br.readLine() ;
			
			System.out.print("\nEnter no. of mini projects : ") ;	min_proj = Integer.parseInt( br.readLine() ) ;
			
			System.out.print("\nEnter no. of projects : ") ;	proj = Integer.parseInt( br.readLine() ) ;
			
			if( has_price(min_proj,proj) == 1 )
				stu_price = 1 ;
			
			else
				stu_price = 0 ;
				
		}
		else
		{
			System.out.println("\n\n\n\n\t\t\tSTAFF DATA") ;
			
			System.out.println("\t\t\t-----------") ;
			
			System.out.print("\nEnter staff id : ") ;		sta_id = br.readLine() ;

			System.out.print("\nEnter staff name : ") ;	sta_name = br.readLine() ;
			
			System.out.print("\nEnter no. of books published : ") ;	books = Integer.parseInt( br.readLine() ) ;
			
			System.out.print("\nEnter no. of presentation : ") ;	presentation = Integer.parseInt( br.readLine() ) ;
			
			if( has_price(books,presentation) == 1 )
				sta_price = 1 ;
			
			else
				sta_price = 0 ;
	
		}
	}
	
	public static void main(String args[])	throws IOException		//main function
	{
		studprz stu = new studprz(0) ;
		
		stu.get_input() ;
		
		stu.put_output() ;
		
		studprz sta = new studprz(1) ;
		
		sta.get_input() ;
		
		sta.put_output() ;
	}

}		// class ends