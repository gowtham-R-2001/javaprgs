import java.io.* ;

class fibrecur
{
	public static void main(String args[])
	{
		int a = -1 , b = 1 , temp = 0 , n = 10;
		fib(a,b,temp,n) ;
	}
	
	public static int fib(int a, int b, int temp, int n )
	{
		if(n == 0)
			return(1) ;
	
		temp = a+b ;
		n-- ;
		System.out.println(temp) ;
		fib(b,temp,0,n) ;
			
		return(0) ;
	}
}