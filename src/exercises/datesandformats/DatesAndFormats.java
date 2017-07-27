package exercises.datesandformats;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

//takes the current date and formats it multiple different ways
public class DatesAndFormats {

	DatesAndFormats(){
		
	}
	
	public List<String> formattingDates() {
		List<String> formattedDates = new ArrayList<String>();
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		formattedDates.add(sdf.format(cal.getTime()));
		
		sdf = new SimpleDateFormat("dd::MMM::yyyy");
		formattedDates.add(sdf.format(cal.getTime()));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		formattedDates.add(sdf.format(cal.getTime()));
		
		sdf = new SimpleDateFormat("dd::MMM::yyyy hh::mm::ss");
		formattedDates.add(sdf.format(cal.getTime()));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSSZ");
		formattedDates.add(sdf.format(cal.getTime()));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		formattedDates.add(sdf.format(cal.getTime()));
		
		
		return formattedDates;
	}
	
}
