package exercises.newyork;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

//the purpose of this class is to get the current date and time in new york
public class NewYorkTime {
	
	NewYorkTime(){
		
	}
	
	public String getNewYorkTime() {
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		DateFormat sdf = new SimpleDateFormat("EEE MMM yyyy KK:mm:ss z");
		sdf.setCalendar(cal);

		return sdf.format(cal.getTime());
	}

}
