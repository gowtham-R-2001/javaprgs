import java.io.* ;

class A			// multilevel
{
	public void show() 
	{
		System.out.println("showing...") ;
	}
}

class B extends A
{
	public void display() 
	{
		System.out.println("displaying") ;
	}
}

class C extends B
{
	public void print() 
	{
		System.out.println("printing...") ;
	}
}

class inhrtce1
{
	public static void main(String args[])	throws IOException
	{
			C obj = new C() ;

			obj.print() ;
	
			obj.show() ;
	
			obj.display() ;
	}
}