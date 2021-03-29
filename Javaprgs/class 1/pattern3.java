import java.io.* ;

class pattern3
{
	public static void main(String args[])	throws IOException
	{
		int i = 0 , j = 0 , n = 10 ;
		
		for(i = 1 ; i <= n ; i++)
		{
			for(j = 1 ; j <= n ; j++)
			{
				if(i == 1 || i == n || j == 1 || j == n)
				{
					System.out.print("*") ;
				}
				else
					System.out.print(" ") ;
			}
			System.out.print("\n") ;
		}
	}
}