import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the cost per SqFt in dollars: ");
		double costSqFt = sc.nextDouble();
		
		System.out.print("Enter house length in feet: ");
		double houseLength = sc.nextDouble();
		
		
		System.out.print("Enter house width in feet: ");
		double houseWidth = sc.nextDouble();
		
		
		System.out.print("Enter house height in feet: ");
		double houseHeight = sc.nextDouble();
		
		System.out.print("Enter the number of windows: ");
		double windowNumber = sc.nextDouble();
		
		System.out.print("Enter length of windows: ");
		double windowLength = sc.nextDouble();
		
		System.out.print("Enter width of windows: ");
		double windowWidth = sc.nextDouble();
		
		System.out.print("Enter the number of doors: ");
		double doorNumber = sc.nextDouble();
		
		System.out.print("Enter the length of door: ");
		double doorLength = sc.nextDouble();
		
		System.out.print("Enter the width of door: ");
		double doorWidth = sc.nextDouble();
		
		
		
		double normalSide = ((houseLength * houseWidth)*2);
		
		double peakSide = ((houseLength * houseWidth) + 0.5*(houseLength*(houseHeight - houseWidth)))*2;
		
		double windowSqFt = windowNumber * (windowLength * windowWidth);
		
		double doorSqFt = doorNumber * (doorLength * doorWidth);
		
		double totalSqFt = (normalSide + peakSide) - (windowSqFt + doorSqFt);
		
		double totalCost = (totalSqFt * costSqFt);
		
		System.out.println("Your total paintable surface area is : " + totalSqFt + "square feet");
		
		System.out.println("The total cost to paint your house is : $ " + totalCost);

	}

}
