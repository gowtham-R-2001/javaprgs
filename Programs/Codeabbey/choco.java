import java.io.* ;

class choco
{
	public static void main(String args[])	throws IOException
	{
		int n = 0 , i = 0 , cnt = 0 , s = 0 , flg = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		n = Integer.parseInt( br.readLine() ) ;
		
		int a[] = new int[n+1] ;
		
		int b[] = new int[n+1] ;
		
		for(i = 0 ; i < n ; i++)
		{
			a[i] = Integer.parseInt( br.readLine() ) ;
			b[i] = 1 ;
		}
		for(i = 0 ; i < n ; i++)
		{
	
		}
		
		while(cnt != n)
		{
			cnt = 0 ;
				
			for(i = 0 ; i < n ; i++)
			{
				if( (a[i+1] > a[i]) && (flg == 0) )
				{
					b[i+1] += b[i] ;
				}
			
				if(b[i] == b[i+1])
				{
					if(a[i] > a[i+1])
						b[i] += 1 ;
					
					else if(a[i+1] > a[i])
						b[i+1] += 1 ;
				}
				
				else
					cnt++ ;
			}
			flg = 1 ;
		}
		
		for(i = 0 ; i < n ; i++)
			s += b[i] ;
		
		System.out.println(s) ;
	}
}