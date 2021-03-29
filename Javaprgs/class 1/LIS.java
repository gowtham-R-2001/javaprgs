import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LIS 
{

    public static void main(String[] args) throws IOException
    {
        String alp = "abcdefghijklmnopqrstuvwxyz";
        String input = "";
        String x = "", finAns="";
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
        input = br.readLine();
        for(int i = 0; i < input.length(); i++ )
        {
			char c = input.charAt(i);
			int z = (int)c-9;
            x = x + (char)z;
        }
		for(int i = 1; i < input.length(); i++)
		{
			finAns += Character.toString(x.charAt(i));
		}
		finAns += Character.toString(x.charAt(0));
		
		System.out.println( finAns );
    }
}