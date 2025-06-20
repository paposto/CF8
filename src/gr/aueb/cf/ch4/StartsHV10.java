package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10 γραμμές αστεράκια με 10 αστεράκια
 * σε κάθε γραμμή.
 */
public class StartsHV10 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
