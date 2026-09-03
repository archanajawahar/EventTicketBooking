package com.booking;

import java.util.Scanner;

public class EventTicketBooking {

    public static double calculateTotal(String category, int tickets) {

        double price;

        switch (category.toLowerCase()) {

            case "regular":
                price = 500;
                break;

            case "premium":
                price = 1000;
                break;

            case "vip":
                price = 2000;
                break;

            default:
                throw new IllegalArgumentException("Invalid ticket category");
        }

        double total = price * tickets;

        // 10% discount for more than 5 tickets
        if (tickets > 5) {
            total = total - (total * 0.10);
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bookings: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nBooking " + i);

            System.out.print("Enter customer name: ");
            String name = sc.next();

            System.out.print("Enter ticket category (Regular/Premium/VIP): ");
            String category = sc.next();

            System.out.print("Enter number of tickets: ");
            int tickets = sc.nextInt();

            double total = calculateTotal(category, tickets);

            System.out.println("\n----- BOOKING DETAILS -----");
            System.out.println("Customer Name : " + name);
            System.out.println("Category      : " + category);
            System.out.println("Tickets       : " + tickets);
            System.out.printf("Total Amount  : Rs. %.2f%n", total);
        }

        sc.close();
    }
}
