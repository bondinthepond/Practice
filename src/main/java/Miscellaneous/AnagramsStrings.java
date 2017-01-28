package Miscellaneous;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by aditya.mullela on 18/11/16.
 */
public class AnagramsStrings {

    private FindingCharRepetitionsInAString findingCharRepetitionsInAString;

    public void findIfStringsAreAnagrams(String s1, String s2) {

        HashMap<Character, Integer> hashMap1;

        HashMap<Character, Integer> hashMap2;

        findingCharRepetitionsInAString = new FindingCharRepetitionsInAString();

        hashMap1 = findingCharRepetitionsInAString.calculateRepetitions(s1);
        hashMap2 = findingCharRepetitionsInAString.calculateRepetitions(s2);

        Set set1 = hashMap1.entrySet();
        Set set2 = hashMap2.entrySet();

        Iterator iterator1 = set1.iterator();
        Iterator iterator2 = set2.iterator();

        while(iterator1.hasNext()){
            Map.Entry entry1 = (Map.Entry)iterator1.next();

            if(!iterator2.hasNext()) {
                System.out.println("extra character present in the second String");
                System.exit(0);
            }

            Map.Entry entry2 = (Map.Entry)iterator2.next();

            System.out.println(entry1.getKey() + " " + entry2.getKey());


            if (entry1.getKey() != entry2.getKey()) {
                System.out.println("extra character present in one of the String");
                System.exit(0);
            } else if(entry1.getValue() != entry2.getValue()){
                    System.out.println("Count of characters present in different in both the String");
                System.exit(0);
            }
        }
        System.out.println("Yes they are anagrams");
    }

}
