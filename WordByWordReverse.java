package String;

public class WordByWordReverse 
{
	public static void main(String[] args)
	{
		String name = "vijay dinanath chauhan";
		String[] str = name.split(" ");
	    for (String a : str)
		
				for (int i = a.length()-1; i >= 0; i--) 
				{
				System.out.print(a.charAt(i) );
				

			}

		

	}
}
