import java.io.* ;

class krshmthy
{
	public static void main(String args[])		throws IOException
	{
			int i = 0 , n = 0 , j = 0 , m = 0 , ans1 = 0 ; 
			
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
			System.out.print("\n\nEnter input : ") ;
		
			n = Integer.parseInt( br.readLine() ) ;
		
			m = n ;
			
			ans1 = rev(n) ;
			
			if( ans1 == n )
				System.out.print( n + " is a krishnamurthy number o_O" ) ;
			
			else
				System.out.print( n + " is not a krishnamurthy number *.*" ) ;
	}
	
	public static int rev(int n)
	{
		int s = 0 , r = 0 , ans = 0 , sum = 0 ;
		
		while( n > 0 )
		{
			r = n % 10 ;
					
			ans = fact(r) ;
			
			//System.out.println("\n\t\tF : " + ans ) ;
			
			sum = sum + ans ;
			
			//System.out.println("\n\t\t" + sum ) ;
			
			n /= 10 ;
		}
		
		return(sum) ;
	}
	public static int fact(int r)
	{
		int f = 1 , i =  0 ;
		
		for(i = 1 ; i <= r ; i++)
		{
			f = f * i ;
		}
			
		return(f) ;
	}
}