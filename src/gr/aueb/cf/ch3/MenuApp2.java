package gr.aueb.cf.ch3;

/**
 * Εκφράζει την λογική της do-while αλλά με τη χρήση
 * αέναου while-do και sentinel.
 */

import java.util.Scanner;

public class MenuApp2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EXIT = 3;
        int choice = 0;

        while (true) {
            System.out.println("Παρακαλώ δώστε ένα από τα παρακατώ");
            System.out.println("1. Εισαγωγή Προϊόντος");
            System.out.println("2. Διαγραφή Προϊόντος");
            System.out.println("3. Έξοδος");
            choice = scanner.nextInt();
            if (choice == EXIT) {
                break;
            }
            System.out.println("Ευχαριστούμε που χρησιμοποιήσατε την εφαρμογή μας!");
        }
    }
}