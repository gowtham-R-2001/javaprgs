import java .io.* ;

class round
{
	public static void main(String args[])	throws IOException
	{
		float n1 , n2 , ans , ans1 ;
		
		int fin_ans = 0 , flg = 0 , i = 0 , tst = 0;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\t\t\tRounding values...") ;
		
		System.out.print("\nEnter number of test cases : ") ;
		
		tst = Integer.parseInt( br.readLine() ) ;
		
		int[]a = new int[tst] ;
		
		for(i = 0 ; i < tst ; i++)
		{
		System.out.print("\nEnter number 1 : ") ;
		
		n1 = Integer.parseInt( br.readLine() ) ; 
		
		System.out.print("\nEnter number 2 : ") ;
		
		n2 = Integer.parseInt( br.readLine() ) ; 
		
		ans = n1 / n2 ;
				
		ans1 = ans * 10 ;
		
		if(ans1 < 0)
		{
			flg = 1 ;
			ans1 = -1 * ans1 ;
		}
		
		if( (ans1 % 10) >= 5)
		{
			ans1 = (int)ans1 % 10 ;
			
			if(flg == 1)
				ans1 = -10 + ans1 ;

			else
				ans1 = 10 - ans1 ;
			
			ans  = ans + ans1 / 10 ;
		}
			a[i] = (int)ans ;
		}
		
		for(i = 0 ; i < tst ; i++)
		{
			System.out.println(a[i]) ;
		}
		
	}
}