import java.io.* ;

class A
{
	public void print()
	{
		System.out.print("printing...") ;
	}
}

class B
{
	public void print()
	{
		System.out.print("printing1...") ;
	}
}

class inhrtce3 
{
	public static void main(String args[])	throws IOException
	{
		C obj = new C() ;
		
		obj.print() ;
	}
}