import java.io.* ;

import java.util.regex.* ;

class number
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		String s = "" ;
		
		String regexpat = "(.*)[0-9]{10}(.*)" ;
		
		System.out.print("Enter string : ") ;
		
		s = br.readLine() ;
		
		Pattern p = Pattern.compile(regexpat,Pattern.CASE_INSENSITIVE) ;
		
		Matcher m = p.matcher(s) ;
		
		boolean result = m.matches() ;
		
		if( result )
			System.out.println("\nValid Number\n\n") ;
		
		else
			System.out.println("\nInvalid Number\n\n") ;
	}
}