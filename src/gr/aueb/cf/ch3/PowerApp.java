package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη δύο ακεραίους , έστω
 * base και power και υπολογίζει με επαναληπτικό
 * τρόπο (while) την δύναμη base^power και εκτυπώνει
 * το αποτέλεσμα στο stdout. Για παράδειγμα, αν ο χρήστης
 * δώσει base = 2 και power = 10, τότε το base^power = 1024,
 * δηλαδή 2 * 2 * 2 *...* 2, 10 φορές που ισούται με 1024.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.print("Παρακαλώ εισάγετε δύο ακεραίους, base και power: ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power) {
            result = result * base; // result *= base;
            i++;
        }
        System.out.printf("%d^%d =%d", power, power, result);

    }

}
