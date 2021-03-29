import java.io.* ;

class main
{
	public static void main(String args[])
	{
		dog germanShep = new dog( "german sheperd","black",true,4 );
		dog labrador = new dog( "labrador","white",true,4 );

		bird parrot = new bird( "parrot","green",true,2 );

		System.out.println(germanShep.getName()) ;
		System.out.println(labrador.getLegs()) ;
		System.out.println(parrot.getLegs()) ;
	}
}