import java.io.* ;

class recur
{
	public static void main(String args[])	throws IOException
	{
		int f1 = -1 , f2 = 1 , temp = 0 , cnt = 0 , n = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter Input : ") ;
		
		n = Integer.parseInt( br.readLine() ) ;
		
		func(f1,f2,temp,n,cnt) ;
	}
	
	public static void func(int f1,int f2,int temp,int n,int cnt)
	{	
		if(cnt == n )
			System.exit(0) ;
		
		temp = f1 + f2 ;
		
		f1 = f2 ;
		
		f2 = temp ;
		
		System.out.println(temp) ;
		
		cnt++ ;
		
		func(f1,f2,temp,n,cnt) ;
	}
}