package gr.aueb.cf.ch3;

/**
 * Σύντομος κώδικας για την εισαγωγή από τον χρήστη
 * ακεραίων μέχρι να βρεθεί το -1
 */
import java.util.Scanner;

public class SentinelApp2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Παρακαλώ εισάγετε ακεραίους (-1 για έξοδο)");
        num = scanner.nextInt();

        while ((num = scanner.nextInt()) !=-1) {
            iterations++;
            System.out.println("Παρακαλώ δώστε τον επόμενο ακέραιο (-1 για έξοδο)");
        }

        System.out.printf("%d επαναλήψεις", iterations);
    }

}
