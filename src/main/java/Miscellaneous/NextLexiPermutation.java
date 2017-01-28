package Miscellaneous;

import java.util.Scanner;

/**
 * Created by aditya.mullela on 29/01/17.
 */
public class NextLexiPermutation {

    public void execute(){
        Scanner scan = new Scanner(System.in);
        int numberOfTestCases = scan.nextInt();

    String[] strings = new String[numberOfTestCases];

    String s = scan.nextLine();
    for (int i = 0; i < numberOfTestCases; i++) {
        strings[i] = scan.nextLine();
    }

    for (String s1: strings) {
        checkLexi(s1);
    }
}

    public static void checkLexi(String s){

        char[] charArray = s.toCharArray();
        int n = s.length();

        int k = getPointOfFirstDiscrepancy(charArray);

        if(k == -1){
            System.out.println("no answer");
        }

        if(k != -1) {
            int j = n-1;

            while (charArray[k] >= charArray[j]) {
                j--;
            }

            swap(k++, j, charArray);

            j = n - 1;

            while (k < j) {
                swap(k++, j--, charArray);
            }

            StringBuilder builder = new StringBuilder();

            for(int p = 0; p< charArray.length; p++){
                builder.append(charArray[p]);
            }

            System.out.println(builder.toString());
        }

    }



    public static int getPointOfFirstDiscrepancy(char[] charArray){

        for(int i = charArray.length - 2 ; i>=0; i--){
            if(charArray[i]<charArray[i+1]){
                return i;
            }
        }

        return -1;
    }

    public static void swap(int m, int n, char[] charArray){

        char temp = charArray[m];
        charArray[m] = charArray[n];
        charArray[n] = temp;
    }
}
