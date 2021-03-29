import java.io.* ;

import java.util.regex.* ;

class email
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		String s = "" ;
		
		String regexpat = "([a-z])(.*)(@)([a-z]*)([.])(co.in|com)" ;
	
		System.out.print("\nEnter your e-mail id :  ") ;

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