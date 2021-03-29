import java.io.* ;

class anagram
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		String s1 = "" , s2 = "" ;
		
		System.out.print("\nEnter String 1 : ") ;	s1 = br.readLine() ;
		
		System.out.print("\nEnter String 2 : ") ;	s2 = br.readLine() ;
		
		if(AnagramCheck(s1,s2) == 1)
			System.out.println("\nThey are Anagram\n\n") ;
		
		else
			System.out.println("\nThey are NOT Anagram\n\n") ;
	}
	
	public static int AnagramCheck(String s1,String s2)
	{
		int ln1 = s1.length() , ln2 = s2.length() ,cnt = 0 ;
		
		if( ln1 == ln2 )
		{
			for(int i = 0 ; i < ln1 ; i++)
			{
				if( s1.contains(Character.toString( s2.charAt(i) ) ) )
					cnt++ ;
			}
			
			if(cnt == ln1)
				return(1) ;
		}
		return(0) ;
	}
}