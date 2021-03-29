import java.io.*;

class snake 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		int n = 0, flg = 0, j = 1, x= 0, y = 0;
		n = Integer.parseInt( br.readLine() );

		for(int i = 1; i <= n; i++)
		{
			if( flg == 0 )
			{	
				while(true)
				{
					if( y >= n )
						break;
					System.out.print( j + " " );
					j++;
					y++;
				}
				j--;
				y = 0;
			}
			else
			{
				while( true )
				{
					if( x >= n )
						break;
					System.out.print( j + " " );
					j--;
					x++;
				}
				j++;
				x = 0;
			}

			System.out.println();

			if( (i+1) % 2 == 0 )
			{
				flg = 1;
				j += n;
			}
			else
			{
				flg = 0;
				j += n;
			}
		}
	}
}