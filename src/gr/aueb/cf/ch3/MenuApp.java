package gr.aueb.cf.ch3;

/**
 * Εμφανίζει εξακολουθητικά ένα μενού επιλογών μέχρι
 * ο χρήστης να δώσει 'έξοδο'.
 */

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EXIT = 3;
        int choice = 0;

        do {
            System.out.println("Παρακαλώ δώστε ένα από τα παρακατώ");
            System.out.println("1. Εισαγωγή Προϊόντος");
            System.out.println("2. Διαγραφή Προϊόντος");
            System.out.println("3. Έξοδος");
            choice = scanner.nextInt();
        }
        while (choice != EXIT);
        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε την εφαρμογή μας!");

    }
}
