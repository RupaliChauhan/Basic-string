package String;

public class reverse 
{
	public static void main(String[] args)
	{
		String name = "Hello Sunrays";
	
		String a = " ";
		for(int i =name.length()-1; i>=0; i--)
		{
	     a = a+name.charAt(i);
		}
		System.out.println("reverse string "+a);
	}
}
