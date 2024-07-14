import java.util.Scanner;

public class CinemaManagement {
    private static final int ROWS=3;
    private static final int[] SEAT_PER_ROW = {16};
    private static final char[][] seats = new char[ROWS][];


    public static void main(String[]args) {
        System.out.println ("Welcome to The London Lumiere");


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("Please select an option:");
            System.out.println("\t1)    1) Buy a ticket");
            System.out.println("\t2)    2) Cancel ticket");
            System.out.println("\t2)    3) See seating plan");
            System.out.println("\t3)    4) Find First available");
            System.out.println("\t5)    5) Print tickets information and total price");
            System.out.println("\t6)    6) Search ticket");
            System.out.println("\t7)    7) Sort ticket by price");
            System.out.println("\t8)    8) Exit");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("Select option:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    buySeat(scanner);
                    break;
                case 2:
                    cancelSeat(scanner);
                    break;
                case 3:
                    findFirstAvailable();
                    break;
                case 4:
                    showSeatingPlan();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

}
