package Miscellaneous;

/**
 * Created by aditya.mullela on 30/01/17.
 */
public class LCMandGCD {

    public static int findLCM(int a, int b){

        int LCM = (a*b)/findGCD(a,b);

        return LCM;
    }

    public static int findGCD(int a , int b){

        if(b == 0){
            return a;
        } else {
            return findGCD(b, a%b);
        }
    }

    public static int findLCM(int[] array){

        int LCM = array[0];
        for(int i = 1; i<array.length; i++){
            LCM  = findLCM(array[i], LCM);
        }
        return LCM;
    }

    private static int findGCD(int[] array){

        int GCD = array[0];
        for(int i = 1; i<array.length; i++){
            GCD  = findGCD(array[i], GCD);
        }
        return GCD;
    }
}
