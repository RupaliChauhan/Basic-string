package hellojava;

public class FactorialNumber 
{
	public static void main(String[] args) 
	{
	    int no = 6; 
		int fact=1;  
		for(int i = 1; i<=no; i++)
		{
			fact= fact * i;
		}
		System.out.println("factorial of "+no+ "is"+ fact);
	}

}
