package hellojava;

public class Palindrome
{
	public static void main(String[] args)
	{
		int num = 536 ;
		int temp = num ;
		int rev = 0, rem;
		 while (temp != 0)
		 {
			 rem = temp %10;
			 rev = rev * 10 +rem;	
			 temp = temp / 10;
			 
		 }
		 if(num == rev)
		 {
			 System.out.println("number is palindrome");
		 }
		 else
		 {
			 System.out.println("number is not plindrome");
		 }	 
		
	}
}
