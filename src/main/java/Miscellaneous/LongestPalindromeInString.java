package Miscellaneous;

/**
 * Created by aditya.mullela on 17/01/17.
 */
public class LongestPalindromeInString {

    public String getLongestPalindrome(String s){

        if (s.isEmpty()) {
            return null;
        }

        if (s.length() == 1) {
            return s;
        }

        String currentLongest = s.substring(0,1);


        for(int i = 0 ; i < s.length() ; i++){

            // get pailndrom with centre i
            String temp = getPalindromeAt(s, i, i);
            if (temp.length() > currentLongest.length()) {
                currentLongest = temp;
            }

            //get palindrome with centre i, i+1
            temp = getPalindromeAt(s, i, i+1);
            if (temp.length() > currentLongest.length()) {
                currentLongest = temp;
            }
        }
        return currentLongest;
    }

    public String getPalindromeAt(String s, int begin, int end) {

        while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
            return s.substring(begin+1, end);
        }
}
