import java.io.* ;

class stud1
{
	public static void main(String args[]) throws IOException
	{
		String name = "" ;
		
		int roll = 0 , m1 = 0 , m2 = 0 , m3 = 0 , tot = 0 ;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;

		System.out.print("Enter roll : ") ;
		
		roll = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("Enter name : ") ;
		
		name = br.readLine() ;
		
		System.out.print("Enter marks 1 : ") ;
		
		m1 = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("Enter marks 2 : ") ;
		
		m2 = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("Enter marks 3 : ") ;
		
		m3 = Integer.parseInt( br.readLine() ) ;
		
		tot = m1 + m2 + m3 ;
		
		System.out.printf("\nTotal : %d ",tot) ;
	}
}