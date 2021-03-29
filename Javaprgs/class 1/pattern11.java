import java.io.* ;

class pattern11
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		
		String s = "" ;
		
		s = br.readLine() ;
		
		int ln = s.length() ;

		for(int i = 0 ; i < ln ; i++)
		{
			int j = ln-1-i ;
			
			for(int k = 0 ; k < ln ; k++)
			{
				if(k == i || k == j)
					System.out.print( s.charAt(k) ) ;
				else
					System.out.print(" ") ;
			}
			System.out.println() ;
		}
	}
}