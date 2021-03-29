import java.io.* ;

class Zoho1
{
	public static int n = 0 ;
	public static void main(String args[])
	{
		int[] a = {6,5,4,2,3,1,7} ;
		int[] b = new int[7] ;
		int[] c = new int[7] ;
		
		System.arraycopy(a, 0, b, 0, 7);
		System.arraycopy(a, 0, c, 0, 7);
		sort(b,c) ;
		
		int x = 0 ;
		
		for(int i = 0 ; i < 7 ; i++)
		{
			if( i % 2 == 0)
				a[i] = c[x] ;
			else
			{
				a[i] = b[x] ;
				x++ ;
			}
		}
		
		for(int i = 0 ; i < 7 ; i++)
			System.out.print(a[i]+" ") ;
	}
	
	public static void sort(int[] b,int[] c)
	{
		int temp = 0  ;
		
		for(int i = 0 ; i < 7 ; i++)
		{
			for(int j = i+1 ; j < 7 ; j++)
			{
				if( b[i] > b[j] )
				{
					temp = b[i] ;
					b[i] = b[j] ;
					b[j] = temp ;
				}
			}
		}
		for(int i = 0 ; i < 7 ; i++)
		{
			for(int j = i+1 ; j < 7 ; j++)
			{
				if( c[i] < c[j] )
				{
					temp = c[i] ;
					c[i] = c[j] ;
					c[j] = temp ;
				}
			}
		}
	}
}