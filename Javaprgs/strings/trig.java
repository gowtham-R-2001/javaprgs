import java.io.* ;

class trig
{
	public static void main(String args[]) throws IOException
	{
		int x = 0 , i = 0 , limit = 0 , opt = 0 , cnt = 1  ;
		
		float ans = 0.0f , m = 0.0f , f = 0.0f ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ) ;
		
		System.out.print( "\nEnter value of X : " ) ;
		
		x = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\nEnter limit : ") ;
		
		limit = Integer.parseInt( br.readLine() ) ;
		
		System.out.print( "\n\nCODE             OPERATIONS\n\n" ) ;
		
		System.out.println( " 1                   Sinhx  " ) ;
		
		System.out.println( " 2                   Coshx" ) ;
		
		System.out.println( " 3                   Sinx" ) ;
		
		System.out.println( " 4                   Cosx" ) ;
		
		System.out.println( " 5                   eX" ) ;
		
		System.out.print("\n\t\tEnter CODE : ") ;
		
		opt = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\n\n") ;
		
		if( opt == 1 )
		{
			System.out.println("The Answer is : ") ;
			
			for( i = 1 ; i <= limit ; i += 2 )
			{
					m = mul(x,i) ;
					
					f = factorial(i) ;
					
					System.out.print( m + "/" + f + " + " ) ;
					
					ans = ans + m / f ; 
			}
			
			System.out.print("...") ;
		}

		else if( opt == 2 )
		{
			System.out.println("The Answer is : ") ;
			
			for( i = 1 ; i <= limit ; i++ )
			{
				if( i == 1 )
				{
					System.out.print( " 1 + " ) ;
					ans += 1 ;
				}
				
				if( (i % 2 == 0) ) 
				{
					m = mul(x,i)  ;
					
					f = factorial(i) ;
					
					ans += m / f ;
					
					System.out.print( m + "/" + f + " + " ) ;
				}
			}
			
			System.out.print("...") ;
		}
		
		else if( opt == 3 )
		{
			System.out.println("The Answer is : ") ;
			
			for( i = 1 ; i <= limit ; i += 2 )
			{
				m = mul(x,i) ;
				
				f = factorial(i) ;
				
				if(cnt % 2 == 0 )
				{
					ans += m / f ;
					System.out.print( m + "/" + factorial(i) + " + " ) ;
				}
				
				else
				{
					ans -= m / f ;
					
					System.out.print( m + "/" + f + " - " ) ;
				}
				
				cnt++ ;
			}
				
			System.out.print("...") ;
		}
		
		else if( opt == 4 )
		{
			System.out.println("The Answer is : ") ;
			
			System.out.print( " 1 - " ) ;
			
			for( i = 2 ; i <= limit ; i += 2 )
			{
				m = mul(x,i) ;
				
				f = factorial(i) ;
				
				if( (i % 2 == 0) ) 
				{
					if( cnt % 2 == 0 )
					{
						ans += m / f ;
						System.out.print( m + "/" + f + " - " ) ;
					}
					
					else
					{
						ans -= m / f ;
						System.out.print( m + "/" + f + " + " ) ;
					}
				}
				
				cnt++ ;
			}
			
			ans -= 1 ;
			
			System.out.print("...") ;
		}
		
		else if( opt == 5 )
		{
			System.out.print( " 1 + " ) ;
						
			for( i = 2 ; i <= limit ; i++ )
			{
				m = mul(x,i) ;
				
				f = factorial(i) ;
				
				ans += m / f ;
				
				System.out.print( m + "/" + f + " + " ) ;
			}
			
			System.out.print("...") ;
		}
		
		else
			System.out.print("INVALID *.* ") ;
		
		System.out.println("Ans : " + ans ) ;
	
	}
	
	public static int mul( int input,int n )
	{	
		int ans = 1 ;
		
		for( int i = 1 ; i <= n ; i++ )
			ans *= input ;
		
		return( ans ) ;  
	}
	
	public static int factorial(int n) 
	{
		int fact = 1 ;
		
		for( int i = 1 ; i <= n ; ++i )
			fact *= i ;
		
		return( fact ) ;
	}
}