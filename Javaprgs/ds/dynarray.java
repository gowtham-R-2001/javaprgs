import java.io.* ;

class dynarray
{
	public static void main(String args[])
	{	
		cls c = new cls() ;

		System.out.println("Before expanding...") ;
		
		for(int n : c.arr)
			System.out.println(n + " ") ;

		System.out.println("After expanding expanding...") ;
		
		c.expand() ;
		
		for(int n : c.arr)
			System.out.println(n + " ") ;
		
		//c.shrink(arr) ;
	}
}