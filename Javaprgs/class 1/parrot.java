import java.io.* ;

class parrot
{
	public static void main(String args[])
	{	
		for(int parrot = 1 ; parrot < 1000 ; parrot++)
		{
			for(int cage = 1 ; cage < 1000 ; cage++)
			{
				if( (parrot % cage == 1) && ((cage*2) % parrot == 2) )
					System.out.println("Parrot : " + parrot + " Cage : " + cage ) ;
			}
		}
	}
}