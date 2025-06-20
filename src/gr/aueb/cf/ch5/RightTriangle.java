package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει 3 αριθμούς που αναπαριστούν
 * τις πλευρές ενός ορθογώνιου τριγώνου, έστω
 * α η υποτείνουσα και b, c οι 2 κάθετες πλευρές του τριγώνου.
 * Και το πρόγραμμα ελέγχει αν το τρίγωνο είναι ορθογώνιο.
 * Ορθογώνιο είναι το τρίγωνο που είναι a*a = b*b + c*c
 */

public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Παρακαλώ εισάγετε το a, b, c (α την υποτείνουσα)");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        // Έλεγχος αν το τρίγωνο είναι ορθογώνιο.
        isRight = Math.abs(a * a - (b * b + c * c)) < EPSILON;

        System.out.println("Triange is right: " + isRight);

    }

}
