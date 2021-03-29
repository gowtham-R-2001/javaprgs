import java.lang.Exception ;

class ownexecp extends Exception
{
	public ownexecp(String msg)
	{
		super(msg) ;
	}
}

class userexcep
{
	public static void main(String args[])
	{
		int n = 7 , d = 0 , ans = 0 ;

		try
		{	
			if( d == 0 )
				throw new ownexecp("Trying to divide by Zero") ;
			ans = n / d ;
		}
		catch( ownexecp e )
		{
			System.out.println(e.getMessage()) ;
		}

		System.out.println("Ans : " + ans ) ;
	}
}