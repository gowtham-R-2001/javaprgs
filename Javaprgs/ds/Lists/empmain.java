import java.util.ArrayList;
import java.util.List;
import java.io.* ;

class empmain
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ) ;

		List<emplist> emp = new ArrayList<>() ;
		
		//System.out.println(emp.hashcode());
		
		while(true)
		{
			System.out.println("1 - Add Employee") ;
			System.out.println("2 - Delete Employee") ;
			System.out.println("3 - Edit Employee") ;
			System.out.println("4 - Add Employee at a given position") ;
			System.out.println("5 - Display the list") ;
			System.out.println("6 - Exit") ;
			System.out.print("\n\nEnter Code : ") ;
			int opt = Integer.parseInt( br.readLine() ) ;

			if( opt == 1 )
			{
				System.out.println("Enter name : ") ;
				String name = br.readLine() ;

				System.out.println("Enter id : ") ;
				String id = br.readLine() ;

				System.out.println("Enter Mobile number : ") ;
				String mobno = br.readLine() ;

				emp.add( new emplist(name,id,mobno) ) ;
			}
			else if(opt == 2)
			{
				int flg = 0 ;
				System.out.println("Enter employee id to delete : ") ;
				String id = br.readLine() ;
				
				for(int i = 0 ; i < emp.size() ; i++)
				{
					String x = List.toString(emp.get(i)) ;
					if( x.contains(x) )
					{
						emp.remove(i) ;
						System.out.println("\n\nSuccessfully Deleted...\n\n") ;
						flg = 1 ;
						break ;
						System.out.println(emp.get(i)) ;
				}
				if(flg == 0)
					System.out.println("\n\nNot Found...\n\n") ;
			}
			else if(opt == 3)
			{
				// String name = "" , id = "" , mobno = "" ;
				
				// System.out.println("Enter id : ") ;
				// id = br.readLine() ;
				
				// for(int i = 0 ; i < emp.size() ; i++)
				// {
					// String x = emp.get(i) ;
					// if( x.contains(id) )
					// {
						// name = 
						// flg = 1 ;
					// }
				// }
				// if(flg == 0)
					// System.out.println("\n\nNot Found...\n\n") ;
			}
			else if(opt == 4)
			{
				int s = emp.size() ;

				System.out.println("Enter name : ") ;
				String name = br.readLine() ;

				System.out.println("Enter id : ") ;
				String id = br.readLine() ;

				System.out.println("Enter Mobile number : ") ;
				String mobno = br.readLine() ;

				System.out.println("Enter position : ") ;
				int pos = Integer.parseInt( br.readLine() ) ;

				if(pos<=s)
					emp.add(pos,new emplist(name,id,mobno)) ;
				else
					System.out.println("Invalid") ;

				emp.forEach( e->System.out.println(e) ) ;
			}
			else if(opt == 5)
			{
				emp.forEach( e->System.out.println(e) ) ;
			}
			else
			{
				System.out.println("Program Terminated");
				System.exit(0) ;
			}
		}
	}
}