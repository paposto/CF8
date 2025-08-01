package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * θα εκφράσουμε την λογική του if-then-else
 * αλλα με linear τρόπο ελέγχοντας στην αρχή του κώδικα
 * τα failure/error conditions.
 */

public class SecretFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        final int SECRET_KEY = 12;

        System.out.println("Παρακαλώ εισάγετε ένα ακέραιο");
        num = scanner.nextInt();

        if (num != SECRET_KEY) {
            System.out.println("Secret not found");
            System.exit(1);

            System.out.println("Secret was valid. You may go on!");
        }
    }
}
