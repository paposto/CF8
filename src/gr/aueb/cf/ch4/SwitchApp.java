package gr.aueb.cf.ch4;

import java.util.Scanner;
import java.util.SortedMap;

/**
 * H switch-case χρησιμοποιείται αντί των
 * πολλαπλών if-then-else.
 */

public class SwitchApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Παρακαλώ εισάγετε ένα από τα παρακάτω: ");
        System.out.println("1. One-player game");
        System.out.println("2. Two-player game");
        System.out.println("3. Team games");
        System.out.println("4. Exit");

        choice = scanner.nextInt();;

        switch (choice) {
            case 1:
                System.out.println("one-player game started");
                break;
            case 2:
                System.out.println("two-player game started");
                break;
            case 3:
                System.out.println("three-player game started");
                break;
            case 4:
                System.out.println("four-player game started");
                break;
            default:
                System.out.println("Error in choice");
                break;
        }
    }
}
