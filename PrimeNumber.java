package hellojava;

public class PrimeNumber 
{
	public static void main(String[] arg)
	{
		int num = 8 , temp = 0 ;
		for (int i = 2; i<= num-1 ; i++)
		{
			if(num%i == 0)
			{
				temp=temp+1;
			}
			if(temp>0)
			{
				System.out.println("not prime");
			}
			else
				
			{
				System.out.println("num is prime");
			}
		}
	}
}
