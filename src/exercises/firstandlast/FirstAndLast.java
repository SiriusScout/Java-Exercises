package exercises.firstandlast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
//import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

//the purpose of this class is to get the first and last days of the week (sunday and saturday)
//for the given month of the year 2017
public class FirstAndLast {
	
	FirstAndLast(){
	}
	
	public List<String> getFirstAndLast(int month) {
		Calendar cal = new GregorianCalendar();
		DateFormat sdf = new SimpleDateFormat("EEE dd MMM yyyy");
		List<String> dates = new ArrayList<String>();
		
		//setting at the start of the year
		cal.set(Calendar.YEAR, 2017);
		cal.set(Calendar.MONTH, month);
		
		//goes through each day based on the length of the month
		for(int day = 1; day <= YearMonth.of(2017, month).lengthOfMonth(); day++) {
			cal.set(Calendar.DAY_OF_MONTH, day);
			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				dates.add(sdf.format(cal.getTime()));
			}
			else if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				dates.add(sdf.format(cal.getTime()));
			}
		}
		
		return dates;
	}

}
