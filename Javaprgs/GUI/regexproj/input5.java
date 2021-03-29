import java.io.* ;

import java.util.regex.* ;

class input5
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		String s = "" ;
		
		//String regexpat = "(([a-z[A-Z[0-9[!|@|#|$|%|&]+]+]+]+){3,})" ;
		
		//String regexpat = "(([a-z[A-Z[0-9(!|@|#|$|%|&)+]+]+]+){3,})" ;
		
		//"(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\S+$).{8,}"
		
		String regexpat = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[~!@#$%^&+=])(?=\\S+$).{8,}" ;
	
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