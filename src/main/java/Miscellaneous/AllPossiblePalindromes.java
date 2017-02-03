package Miscellaneous;

import java.util.*;

/**
 * Created by aditya.mullela on 18/01/17.
 */
public class AllPossiblePalindromes {

    public void findAllPalindromesIn(String s){

        if (s.equals(" ")){
            System.out.println("String is empty");
        }
        if(s.length() == 1){
            System.out.println("Longest Palindrome" + s);
        }

        Set<String> setOfPalindromes = new TreeSet<String>();

        for(int i = 1; i<s.length(); i++){
            returnIfThereIsAPalindromeBetween(i, i, s, setOfPalindromes);

            returnIfThereIsAPalindromeBetween(i, i+1, s, setOfPalindromes);
        }


        Iterator iterator = setOfPalindromes.iterator();

        int i = 1;
        while (iterator.hasNext()){


            System.out.print( i + " " + iterator.next() + " ");

            i++;
        }
    }

    public void returnIfThereIsAPalindromeBetween(int begin, int end, String s, Set resultSet){

        while(begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)){
            begin--;
            end++;
            resultSet.add(s.substring(begin+1, end));
        }
    }
}
