import java.io.* ;

import java.util.regex.* ;

class regexeg
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;

		String s = "" ;

		//String regexpat = "(((18)(cs|CS))([0-9]{3}))" ;
		
		//String regexpat = "(((17|18|19|20)(cs|CS))([0-9]{3}))" ;
		
		String regexpat = "(((17|18|19|20)(cs|mech|civil|it|ece|eee))([0-9]{3}))" ;
		
		System.out.println("Enter String : ") ;

		s = br.readLine() ;

		Pattern p = Pattern.compile(regexpat,Pattern.CASE_INSENSITIVE) ;
		
		//Pattern p = Pattern.compile(regexpat) ;

		Matcher m = p.matcher(s) ;
		

		boolean result = m.matches() ;

		if( result )
			System.out.println("Available") ;

		else
			System.out.println("NOT Available") ;
	}
}