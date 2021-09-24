package DateAndTime;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class age 
{
	
	public static void main(String[] args) throws ParseException  
	{
		SimpleDateFormat aa = new SimpleDateFormat ("dd/mm/yyyy");
		Date birth =aa.parse("21/02/1992");
		Date now=new Date();
		
		int result = birth.compareTo(now);
		System.out.println(result);

	}
	
}
