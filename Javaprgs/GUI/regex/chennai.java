import java.io.* ;

import java.util.regex.* ;

class chennai
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		String s = "" ;
		
		String regexpat = "(.*)(chennai)(.*)" ;
		
		System.out.print("Enter string : ") ;
		
		s = br.readLine() ;
		
		Pattern p = Pattern.compile(regexpat,Pattern.CASE_INSENSITIVE) ;
		
		Matcher m = p.matcher(s) ;
		
		boolean result = m.matches() ;
		
		if( result )
			System.out.println("Chennai is Present in the string") ;
		
		else
			System.out.println("Chennai is NOT Present in the string") ;
	}
	
}