import java.io.* ;

class fileread
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;

		String name= "" ;
		int m1 = 0 , m2 = 0  , m3 = 0 , tot = 0 ;
		float avg = 0.0f ;

		try
		{
			String x = "" ;
			String[] arr = new String[100] ;
			FileReader freader = new FileReader("stumark.txt") ;
			BufferedReader breader = new BufferedReader(freader) ;
			
			System.out.println() ;
			
			while( (x = breader.readLine()) != null )
			{
				arr = x.split("_") ;
				for(int i = 0 ; i < arr.length ; i++)
				{
					System.out.print( arr[i] + " " ) ;
					if( i == 1 || i == 2 || i == 3 )
						tot += Integer.parseInt(arr[i]) ;
				}
				System.out.println(" " + tot + "\n" ) ;
				tot = 0 ;
			}
		}
		catch(IOException e)
		{
			e.printStackTrace() ;
			System.exit(0) ;
		}
	}
}