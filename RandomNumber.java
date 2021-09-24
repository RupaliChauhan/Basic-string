package hellojava;

	public class RandomNumber
	{
	public static void main(String[] args)
	{
		int i;
		for(i=1; i<=5; i++)
		{
			System.out.println(" " +(int)(Math.random()*100));
		}
	}
}
