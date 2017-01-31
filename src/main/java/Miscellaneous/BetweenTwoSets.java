package Miscellaneous;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aditya.mullela on 31/01/17.
 */
public class BetweenTwoSets {

    public static void execute(){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[] a = new int[n];

    for(int a_i=0; a_i < n; a_i++){
        a[a_i] = in.nextInt();
    }

    int[] b = new int[m];
    for(int b_i=0; b_i < m; b_i++){
        b[b_i] = in.nextInt();
    }

    in.close();

    Arrays.sort(a);
    Arrays.sort(b);

    //using the logic that x will be between largest of a and smallest of b

    int count = 0;
    int lastNum = a[a.length - 1];

    for(int i = lastNum; i<=b[0]; i++){
        boolean isFactorOfA = true;
        boolean isFactorOfB = true;

        for(int x : a){
            if(i % x != 0) {
                isFactorOfA = false;
                break;
            }
        }

        for(int y : b){
            if(y%i != 0) {
                isFactorOfB = false;
                break;
            }
        }

        if(isFactorOfA && isFactorOfB){
            count++;
        }
    }
    System.out.println(count);
}
}

