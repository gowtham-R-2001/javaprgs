import java.io.* ;

import studata.* ;

class details
{
	public static void main(String args[])	throws IOException
	{
		studatax s = new studatax() ;
		
		s.get_data() ;
		
		s.get_marks() ;
		
		s.get_personal_details() ;
		
		s.put_data() ;
		
		s.put_marks() ;
		
		s.put_personal_details() ;
	}
}