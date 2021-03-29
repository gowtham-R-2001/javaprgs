import java.io.* ;

class studprz1
{
	private String  stu_name = "" ;
	
	private int min_proj = 0 , proj = 0 , stu_flg = 0 , stu_price = 0 , sta_flg = 0 ;
	
	private String sta_name = "" ;
	
	private int books = 0 , presentation = 0 , sta_price = 0 , stu_id = 0 , sta_id = 0;
	
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
	
	public int get_data(int opt,int roll)	throws IOException
	{
		if(opt == 1)
		{
			stu_id = roll ;
		
			System.out.print("\nEnter name : ") ; stu_name =	br.readLine() ;
		
			System.out.print("\nEnter mini projects : ") ;	min_proj = Integer.parseInt( br.readLine() ) ;
		
			System.out.print("\nEnter projects : ") ;	proj = Integer.parseInt( br.readLine() ) ;
			
			roll++ ;
		}
		else if(opt == 2)
		{
			sta_id = roll ;
			
			System.out.print("\nEnter staff name : ") ;	sta_name = br.readLine() ;
			
			System.out.print("\nEnter number of books published  : ") ;	books =  Integer.parseInt( br.readLine() ) ;
			
			System.out.print("\nEnter number of presentations : ") ; presentation = Integer.parseInt( br.readLine() ) ;
			
			roll++ ;
		}
		else
			System.out.print("\n\nInvalid input *.*") ;
		
		return(roll) ;
	
	}
	
	public void put_data(int opt)
	{
		if(opt == 1)
		{
			System.out.print("\n\nStudent Name : " + stu_name ) ;
		
			System.out.print("\n\nStudent Id : " + stu_id ) ;
		
			System.out.print("\n\nMini projects : " + min_proj ) ;
			
			System.out.print("\n\nProjects : " + proj ) ;
		}
		if(opt == 2)
		{
			System.out.print("\n\n\nStaff Name : " + sta_name ) ;
		
			System.out.print("\n\nStaff Id : " + sta_id ) ;
		
			System.out.print("\n\nBooks published : " + books ) ;
			
			System.out.print("\n\nPresentations : " + presentation ) ;
		}
	}
	
	public int hasprice(int opt)
	{
		int ret = 0 ;
		
		if(opt == 1)
		{
			if( (min_proj >= 2) && (proj >= 1) )
						ret = 1 ;
		}
		
		if(opt == 2)
		{
			if( (books >= 1) && (presentation >= 1) )
						ret = 1 ;
		}
		
		return(ret) ;
	}
	
	public static void main(String args[])	throws IOException
	{	
		BufferedReader brr = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		char ch ;
		
		int i = 0 , opt = 0 , cnt = 0 ; 
		
		int stu_roll = 101 , sta_roll = 201 ;
		
		int a[] = new int[10] ;
		
		studprz1 s[] = new studprz1[10] ;
		
		while(true)
		{
			s[i] = new studprz1() ;
			
			System.out.print("\n\n\t\t 1 - student / 2 - Staff : ") ;
			
			opt = Integer.parseInt( brr.readLine() ) ;
			
			if(opt == 1)
			{
				a[i] = opt ;
				stu_roll = s[i].get_data(opt,stu_roll) ;
			}
			
			else if(opt == 2)
			{
				sta_roll = s[i].get_data(opt,sta_roll) ;
				a[i] = opt ;
			}
			else
				System.out.print("\nInvalid input *.*") ;
			
			System.out.print("\n\n\t\t\tDo you want to continue (Yy | Nn) : ") ;
			
			ch = brr.readLine().charAt(0) ;

			cnt++ ;
			
			if( (ch == 'Y') || (ch == 'y') )
			{
				i++ ;	
				continue ;
			}
			
			else
				break ;
		}
		
		for(i = 0 ; i < cnt ; i++)
		{
			s[i].put_data(a[i]) ;	
			
			if( s[i].hasprice(a[i]) == 1)
				System.out.print("\n\n\t\tYou have a price O_O\n\n") ;
			
			else
				System.out.print("\n\n\t\tYou don't have a price O_O\n\n") ;
		}
		
	}
}