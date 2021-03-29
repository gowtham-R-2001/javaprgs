import java.io.* ;

class roll
{
	public static void main(String args[])	throws IOException
	{
		String s = "" , x = "" ;
		
		String[] check_dept = { "cseCSE","mecMEC","eeeEEE","eceECE" } ; 
		
		String[] check_yr = { "17","18","19","20","21" } ;
		
		int i = 0 , flg = 0 , r = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\nEnter Register number : ") ;

		s = br.readLine() ;
		
		x = s.substring(0,2) ;
		
		for(i = 0 ; i < 5 ; ++i)
		{
			if( check_yr[i].contains(x) )
			{
				flg = 1 ;
				System.out.println( "YEAR : " + check_yr[i] ) ;
				break ;
			}	
		}
		
		x = s.substring(2,5) ;
		
		if(flg == 1)
		{
			flg = 0 ;
			
			for(i = 0 ; i < 4 ; ++i)
			{
				if( check_dept[i].contains(x) )
				{
					flg = 1 ;
					System.out.println( "DEPT : " + x ) ;
					break ;
				}
			}
		}
		
		else
			System.out.println("Invalid *.*") ; 
		
		if( flg == 1 )
		{
			x = s.substring(5,9) ;
			
			r = Integer.parseInt(x) ;
			
			if( (r > 0) && (r < 10000) )
				System.out.println("ROLL : " + r ) ;
			
			else
				System.out.println("ROLL  : Invalid *.* ") ;
		} 
		
		else
			System.out.println("Invalid *.* ") ;
	}
}