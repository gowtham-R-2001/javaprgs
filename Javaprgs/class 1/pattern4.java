import java.io.* ;

class pattern4
{
	public static void main(String args[])	throws IOException
	{
		int i = 0 , j = 0 , n = 5 ;
		
		for(i = 0 ; i < n ; i++)
		{
			for(j = 0 ; j < n ; j++)
			{
				System.out.print("*") ;
			}
			System.out.print("\n") ;
		}
	}
}