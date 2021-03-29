import java.io.* ;

class Zohoa10
{
	public static void main(String args[]) throws IOException
	{
		String s = "" , c = "" ;
		String alp = "abcdefghijklmnopqrstuvwxyz" ;
		String num = "0123456789" ;
		char z = '0';
		int integer1 = 0 , integer2 = 0 ;

		int cnt = 0 ;

		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		s = br.readLine() ;

		//String[] s1 = new String[ s.length() ] ;

		for(int i = 0 ; i < s.length() ; i++)
		{
			c = Character.toString( s.charAt(i) ) ;

			if( alp.contains( c ) )
			{
				z = s.charAt(i) ;
				if( num.contains(Character.toString(s.charAt(i+1))) )
				{
					integer1 = Integer.parseInt(  Character.toString(s.charAt(i+1)) ) ;
					
					if( (i < s.length()-2)  && num.contains(Character.toString(s.charAt(i+2))) )
					{
						integer2 = Integer.parseInt( Character.toString(s.charAt(i+2)) ) ;
						/*if(integer2 == 0)
							integer2 = 1 ;*/
						integer1 = (integer1*10) + integer2;
						i++ ;
					}
					for(int x = 0 ; x < integer1 ; x++)
						System.out.print( z ) ;
					
					i++ ;
					integer1 = 0;
					integer2 = 0 ;
				}
			}
			/*System.out.println( "Z : " + z ) ;
			System.out.println( "Int 1  : " + integer1 ) ;
			System.out.println( "Int 2  : " + integer2 ) ;*/
		}
	}
}