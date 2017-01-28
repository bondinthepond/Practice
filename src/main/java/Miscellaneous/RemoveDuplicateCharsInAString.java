package Miscellaneous;

/**
 * Created by aditya.mullela on 06/11/16.
 */
public class RemoveDuplicateCharsInAString {

    public void removeDuplicates(String inputString) {

        if (inputString == null && inputString.length() == 1)
            return;

        System.out.println(inputString);

        char[] inputChar = inputString.toCharArray();

        int n = inputChar.length;

        int tail = 1;

        for(int x = 1; x<n; x++){
            int y;
            for(y=0; y<tail ; y++) {
                if (inputChar[x] == inputChar[y])
                    break;
            }
            System.out.println("1 :" + String.valueOf(inputChar));
                if(y == tail){
                    inputChar[tail] = inputChar[x];
                    tail++;
                }
            System.out.println("2 : " + String.valueOf(inputChar));
            }
            inputChar[tail] = 0;
        System.out.println("final :" + String.valueOf(inputChar));
//        char key;
//
//       for(int i = 0; i< n; i++){
//           key = inputChar[keyLocation];
//           if(key != 0) {
//               key = inputChar[keyLocation];
//               System.out.println("Key =" + key);
//
//               for (int j = i+1; j < n; j++) {
//
//                   if (inputChar[j] == key) {
//                       inputChar[j] = 0;
//                   }
//                   System.out.println(String.valueOf(inputChar));
//               }}
//           keyLocation++;
//           System.out.println(String.valueOf(inputChar));
//           }
//            System.out.println(String.valueOf(inputChar));
//
//        char[] outputChar = new char[n];
//        int k = 0;
//        for (int l=0; l<n; l++) {
//            if(inputChar[l] != 0){
//                outputChar[k] = inputChar[l];
//                k++;
//            }
//
//            System.out.println(String.valueOf(outputChar));
//        }

//        HashMap<Character, Integer> hashMapChar = new HashMap<Character, Integer>();
//
//        for (char c: inputChar) {
//
//            if (hashMapChar.containsKey(c))
//                hashMapChar.put(c, hashMapChar.get(c)+1 );
//            else
//                hashMapChar.put(c, 1);
//        }
//
//        Set keySet = hashMapChar.keySet();
//
//        ArrayList<Character> arrayList = new ArrayList();
//        Iterator i = keySet.iterator();
//
//
//        while(i.hasNext()){
//            arrayList.add((Character) i.next());
//        }
//
//        char[] newCharArray = new char[arrayList.size()];
//
//        for (int j =0 ; j<arrayList.size(); j++) {
//            newCharArray[j] = arrayList.get(j);
//        }
//
//        System.out.println(new String(newCharArray));
        }
    }
