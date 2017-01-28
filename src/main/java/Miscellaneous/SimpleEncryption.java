package Miscellaneous;

/**
 * Created by aditya.mullela on 27/01/17.
 */
public class SimpleEncryption {

    public void execute(String input){

        String inputWithOutSpace = new String(removeSpaces(input));

        char[][] charMatrix = buildMatrix(inputWithOutSpace);

        populateOutput(charMatrix);
    }

    public static char[][] buildMatrix(String input){

        int length = input.length();

        double l = Math.sqrt(length);

        int numberOfRows = (int) Math.floor(l);
        int numberOfColumns = (int) Math.ceil(l);

        if(numberOfColumns * numberOfRows < length){
            numberOfRows++;
        }

        char[][] charMatrix = new char[numberOfRows][numberOfColumns];

        System.out.println(numberOfRows+ " " +numberOfColumns);

        int k = 0;
        for (int r=0; r<numberOfRows; r++) {

            for(int c=0; c<numberOfColumns; c++){

                if(k < input.length()) {
                    charMatrix[r][c] = input.charAt(k);
                    k++;
                } else {
                    break;
                }
            }
        }
        return charMatrix;
    }

    public static void populateOutput(char[][] inputCharArray){

        StringBuilder builder = new StringBuilder();
        for(int j = 0; j<inputCharArray[0].length; j++) {

            for(int i = 0; i < inputCharArray.length; i++){
                if(inputCharArray[i][j] != '\u0000'){
                    builder.append(inputCharArray[i][j]);
                }}
            builder.append(" ");
        }

        int lastIndex = builder.length();
        builder.deleteCharAt(lastIndex-1);
        System.out.println(builder);
    }

    public static String removeSpaces(String input){

        char[] characters = input.toCharArray();

        StringBuilder builder = new StringBuilder();

        for( int i = 0; i < characters.length; i++){
            if(characters[i] != ' ')
                builder.append(characters[i]);
        }

        return builder.toString();
    }
}

