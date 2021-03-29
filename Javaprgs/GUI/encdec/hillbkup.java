import java.io.* ;

class hillbkup
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		/*String alp = "abcdefghijklmnopqrstuvwxyz" , s1 = "" ;
		
		int[][] a = new int[2][2] ;
		
		int[][] b = new int[2][2] ;
		
		int[][] c = new int[2][2] ;
		
		s1 = br.readLine() ;
		
		for(int i = 0 ; i < 2 ; ++i)
		{
			for(int j = 0 ; j < 2 ; ++j)
			{
				System.out.print("Enter elemnt " + i + "" + j + " : " ) ;
				a[i][j] = Integer.parseInt( br.readLine() ) ;
			}
		}
		
		for(int i = 0 ; i < 2 ; ++i)
		{
			for(int j = 0 ; j < 1 ; ++j)
			{
				System.out.print("Enter elemnt " + i + "" + j + " : " ) ;
				b[i][j] = Integer.parseInt( br.readLine() ) ;
			}
		}
		
		matrixmul(a,b,c) ;
		
		for(int i = 0 ; i < 2 ; i++)
		{
			for(int j = 0 ; j < 1 ; j++)
			{
				System.out.print(c[i][j] + " " ) ;
			}
			System.out.println("") ;
		}
	}
	
	public static int[][] matrixmul(int[][] a , int[][] b , int[][] c)
	{
		int sum = 0 ;
		
		for(int i = 0 ; i < 2 ; i++)
		{
			for(int j = 0 ; j < 1 ; j++)
			{
				for(int k = 0 ; k < 2 ; k++)
				{
					sum = sum + a[i][k] * b[k][j] ;
					System.out.println("SUM : " + sum ) ;
				}
				
				c[i][j] = sum ;
				sum = 0 ;
			}
		}
		
		return(c) ;
	}
	
	public static int[][] invers(int[][] a , int[][] b , int c[][] )
	{
		return(a) ;
	} */
	
		System.out.println("Enter num : ") ;
		
		int num = Integer.parseInt( br.readLine() ) ;
		
		System.out.println("Enter num : ") ;
		
	
		System.out.println( "Ans : " + (num % 83) ) ; 
		
		//System.out.println("ans : " + rem* 26 ) ;
	}
}

