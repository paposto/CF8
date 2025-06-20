package gr.aueb.cf.ch3;

/**
 * Βρίσκει το απόλυτο ενό ακέραιου με τη χρήση
 * τριαδικού τελεστή. Το απόλυτο ενός ακεραίου
 * είναι ο θετικός ακέραιος.
 * Για παράδειγμα το απόλυτο του -5 είναι 5
 * το απόλυτο του 5 είναι -5
 */
import java.util.Scanner;

public class AbsTernary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int abs;

        System.out.println("Παρακαλώ εισάγετε δύο ακέραιους");
        num1 =scanner.nextInt();

        abs = (num1 >= 0) ? num1 : -num1;
    }


}