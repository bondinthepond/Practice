package BasicUtils;

/**
 * Created by aditya.mullela on 03/11/16.
 */
public class PrintArrayUtil {

    public static void printCharArray (Character[] characters) {

        for (int i = 0; i< characters.length; i++) {
            System.out.println(characters[i]);
        }
    }
    public static void  printIntegerArray (Integer[] integers) {

        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }
    }

    public static void printStringArray (String[] arrayOfStrings) {

        for (int i = 0; i< arrayOfStrings.length; i++) {
            System.out.println(arrayOfStrings[i]);
        }
    }

    public static void printString (String inputString) {

            System.out.println(inputString);

    }


}
