package exercises.employees;

public class SalesPerson implements Employee {
	String dateOfJoin;
	int salary;
	double commision;
	SalesPerson(){
		
	}
	
	SalesPerson(String date){
		dateOfJoin = date;
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
