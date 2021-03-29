import java.io.* ;

class getInput
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;

	int id = 0 , age = 0 ;
	String name = "" , address = "" ;

	public int get_data()	throws IOException
	{
		try
		{
			System.out.print("Enter ID : ") ;		id = Integer.parseInt(br.readLine()) ;
			System.out.print("Enter Name : ") ;		name = br.readLine() ;
			System.out.print("Enter Age : ") ;		age = Integer.parseInt(br.readLine()) ;
			System.out.print("Enter Address : ") ;	address = br.readLine() ;
		}
		catch(Exception e)
		{
			System.out.println("Invalid input") ;
			return(1) ;
		}
		return(0) ;
	}
	public void put_data()
	{
		System.out.println("\n\nName : " + name ) ;
		System.out.println("ID : " + id ) ;
		System.out.println("Age : " + age ) ;
		System.out.println("Address : " + address ) ;
	}
}

class input
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;

		getInput g[] = new getInput[10] ;
		int opt = 0 , i = 0 , totalrec = 0 , x = 0 ;

		while(true)
		{
			g[i] = new getInput() ;
			x = g[i].get_data() ;

			if(x == 1)
				System.out.println("Enter the input Again ...\n") ;
			
			else
			{
				try
				{
					System.out.print("\n\n1-Continue 2-Exit : ") ;
					opt = Integer.parseInt( br.readLine() ) ;
				}
				catch(Exception e)
				{
					break ;
				}

				if(opt == 1)
				{
					i++ ;
					continue ;
				}
				else
					break ;
			}
		}
		totalrec = i ;
		
		for(i = 0 ; i <= totalrec ; i++)
			g[i].put_data() ;
	}
}