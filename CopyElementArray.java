package Array;

public class CopyElementArray
{
	public static void main(String[] agrs)
	{
		int arr1 [] = new int[]{2,3,5,6,7,8};
	    int arr2 [] = new int [arr1.length];
	    for(int i = 0;i<arr1.length;i++)
	    {
	    	arr2[i]= arr1[i];
	    	
	    }
		System.out.println("Element of oriinal array:");
		for(int i =0; i<arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		 System.out.println();    
             
	        System.out.println("Elements of new array: ");    
	        for (int i = 0; i < arr2.length; i++) 
	        {     
	           System.out.print(arr2[i] + " ");    
	        }     
	}
}






    