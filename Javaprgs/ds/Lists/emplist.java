import java.util.ArrayList;
import java.util.List;

class emplist
{
	String name = "" , id = "" , mobno = "" ;

	public emplist(String name ,String id ,String mobno)
	{
		this.name = name ;
		this.id = id ;
		this.mobno = mobno ;
	}

	public void setName(String name)
	{
		this.name = name ;
	}
	public void setid(String id)
	{
		this.id = id ;
	}
	public void setmobno(String mobno)
	{
		this.mobno = mobno ;
	}

	public String getname()
	{
		return(name) ;
	}
	public String getid()
	{
		return(id) ;
	}
	public String getmobno()
	{
		return(mobno) ;
	}
	
	public String toString()
	{
		return( "Name : " + name + " Id : " + id + " Mobile number : " + mobno ) ;
	}
}
