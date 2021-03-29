import java.io.*;
import java.util.*;

class map
{
	public static void main(String args[])
	{
		Map<String, String> rollNo = new HashMap<>() ;
		
		rollNo.put( "1","Siva" ) ;
		rollNo.put( "2","Sakthi" ) ;
		
		System.out.println(rollNo.get("2")) ;
	}
}