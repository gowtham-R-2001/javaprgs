import java.io.* ;
import java.util.Arrays ;

class quicksort
{
	public static void main(String args[])	throws IOException
	{
		int[] arr = {88,0,-9,98,27,-1,17,19,23,6,88} ;
		
		Sort(arr,0,arr.length-1) ;
		
		System.out.println( Arrays.toString(arr) ) ;
	}
	
	public static void Sort(int[] arr,int first,int last)
	{
		int i = 0 , j = 0 , pivot = 0 , temp = 0 ;
		
		if(first < last)
		{
			i = first ;
			pivot = first ;
			j = last ;
			
			while(i < j)
			{
				while( (arr[i] <= arr[pivot]) && (i <= last) )
					i++ ;
				
				while( (arr[j] > arr[pivot]) && (j >= first) )
					j-- ;
				
				if(i < j)
				{
					temp = arr[i] ;
					arr[i] = arr[j] ;
					arr[j] = temp ;
				}
			}
			
			temp = arr[pivot] ;
			arr[pivot] = arr[j] ;
			arr[j] = temp ;
			
			Sort(arr,first,j-1) ;
			Sort(arr,j+1,last) ;
		}
	}
}