import java.io.* ;

import java.util.regex.* ;

class input
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		String s = "" ;
		
		String regexpat = "[a-ip-z]*" ;
	
		System.out.print("\nEnter String :  ") ;	s = br.readLine() ;
		
		Pattern p = Pattern.compile(regexpat) ;
		
		Matcher m = p.matcher(s) ;
		
		boolean result = m.matches() ;
		
		if(result)
			System.out.println("valid") ;
		
		else
			System.out.println("Invalid") ;
	}
}