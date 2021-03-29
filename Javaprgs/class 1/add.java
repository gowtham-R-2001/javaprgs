import java.io.* ;

class add
{
	public static void main(String args[]) throws IOException
	{
		int n1 = 0 , n2 = 0 , sum = 0 ;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;
		
		System.out.print("Enter number 1 : ") ;
		
		n1 = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("Enter number 2 : ") ; // System.exit(0) ;
		
		n2 = Integer.parseInt( br.readLine() ) ;
		
		sum = add(n1,n2) ;
		
		System.out.printf("SUM : %d ",sum) ;
	}
	
	public static int add(int n1 , int n2)
	{
		return(n1+n2) ;
	}
}

