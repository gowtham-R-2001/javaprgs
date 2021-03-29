import java.io.* ;

import java.util.regex.* ;

class input6
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		String s1 = "" , s2 = "" ;
		
		String[] strarr = new String[30] ;
 		
		System.out.println("Enter String : ") ;
		
		s1 = br.readLine() ;
		
		strarr = s1.split(" ") ;
		
		int ln = 0 ;
		
		for( String x : strarr )
			ln++ ;
		
		System.out.println(ln) ;
		
		for(int i = ln-1 ; i >= 0 ; i--)
		{
			if(i == 0)	
				s2 = s2 + strarr[i] ;
			
			else	
				s2 = s2 + strarr[i] + " " ;
		}
			
	
		System.out.println("ANS : " + s2) ;
	}
}