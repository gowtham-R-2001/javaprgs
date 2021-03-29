import java.io.* ;

class pattern9
{
	public static void main(String args[])	throws IOException
	{
		int i = 0 , j = 0 , k = 0 , n = 10 , m = 0 ;
		
		for(i = 1 ; i <= n ; i++)
		{
			for(k = n-i ; k >= 1 ; k--)
			{
				System.out.print(" ") ;
			}
			
			for(j = 1 ; j <= i ; j++)
			{
				System.out.print(j) ;
			}
			
			for(m = j-2 ; m >= 1 ; m--)
			{
				System.out.print(m) ;
			} 
			
			System.out.print("\n") ;
		} 
		
		i = j = k = m = 0 ;
		
		for(i = 9 ; i >= 1 ; i--)
		{
			for(k = n-i ; k >= 1 ; k--)
			{
				System.out.print(" ") ;
			}
			
			for(j = 1 ; j <= i ; j++)
			{
				System.out.print(j) ;
			}
			
			for(m = j-2 ; m >= 1 ; m--)
			{
				System.out.print(m) ;
			} 
			
			System.out.print("\n") ;
		}
	}
}