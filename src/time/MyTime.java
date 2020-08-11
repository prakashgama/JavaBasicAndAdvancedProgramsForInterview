package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MyTime {
	
	public static void main(String[] args) {
		
		LocalDateTime t=LocalDateTime.now();
		
		System.out.println(t.toLocalDate());
		
		System.out.println();
		
		//System.out.println(t.get);
		
		
	}

}
