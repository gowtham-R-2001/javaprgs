import java.io.* ;

class fib
{
	public static void main(String args[])	throws IOException
	{
		int f1 = -1 , f2 = 1 , temp = 0 , cnt = 0 ,  n = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter input : ") ;
		
		n = Integer.parseInt( br.readLine() ) ;
		
		func(n,f1,f2,temp,cnt) ;
	}
	
	public static void func(int n,int f1,int f2,int temp,int cnt)
	{
		if( cnt == n )
			System.exit(0) ;
		
		temp = f1 + f2 ;
		f1 = f2 ;
		f2 = temp ;
		
		System.out.print("\n\t" + temp ) ;
		
		cnt++ ;
		
		func(n,f1,f2,temp,cnt) ;
	}
}