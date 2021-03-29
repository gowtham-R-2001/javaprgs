import java.io.* ;

class strcnt
{
	public static void main(String args[])	throws IOException
	{
		String s = "" , x = "" ;
		
		//String vow = "a_e_i_o_u_A_E_I_O_U" ;
		
		String vow = "aeiouAEIOU" ;
		
		char[] a = new char[30] ;
		
		char m ;
		
		int i = 0 , vowels = 0 , cons = 0 , space = 0 , tot = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\nEnter String : ") ; 

		s = br.readLine() ;
				
		for(i = 0 ; i < s.length() ; ++i)
		{	
			//x = s.substring(i,i+1) ;
			
			m = s.charAt(i) ;
			
			x = Character.toString(m) ;	// to convert character to string
			
			System.out.println(x) ;
			
			if ( vow.contains(x) )
				vowels++ ;
		}  
		
		//tot = vowels + cons + space ;
		
		System.out.println("Vowels : " + vowels) ;	//System.out.println("Consonants : " + cons) ;
		
		//System.out.println("Spaces : " + space) ;	System.out.println("Total characters : " + tot)  ;	
		
	}
}