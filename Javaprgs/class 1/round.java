import java.io.* ;

class round
{
	public static void main(String args[])	throws IOException
	{
		float f = 0.0f ;
		
		int z = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		f = Float.parseFloat( br.readLine() ) ;
				
		z = (int)(f + 0.5) ;
		
		System.out.print(z) ;
	}
}