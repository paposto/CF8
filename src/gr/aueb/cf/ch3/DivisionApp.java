package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης θα δώσει αριθμιτή και
 * παρονομαστή και το πρόγραμμα θα πρέπει να ελέγξει αν ο παρανομαστή είναι 0,
 * γιατί δεν μπορεί να γίνει διαίρεση με το 0 στην java.
 */
public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {

            System.out.println("Παρακαλώ δώστε τον αριθμητή");
            numerator = scanner.nextInt();

            System.out.println("Δώστε παρονομαστή");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Παρονομαστής δεν μπορεί να είναι 0");
                break;
            }

            result = numerator / denominator;
            System.out.printf("%d / %d = %d", numerator, denominator, result);

        }

    }
}