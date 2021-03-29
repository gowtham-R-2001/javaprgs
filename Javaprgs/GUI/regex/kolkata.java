import java.io.* ;

import java.util.regex.* ;

class kolkata
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		String s = "" ;
		
		String regexpat = "(.*)(\\bkolkata\\b)(.*)" ;
	
		System.out.print("Enter string : ") ;
		
		s = br.readLine() ;
		
		Pattern p = Pattern.compile(regexpat,Pattern.CASE_INSENSITIVE) ;
		
		Matcher m = p.matcher(s) ;
		
		boolean result = m.matches() ;
		
		if( result )
			System.out.println("\nIt have the word Kolkata\n\n") ;
		
		else
			System.out.println("\nIt NOT have the word Kolkata\n\n") ;
	}
}