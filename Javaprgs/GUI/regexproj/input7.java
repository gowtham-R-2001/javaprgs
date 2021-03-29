import java.io.* ;

import java.util.regex.* ;

class input7
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
		
		for(int i = 0 ; i < ln ; i++)
		{
			if(i == ln-1)	
				s2 = s2 + strarr[i] ;
			
			else	
				s2 = s2 + strarr[i] + "%20" ;
		}
			
	
		System.out.println("ANS : " + s2) ;
	}
}