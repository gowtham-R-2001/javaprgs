import java.io.* ;

import java.util.regex.* ;

class landline
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		String s = "" ;
		
		String regexpat = "(.* )(0422)([0-9]{7})( .*)" ;
	
		System.out.print("Enter string : ") ;
		
		s = br.readLine() ;
		
		Pattern p = Pattern.compile(regexpat,Pattern.CASE_INSENSITIVE) ;
		
		Matcher m = p.matcher(s) ;
		
		boolean result = m.matches() ;
		
		if( result )
			System.out.println("\nValid number\n\n") ;
		
		else
			System.out.println("\nInvalid number\n\n") ;
	}
}