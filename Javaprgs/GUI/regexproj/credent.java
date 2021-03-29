import java.io.* ;

import java.util.regex.* ;

class credent
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		
		String username = "" , password = "" ;
		
		String usernamepat = "^[a-zA-Z][a-zA-Z0-9._-]{3,10}$" ;
		
		String passwordpat = "([a-zA-z0-9!@#$%&]{7,14})" ;
		
		//System.out.print("\nEnter username : ") ;		username = br.readLine() ;
		
		System.out.print("\nEnter password : ") ;		password = br.readLine() ;
		
		
		//Pattern p = Pattern.compile(usernamepat) ;
		
		//Matcher m = p.matcher(username) ;
		
		//boolean username_result = m.matches() ;
		
		
		Pattern p1 = Pattern.compile(passwordpat) ;
		
		Matcher m1 = p1.matcher(password) ;
		
		boolean password_result = m1.matches() ;
		
		/*if(username_result)
			System.out.println("\nUsername valid") ;
		
		else
			System.out.println("\nUsername Invalid") ;*/
		
		if(password_result)
			System.out.println("\npassword valid") ;
		
		else
			System.out.println("\npassword Invalid") ;
	}
}