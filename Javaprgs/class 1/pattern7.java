import java.io.* ;

class pattern7
{
	public static void main(String args[])	throws IOException
	{
		int i = 0 , j = 0 , k = 0 , n = 5 ;
		
		for(i = 1 ; i <= n ; i++)
		{
			for(k = n-i ; k >= 1 ; k--)
			{
				System.out.print(" ") ;
			}
			
			for(j = 1 ; j <= n ; j++)
			{
				System.out.print("*") ;
			}
			System.out.print("\n") ;
		} 
		
		for(i = 5 ; i >= 1 ; i--)
		{	
			for(k = n-i ; k >= 0 ; k-- )
			{
				System.out.print(" ") ;
			}
			
			for(j = 1 ; j <= n ; j++)
			{
				System.out.print("*") ;
			}
			
			System.out.print("\n") ;
		} 
	}
}