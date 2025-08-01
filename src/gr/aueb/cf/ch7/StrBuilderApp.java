package gr.aueb.cf.ch7;

/**
 * {@link StringBuilder} is mutable!
 */
public class StrBuilderApp {
    public static void main(String[] args) {
        String concatStr = "";
        StringBuilder sb = new StringBuilder();
        long timeStart = 0L;
        long timeEnd = 0L;
        double strElapsedTime;
        double sbElapsedTime;


        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 50_000; i++) {
            concatStr = concatStr + i;
        }
        timeEnd = System.currentTimeMillis();
        strElapsedTime = (timeEnd - timeStart) / 1000.0;

        // Test StringBuilder
        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 50_000; i++) {
            sb.append(i);
        }
        timeEnd = System.currentTimeMillis();
        sbElapsedTime = (timeEnd - timeStart) / 1000.0;

        System.out.println("String concat time: " + strElapsedTime + " sec");
        System.out.println("StringBuilder time: " + sbElapsedTime + " sec");
    }
}
