/*

 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *
 
 
 */

import java.io.* ;

class pattern
{
	public static void main(String args[]) 	throws IOException
	{
		int i = 0 , j = 0 , n = 0 ; 
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter input : ") ;
		
		n = Integer.parseInt( br.readLine() ) ;
		
		for(i = 1 ; i <= n ; i++)
		{
			for(j = i ; j >= 1 ; j-- )
			{
				System.out.print(" * ") ;
			}
			
			System.out.print("\n") ;
		}
	}
}
