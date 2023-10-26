package monmouth.edu;
/**
   This program demonstrates the measurable Country class.
*/
public class MeasurableTester
{
   public static void main(String[] args)
   {
     
	 
	   //Countries
		  System.out.println("Countries Data");
		  Measurable[] countries = new Measurable[3];
	      countries[0] = new Country("Uruguay", 176220);
	      countries[1] = new Country("Thailand", 513120);
	      countries[2] = new Country("Belgium", 30510);
	      double avg=Data.average(countries);
	      System.out.println("Average area: " + avg);
	      System.out.println("Expected: 239950");
	      System.out.println("");
	      double maxData = Data.max(countries);
	      System.out.println("Maximum area: " + maxData);
	      System.out.println("Expected: 513120");
	      System.out.println("");
    
      //Quizzes
      System.out.println("Quiz Data");
      Measurable[] quizzes = new Measurable[5];
      quizzes[0] = new Quiz(95);
      quizzes[1] = new Quiz(80);
      quizzes[2] = new Quiz(90);
      quizzes[3] = new Quiz(50);
      quizzes[4] = new Quiz(75);
      double avg1 = 78;
      System.out.println("Average of Quizzes: " + avg);
      double maxData1 = 95;
      System.out.println("Max quiz grade: " + maxData);
      
   }
}
