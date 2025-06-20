package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * To {@link java.until.InputMismatchException} συμβαίνει όταν ο
 * scanner αποτυγχάνει να διαβάσει το σωστό data type.
 */
public class ExceptionInputMisMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο.");
 //       num1 = scanner.nextInt(); Δίνει mismatch αν δοθεί non-int

        while (!scanner.hasNextInt()) {     // κοιτάζει αν ο χαρακτήρας είναι int
            System.out.println("Μη αποδεκτοί χαρακτήρες. Παρακαλώ εισάγετε ακέραιο.");
            scanner.nextLine();
        }
        num1 = scanner.nextInt();
        System.out.println("Num: " + num1);
    }
}
