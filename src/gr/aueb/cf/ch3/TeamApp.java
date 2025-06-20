package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει μία θερμοκρασία από τον χρήστη
 * και εμφανίζει κατάλληλο μήνυμα αν η θερμοκρασία
 * είναι κάτω από το μηδέν (0).
 *
 */
public class TeamApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero = false;

        System.out.println("Παρακαλώ εισάγετε μία θερμοκρασία");
        temp = scanner.nextInt();

        isTempBelowZero = temp < 0;

        System.out.println("Η Θερμοκρασία είναι κάτω από το μηδέν: " + isTempBelowZero);
    }
}
