import java.io.* ;

class bigcls
{
	public int func(int input)	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
	
		input = Integer.parseInt( br.readLine() ) ;
		
		return(input) ;
	}
	
	public int big(int n1,int n2) 	
	{
		return( (n1 >= n2) ? n1 : n2) ;
	}
	
	public int big(int n1 , int n2 , int n3) 
	{	
		int b = 0 ;

		if(n1 > n2)
			b = n1 ;
		
		else
			b = n2 ;
		
		return( (n3 >= b) ? n3 : b ) ;	
	}
}