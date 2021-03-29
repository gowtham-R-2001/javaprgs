import java.io.* ;

import java.util.regex.* ;

class reggexeg
{
	public static void main()	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		String s = "" ;
		
		s = br.readLine() ;
		
		Pattern p = Pattern.compile(regexpat,Pattern.CASE_INSENSITIVE) ;
		
		matcher m = p.matcher(s) ;
		
		boolean result = m.matches() ;
		
		if( result )
			System.out.println("Not Available") ;
		
		else
			System.out.println("Available") ;
	}
}