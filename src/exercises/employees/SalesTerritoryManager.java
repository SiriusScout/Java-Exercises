package exercises.employees;

public class SalesTerritoryManager extends SalesManager {
	String dateOfJoin = "";
	int salary = 100000;
	double commision = 45000.30;
	
	SalesTerritoryManager(String date) {
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
