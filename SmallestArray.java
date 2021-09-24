package Array;

public class SmallestArray 
{
	public static void main(String[] args)
	{
	int arr[] = new int[] {2,44,31,9,1};
	int min =  arr [0];
	for(int i = 0; i<arr.length; i++)
	{
	if(arr[i]< min)
		min = arr[i];
	}
	System.out.println("Largest Element is:" + min);
}
}