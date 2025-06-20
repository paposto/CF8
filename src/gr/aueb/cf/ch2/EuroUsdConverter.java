package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει από το χρήση ένα ποσό
 * σε Ευρώ και μετατρέπει σε USD και cents.
 * Η ισοτιμία είναι 99 USD cents = 1 Euro.
 * Εκτυπώνει το αποτέλεσμα.
 */
public class EuroUsdConverter {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        int inputEuros = 0;
        int totalUsdCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        // Εντολές
        System.out.println("Παρακαλώ εισάγετε ένα ποσό σε Euro (ακέραιο)");
        inputEuros = in.nextInt();

        totalUsdCents = inputEuros * PARITY; //magic number
        usaDollars = totalUsdCents / 100;
        usaCents = totalUsdCents % 100;

        System.out.printf("%d \u20AC = %d \u0024, %d usa cents", inputEuros, usaDollars, usaCents);
    }

}
