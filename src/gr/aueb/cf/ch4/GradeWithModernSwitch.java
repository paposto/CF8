package gr.aueb.cf.ch4;

import java.util.Scanner;
import java.util.SortedMap;

/**
 * Ο χρήστης εισάγει ένα βαθμό από 1-10
 * και το πρόγραμμα εμφανίζει κατάλληλο μήνυμα
 * όπως Άριστα (9, 10), Πολύ καλά (7, 8), Καλά (5, 6)
 * και Αποτυχία (1-4).
 *
 * Χρησιμοποιεί modern switch.
 */
public class GradeWithModernSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;

        System.out.println("Παρακαλώ εισάγετε το βαθμό");
        grade = scanner.nextInt();

        switch (grade) {
            case  1, 2, 3, 4 -> {
                System.out.println("Αποτυχία"); //Μέσα στο bracket βάζω όσες εντολές θέλω.
            }
            case 5, 6 -> System.out.println("Καλώς");
            case 7, 8 -> System.out.println("Άριστα");
            default -> System.out.println("Λάθος βαθμός");
        }
    }
}
