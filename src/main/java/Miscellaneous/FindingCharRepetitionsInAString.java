package Miscellaneous;

import java.util.HashMap;

/**
 * Created by aditya.mullela on 06/11/16.
 */
public class FindingCharRepetitionsInAString {

    public HashMap<Character, Integer> calculateRepetitions(String inputString) {

        char[] charArray = inputString.toCharArray();

        HashMap<Character, Integer> characterIntegerMap = new HashMap<Character, Integer>();

        for (char c : charArray) {

            if (characterIntegerMap.containsKey(c)) {
                characterIntegerMap.put(c, characterIntegerMap.get(c) + 1);
            } else {
                characterIntegerMap.put(c, 1);
            }

        }

        System.out.println(characterIntegerMap);

//        Set set = characterIntegerMap.entrySet();
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//        Map.Entry count = (Map.Entry) iterator.next();
//            System.out.println(count.getKey());
//            System.out.println(count.getValue());
//        }
    return characterIntegerMap;
    }
    }
