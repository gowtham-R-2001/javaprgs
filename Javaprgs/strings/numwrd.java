import java.io.* ;

class numwrd
{
	public static void main(String args[])	throws IOException
	{		
		//String[] s = new String[10] ;
		
		String[] s = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"} ;
		
		int num = 0 , r = 0 , i = 0 , ln = 0 ;
		
		int[] a = new int[20] ;
	
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;

		System.out.print("\nEnter number : ") ;	num = Integer.parseInt( br.readLine() ) ;
		
		while(num > 0)
		{
			r = num % 10 ;
			
			a[i++] = r ;
			
			num /= 10 ;
		}
		
		ln = i ;
		
		for(i = ln-1 ; i >= 0 ; --i)
			System.out.print( s[ a[i] ] ) ; 
	}
}