import java.io.* ;

class replace1
{
	public static void main(String args[]) throws IOException
	{
		String s = "" , r1 = "" , r2 = "" ;
		
		char[] a , b , c = new char[50] ;
		
		int i = 0 , cnt = 0 , k = 0 , y = 0 , flg = 0 , x = 0 , findex = 0 , lindex = 0 , ln = 0 , newln = 0 , lnn = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\nEnter String : ") ;  s = br.readLine() ;
		
		System.out.print("\nEnter the word to replace : ") ;  r1 = br.readLine() ;
		
		System.out.print("\nEnter new word : ") ;  r2 = br.readLine() ;
		
		a = s.toCharArray() ;	b = r1.toCharArray() ;	c = r2.toCharArray() ;
		
		lnn = c.length ;
		
		ln = a.length ;
		
		for(i = 0 , k = 0 ; i < a.length ; ++i )
		{
				if(b[k] == a[i])
				{
					x = k ;  y = i ;
					
					findex = i ;
					
					while(b[x++] == a[y++])
					{		
							cnt++ ;

							if(cnt == b.length)
							{
								flg = 1 ;
								break ;
							}
					}

				}

				if(flg == 1)
					break ;

				else
					cnt = 0 ;
        }
		
		i = 0 ;	k = 0 ;
		
		//newln = b.length - c.length ;
	
		if(flg == 1)
		{
			if(b.length < c.length)
			{
				for(i = ln-1 ; i >= c.length-1 ; i--)
					a[i] = a[i-1] ;
								
				for(i = findex , k = 0 ; i < c.length ; i++)
					a[i] = c[k++] ;
				
				for(i = 0 ; i < a.length ; i++)
					System.out.print(a[i]) ;
			}
			
			else if(b.length > c.length)
			{
				for(i = c.length-1 ; i < ln ; i++)
					a[i] = a[i+1] ;
				
				for(i = findex , k = 0 ; i < c.length ; i++)
					a[i] = c[k++] ;
				
				for(i = 0 ; i < a.length ; i++)
					System.out.print(a[i]) ;
			} 
			
			else
			{
				
			} 
				
		}
		
		else
			System.out.println( r1 + " is not in the string *.*") ; 
	}
}