import java.io.* ;
	
class parent
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		String father_name = "" , mother_name = "" ;
		
		int savings = 10000 , mother_share = 0 ;
		
		public void get_parent_data()	throws IOException
		{
			System.out.print("\nEnter father name : ") ;	father_name = br.readLine() ;
			
			System.out.print("\nEnter mother name : ") ; 	mother_name = br.readLine() ;
			
			mother_share = savings - 500 ;
		}
		
		public void put_parent_data()
		{
			System.out.print("\nFather name : " + father_name) ;	
			
			System.out.print("\nMother name : " + mother_name) ;
			
			System.out.print("\nFather Savings : " + savings) ;
			
			System.out.print("\nMother share : " + mother_share ) ;
		}
	}
	
class child extends parent
	{
		String child_name = "" ;
		
		char sex ;
		
		int child_share = 0 , child_savings = 5000 ;
		
		public int get_child_data()		throws IOException
		{
			int ret ;
			
			System.out.print("\n\nEnter child name : ") ;	child_name = br.readLine() ;
			
			System.out.print("\nEnter sex (m/f) : ") ;	sex = br.readLine().charAt(0) ;
			
			if(sex == 'm')
				ret = 1 ;

			else if(sex == 'f')
				ret = 2 ;
			
			else 
			{
				System.out.print("\nInvalid input *.*") ;
				ret = 0 ;
			}
			
			return(ret) ;
		}
		
		public void amount(int flg)
		{
			if(flg == 1)
			{
				savings = 0 ;
				child_share = 5000 ;
				mother_share += 5000 ; 
				child_savings += 5000 ;
			}
			
			else if(flg == 2)
			{
				savings = 0 ;
				child_share = 8000 ;
				mother_share += 2000 ; 
				child_savings += 8000 ;
			}
			
			else
				System.out.print("\n\t\tInvalid *.*") ;
		}
		
		public void put_child_data()
		{
			System.out.print("\n\nChild name : " + child_name ) ;
			
			System.out.print("\nChild sex : " + sex ) ;
			
			System.out.print("\nChild share : " + child_share ) ;
			
			System.out.print("\nMother share : " + mother_share ) ;
			
			System.out.print("\nTotal Child savings : " + child_savings ) ;
		}
	}
	
class bankinsu
{	
	public static void main(String args[])	throws IOException
	{
		char opt ;
		
		int s = 0 ;
		
		BufferedReader b = new BufferedReader( new InputStreamReader(System.in) ) ;
		
		System.out.print("\n\t\t\tBANK INSURANCE") ;
		
		System.out.print("\n\t\t\t--------------") ;
		
		System.out.print("\n\nYou have a child (Yy|Nn) : ") ;
		
		opt = b.readLine().charAt(0) ;
		
		if( (opt == 'Y') || (opt == 'y') )
			child obj = new child() ;
		
		else
			parent obj = new parent() ;
		
		if(obj instanceof child )
		{	
			s = obj.get_child_data() ;
			
			System.out.print("\n\n\t\tAfter claiming insurance") ;
			
			System.out.print("\n\t\t-------------------------\n\n") ;
			
			if(s == 1)
				obj.amount(1) ;
			
			else if(s == 2)
				obj.amount(2) ;
			
			else
				System.exit(0) ;
			
			obj.put_child_data() ;
		}
		
		if(obj instanceof parent)
		{	
			obj.get_parent_data() ;
			
			System.out.print("\n\n\t\tAfter claiming insurance") ;
			
			System.out.print("\n\t\t-------------------------\n") ;
			
			obj.put_parent_data() ;
		}
		
		System.out.print("\n\n") ;
			
	}
}