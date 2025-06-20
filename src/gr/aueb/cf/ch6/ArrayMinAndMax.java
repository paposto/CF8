package gr.aueb.cf.ch6;

/**
 * Finds min and max assuming that the
 * first element is the min element and
 * then comparing each array element with min
 * and updating if a new min is found.
 */
public class ArrayMinAndMax {

    public static void main(String[] args) {

    }

    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length < 1) return - 1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr [i] < maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }

}
