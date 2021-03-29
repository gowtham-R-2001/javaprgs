import java.io.* ;

class A
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

class C extends A
{
	public void print() 
	{
		System.out.println("printing...") ;
	}
}

class inhrtce2
{
	public static void main(String args[])	throws IOException
	{
			C obj = new C() ;
			
			B obj1 = new B() ;

			obj.print() ;
	
			obj.show() ;
	
			obj1.display() ;
	}
}