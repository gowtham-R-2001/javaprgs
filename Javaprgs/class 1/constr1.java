import java.io.* ;

class constr1
{
	private int l = 0 , b = 0 , h = 0 ;
	
	public constr1(int l,int b,int h)
	{
		this.l = l ;	this.b = b ;	this.h = h ;
	}
	
	public constr1(int l)
	{
		this.l = l ;	this.b = 30 ;	this.h = 50 ;
	}
	
	public constr1(int l,int b)
	{
		this.l = l ;	this.b = b ;	this.h = 25 ;
	}
	
	public void print()
	{
		System.out.println("Length : " + l ) ;
		
		System.out.println("Breadth : " + b ) ;
		
		System.out.println("Height : " + h ) ;
	}
	
	public static void main(String args[])	throws IOException
	{
		constr1 c = new constr1(10,20,30) ;
		
		c.print() ;
		
		System.out.println("\n\n") ;
		
		constr1 b = new constr1(10) ;
		
		b.print() ;
		
		System.out.println("\n\n") ;
		
		constr1 a = new constr1(27,37) ;
		
		a.print() ;
	}
}