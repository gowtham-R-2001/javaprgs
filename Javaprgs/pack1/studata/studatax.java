package studata ;

import java.io.* ;

public class studatax
{
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
	
	public String id = "" , name = "" , hobby = "" , address = "" , mob = "" ;
	
	public int m1 = 0 , m2 = 0 , m3 = 0 , m4 = 0 , m5 = 0 , tot = 0 ;
		
	public float avg = 0.0f ;
		
	public char g ;
	
	public void get_data()	throws IOException
	{
		System.out.print("\n\nName : ") ; 	name = br.readLine() ;
		
		System.out.print("\n\nId : ") ; 	id = br.readLine() ;
	}
	
	public void get_marks()	throws IOException
	{
		System.out.print("\nEnter tamil marks : ") ;	m1 = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\nEnter english marks : ") ;	m2 = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\nEnter maths marks : ") ;	m3 = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\nEnter science marks : ") ;	m4 = Integer.parseInt( br.readLine() ) ;
		
		System.out.print("\nEnter social marks : ") ;	m5 = Integer.parseInt( br.readLine() ) ;
		
		tot = m1 + m2 + m3 + m4 + m5 ;
		
		avg = tot / 5 ;
		
		if( (avg >= 90) && (avg <= 100) )
				g = 'O' ;
			
		else if( avg >= 80 )
			g = 'A' ;
		
		else if( avg >= 70 )
			g = 'B' ;
		
		else if( avg >=60 )
			g = 'C' ;
		
		else
			g = 'R' ;
		
	}
	
	public void get_personal_details()	throws IOException
	{	
		System.out.print("\nEnter address : ") ;	address = br.readLine() ;
		
		System.out.print("\nEnter mobile number : ") ;	mob = br.readLine() ;
		
		System.out.print("\nEnter your hobby : ") ;	hobby = br.readLine() ;
	}
	
	public void put_personal_details()
	{	
		System.out.print("\n\n Address : " + address ) ;
		
		System.out.print("\n Mobile number : " + mob ) ;
		
		System.out.print("\n Hobby : " + hobby ) ;
	}
	
	public void put_marks()
	{
		System.out.print("\nTamil marks : " + m1 ) ;
		
		System.out.print("\nEnglish marks : " + m2 ) ;

		System.out.print("\nMaths marks : " + m3 ) ;
		
		System.out.print("\nScience marks : " + m4 ) ;
		
		System.out.print("\nSocial marks : " + m5 ) ;
		
		System.out.print("\nTotal : " + tot ) ;
		
		System.out.print("\nAverage : " + avg ) ;
		
		System.out.print("\nGrade : " + g ) ;
	}
	
	public void put_data()
	{
		System.out.print("\nName : " + name ) ;
		
		System.out.print("\nId : " + id ) ;
	}
}