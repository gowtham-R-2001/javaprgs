import java.io.* ;

class alpsort
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		String[] str = {"Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory"} ;
		
		int[] length = new int[9] ;
		
		int i = 0 , temp = 0 , j = 0 , k = 0 ;
		
		for(i = 0 ; i < 9 ; i++)
			length[i] = str[i].length() ;
		
		for(i = 0 ; i < 9 ; i++)
		{
			for(j = i+1 ; j < 9 ; j++)
			{
				if( length[i] < length[j] )
				{
					temp = length[i] ;
					
					length[i] = length[j] ;
					
					length[j] = temp ;
				}
			}
		}
		
		i = 0 ; k = 0 ;
		
		while(k < 9)
		{
			if( str[i].length() == length[k] )
			{
				System.out.println( str[i] ) ;
				str[i] = " " ;	length[k] = -1 ;
				k++ ;	
				i = -1 ;
			}
			i++ ;
		}
	}
}