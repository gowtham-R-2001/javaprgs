import java.io.* ;

public class animal
{
	String name = "" ;
	String color = "" ;
	boolean hastale;
	int legs = 0 ;
	public animal(String name, String color, boolean hastale, int legs)
	{
		this.name = name ;
		this.color = color ;
		this.hastale = hastale ;
		this.legs = legs ;
	}
	
	public String getName()
	{
		return(name) ;
	}
	public String getColor()
	{
		return(color) ;
	}
	public boolean getHastale()
	{
		return(hastale) ;
	}
	public int getLegs()
	{
		return(legs) ;
	}
	
	/*public void setName(String name)
	{
		this.name = name ;
	}
	public void setColor(String Color)
	{
		this.name = name ;
	}
	public void setHastale(boolean hastale)
	{
		this.hastale = hastale ;
	}
	public void setLegs(int legs)
	{
		this.legs = legs ;
	}*/
}