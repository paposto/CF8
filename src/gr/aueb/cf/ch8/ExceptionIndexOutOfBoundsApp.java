package gr.aueb.cf.ch8;

/**
 * Τα run time exceptions που προκύπτουν από
 * προγραμματιστικά λάθη δεν τα κάνουμε try-catch
 */
public class ExceptionIndexOutOfBoundsApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i] + "");
        }
    }
}
