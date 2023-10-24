package monmouth.edu;

public class Instructor extends Person {
	   double salary;

	   Instructor(String nameParam, int dobParam, double salaryParam) {
	       super(nameParam, dobParam);
	       this.salary = salaryParam;
	   }
	   public String toString() {
	       return super.toString() + "\nInstructor Salary: $" + String.format("%,.2f", salary);
	   }
	}

