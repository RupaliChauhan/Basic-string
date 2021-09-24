package DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class CompareDate
{
public static void main(String[] args) throws ParseException 
{
	SimpleDateFormat aa= new SimpleDateFormat("yyyy-mm-dd");
	Date start =  aa.parse("2000-08-12");
	Date end =  aa.parse("1990-05-2");
	
	System.out.println(aa.format(start));
	System.out.println(aa.format(end));
	
	int result=start.compareTo(end);
	 if (result == 0) 
	 {
          System.err.println("");
      } 
	 else if (result > 0)
	 {
          System.err.println("this is wrong");
      }
	 else if (result < 0)
	 {
          System.err.println("");
      } 
	 else
	 {
          System.err.println("");
      }
	
	
	
}


}

