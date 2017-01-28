package Miscellaneous;

import java.math.BigInteger;

/**
 * Created by aditya.mullela on 27/01/17.
 */
public class CalculateFactorial {

    public static void factorial(int inputNumber) {

        BigInteger factorial = new BigInteger("1");

        for (int i = inputNumber; i > 0; i--) {
            BigInteger bigInteger = new BigInteger(String.valueOf(i));
            factorial = factorial.multiply(bigInteger);
        }

        System.out.println(factorial);

    }
}
