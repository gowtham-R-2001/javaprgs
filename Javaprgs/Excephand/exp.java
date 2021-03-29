import java.io.* ;

class exp
{
	public static void main(String args[])	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		
		int num1 = 0 , num2 = 0 , ans = 0 ;

		try
		{
			System.out.print("\nEnter number 1 : ") ;
		
			num1 = Integer.parseInt(br.readLine()) ;

			System.out.print("\nEnter number 2 : ") ;

			num2 = Integer.parseInt(br.readLine()) ;
			
			ans = num1 / num2 ;
		}
		catch(IOException|NumberFormatException|ArithmeticException e)
		{
			e.printStackTrace() ;
			//System.out.println("\nNumber format exception Caught") ;
		}
		/*catch(ArithmeticException e)
		{
			e.printStackTrace() ;
			System.out.println("\nArithmetic exception Caught") ;
		} 
		catch(IOException e)
		{
			e.printStackTrace() ;
			//System.out.println("EXP") ;
		} */
		finally
		{
			System.out.println("Unexpected problem Occurred*.*") ;
		}
		
		System.out.println("ANS : " +ans ) ;
	}
}