package gr.aueb.cf.ch3;

/**
 * Εμφανίζει 5 σειρές από 10 αστεράκια
 */
public class NestedStars {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while(j <=5) {
            i = 1;

            while (i <= 10) {
                System.out.println("*");
                i++;
             }

            System.out.println();
            j++;
        }

    }
}