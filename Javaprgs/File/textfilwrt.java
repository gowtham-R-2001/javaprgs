import java.io.InputStreamReader ;
import java.io.BufferedReader ;
import java.io.BufferedWriter ;
import java.io.FileReader ;
import java.io.FileWriter ;
import java.io.IOException ;

class textfilwrt
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;

		String name= "" ;
		int m1 = 0 , m2 = 0  , m3 = 0 ;

		try
		{
			FileWriter reader = new FileWriter("stumark.txt",true) ;
			BufferedWriter writer = new BufferedWriter(reader) ;

			for(int i = 0 ; i < 3 ; i++)
			{
				System.out.println("Enter name : ") ;
				name = br.readLine() ;

				System.out.println("Enter mark 1 : ") ;
				m1 = Integer.parseInt( br.readLine() ) ;

				System.out.println("Enter mark 1 : ") ;
				m2 = Integer.parseInt( br.readLine() ) ;

				System.out.println("Enter mark 1 : ") ;
				m3 = Integer.parseInt( br.readLine() ) ;

				int tot = m1+m2+m3 ;
				float avg = tot/3 ;

				writer.write(name+"_"+m1+"_"+m2+"_"+m3+"_"+tot+"_"+avg+"\n" ) ;
			}
			writer.close() ;
		}
		catch(IOException e)
		{
			e.printStackTrace() ;
			System.exit(0) ;
		}
	}
}