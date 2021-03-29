import java.io.* ;

class ausadd		//AUSTRIAN ADDITION
{
	public static void main(String args[])	throws IOException
	{
		float bill = 0.0f , count = 0.0f  , bill_1 = 0.0f ;

		int payment = 0 , unit = 10 , constant = 0 ;

		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;

		System.out.print("\nEnter Bill amount : ") ;

		bill = Float.parseFloat( br.readLine() ) ;		

		System.out.print("\nEnter payment : ") ;

		payment = Integer.parseInt( br.readLine() ) ;

		bill_1 = bill * 100 ;

		unit = 10 ;

		if( (bill_1 % 10 == 0) && (bill_1 % 100 == 0) )
			constant = (int)bill ; 
		
		else
			constant = (int)bill + 1 ;
		
		//if(bill_1 % 10 == 0)	bill_1 += 1 ;
		
		while(constant > bill)	
		{	
			if( (bill_1 % unit) == 0 )
			{
				bill += count ;
				unit = unit * 10 ;
				System.out.print("\n\n" + count + "P") ;
				count = 0 ;
			}
			
			bill_1 += 1 ;	count += 0.01 ;
		}
		
		unit = 0 ;
		count = 0 ;
		
		while(payment > bill)	
		{
			if( (bill_1 % 10) == 0)
			{
				bill += count ;
				System.out.print("\n\n" + count + "R" ) ;
				count = 0 ;
			}
			bill_1 += 1 ;	count += 1 ;
		} 
		
		System.out.print("\n\n\n") ;
	}
}