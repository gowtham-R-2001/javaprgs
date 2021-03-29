import java.lang.Math;
public class hello {

	public static void main(String[] args) 
	{
		int x = 0 ;
		System.out.println("Hello world") ;
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.println(Math.random()*100);
			x = (int)(Math.random()*100) ;
			System.out.println(x);
		}
	}

}
