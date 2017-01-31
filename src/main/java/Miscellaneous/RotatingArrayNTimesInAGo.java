package Miscellaneous;

import java.util.ArrayList;

/**
 * Created by aditya.mullela on 31/01/17.
 */
public class RotatingArrayNTimesInAGo {

    public static void rotateArray(ArrayList<Integer> a, int b) {

        ArrayList<Integer> ret = new ArrayList<Integer>();

        int x;

        if(b > a.size()){
            x = b % a.size();
        } else {
            x = b;
        }

        for (int i = x; i < a.size(); i++) {
            ret.add(a.get(i));
        }

        for(int i = 0; i < x; i++) {
            ret.add(a.get(i));
        }

        for(int j = 0; j<ret.size();j++){
            System.out.println(ret.get(j));
        }
    }
}
