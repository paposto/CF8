package gr.aueb.cf.ch5;

/**
 * Υπολογίζει το παραγοντικό του n.
 * n! = 1 * 2 * ... * n
 * Για παράδειγμα το 3! = 1 * 2 * 3 = 6
 * Επίσης το 0! = 1
 * Επίσης δεν ορίζεται αρνητικό παραγοντικό.
 */
public class Factorial {

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%d! = %,15d\n", i, facto(i));
        }
    }

    /**
     * calculates n!.
     * @param n     the input integer.
     * @return      the factorial of n.
     */
    public static int facto (int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;    // result *= i;
        }
        return result;
    }

    public static void printTheResult (int result) {
        System.out.println("Το αποτέλεσμα είναι " + result);
    }
}
