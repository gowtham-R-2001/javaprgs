import java.io.* ;

class maths
{
	public static void main(String args[])	throws IOException
	{
		int a = 0 , b = 0 , ans = 0 , i = 0 ;
		
		for(a = 1 ; a <= 100 ; a++)
		{
			for( b = 1 ; b <= 100 ; b++)
			{
				if( ( (a * b) == 1920 ) && ( (a + b) == 92 ) )
				{
					System.out.print( "A : " + a + " B : " + b ) ;
					break ;
				}
			}
		}
	}
}