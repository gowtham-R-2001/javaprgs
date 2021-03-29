import java.io.* ;

class pattern8
{
	public static void main(String args[])	throws IOException
	{
		int i = 0 , j = 0 , n = 5 , k = 0 ;
		
		for(i = 1 ; i <= n ; i++)
		{	
			for(k = n-i ; k >= 1 ; k--)
			{
				System.out.print(" ") ;
			}
			
			for(j = 1 ; j <= n ; j++)
			{
				if(i == 1 || j == 1 || j == n || i == n )
					System.out.print("*") ;
				
				else
					System.out.print(" ") ;
			}
			System.out.print("\n") ;
		}
	}
}