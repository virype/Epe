package epe;

import java.util.Scanner;

public class Epe1 {
	public static void main(String[] args) {

        int[][] hotel = new int[7][5];
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== HOTEL RESERVATION SYSTEM ===");
            System.out.println("1. View Rooms");
            System.out.println("2. Check In");
            System.out.println("3. Check Out");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("\n--- Current Room Status ---");

              
                for (int i = 6; i >= 0; i--) {
                    System.out.print("Floor " + (i + 1) + ": ");
                    for (int j = 0; j < 5; j++) {
                        System.out.print("[" + hotel[i][j] + "] ");
                    }
                    System.out.println();
                }

            } else if (choice == 2) {
                System.out.print("Enter floor (1-7): ");
                int floor = sc.nextInt() - 1;

                System.out.print("Enter room (1-5): ");
                int room = sc.nextInt() - 1;

                if (floor >= 0 && floor < 7 && room >= 0 && room < 5) {
                    if (hotel[floor][room] == 0) {
                        hotel[floor][room] = 1;
                        System.out.println("Check-in successful!");
                    } else {
                        System.out.println("Room already occupied!");
                    }
                } else {
                    System.out.println("Invalid floor or room number!");
                }

            } else if (choice == 3) {
                System.out.print("Enter floor (1-7): ");
                int floor = sc.nextInt() - 1;

                System.out.print("Enter room (1-5): ");
                int room = sc.nextInt() - 1;

                if (floor >= 0 && floor < 7 && room >= 0 && room < 5) {
                    if (hotel[floor][room] == 1) {
                        hotel[floor][room] = 0;
                        System.out.println("Check-out successful!");
                    } else {
                        System.out.println("Room already empty!");
                    }
                } else {
                    System.out.println("Invalid floor or room number!");
                }

            } else if (choice == 4) {
                System.out.println("Exiting System. Goodbye!");
            } else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }

}
