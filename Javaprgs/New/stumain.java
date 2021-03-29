import java.io.* ;

class stumain
{
	public static void main(String args[])	throws IOException
	{
		stucls s = new stucls() ;
		
		s.func() ;
		
		System.out.print("\n\n\t\t\tSTUDENT DATA") ;
		
		System.out.print("\n\t\t\t------------") ;
		
		System.out.print("\nNAME : " + s.get_name() )  ;
		
		System.out.print("\n\nROLL : " + s.get_roll() )  ;
		
		System.out.print("\n\nTAMIL MARKS : " + s.get_m1() )  ;
		
		System.out.print("\n\nENGLISH MARKS : " + s.get_m2() )  ;
		
		System.out.print("\n\nMATHS MARKS : " + s.get_m3() )  ;
		
		System.out.print("\n\nSCIENCE MARKS : " + s.get_m4() )  ;
		
		System.out.print("\n\nSOCIAL MARKS : " + s.get_m5() )  ;
		
		System.out.print("\n\nTOTAL MARKS : " + s.get_tot() )  ;
		
		System.out.print("\n\nAVERAGE : " + s.get_avg() )  ;
		
		System.out.print("\n\nGRADE : " + s.get_grade() + "\n\n")  ;
	}
}