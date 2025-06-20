package gr.aueb.cf.ch2;

import java.util.Scanner;
import java.util.SortedMap;

/**
 * Ο χρήστης δίνει την ηλικία του σε έτη (έστω ακέραιος)
 * και το πρόγραμμα επιστρέφει την ηλικία σε ημέρες, όπου
 * θεωρούμε ότι 1 έτος = 365 ημέρες. Για παράδειγμα αν δοθεί
 * ηλικία 20 ετών, το αποτέλεσμα είναι 7300 ημέρες.
 */
public class YearsToDays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int DAYS_PER_YEAR = 365;
        int inputAgeInYears = 0;
        int ageInDays = 0;


        System.out.println("Παρακαλώ εισάγετε την ηλικία σας σε έτη");
        inputAgeInYears = scanner.nextInt();
        ageInDays = inputAgeInYears * DAYS_PER_YEAR;

        System.out.printf("");
        System.out.println("Η ηλικίας σας σε ημέρες είναι: " + ageInDays);
    }
}
