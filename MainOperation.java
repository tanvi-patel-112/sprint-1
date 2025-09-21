package com.demo.Operation;

import java.util.Scanner;

public class MainOperation {

    static Scanner sc = new Scanner(System.in);

    public static void mainOps() {
        while (true) {
            System.out.println("\n==== Online Food Ordering System ====");
            System.out.println("1. User Operations");
            System.out.println("2. Restaurant Operations");
            System.out.println("3. MenuItem Operations");
            System.out.println("4. Order Operations");
            System.out.println("5. OrderItem Operations");
            System.out.println("6. Payment Operations");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    AllOperations.userOperations();
                    break;
                case 2:
                    AllOperations.restaurantOperations();
                    break;
                case 3:
                    AllOperations.menuItemOperations();
                    break;
                case 4:
                    AllOperations.orderOperations();
                    break;
                case 5:
                    AllOperations.orderItemOperations();
                    break;
                case 6:
                    AllOperations.paymentOperations();
                    break;
                case 7:
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    public static void main(String[] args) {
        mainOps();
    }
}
