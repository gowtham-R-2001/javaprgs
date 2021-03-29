import java.io.*;
import java.util.regex.*;

class regpwd
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;

		String s = "" ;

		System.out.print(" Enter PWD :  ")  ;
		s = br.readLine() ;

		String ptn1 = "(([a-zA-Z]+[0-9]+[~!@#&\\$%\\^\\*]+)|";
		String ptn2 = "([a-zA-Z]+[~!&@#\\$%\\^\\*]+[0-9]+)|" ;
		String ptn3 = "([0-9]+[a-zA-Z]+[~!@&#\\$%\\^\\*]+)|" ;
		String ptn4 = "([0-9]+[~!@&#\\$%\\^\\*]+[a-zA-Z]+)|" ;
		String ptn5 = "([~!@&#\\$%\\^\\*]+[0-9]+[a-zA-Z]+)|" ;
		String ptn6 = "([~!@&#\\$%\\^\\*]+[a-zA-Z]+[0-9]+))" ;
		String ptn  = ptn1 + ptn2 + ptn3 + ptn4 + ptn5 + ptn6 ;

		Pattern p = Pattern.compile(ptn) ;
		Matcher m = p.matcher(s) ;
		boolean result = m.matches() ;

		if(result)
			System.out.println(" Valid ") ;
		else
			System.out.println(" Invalid  ") ;
	}
}