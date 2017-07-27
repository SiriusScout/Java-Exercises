package exercises.employees;

public class Worker implements Employee{
	String dateOfJoin = "";
	int salary = 60000;
	
	Worker(String date){
		dateOfJoin = date;
	}
	
	public String getDateOfJoin(){
		return dateOfJoin;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public double getPaycheck() {
		return salary * .70;
	}

}
