package gr.aueb.cf.ch3;

/**
 * Μετράει το πλήθος των συνεχόμενων θετικών ακεραίων
 * (συμπεριλαμβάνων και το 0) που δίνει ο χρήστης.
 */
import java.util.Scanner;


public class PositivesCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        System.out.println("Παρακαλώ δώστε μια ακολουθία συνεχόμενων θετικών ακεραίων");
        num = scanner.nextInt();

        while (num >= 0) {
            positivesCount++;
            System.out.println("Παρακαλώ δώστε τον επόμενο ακέραιο");
            num = scanner.nextInt();
        }

        System.out.println("Positives count: " + positivesCount);
    }
}
