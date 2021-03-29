import java.io.* ;

class student
{
	String name = "" , id = "" ;
	
	int tam = 0 , eng = 0 , mat = 0 , sci = 0 , soc = 0 , his = 0 , tot = 0 ;
	
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
	
	public void get_data() throws IOException				
	{
		System.out.print("\nEnter name : " ) ;	name = br.readLine() ;
		
		System.out.print("\nEnter id : " ) ;	id = br.readLine() ;
		
		System.out.print("\n Enter tamil marks : ") ;	tam = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\n Enter english marks : ") ;	eng = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\n Enter maths marks : ") ;	mat = Integer.parseInt( br.readLine() ) ;

		System.out.print("\n Enter science marks : ") ;	sci = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\n Enter social marks : ") ;	soc = Integer.parseInt( br.readLine() ) ;
	}
	
	public void put_data()
	{
		System.out.println("\nName : " + name ) ;
		
		System.out.println("Id : " + id ) ;
		
		System.out.print("\nTamil marks : " + tam ) ;
		
		System.out.print("\nEnglish marks : " + eng ) ;
		
		System.out.print("\nMaths marks : " + mat ) ;
		
		System.out.print("\nScience marks : " + sci ) ;
		
		System.out.print("\nSocial marks : " + soc ) ;
	}
	
	class stu_priv
	{
		public void get_special_data() throws IOException
		{
			System.out.print("\nEnter history marks : ") ;	his = Integer.parseInt( br.readLine() ) ;
		}
		
		public void put_special_data()
		{
			System.out.print("\nHistory marks : " + his ) ;
		}
	}
}

class stuext
{
	public static void main(String args[])	throws IOException
	{
		char ch ;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		student stu = new student() ;
		
		stu.get_data() ;
		
		System.out.print("\nDo you have history marks : ") ;	ch = br.readLine().charAt(0) ;
		
		if( (ch == 'Y') || (ch == 'y') )
		{
			student.stu_priv inner_pri = stu.new stu_priv() ;
			
			inner_pri.get_special_data() ;
			
			stu.put_data() ;
			
			inner_pri.put_special_data() ;
		}
		
		else
			stu.put_data() ;
	}
}
