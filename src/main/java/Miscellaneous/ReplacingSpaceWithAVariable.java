package Miscellaneous;

/**
 * Created by aditya.mullela on 18/11/16.
 */
public class ReplacingSpaceWithAVariable {

    public void replaceSpace(String s){

        char[] charArray = s.toCharArray();

        int spaceCount = 0, newLength;

        for (int i = 0; i < s.length(); i++) {
            if (charArray[i] == ' ') {
                spaceCount++;
            }
        }

        newLength = charArray.length + spaceCount * 2;

        char[] newCharArray = new char[newLength];

        int k = 0;
        for (int j = 0; j < charArray.length; j++) {
            if (charArray[j] == ' ') {
                newCharArray[k] = '%';
                newCharArray[k+1] = '2';
                newCharArray[k+2] = '0';
                k = k+3;
            } else {
                newCharArray[k] = charArray[j];
                k++;
            }
        }

        System.out.println(String.valueOf(newCharArray));
    }
}
