package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Να υπολογίζει τη δύναμη a ^ n.
 */
public class PowerApp {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("2^%d = %,5d\n", i, power(2, i));
        }

    }

    public static long power(int a, int n) {
//        int result = 1;
//
//        for (int i = 1; i <= n; i++) ;
//        {
//            result = result * a;
//        }
//
//        return result;
        return (long) Math.pow(a, n);
    }
}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double power = 0;
//        double base = 0;
//
//        for (int i = 1; i <= power; i++);
//        System.out.println("Παρακαλώ εισάγετε δύο ακέραιους");
//        power = scanner.nextInt();
//        base = scanner.nextInt();
//
//
//    double result = Math.pow(power, base);
//        System.out.println("Το αποτέλεσμα είναι: " + result);
//
//    }

