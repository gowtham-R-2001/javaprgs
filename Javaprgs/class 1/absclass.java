/* An abstract class is a class that cannot have an object of its own. 
An abstract class can have concreate and abstract methods.
A concrete method declared and defined inside the abstract class. 
A abstract method declared and NOT defined inside the abstract class. 
When a class contains abstract method it should be declared as abstract class.
if abstract keyword is used there is no need to define abstract class.
declaring a variable : public static final variable_name ;
concrete method
*/

import java.io.* ;

abstract class absclass
{
	int legs = 4 ;       //public static final 

	public void haslegs(String animal_name)		//Concrete
	{
		System.out.println(animal_name + " has " + legs + " legs" ) ;
	}
	
	public void hastail(String animal_name)
	{
		System.out.println(animal_name + " has a long tail") ;
	}
	
	abstract public void eating_habit() ;	// Abstract
}

class horse extends absclass
{
	public void eating_habit()
	{
		System.out.println("My horse eats bun,butter,jam etc..") ;
	}
}

class cat extends absclass
{
	public void eating_habit()
	{
		System.out.println("My cat eats grass,milk etc..") ;
	}
	
	public static void main(String args[])	throws IOException
	{
		/* 
				absclass absobj = new absclass() ;
		
				will give an error ;

		*/
		
		horse h = new horse() ;
		
		cat c = new cat() ;
		
		c.haslegs("cat") ;	 c.hastail("cat") ;	  c.eating_habit() ;
		
		h.haslegs("horse") ; h.hastail("horse") ; h.eating_habit() ;
	}
}