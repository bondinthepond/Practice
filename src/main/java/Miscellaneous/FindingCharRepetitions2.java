package Miscellaneous;

/**
 * Created by aditya.mullela on 16/11/16.
 */
public class FindingCharRepetitions2 {

    public static boolean isUniqueChar2(String string) {
        boolean[] char_set = new boolean[128];
        for(int i = 0; i< string.length(); i++){
            int val = string.charAt(i);
            System.out.println(val);
            if(char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }

}
