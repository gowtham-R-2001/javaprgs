import java.io.* ;

class pattern2
{
	public static void main(String args[])	throws IOException
	{
		int i = 0 , j = 0 , a = 0  , n = 10;
		
		for(i = 0 ; i < n ; i++)
		{
			a = 10-i ;
			
			for(j = 0 ; j < n-1 ; j++)
			{
				System.out.print(" ") ;
			}
			for(j = 0 ; j < i ; j++)
			{
				System.out.print(a) ;
				a++ ;
			}
			System.out.print("\n") ;
		} 
		
	}
}