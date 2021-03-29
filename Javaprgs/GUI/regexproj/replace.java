import java.io.* ;

import java.util.regex.* ;

class replace
{
	public static void main(String args[])
	{	
		String input = "EGG There are 15 eggs in the egg basket";
		
		//String input = "duckEGG There are 15 duckeggs in the duckegg basket";
		
		String output = input.replaceAll("(\\b((.)(GG|gg)([s]*)\\b))","apple") ;
		
		System.out.println("Ans : " + output ) ;
	}
}
