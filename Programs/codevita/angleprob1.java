import java.io.* ;

class angleprob1
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		float input1 = 0.0f , input2 = 0.0f , ist = 0.0f ;
		
		int hr = 0 , min = 0 ;
		
		input1 = Float.parseFloat( br.readLine() ) ;
		
		input2 = Float.parseFloat( br.readLine() ) ;
		
		if(input1 == 24)
			ist =  4 * input2 ;
		
		else
			ist =  2 * input2 ;
		
		for(int i = 60 ; i < ist ; i += 60 )
			hr++ ;
		
		min = (int)ist - (hr*60)  ;
		
		if(min >= 60)
		{
			hr++ ;
			min-=60 ;
		}
		
		float ans = (float)func(hr,min) ;
		
		System.out.printf( "%f" ,ans ) ;
	}
	
	public static int func( int hour , int min )
	{	
		int h = (hour * 360) / 12 + (min * 360) / (12 * 60);

		int m = (min * 360) / (60);

		int ans = h - m ;

		if( ans < 0 )
			ans = -1 * ans ;
		
		if( ans > 180)
			ans = 360 - ans ;
		
		return(ans) ;
	}
}