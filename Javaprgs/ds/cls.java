import java.io.* ;

class cls
{
	int[] arr = new int[5] ;
	
	public void expand()
	{
		int capacity = arr.length ;
		
		int[] newarr = new int[capacity*2] ;
		
		capacity*=2 ;
		
		System.arraycopy(arr,0,newarr,0,arr.length) ;
		
		arr = newarr ;
	}
	
	public void shrink()
	{
		int capacity = arr.length ;
		
		int[] newarr = new int[capacity*2] ;
		
		arr = newarr ;
		
		capacity/=2 ;
	}
}