package gr.aueb.cf.ch7;

import java.math.BigInteger;

/**
 * From string to primitive data types.
 * From class to string.
 */
public class StringTypecast {

    public static void main(String[] args) {
        String s = "Coding";
        double myDouble = 3.5;
        BigInteger bigInt = new BigInteger("123456789");

        String strDouble = String.valueOf(myDouble);
        String strInt = bigInt.toString();
    }

}
