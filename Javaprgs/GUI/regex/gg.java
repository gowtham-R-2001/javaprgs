import java.io.* ;

import java.util.regex.* ;

class gg
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		String s = "" ;
		
		String regexpat = "((.*)(gg)(.*))" ;
		
		System.out.print("Enter String : ") ;	s = br.readLine() ;
		
		/*for(int i = 0 ; i < s.length() ; i++ )
		{
			if( g.contains( Character.toString( s.charAt(i) ) ) &&  g.contains( Character.toString( s.charAt(i+1) ) )  )
			{
				flg = 1 ;
				break ;
			}
		}
		if(flg == 1)
			System.out.println("It have 2 g's") ;
		
		else
			System.out.println("It NOT have 2 g's") ; */
		
		Pattern p = Pattern.compile(regexpat,Pattern.CASE_INSENSITIVE ) ;
		
		Matcher m = p.matcher(s) ;
		
		boolean result = m.matches() ;
		
		if(result)
			System.out.println("They have 2 g's") ;
		
		else
			System.out.println("They NOT have 2 g's") ;
	}
}