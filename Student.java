package monmouth.edu;

public class Student extends Person {
	   String major;

	   Student(String nameParam, int dobParam, String majorParam) {
	       super(nameParam, dobParam);
	       this.major = majorParam;
	   }

	   
	   public String toString() {
	       return super.toString() + "\nStudent Major: " + major;
	   }
	}