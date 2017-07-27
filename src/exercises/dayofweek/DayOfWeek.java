package exercises.dayofweek;

public class DayOfWeek {
	String date = "";
	int year = 0;
	int month = 0;
	int day = 0;
	int daysPerMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	//CONSTRUCTOR
	DayOfWeek(String date){
		this.date = date;
	}
	
	//parses date
	void parseDate() {
		String data[] = new String[3];
		if(date != "") {
			data = date.split("/");
			year = Integer.parseInt(data[0]);
			month = Integer.parseInt(data[1]);
			day = Integer.parseInt(data[2]);
		}
	}
	
	//gets the number up of the day up to that point
	int getDayOfWeekNumber() {
		int totalNumberOfDays = 0;
		int leadingDays = day; 
		int dayNumber = 0;
		
		totalNumberOfDays = ((year - 1900) * 365) + (year - 1900)/4;
		
		if(isLeapYear() && (month == 1 || month == 2))
			totalNumberOfDays--;
		
		for(int monthIndex = 1; monthIndex < month; monthIndex++) {
			leadingDays += daysPerMonth[monthIndex];
		}
		
		dayNumber = (totalNumberOfDays + leadingDays)%7;
		
		return dayNumber;
	}
	
	//turns number into its string value
	String translateNumToDay(int num) {
		switch(num) {
		case 0:
			return "SUNDAY";
		case 1:
			return "MONDAY";
		case 2:
			return "TUESDAY";
		case 3:
			return "WEDNESDAY";
		case 4:
			return "THURSDAY";
		case 5:
			return "FRIDAY";
		case 6:
			return "SATURDAY";
		default:
			return "invalid";
		}
	}
	
	
	//checks if the year is a leap year
	boolean isLeapYear() {
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					return true;
				}
				else
					return false;
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}

}
