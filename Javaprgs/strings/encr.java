import java.io.* ;

class encr
{
	public static void main(String args[])	throws IOException
	{	
		String[] s1 = new String[50] ;
		
		String s = "" ;
		
		int i = 0 , x = 0 , key = 0 , opt = 0 ;
		
		char v ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.println("\n\nCode            Operations ") ;
		
		System.out.println("------------------------") ;
		
		System.out.println("  1             ENCRYPTION") ;
		
		System.out.println("  2             DECRYPTION") ;
		
		System.out.println("------------------------") ;
		
		System.out.print("\t\tEnter CODE : ") ;				
		
		opt = Integer.parseInt( br.readLine() ) ;
		
		if(opt == 1)
		{
				System.out.print("\nEnter Message : ") ;	   	    	s = br.readLine() ;
				
				System.out.print("\nEnter ENCRYPTION key : ") ; 		key = Integer.parseInt( br.readLine() ) ;
				
				encryption(s,key,s1) ;
		}
		
		else if( opt == 2 )
		{
				System.out.print("\nEnter Message : ") ;	   	    	s = br.readLine() ;
				
				System.out.print("\nEnter ENCRYPTION key : ") ; 		key = Integer.parseInt( br.readLine() ) ;
				
				decryption(s,key,s1) ;
		}
		
		else
			System.out.println("\n\n\t\tInvalid input *.*") ;
	}
	
	public static void encryption( String s , int key , String[] s1)
	{
			int i = 0 , x = 0 ;
			
			char v ;
			
				while( key > 5 )
						key -= 5 ;
				
				System.out.print("\nYour ENCRYPTED message :  ") ;
				
				for(i = 0 ; i < s.length() ; i++)
				{
					if( s.charAt(i) == 32 )
						x = (int)s.charAt(i) ;
					
					else
						x =  (int)s.charAt(i) + key ;

					if( (x > 122) || (x > 90 && x < 97 ) )
						x -= 26 ;
					
					v = (char)x ;
					
					s1[i] = Character.toString(v) ;
					
					System.out.print(s1[i]) ;
				}
				
					System.out.print("\n\n") ;
	}
	
	public static void decryption( String s , int key , String[] s1 )
	{
		int i = 0 , x = 0 ;
			
		char v ;
		
				while( key > 5 )
						key -= 5 ;
					
				System.out.print("\nYour DECRYPTED message :  ") ;
				
				for(i = 0 ; i < s.length() ; i++)
				{
					if( s.charAt(i) == 32 )
						x = (int)s.charAt(i) ;
					
					else
						x =  (int)s.charAt(i) - key ;
					

					if( (x > 122) || (x > 90 && x < 97 ) )
						x += 26 ;
					
					v = (char)x ;
					
					s1[i] = Character.toString(v) ;
					
					System.out.print(s1[i]) ;
				}
				
					System.out.print("\n\n") ;
	}
}