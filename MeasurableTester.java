package monmouth.edu;

public class MeasurableTester {
    public static void main(String[] args) 
    {
    	Measurable[] bank = new Measurable[3];
        bank[0] = new BankAccount(176220);
        bank[1] = new BankAccount(513120);
        bank[2] = new BankAccount(30510);
    	
    	
    	Measurable[] countries = new Measurable[3];
        countries[0] = new Country("Uruguay", 176220);
        countries[1] = new Country("Thailand", 513120);
        countries[2] = new Country("Belgium", 30510);
        
        Quiz[] quizzes = 
        	{
            new Quiz(95),
            new Quiz(80),
            new Quiz(90),
            new Quiz(50),
            new Quiz(75)
        };


        System.out.println("Average Score: " + Data.average(quizzes));
        System.out.println("Average Area: " + Data.average(countries));
        System.out.println("Average Balance: " + Data.average(bank));
        System.out.println("Max Score: " + Data.max(quizzes).getMeasure());
        System.out.println("Max Area: " + Data.max(countries).getMeasure());
        System.out.println("Max Balance: " + Data.max(bank).getMeasure());
        System.out.println("Minimum Score: " + Data.min(quizzes));
        System.out.println("Minmum Area: " + Data.min(countries));
        System.out.println("Minimum Balance: " + Data.min(bank));
    }
}