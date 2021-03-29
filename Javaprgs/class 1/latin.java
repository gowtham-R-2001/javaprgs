import java.io.*;

class latin 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		int n = 0, x = 1, j = 65, flg= 0, cnt = 0;
		n = Integer.parseInt( br.readLine() );

		for(int i = 65; i < (65+n); i++)
		{
			x = i;
			while(true)
			{
				System.out.print( (char)(x) + " " );

				if( cnt >= n-1 )
					break;

				if( x == (65+(n-1)) )
				{
					for(int e = 65; e < ((n-1)+65)-cnt; e++)
						System.out.print((char)(e) + " " );
					break;
				}

				x++;
				cnt++;
			}

			j = 65;
			cnt = 0;
			System.out.println();
		}
	}
}


// A B C  - 65 66 67
// B C A  - 66 67 65
// C A B  - 67 65 66