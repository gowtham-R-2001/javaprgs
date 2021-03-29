
import java.io.* ;

class strngs
{
	public static void main(String args[])	throws IOException 
	{
		String s1 = "" , s2 = "" , s3 = "" ;
		
		char c , index ;
		
		char[] a = new char[30] ;
		
		String[] s = new String[10] ; 
		
		char[][] y = new char[30][30] ;
		
		int ln = 0 , i = 0 , k = 0 , cnt = 0 ;
	
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\nEnter String 1 : ") ;
		
		s1 = br.readLine() ;
		
		/*System.out.print("\nEnter String 2 : ") ;
		
		s2 = br.readLine() ;
		
		ln = s1.length() ;
		
		System.out.println("\nLength : " + ln ) ; */		// length of the array
		
		/*c = s.charAt(0) ;
		
		System.out.println ("character : " + c) ; // character 
		
		System.out.print("\nEnter char : ") ;	index = br.readLine().charAt(0) ;	// Index of the given char
		
		System.out.println( "Index : " + s.indexOf(index) ) ;	
		
		System.out.println( "last Index : " + s.lastIndexOf(index) ) ;  // Index of the given char but it count from the last (REVERSE ORDER)
		
		a = s.toCharArray() ;
		
		for(i = 0 , k = ln-1 ; i < ln ; i++ , k--)
		{
			if(a[i] == a[k] )
				cnt++ ;
			
			if(cnt == ln)
				break ;
		}
				
		if(cnt == ln)
			System.out.println("PALINDROME") ;
		
		else
			System.out.println("NOT A PALINDROME") ; 
		
		if( s.equals(s1) )
			System.out.println("Both are SAME ") ;
		
		else
			System.out.println("Both are NOT SAME ") ; 
		
		if( s.equalsIgnonoreCase(s1) )
			System.out.println("Both are SAME ") ;
		
		else
			System.out.println("Both are NOT SAME ") ; 
		
		System.out.println( s1.substring(1,3) ) ;	//starting from the 1st upto 5th but not includes 5th index
		
		/*if( s1.compareTo(s2) == 0 )
			System.out.println("Both are SAME ") ;		// it also has ignore case
		
		else if(s1.compareTo(s2) > 0 )
			System.out.println("S2 comes first") ; 
		
		else
			System.out.println("S1 comes first") ; 
		
		s1 = String.join("sakthi","siva") ;
		
		System.out.println("" + s1) ; 
		
		if( s1.contains(s2) )  // substring
			System.out.println("The string is contained in s1") ;
		
		else
			System.out.println("The string is not contained in s1") ; 
		
		if ( str.contains("a_A_e_") )
		
		if(s1.isEmpty() ) // to check the input is empty
			System.out.println("Please input a value") ;

		else
			System.out.println("Hello " + s1 ) ; */
		
		s = s1.split(" ") ; // to split the array if blankpace presents 
		
		for(String x : s ) 	// enhanced for loop (or) for each loop
			System.out.println(x) ;
		
		/*s2 = s1.replace('a','A') ; // if we replace the character or string,we want to store in a seperate array

		System.out.println(s2) ; */
	}
}