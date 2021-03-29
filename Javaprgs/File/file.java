import java.io.* ;

class file1
{
	String name = "" , id = "" ;
	int m1 = 0 , m2 = 0 , m3 = 0 , m4 = 0 , m5 = 0 ;

	public void setName(String name)
	{
		this.name = name ;
	}
	public void setId(String id)
	{
		this.id = id ;
	}
	public void setM1(int m1)
	{
		this.m1 = m1 ;
	}
	public void setM2(int m2)
	{
		this.m2 = m2 ;
	}
	public void setM3(int m3)
	{
		this.m3 = m3 ;
	}
	public void setM4(int m4)
	{
		this.m4 = m4 ;
	}
	public void setM5(int m5)
	{
		this.m5 = m5 ;
	}


	public String getName()
	{
		return(name) ;
	}
	public String getId()
	{
		return(id) ;
	}
	public int getm1()
	{
		return(m1) ;
	}
	public int getm2()
	{
		return(m2) ;
	}
	public int getm3()
	{
		return(m3) ;
	}
	public int getm4()
	{
		return(m4) ;
	}
	public int getm5()
	{
		return(m5) ;
	}
	public String grade(int tot)
	{
		String x = "" ;

		if( tot >= 490 && tot <= 500 )
			x = "O Grade" ;
		else if(tot >= 450)
			x = "A grade" ;
		else if(tot >= 400)
			x = "B Grade" ;
		else if(tot >= 300)
			x = "C Grade" ;
		else
			x = "RA" ;

		return(x) ;
	}
}

class file
{
	public static void main(String args[]) throws IOException
	{
		file1 f = new file1() ;
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;

		try
		{
			System.out.print("Enter 1 - Add Data\nEnter 2 - Display data\n\tEnter code : ") ;
			int opt = Integer.parseInt( br.readLine() ) ;
			if(opt == 1)
			{
				FileWriter reader = new FileWriter("student.txt",true) ;
				BufferedWriter writer = new BufferedWriter(reader) ;

				while(true)
				{
					System.out.println("Enter name : ") ;
					String name = br.readLine() ;
					f.setName(name) ;

					System.out.println("Enter id : ") ;
					String id = br.readLine() ;
					f.setId(id) ;

					System.out.println("Enter Tamil marks : ") ;
					int m1 = Integer.parseInt( br.readLine() ) ;
					f.setM1(m1) ;

					System.out.println("Enter english marks : ") ;
					int m2 = Integer.parseInt( br.readLine() ) ;
					f.setM2(m2) ;

					System.out.println("Enter maths marks : ") ;
					int m3 = Integer.parseInt( br.readLine() ) ;
					f.setM3(m3) ;

					System.out.println("Enter science marks : ") ;
					int m4 = Integer.parseInt( br.readLine() ) ;
					f.setM4(m4) ;

					System.out.println("Enter social marks : ") ;
					int m5 = Integer.parseInt( br.readLine() ) ;
					f.setM5(m5) ;

					writer.write( f.getName() +"_"+f.getId()+"_"+f.getm1()+"_"+f.getm2()+"_"+f.getm3()+"_"+f.getm4()+"_"+f.getm5()) ;
					writer.write("\n") ;
					
					System.out.println("Do you want to another data(Yy|Nn) : ") ;
					char choice = br.readLine().charAt(0) ;
					
					if( choice == 'Y' || choice == 'y' )
						continue ;
					
					else
						break ;
				}
				writer.close() ;
			}
			else
			{
				FileReader freader = new FileReader("student.txt") ;
				BufferedReader breader = new BufferedReader(freader) ;

				String x = "" ;
				String[] arr = new String[200] ;
				int tot = 0 , i = 0;

				while( (x = breader.readLine()) != null )
				{
					arr = x.split("_") ;
					for(i =  0 ; i < arr.length ; i++)
					{
						System.out.print(arr[i]+"  ") ;
						if( (i == 2) || (i == 3) || (i == 4) || (i == 5) || (i == 6) )
							tot += Integer.parseInt( arr[i] ) ;
					}
					System.out.print("  "+tot) ;
					System.out.print("  "+tot/5) ;
					System.out.print("   " + f.grade(tot) ) ;
					System.out.println() ;
					tot = 0 ;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace() ;
			System.exit(0) ;
		}
	}
}