package exercise.tendays;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

//this class is meant to find the previous and post ten days from the current date
public class TenDays {

	TenDays(){
		
	}
	
	//Returns a list of the 10 previous dates before the current date
	public List<String> getBehindTenDays() {
		Calendar cal = Calendar.getInstance();
		DateFormat sdf = new SimpleDateFormat("EEE dd MMM yyyy");
		List<String> dates = new ArrayList<String>();
		int counter = -1;
		
		while(counter > -10) {
			cal.add(Calendar.DATE, -1);
			dates.add(sdf.format(cal.getTime()));
			counter--;
		}
		
		return dates;
	}
	
	//Returns a list of the 10 dates after the current date
	public List<String> getAheadTenDays() {
		Calendar cal = Calendar.getInstance();
		DateFormat sdf = new SimpleDateFormat("EEE dd MMM yyyy");
		List<String> dates = new ArrayList<String>();
		int counter = 1;
		
		while(counter < 10) {
			cal.add(Calendar.DATE, 1);
			dates.add(sdf.format(cal.getTime()));
			counter++;
		}
		
		return dates;
	}
}
