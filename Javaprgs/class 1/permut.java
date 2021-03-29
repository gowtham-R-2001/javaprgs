import java.io.*;
import java.util.*;

class permut
{
	private static int flg = 0;
	public static ArrayList<String> fun(String[] inputArr, String input,int totalLength,int num,ArrayList<String> outputArr)
	{
		if( totalLength > 0 )
		{
			String s = Arrays.toString(inputArr);
			s = s.replace("//]//","");
			s = s.replace("//[//","");

			if( num <= 0 )
				num = input.length() - 1;
			
			for(String x: outputArr)
			{
				if( x.contains(s) )
				{
					//flg = 1;
					break;
				}
				else
					flg = 0;
			}
				
			if(flg == 0)
			{
				outputArr.add(s);

				System.out.println( s );

				
				String temp = "";
				temp = inputArr[num];
				inputArr[num] = inputArr[num-1];
				inputArr[num-1] = temp;
			}

			num--;
			totalLength--;

			fun( inputArr,input,totalLength,num,outputArr );
		}
		return(outputArr);
	}

	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		String input = "";
		input = br.readLine();
		String[] inputArr = new String[input.length()];
		int totalLength = 1;

		for(int i = 0;i < input.length(); i++)
			totalLength *= input.length()-i;

		ArrayList<String> outputArr = new ArrayList<>();

		inputArr = input.split("");

		int num = 0;
		outputArr = fun( inputArr,input,totalLength,num,outputArr );

		System.out.println();System.out.println();System.out.println();System.out.println();
		int alp = 65;

		for(int i = 0; i < totalLength; i++)
		{
			for(String x : outputArr)
			{
				String m = Character.toString(x.charAt(1));
				if( m.equalsIgnoreCase(  Character.toString( (char) alp)  ) )
					System.out.println( x );
			}
			alp++;
			System.out.println();
		}
	}
}

/* input : abc 
	abc
	acb
	bac
	bca
	cba
	cab


	abc
	acb
	cab
	cba
	bca
	bac


	input : abcd
	abcd
	acbd
	acdb
*/