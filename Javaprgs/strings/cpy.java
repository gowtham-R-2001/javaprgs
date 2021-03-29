import java.io.* ;

class cpy
{
	public static void main(String args[]) throws IOException
	{
		String s = "" , r1 = "" , r2 = "" ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\nEnter String : ") ;  s = br.readLine() ;
		
		System.out.print("\nEnter the word to replace : ") ;  r1 = br.readLine() ;
		
		System.out.print("\nEnter new word : ") ;  r2 = br.readLine() ;
		
		s = s.replace(r1,r2) ;
		
		System.out.println(s) ;
	}
}