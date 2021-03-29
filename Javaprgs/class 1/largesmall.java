import java.io.*;

class largesmall
{
	public static int[] sortfun(int[] largeArr,int[] smallArr,int[] arr,int n)
	{
		for(int i = 0; i < n; i++)
		{
			for(int j = i+1; j < n; j++)
			{
				if( largeArr[i] > largeArr[j] )
				{
					int temp = 0;
					temp = largeArr[i];
					largeArr[i] = largeArr[j];
					largeArr[j] = temp;
				}

				if( smallArr[i] < smallArr[j] )
				{
					int temp = 0;
					temp = smallArr[i];
					smallArr[i] = smallArr[j];
					smallArr[j] = temp;
				}
			}
		}

		int x = 0;

		for(int i = 0; i < n; i++)
		{
			if( i % 2 != 0 )
			{
				arr[i] = largeArr[x];
				x++;
			}	
			else
				arr[i] = smallArr[x];
		}

		return( arr );
	}


	public static void display(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
			System.out.print( "\t" + arr[i] );

		System.out.println( "\n\n\n" );
	}

	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		int n = 0;
		n = Integer.parseInt( br.readLine() );
		int[] arr = new int[n];
		int[] largeArr = new int[n];
		int[] smallArr = new int[n];

		for(int i = 0;i < n;i++)
		{
			arr[i] = Integer.parseInt( br.readLine() );
			largeArr[i] = smallArr[i] = arr[i];
		}

		arr = sortfun(largeArr,smallArr,arr,n);
		display(arr);
	}
}