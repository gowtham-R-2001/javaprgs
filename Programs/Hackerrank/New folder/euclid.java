import java.io.* ;

class euclid
{
	public static void main(String args[])
	{
		int[] prime = new int[100] ;
		
		for(int i = 0 ; i < 100 ; i++)
			prime[i] = i+1 ;
		
		for(int i = 2 ; i <= 10 ; i++)
		{
			for(int j = 0 ; j < 100 ; j++)
			{
				if( i != prime[j] )
				{
					if( prime[j] % i == 0 )
						prime[j] = 0 ;
				}
			}
		}
		for(int j = 0 ; j < 100 ; j++)
		{
			if( prime[j] != 0 )
				System.out.println( prime[j] ) ;
		}
	}
}