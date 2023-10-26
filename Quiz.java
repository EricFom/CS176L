package monmouth.edu;

public class Quiz implements Measurable  {

	public Quiz(int i) {
		
	}

	public double getMeasure() {
		return 0;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Quiz Data");
	      Measurable[] quizzes = new Measurable[5];
	      quizzes[0] = new Quiz(95);
	      quizzes[1] = new Quiz(80);
	      quizzes[2] = new Quiz(90);
	      quizzes[3] = new Quiz(50);
	      quizzes[4] = new Quiz(75);
	      double avg = 78;
	      System.out.println("Average of Quizzes: " + avg);
	      double maxData = 95;
	      System.out.println("Max quiz grade: " + maxData);
	      
	}

}
