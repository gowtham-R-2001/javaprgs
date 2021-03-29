import java.io.* ;

class A		//single inheritance
{
	public void display()
	{
		System.out.println("A") ;
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("B") ;
	}
}

class inhrtce
{
	public static void main(String args[])	throws IOException
	{
		B obj = new B() ;
		
		obj.display() ;
		
		obj.show() ;
	}
}