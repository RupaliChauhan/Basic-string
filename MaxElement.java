package Array;

public class MaxElement
{
	public static void main(String[] args)
	{
		int arr[] = new int[] {2,44,31,9,1};
		int max =  arr [0];
		for(int i = 0; i<arr.length; i++)
		{
		if(arr[i]> max)
			max = arr[i];
		}
		System.out.println("Largest Element is:" +max);
	}
}
