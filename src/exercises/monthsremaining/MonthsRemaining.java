package exercises.monthsremaining;

import java.util.Calendar;

//this returns the remaining months for the current year
public class MonthsRemaining {
	
	public Integer getMonthsRemaining(){
		Integer months = 0;
		
		Calendar cal = Calendar.getInstance();
		months = 11 - cal.get(Calendar.MONTH);
		
		return months;
	}

}
