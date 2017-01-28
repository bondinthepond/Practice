package TypesOfInputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by aditya.mullela on 03/11/16.
 */
public class ProcessCharInput {

    public static Character[] getCharArray() throws IOException {

        System.out.println("Enter the array of characters");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputOfCharacters = reader.readLine();
        String[] arrayOfInputs = inputOfCharacters.split(" ");
        Character[] arrayOfCharacters = new Character[arrayOfInputs.length];

        for (int i = 0; i<arrayOfInputs.length; i++) {
            arrayOfCharacters[i] = arrayOfInputs[i].charAt(0);
        }
        return arrayOfCharacters;
    }
}
