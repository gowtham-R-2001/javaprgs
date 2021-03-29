import java.io.* ;

class palind1
{
	public static void main(String args[])	throws IOException
	{
		String a = "" ;
		
		String b = "" ;
		
		char[] c = new char[40] ;
		
		char[] d = new char[40] ;
		
		int i = 0 , ln  = 0 , lnn = 0  , j = 0 , flg = 0 , big = 0 ;
		
		BufferedReader br =  new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter String 1 : ") ;
		
		a = br.readLine() ;
		
		System.out.print("\n\nEnter String 2 : ") ;
		
		b = br.readLine() ;
		
		c = a.toCharArray() ;  
		
		d = b.toCharArray() ;  
		
		ln = a.length() ;
		
		lnn = b.length() ;
		
		if(ln >= lnn)
			big = ln ;
		
		else
			big = lnn ;
		
		if(ln != lnn)
		{
			System.out.print("\n\nStrings are not same") ;
			
			System.exit(0) ;
		}
		
		for(i = 0 , j = 0 ; i < ln ; i++ , j++)
		{	
			if( c[i] != d[j] )
			{
				System.out.print("\n\nStrings are not same") ;
				flg = 1 ;
				break ;
			}
		}
		
		if(flg == 0)
			System.out.print("\n\nStrings are same") ;
	}
}