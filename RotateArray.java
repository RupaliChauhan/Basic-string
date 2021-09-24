package Array;

public class RotateArray 
{
	public static void main(String[] args)
	{
		int[] arr =new int[] {2,2,8,9,0};
		int n=3;
		System.out.println("the origional array is");
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println(arr[i] + " ");
		}	
		
		for(int i =0 ;i < n;i++)
		{
			int j,first;
			first =arr[0];
			for(j = 0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
				arr[j] =first;
			}
			System.out.println();
			System.out.println("Array after left rotation: ");  
	        for(int i1 = 0; i1< arr.length; i1++)
	        {  
	            System.out.print(arr[i1] + " ");  
	        }  
		}	
		
		
	}
}
