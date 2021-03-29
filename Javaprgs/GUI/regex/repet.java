import java.io.* ;

import java.util.regex.* ;

class repet
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		String s = "" ;
		
		String regexpat = "(.*)(00|11|22|33|44|55|66|77|88|99)(.*)" ;
	
		System.out.print("Enter string : ") ;
		
		s = br.readLine() ;
		
		Pattern p = Pattern.compile(regexpat,Pattern.CASE_INSENSITIVE) ;
		
		Matcher m = p.matcher(s) ;
		
		boolean result = m.matches() ;
		
		if( result )
			System.out.println("\nIt has 2 numbers near to each other\n\n") ;
		
		else
			System.out.println("\nIt NOT has 2 numbers near to each other\n\n") ;
	}
}
