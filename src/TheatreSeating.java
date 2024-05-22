import java.util.Scanner;

/**
 * The TheatreSeating class models a movie theatre seating arrangement.
 * '0' represents an available seat, while 'X' represents a reserved seat.
 */
public class TheatreSeating {
    private char[][] seats;

    // Constructor to initialize the seating chart with all seats set to available.
    public TheatreSeating(int rows, int cols) {
        seats = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = '0';
            }
        }
    }

    // Displays the current seating chart.
    public void displaySeatingChart() {
        System.out.println("Current Seating Chart:");
        for (char[] row : seats) {
            for (char seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }

    // Attempts to reserve a seat. If already reserved, notifies the user.
    public void reserveSeat(int row, int col) {
        if (seats[row][col] == 'X') {
            System.out.println("Seat " + (row + 1) + "-" + (col + 1) + " is already taken.");
        } else {
            seats[row][col] = 'X';
            System.out.println("Seat " + (row + 1) + "-" + (col + 1) + " has been successfully reserved.");
        }
    }

    // Main method to test the functionality of the TheatreSeating class.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a TheatreSeating object with a seating chart of 5 rows and 5 columns.
        TheatreSeating theatre = new TheatreSeating(5, 5);

        // Display the initial seating chart.
        theatre.displaySeatingChart();

        // Reserve a seat based on user input.
        System.out.print("Enter row to reserve (1-5): ");
        int row = scanner.nextInt() - 1;
        System.out.print("Enter column to reserve (1-5): ");
        int col = scanner.nextInt() - 1;

        theatre.reserveSeat(row, col);

        // Display the seating chart after reserving a seat.
        theatre.displaySeatingChart();

        // Attempt to reserve the same seat again to demonstrate reservation check.
        System.out.print("Enter row to reserve (1-5): ");
        row = scanner.nextInt() - 1;
        System.out.print("Enter column to reserve (1-5): ");
        col = scanner.nextInt() - 1;

        theatre.reserveSeat(row, col);

        // Display the final seating chart.
        theatre.displaySeatingChart();
    }
}
