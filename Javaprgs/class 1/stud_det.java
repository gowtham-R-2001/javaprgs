import java.io.* ;

class stud
{
	private String name = "" , mob = "" , address = "" ;
	
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
	
	public void get_data()	throws IOException
	{
		System.out.print("\n\nEnter name : ") ;	name = br.readLine() ;
		
		System.out.print("\nEnter mobile number : ") ;	mob = br.readLine() ;
		
		System.out.print("\nEnter your address : ") ;	address = br.readLine() ;
	}
	
	public void put_data()
	{
		System.out.print("\n\n Name :  " + name ) ;
		
		System.out.print("\n\n Mobile number : " + mob ) ;
		
		System.out.print("\n\n Address : " + address ) ;
	}
	
} // class student ends

class exam_marks extends stud
{
	private int m1 = 0 , m2 = 0 , m3 = 0 , m4 = 0 , m5 = 0 , tot = 0 ;
	
	public void get_marks()		throws IOException
	{
		System.out.print("\n\nEnter tamil marks : ") ;	m1 = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\n\nEnter English marks : ") ;	m2 = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\n\nEnter maths marks : ") ;	m3 = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\n\nEnter science marks : ") ;	m4 = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\n\nEnter social marks : ") ;	m5 = Integer.parseInt( br.readLine() ) ;
		
		tot = m1 + m2 + m3 + m4 + m5 ;
	}
	
	public void put_marks()
	{
		System.out.print("\n\nTamil marks : " + m1 ) ;
		
		System.out.print("\n\nEnglish marks : " + m2 ) ;

		System.out.print("\n\nMaths marks : " + m3 ) ;
		
		System.out.print("\n\nScience marks : " + m4 ) ;
		
		System.out.print("\n\nSocial marks : " + m5 ) ;
		
		System.out.print("\n\nTotal : " + tot ) ;
	}
} // class exam_marks ends

class hobbies extends stud
{
	private String hobbies = "" ;
	
	public void get_hobbies()	throws IOException
	{
		System.out.print("\n\nEnter your hobby : ") ;	 hobbies = br.readLine() ;	
	}
	
	public void put_hobbies()
	{
		System.out.print("\n\nHobby : " + hobbies ) ;
	}
}

public class stud_det
{
	public static void main(String args[])	throws IOException
	{
		exam_marks x = new exam_marks() ;
		
		hobbies z = new hobbies() ;
	
		x.get_data() ;	x.get_marks() ;		z.get_hobbies() ;
	
		x.put_data() ;	x.put_marks() ;		z.put_hobbies() ;
	}
} // main ends