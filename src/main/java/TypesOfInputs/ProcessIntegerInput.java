package TypesOfInputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by aditya.mullela on 03/11/16.
 */
public class ProcessIntegerInput {

    public static Integer[] getIntegerArray () throws IOException {

        System.out.println("Enter the array of integers");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputOfIntegers = reader.readLine();
        String[] arrayOfInputs = inputOfIntegers.split(" ");
        Integer[] arrayOfIntegers = new Integer[arrayOfInputs.length];

        for (int i = 0; i<arrayOfInputs.length; i++) {
            arrayOfIntegers[i] = Integer.parseInt(arrayOfInputs[i]);
        }
        return arrayOfIntegers;
    }

    public static int getSingleInteger() throws IOException{
        System.out.println("Enter the integer");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        int inputInteger = Integer.parseInt(input);

        return inputInteger;
    }
}
