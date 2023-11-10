package monmouth.edu;

import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MeasurableTester
{
   public static void main(String[] args)
   {
     JFrame frame = new JFrame();
     JPanel panel = new JPanel();
     boolean correctInput = false;
     Scanner in = new Scanner(System.in);
     Measurable[] countries = new Measurable[3];
     countries[0] = new Country("Uruguay", 176220);
     countries[1] = new Country("Thailand", 513120);
     countries[2] = new Country("Belgium", 30510);
     Measurable[] bank = new Measurable[3];
     bank[0] = new BankAccount(176220);
     bank[1] = new BankAccount(513120);
     bank[2] = new BankAccount(30510);
     Measurable[] quiz = new Measurable[5];
     quiz[0] = new Quiz(95);
     quiz[1] = new Quiz(80);
     quiz[2] = new Quiz(90);
     quiz[3] = new Quiz(50);
     quiz[4] = new Quiz(75);
     
     while(!correctInput)
     {
    	 System.out.println("Enter metric to use, 1 for maximum, 2 for minimum, 3 for average: ");
    	 String input = in.next();
    	 	if(input.equals("1"))
    	 	{
    	 		JButton button = new JButton("Get Max Balance");
    	 		panel.add(button);
    	 		JButton button2 = new JButton("Get Max Area");
    	 		panel.add(button2);
    	 		JButton button3 = new JButton("Get Max Quiz Score");
    	 		panel.add(button3);
    	 		frame.add(panel);
    	 		correctInput = true;
    	 		ActionListener balanceListener = new ClickListener("The max balance is $" + Double.toString(Data.max(bank)));
    	 		button.addActionListener(balanceListener);
    	 		ActionListener areaListener = new ClickListener("The max area is " + Double.toString(Data.max(countries)));
    	 		button2.addActionListener(areaListener);
    	 		ActionListener quizListener = new ClickListener("The highest score is " + Double.toString(Data.max(quiz)));
    	 		button3.addActionListener(quizListener);
    	 	}
    	 	else if(input.equals("2"))
    	 	{
    	 		
    	 	}
     }
   }
}
