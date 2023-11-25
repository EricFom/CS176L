package monmouth.edu;

import java.util.Scanner;

public class Seating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Airplane airplane = new Airplane();

        while (true) {
            System.out.println("\nEnter a command: add passengers, show seating, quit");
            String command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "add passengers":
                    System.out.println("Enter class (first or economy): ");
                    String seatClass = scanner.nextLine();

                    System.out.println("Enter number of passengers: ");
                    int numPassengers = Integer.parseInt(scanner.nextLine());

                    System.out.println("Enter seat preference (aisle, window, center): ");
                    String seatPreference = scanner.nextLine();

                    airplane.addPassengers(seatClass, numPassengers, seatPreference);
                    break;

                case "show seating":
                    airplane.showSeating();
                    break;

                case "quit":
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid command. Try again.");
            }
        }
    }
}
