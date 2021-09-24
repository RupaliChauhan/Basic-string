package Array;

public class AccendingOrder
{
	public static void main(String[] args)
	{
		int[] arr =new int[] {3,5,4,8,9,10};
		int temp =0;
		System.out.println("the origional array is");
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}	
		System.out.println();
		for(int i = 0; i <arr.length; i++) 
		{	
			for(int j =i+1; j <arr.length; j++) 
			{
				if(arr[i]>arr[j])	
					{
						temp=arr[i];
						arr[i] = arr[j];
						arr[j]=	temp;	
					}
			
			}
			System.out.println("Accending order;" +arr [i]);
		}
				
		 }
		
}

