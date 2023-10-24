package monmouth.edu;

public class Person {

		   String name;
		   int dob;

		   Person(String s, int d){
		       this.name = s;
		       this.dob = d;
		   }
		   public String toString(){
		       return "Person Name: " + name + "\nPerson Birth Year: " + dob;
		   }
		}