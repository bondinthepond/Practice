package TypesOfInputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by aditya.mullela on 03/11/16.
 */
public class ProcessStringInput {

    public static String[] getStringArray() {

        System.out.println("Enter the array of Strings");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputOfCharacters = null;
        try {
            inputOfCharacters = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] arrayOfStrings = inputOfCharacters.split(" ");

        return arrayOfStrings;
}

    public static String getString() throws IOException {

        System.out.println("Enter the String");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputString = reader.readLine();

        return inputString;
    }
}
