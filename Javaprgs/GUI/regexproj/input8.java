import java.io.* ;

import java.util.regex.* ;

class input8
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		String s1 = "" , s2 = "" ;
		
		String[] strarr = new String[30] ;
		
		int[] arr = new int[256] ;
 		
		System.out.println("Enter String : ") ;
		
		s1 = br.readLine() ;
		
		for(int i = 0 ; i < s1.length() ; i++)
			arr[s1.charAt(i)]++ ;
		
		for(int i = 0 ; i < s1.length() ; i++)
			System.out.println(arr[s1.charAt(i)]) ;
	}
}