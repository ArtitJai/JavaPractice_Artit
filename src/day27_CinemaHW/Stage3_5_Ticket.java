package day27_CinemaHW;

import java.util.Arrays;
import java.util.Scanner;

public class Stage3_5_Ticket {

		/*## Description

		When choosing a ticket you are guided not only by your space preference but also
		by your finances. Let's implement the opportunity to check the ticket price and
		see the reserved seat.
		
		## Objectives
		
		Read two positive integer numbers that represent the number of rows and seats in
		each row and print the seating arrangement like in the first stage. Then, read
		two integer numbers from the input: a row number and a seat number in that row.
		These numbers represent the coordinates of the seat according to which the
		program should print the ticket price. The ticket price is determined by the
		same rules as the previous stage:
		
		- If the total number of seats in the screen room is not more than 60, then the
		  price of each ticket is 10 dollars.
		- In a larger room, the tickets are 10 dollars for the front half of the rows
		  and 8 dollars for the back half. Please note that the number of rows can be
		  odd, for example, 9 rows. In this case, the first half is the first 4 rows,
		  and the second half is the last 5 rows.
		
		After that, the program should print out all the seats in the screen room as
		shown in the example and mark the chosen seat by the B symbol. Finally, it
		should print the ticket price and stop. Note that in this project, the number of
		rows and seats won't be greater than 9.
		
		## Examples
		
		The greater-than symbol followed by a space `(> )` represents the user input.
		Note that it's not part of the input.
		
		### Example 1
		
		```text
		Enter the number of rows:
		> 7
		Enter the number of seats in each row:
		> 8
		
		Cinema:
		  1 2 3 4 5 6 7 8
		1 S S S S S S S S
		2 S S S S S S S S
		3 S S S S S S S S
		4 S S S S S S S S
		5 S S S S S S S S
		6 S S S S S S S S
		7 S S S S S S S S
		
		Enter a row number:
		> 3
		Enter a seat number in that row:
		> 6
		
		Ticket price: $10
		
		Cinema:
		  1 2 3 4 5 6 7 8
		1 S S S S S S S S
		2 S S S S S S S S
		3 S S S S S B S S
		4 S S S S S S S S
		5 S S S S S S S S
		6 S S S S S S S S
		7 S S S S S S S S
		```
		
		### Example 2
		
		```text
		Enter the number of rows:
		> 8
		Enter the number of seats in each row:
		> 9
		
		Cinema:
		  1 2 3 4 5 6 7 8 9
		1 S S S S S S S S S
		2 S S S S S S S S S
		3 S S S S S S S S S
		4 S S S S S S S S S
		5 S S S S S S S S S
		6 S S S S S S S S S
		7 S S S S S S S S S
		8 S S S S S S S S S
		
		Enter a row number:
		> 6
		Enter a seat number in that row:
		> 5
		
		Ticket price: $8
		
		Cinema:
		  1 2 3 4 5 6 7 8 9
		1 S S S S S S S S S
		2 S S S S S S S S S
		3 S S S S S S S S S
		4 S S S S S S S S S
		5 S S S S S S S S S
		6 S S S S B S S S S
		7 S S S S S S S S S
		8 S S S S S S S S S
		```
		*/
	private static final Scanner scanner = new Scanner(System.in);

    private static final char VACANT_SEAT = 'S';
    private static final char BOOKED_SEAT = 'B';

    private static final int SMALL_CINEMA_SIZE = 60;
    private static final int PRICE_FRONT_SEATS = 10;
    private static final int PRICE_BACK_SEATS = 8;

    public static final int CHOICE_PRINT_SEATS = 1;
    public static final int CHOICE_BOOK_SEAT = 2;
    public static final int CHOICE_STATISTICS = 3;
    public static final int CHOICE_EXIT = 0;

    private static int numberOfRows = 0;
    private static int numberOfSeats = 0;

    private static int numberOfPurchasedTickets = 0;
    private static float percentageOfPurchasedTickets = 0.0f;
    private static int currentIncome = 0;
    private static int totalIncome = 0;

    private static char[][] seats;

    public static void main(String[] args) {

        fillSeats();
        processUserChoice();
    }

    private static void fillSeats() {

        System.out.println("Enter the number of rows:");
        numberOfRows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        numberOfSeats = scanner.nextInt();

        seats = new char[numberOfRows][numberOfSeats];

        for (char[] row : seats) {
            Arrays.fill(row, VACANT_SEAT);
        }

        calculateTotalIncome();
    }

    private static void calculateTotalIncome() {
        int totalNumberOfSeats = getTotalNumberOfSeats();

        if (totalNumberOfSeats <= SMALL_CINEMA_SIZE) {
            totalIncome = totalNumberOfSeats * PRICE_FRONT_SEATS;
        } else {
            int frontRows = numberOfRows / 2;
            int frontSeats = frontRows * numberOfSeats;
            int backRows = numberOfRows - frontRows;
            int backSeats = backRows * numberOfSeats;
            totalIncome = (frontSeats * PRICE_FRONT_SEATS) + (backSeats * PRICE_BACK_SEATS);
        }
    }

    private static int getTotalNumberOfSeats() {
        return numberOfRows * numberOfSeats;
    }

    private static void processUserChoice() {
        int userChoice;
        do {
            printMenu();
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case CHOICE_PRINT_SEATS:
                    printSeats();
                    break;
                case CHOICE_BOOK_SEAT:
                    bookSeat();
                    break;
                case CHOICE_STATISTICS:
                    printStatistics();
                    break;
                default:
                    break;
            }
        } while (userChoice != CHOICE_EXIT);
    }

    private static void printMenu() {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
    }

    private static void printSeats() {

        System.out.println("Cinema:");
        printSeatNumbers();

        for (int rowIndex = 0; rowIndex < seats.length; rowIndex++) {

            int rowNumber = rowIndex + 1;
            StringBuilder rowSeatsStatus = new StringBuilder("" + rowNumber);

            char[] row = seats[rowIndex];

            for (char seatStatus : row) {
                rowSeatsStatus.append(" ").append(seatStatus);
            }
            System.out.println(rowSeatsStatus);
        }
        System.out.println();
    }

    private static void printSeatNumbers() {

        int rowLength = seats[0].length;
        StringBuilder seatNumbers = new StringBuilder(" ");

        for (int seatNumber = 1; seatNumber <= rowLength; seatNumber++) {
            seatNumbers.append(" ").append(seatNumber);
        }
        System.out.println(seatNumbers);
    }

    private static void bookSeat() {

        int rowNumber;
        int seatNumber;
        boolean isInvalidRowNumber;
        boolean isInvalidSeatNumber;
        int rowIndex;
        int seatIndex;

        do {
            do {
                System.out.println("Enter a row number:");
                rowNumber = scanner.nextInt();

                System.out.println("Enter a seat number in that row:");
                seatNumber = scanner.nextInt();

                isInvalidRowNumber = (rowNumber < 1 || rowNumber > numberOfRows);
                isInvalidSeatNumber = (seatNumber < 1 || seatNumber > numberOfSeats);

                if (isInvalidRowNumber || isInvalidSeatNumber) {
                    System.out.println("Wrong input!\n");
                }
            } while (isInvalidRowNumber || isInvalidSeatNumber);

            rowIndex = rowNumber - 1;
            seatIndex = seatNumber - 1;
            if (seats[rowIndex][seatIndex] == BOOKED_SEAT) {
                System.out.println("That ticket has already been purchased!\n");
            }
        } while (seats[rowIndex][seatIndex] == BOOKED_SEAT);

        seats[rowIndex][seatIndex] = BOOKED_SEAT;

        int ticketPrice = getTicketPrice(rowNumber);
        System.out.printf("Ticket price: $%d\n\n", ticketPrice);

        numberOfPurchasedTickets++;
        currentIncome += ticketPrice;
        recalculatePercentage();
    }

    private static int getTicketPrice(int rowNumber) {
        int ticketPrice;
        int totalNumberOfSeats = getTotalNumberOfSeats();
        int frontRows = numberOfRows / 2;
        if ((totalNumberOfSeats <= SMALL_CINEMA_SIZE) || (rowNumber <= frontRows)) {
            ticketPrice = PRICE_FRONT_SEATS;
        } else {
            ticketPrice = PRICE_BACK_SEATS;
        }
        return ticketPrice;
    }

    private static void recalculatePercentage() {
        percentageOfPurchasedTickets = ((float) numberOfPurchasedTickets / getTotalNumberOfSeats() * 100);
    }

    private static void printStatistics() {
        System.out.printf("Number of purchased tickets: %d\n", numberOfPurchasedTickets);
        System.out.printf("Percentage: %.2f%%\n", percentageOfPurchasedTickets);
        System.out.printf("Current income: $%d\n", currentIncome);
        System.out.printf("Total income: $%d", totalIncome);
        System.out.println("\n");
    }
}
	

