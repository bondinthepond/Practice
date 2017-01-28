package Miscellaneous;

/**
 * Created by aditya.mullela on 08/11/16.
 */
public class NthEvenFibonacciNumber {

    public void evenFibonacciNumberAtN (int n){

        int f0 = 0;
        int f1 = 1;

        int f2 = f0 + f1;

        for (int i=0; i<=(3*n - 2) ; i++){
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }

        System.out.println(f2);
    }
}
