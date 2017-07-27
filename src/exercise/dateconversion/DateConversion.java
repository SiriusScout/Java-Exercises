package exercise.dateconversion;

import java.util.Calendar;
import java.util.Date;

//this class provides two functions to convert between Calendar and Date objects
public class DateConversion {
	
	DateConversion(){
		
	}
	
	public Calendar dateToCalendar(Date date) {
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(date);
		
		return cal;
	}
	
	public Date calendarToDate(Calendar cal) {
		Date date = new Date();
		
		date = cal.getTime();
		
		return date;
	}


}
