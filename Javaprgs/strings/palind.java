import java.io.* ;

class palind
{
	public static void main(String args[])		throws IOException
	{
		String s = "" ;
		
		char[] a = new char[30] ;
		
		int i = 0 , j = 0 , flg = 0 , ln = 0;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter String 1 : ") ;
		
		s = br.readLine() ;
		
		a = s.toCharArray() ;
				
		for(i = 0 , j = a.length-1 ; i < a.length  ; i++ , j-- )
		{
			if(a[i] != a[j])
			{
				flg = 1 ;
				System.out.println("\n\nNot a palindrome *.*") ;
				break ;
			}
		}
		
		if( flg == 0 )
			System.out.println("\n\nit is a palindrome *.*") ;
		
	}
}