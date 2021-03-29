import java.io.* ;

import java.util.regex.* ;

class chennum
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		String s = "" ;
		
		String regexpat = "(.*)([0-9]{10}|chennai)(.*)([0-9]{10}|chennai)(.*)" ;
		
		//String regexpat = "(.*)([0-9]{10}|chennai)(.*)" ;
		
		System.out.print("Enter string : ") ;
		
		s = br.readLine() ;
		
		Pattern p = Pattern.compile(regexpat,Pattern.CASE_INSENSITIVE) ;
		
		Matcher m = p.matcher(s) ;
		
		boolean result = m.matches() ;
		
		if( result )
			System.out.println("\nValid\n\n") ;
		
		else
			System.out.println("\nInvalid\n\n") ;
	}
}