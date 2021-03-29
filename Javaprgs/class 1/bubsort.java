import java.io.* ;

import java.util.Scanner ;

class bubsort
{
	public static void main(String args[])	throws IOException
	{
		Scanner s = new Scanner(System.in) ;
		
		int a[] = new int[10] ;
		
		int i = 0 , temp = 0 , k = 1 , j = 0 ;
		
		for(i = 0 ; i < 10 ; i++)
		{
			System.out.print("\nEnter number " + k++ + " : " ) ;
			
			a[i] = s.nextInt() ;
		}
		
		for(i = 0 ; i < 10 ; i++)
		{
			for(j = i+1 ; j < 10 ; j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i] ;
					a[i] = a[j] ;
					a[j] = temp ;
				}					
			}
		}
		
		for(i = 0 ; i < 10 ; i++)
		{
			System.out.println(a[i]) ;
		}
	}
}