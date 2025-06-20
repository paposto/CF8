package gr.aueb.cf.ch2;

/**
 * Εμφανίζει την ημεροηνία σε μορφή
 * dd/MM/yyyy
 */
public class DateApp {

    public static void main (String[] args) {
        int day = 2;
        int month = 4;
        int year = 2025;

        System.out.println("Η ημερομηνία είναι: " + day + "/" + month + "/" + year);
        System.out.printf("Η ημερομηνία είναι: %d/%d/%d", day, month, year);
    }
}
