import java.io.* ;

class constr1
{
	private l = 0 , b = 0 , h = 0 ;
	
	public constr1(int l,int b,int h)
	{
		this.l = l ;	this.b = b ;	this.h = h ;
	}
	
	public void print(int l , int b , int h)
	{
		System.out.println("Length : " + l ) ;
		
		System.out.println("Breadth : " + b ) ;
		
		System.out.println("Height : " + h ) ;
	}
	
	public static void main(String args[])	throws IOException
	{
		constr1 c = new constr1(10,20,30) ;
		
		c.print() ;
	}
}