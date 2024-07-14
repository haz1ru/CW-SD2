import java.util.Scanner;

public class CinemaManagement {



    public static void main(String[]args) {
        System.out.println ("Welcome to The London Lumiere");


        Scanner scanner = new Scanner(System.in);

            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("Please select an option:");
            System.out.println("\t1)    Buy a ticket");
            System.out.println("\t2)    Cancel ticket");
            System.out.println("\t2)    See seating plan");
            System.out.println("\t3)    Find First available");
            System.out.println("\t5)    Print tickets information and total price");
            System.out.println("\t6)    Search ticket");
            System.out.println("\t7)    Sort ticket by price");
            System.out.println("\t8)    Exit");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("Select option:");
            int choice = scanner.nextInt();

            while (true) {

                switch (choice) {
                    case 1:
                        buy_seat();
                        break;
                    case 2:
                        cancel_seat();
                        break;
                    case 3:
                        find_first_available();
                        break;
                    case 4:
                        show_seating_plan();
                        break;
                    case 5:
                        print_tickets_info();
                        break;
                    case 6:
                        search_ticket();
                        break;
                    case 7:
                        sort_ticket();
                        break;

                    case 8:
                        System.out.println("Terminating Program.Have a great day");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 8.");
                }
            }
    }
    private static void buy_seat() {}
    private static void cancel_seat(){}
    private static void find_first_available(){}
    private static void show_seating_plan(){}
    private static void print_tickets_info(){}
    private static void search_ticket(){}
    private static void sort_ticket(){}

}
