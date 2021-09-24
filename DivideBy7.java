package hellojava;

public class DivideBy7
{
	public static void main(String [] ags)
	{
	int sum = 0; 
	
	for(int i =101; i<=200 ;i++)
	{
		if(i%7==0)
		
		sum=sum+i;
	}
		System.out.println("Sum of all integer between 100 to 200 which are divisble by 7 is ="+ sum);
	
}
	}

