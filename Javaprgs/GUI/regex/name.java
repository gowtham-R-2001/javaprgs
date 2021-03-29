import java.io.* ;

import java.util.regex.* ;

class name
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		String s = "" ;
		
		String regexpat = "(^My)( .*)([.]$)" ;
	
		System.out.print("\nWhat is your name ?   :  ") ;
		
		s = br.readLine() ;
		
		Pattern p = Pattern.compile(regexpat) ;
		
		Matcher m = p.matcher(s) ;
		
		boolean result = m.matches() ;
		
		if( result )
			System.out.println("\nValid \n\n") ;
		
		else
			System.out.println("\nInvalid\n\n") ;
	}
}