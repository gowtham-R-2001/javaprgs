import java.io.* ;
import java.util.List ;
import java.util.ArrayList ;

class Employee
{
	String name = "" , id = "" , mobno = "" ;
	
	public Employee( String name,String id,String mobno )
	{
		this.name = name ;
		this.id = id ;
		this.mobno = mobno ;
	}
	
	//setters
	/*public void setName(String name)
	{
		this.name = name ;
	}
	public void setId(String id)
	{
		this.id = id ;
	}
	public void setMobno(String mobno)
	{
		this.mobno = mobno ;
	}
	// getters
	public String getName()
	{
		return(name) ;
	}
	public String getId()
	{
		return(id) ;
	}
	public String getMobno()
	{
		return(mobno) ;
	}*/
	public String toString()
	{
		return("Name : " + name + "    Id : " + id + "     Mob no. " + mobno ) ;
	}
}

class list
{
	public static void main(String args[])  throws Exception
	{
		List<Employee> emplist = new ArrayList<>();
		
		// to add the data in the list.
		emplist.add( new Employee("siva","18cs014","7010531836") ) ;
		emplist.add( new Employee("sakthi","18cs015","9566862873") ) ;
		emplist.add( new Employee("ganesh","18cs016","9629105961") ) ;
		emplist.add( new Employee("karthi","18cs017","9894185273") ) ;

		emplist.forEach( Employee -> System.out.println(Employee) ) ;
		
		//to get the list at the given position.
		System.out.println( emplist.get(1) ) ;
		
		//to set the given data in the exisiting list at the given position.
		emplist.set(1,new Employee("vishnu","18cs018","9790385268") ) ;
		
		System.out.println("After changing...\n") ;
		
		emplist.forEach( Employee->System.out.println(Employee) ) ;
		
		//to check the list is empty or not.
		System.out.println( emplist.isEmpty() ) ;
		
		//to print the number of items in the list.
		System.out.println( emplist.size() ) ;
		
		System.out.println("After adding the Employee\n") ;
		
		// to add the data at specific position.
		emplist.add(2,new Employee("saraswathi","18cs019","1234567890") ) ;
		
		emplist.forEach( Employee -> System.out.println(Employee) ) ;
		
		// final String os = System.getProperty("os.name");
        // if (os.contains("Windows"))
            // new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        // else
            // Runtime.getRuntime().exec("clear") ;
		
		// clearScreen() ;
	}
	
	/*public static void clearScreen()
	{
		for(int i = 0 ; i < 31 ; i++)
			System.out.println() ;
	}*/
}