import java.io.* ;

class pattern10
{
	public static void main(String args[])	throws IOException
	{
		int i = 0 , j = 0 , m = 0 , k = 0 , n = 5 ;
		
		for(i = 1 ; i <= n ; i++ )
		{
			for(k = n-i ; k >= 1 ; k--)
			{
				System.out.print(" ") ;
			}
			
			for(j = 1 ; j <= i ; j++)
			{
				System.out.print("*") ;
			}
			
			for(m = j-2 ; m >= 1 ; m--)
			{
				System.out.print("*") ;
			}
			
			System.out.print("\n") ;
		}
	}
}