import java.io.* ;

public class przmain
{
	public static void main(String args[])	throws IOException
	{
		student s = new student() ;
		
		teacher t = new teacher() ;
		
		s.get_student_data() ;
		
		t.get_teacher_data() ;
	
		s.put_student_data() ;
		
		t.put_teacher_data() ;
	}
}