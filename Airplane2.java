package monmouth.edu;
import java.util.Scanner;

class Airplane {
    private static final int FIRST_CLASS_ROWS = 5;
    private static final int FIRST_CLASS_SEATS_PER_ROW = 4;
    private static final int ECONOMY_CLASS_ROWS = 15;
    private static final int ECONOMY_CLASS_SEATS_PER_ROW = 6;

    private boolean[][] firstClassSeats;
    private boolean[][] economyClassSeats;

    public Airplane() {
        firstClassSeats = new boolean[FIRST_CLASS_ROWS][FIRST_CLASS_SEATS_PER_ROW];
        economyClassSeats = new boolean[ECONOMY_CLASS_ROWS][ECONOMY_CLASS_SEATS_PER_ROW];
    }

    public boolean addPassengers(String seatClass, int numPassengers, String seatPreference) {
        boolean[][] seats;

        if ("first".equalsIgnoreCase(seatClass)) {
            seats = firstClassSeats;
            if ("center".equalsIgnoreCase(seatPreference)) {
                System.out.println("No center seating available in first class.");
                return false;
            }
        } else if ("economy".equalsIgnoreCase(seatClass)) {
            seats = economyClassSeats;
        } else {
            System.out.println("Invalid seat class");
            return false;
        }

        int rows = seats.length;
        int seatsPerRow = seats[0].length;

        for (int row = 0; row < rows; row++) {
            int availableSeats = 0;
            int startSeat = -1;

            for (int seat = 0; seat < seatsPerRow; seat++) {
                if (!seats[row][seat]) {
                    if (startSeat == -1) {
                        startSeat = seat;
                    }
                    availableSeats++;
                } else {
                    startSeat = -1;
                    availableSeats = 0;
                }

                if (availableSeats == numPassengers) {
                    for (int i = 0; i < numPassengers; i++) {
                        seats[row][startSeat + i] = true;
                    }
                    System.out.println("Passengers assigned to seats in " + seatClass + " class.");
                    return true;
                }
            }
        }

        System.out.println("No matching seats available in " + seatClass + " class.");
        return false;
    }

    public void showSeating() {
        System.out.println("First Class Seating:");
        printSeating(firstClassSeats);

        System.out.println("\nEconomy Class Seating:");
        printSeating(economyClassSeats);
    }

    private void printSeating(boolean[][] seats) {
        for (int row = 0; row < seats.length; row++) {
            for (int seat = 0; seat < seats[0].length; seat++) {
                char status = seats[row][seat] ? 'X' : 'O';
                System.out.print(status + " ");
            }
            System.out.println();
        }
    }
}

