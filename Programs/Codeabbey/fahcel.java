import java.io.* ;

class fahcel
{
	public static void main(String args[])	throws IOException
	{
		float fh = 0 , cel = 0 , flg = 0 , cel_1 = 0 ;
		
		int ans = 0 ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\nEnter fahrenheit : ") ;
		
		fh = Integer.parseInt( br.readLine() ) ;
		
		cel = ( (fh - 32) * 5 ) / 9 ;
		
		cel_1 = cel * 10 ;
		
		if(fh < 0 )
		{ 
			cel_1 = cel_1 * -1;
			flg = 1 ;
		}
		
		if(cel_1 % 10 >= 5 )
		{
			cel_1 = (int)cel_1 % 10 ;
			
			if(flg == 0)
				cel_1 = 10 + cel_1 ;
			
			else
				cel_1 = 10 - cel_1 ;
			
			cel = (int)(cel + cel_1) / 10 ;
		}
		
		ans = (int)cel ;
			
		
		System.out.print("\n\n\t\tANS : " + ans ) ;
	}
}