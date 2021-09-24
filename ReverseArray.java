package Array;

public class ReverseArray 
{
 public static void main(String[] args)
 {
	  int [] arr1 =new int[] {2,4,3,3,2,1};
      System.out.print("origional array :");
      for(int i = 0; i< arr1.length; i++)
      {
    	  System.out.print(arr1[i] + " ");
      }
      System.out.println(" ");
      System.out.print("Reverse array :");
   
      for(int i = arr1.length-1; i>0; i--)
      {
    	  System.out.print(arr1[i] + " ");
      }
 }
}
