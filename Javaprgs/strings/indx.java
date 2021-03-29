import java.io.* ;

class indx
{
	public static void main(String args[])	throws IOException
	{
		String s = "" ;
		
		char[] a = new char[40];
		
		char n ;
		
		int i = 0 , flg = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
				
		System.out.print("\n\nEnter string : ") ;
		
		s = br.readLine() ;
		
		System.out.print("\n\nEnter char : ") ;
		
		n = br.readLine().charAt(0) ;		
		
		a = s.toCharArray() ;

		for(i = 0 ; i < a.length ; i++ )
		{
			if( a[i] == n )
			{
				System.out.print( "\n\n\t\tPosition : " + i + "\n\n" ) ;
				flg = 1 ;
				break ;
			}
		}
		
		if(flg == 0)
			System.out.print("\n\nNot found *.*") ;
	}
}