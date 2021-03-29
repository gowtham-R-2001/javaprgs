import java.io.* ;

import java.util.regex.* ;

class spechar
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		String s1 = "" , s2 = "" ;
		
		//String special_char = "!@#$%^&*()_=<>/`~" ;
	
		System.out.print("\nEnter String :  ") ;

		s1 = br.readLine() ;
		
		/*for(int i = 0 ; i < s1.length() ; ++i)
		{
			if( !(special_char.contains( Character.toString( s1.charAt(i) ) ) ) )
				s2 = s2 + Character.toString( s1.charAt(i) ) ;
		}
		
		System.out.println("Ans : " + s2 ) ; */
		
		s2 = s1.replaceAll("[&_@_$_%_^_&_*_(_)_=_<_>_/_`_~]","") ;
		
		System.out.println("ANS : " + s2) ;
	}
}