package gr.aueb.cf.ch5;

/**
 * Υπολογίζει το α^n αναδρομικά.
 */
public class PowerRecursive {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(power(2, i));
        }

    }

    public static int power(int a, int n) {
//        if (n == 0) return 1;
//        return a * power(a, n-1);
        return (n == 0) ? 1 : a * power (a, n-1);
    }
}
