package dateTime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d=new Date();
		
		System.out.println(formatDate(d));

	}
	
	public static String formatDate(Date dbDate) {
		  SimpleDateFormat sdf = new SimpleDateFormat();
		  sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		  String formatedDate = sdf.format(dbDate);
		  return formatedDate;
		}

}
