import java.io.* ;

class test4
{	
	public static void main(String args[])	throws IOException
	{	
		for( int i = 1 ; i < 20 ; i++ )
		{
			for( int j = 1 ; j < 20 ; j++)
			{
				for( int k = 1 ; k < 20 ; k++ )
				{
					if( (i % 2 != 0)  && (j % 2 != 0 ) && (k % 2 != 0) )
					{
						func(i,j,k) ;
					}
				}
			}
		}
	}
	
	public static int func(int i,int j,int k)
	{
		if( i + j + k == 30 )
				System.out.println( i + " " + j + " " + k ) ;
	}
}