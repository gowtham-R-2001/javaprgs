import java.io.* ;

import java.lang.* ;

class hextodec
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		String s1 = "" ;
		
		System.out.print("\n\nEnter Hexadecimal value : ") ;		
		
		s1 = br.readLine() ;
		
		System.out.println("\n\nDECODED RESULT : " + hextodec(s1) ) ;
		
		System.out.println("\n\n\n\t\t * PROGRAM DONE BY GOWTHAM * \n\n") ;
	}
	
	public static long hextodec(String s)
	{
		String x = "" , z = "0123456789ABCDEF" ;
		
		long ans = 0 , ans1 = 0 , num = 0 , ind = 0 ;
		
		int cnt = 0 , n = 0 ;
		
		n = s.length() ;
		
		for(int i = n-1 ; i >= 0 ; i--)
		{
			x = Character.toString( s.charAt(cnt++) ) ;
			
			ind = z.indexOf(x) ;
			
			if( (ind >= 0) && (ind <= 9) )
			{
				num = Integer.parseInt(x) ;
				ans = (long) (num * Math.pow(16,i) ) ;
			}
			
			else
				ans = (long) (ind * Math.pow(16,i) ) ;
			
			ans1 += ans ;
		}
		
		return(ans1) ;
	}
}