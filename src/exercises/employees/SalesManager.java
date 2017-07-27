package exercises.employees;

public class SalesManager extends SalesPerson{
	String dateOfJoin = "04/21/86";
	int salary = 50000;
	double commision = 50000.30;
	
	SalesManager(){
		
	}
	
	SalesManager(String date) {
		super(date);
	}
	
	public String getDateOfJoin(){
		return dateOfJoin;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public double getPaycheck() {
		return (salary + commision) * .70;
	}

}
