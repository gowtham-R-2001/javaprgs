import java.io.* ;

import java.util.regex.* ;

class eggs
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		String s = "" ;
		
		String regexpat = "((.*)(egg|eggs)(.*))" ;
		
		System.out.print("Enter String : ") ;	s = br.readLine() ;
		
		Pattern p = Pattern.compile(regexpat,Pattern.CASE_INSENSITIVE ) ;
		
		Matcher m = p.matcher(s) ;
		
		boolean result = m.matches() ;
		
		if(result)
			System.out.println("It have egg|eggs") ;
		
		else
			System.out.println("They NOT have egg|eggs") ;
	}
}