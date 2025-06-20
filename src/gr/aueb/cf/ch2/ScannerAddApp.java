package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διβάζει δύο ακεραίους από το
 * stain (keyboard) και υπολογίζει το αποτέλεσμα.
 */
public class ScannerAddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Εντολές
        System.out.println("Παρακαλώ είσαγετε δύο ακεραίους");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        // Εκτύπωση Αποτελεσμάτων
        System.out.printf("Το άθροισμα των %d και %d είναι ίσο με %d", num1, num2, sum);

    }
}
