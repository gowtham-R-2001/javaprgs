package mymath ;

public class mymathx
{
	public static int add(int n1,int n2)
	{
		return(n1 + n2) ;
	}
	
	public static int sub(int n1,int n2)
	{
		return(n1 - n2) ;
	}
	
	public static int mul(int n1,int n2)
	{
		return(n1 * n2) ;
	}
	
	public static float div_q(int n1,int n2)
	{
		return(n1 / n2) ;
	}
	
	public static int div_r(int n1,int n2)
	{
		return(n1 % n2) ;
	}
	
	public static int fact(int n)
	{
		int i = 1 , f = 1 ;
		
		for(i = 1 ; i <= n ; ++i)
		{
			f = f * i ;
		}
		
		return(f) ;
	}
	
	public static int gcd(int n1,int n2)
	{
		int big = 0 , small = 0 , r = 0 ;
		
		big = (n1 >= n2) ? n1 : n2 ;
		
		small = (n1 <= n2) ? n1 : n2 ;
		
		while(true)
		{
			r = big % small ;
			
			if(r == 0)
				break ;
				
			else
			{
				big =  small ;
				small = r ;
			}
		}
		
		return(small) ;	
	}
}