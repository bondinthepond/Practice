//import BasicUtils.PrintArrayUtil;
//import DataStructures.HashMaps;
//import Miscellaneous.*;
//import SortingAlgos.*;
//import TypesOfInputs.ProcessCharInput;
//import TypesOfInputs.ProcessIntegerInput;
//import TypesOfInputs.ProcessStringInput;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
///**
// * Created by aditya.mullela on 03/11/16.
// */
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//
//        ProcessIntegerInput processIntegerInput = new ProcessIntegerInput();
//        ProcessCharInput processCharInput = new ProcessCharInput();
//        ProcessStringInput processStringInput = new ProcessStringInput();
//
//        PrintArrayUtil printArrayUtil = new PrintArrayUtil();
//
//        QuickSort quickSort = new QuickSort();
//        MergeSort mergeSort = new MergeSort();
//        BubbleSort bubbleSort = new BubbleSort();
//        SelectionSort selectionSort = new SelectionSort();
//        InsertionSort insertionSort = new InsertionSort();
//        HashMaps hashMaps = new HashMaps();
//        FindingCharRepetitionsInAString findingCharRepetitionsInAString = new FindingCharRepetitionsInAString();
//        RemoveDuplicateCharsInAString removeDuplicateCharsInAString = new RemoveDuplicateCharsInAString();
//        NthEvenFibonacciNumber nthEvenFibonacciNumber = new NthEvenFibonacciNumber();
//        FindingCharRepetitions2 findingCharRepetitions2 = new FindingCharRepetitions2();
//        AnagramsStrings anagramsStrings = new AnagramsStrings();
//        ReplacingSpaceWithAVariable replacingSpaceWithAVariable = new ReplacingSpaceWithAVariable();
//
//
//        String command = "continue";
//        while(!command.equals("exit")) {
//        System.out.println("Select the type of input : \n"  + "1 for Integer \n" +
//                "2 for Characters \n" + "3 for ArrayOfStrings \n" + "4 for Just 1 String \n" + "5 for Just 1 number");
//
//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//
//        String optionSelected = input.readLine();
//        System.out.println("You selected :" + optionSelected);
//
//        switch (Integer.parseInt(optionSelected)) {
//
//            case 1:
//                Integer[] arrayOfIntegers = processIntegerInput.getIntegerArray();
//
//
//                break;
//
//            case 2:
//                Character[] arrayOfCharacters = processCharInput.getCharArray();
//
//                printArrayUtil.printCharArray(arrayOfCharacters);
//
//                break;
//
//            case 3:
//                String[] arrayOfStrings = processStringInput.getStringArray();
//                anagramsStrings.findIfStringsAreAnagrams(arrayOfStrings[0], arrayOfStrings[1]);
//
//                break;
//
//            case 4:
//
//                String inputString = processStringInput.getString();
////                boolean boo =  findingCharRepetitions2.isUniqueChar2(inputString);
////                System.out.println(boo);
////                findingCharRepetitionsInAString.calculateRepetitions(inputString);
//                replacingSpaceWithAVariable.replaceSpace(inputString);
//                break;
//
//            case 5:
//                int inputInter = processIntegerInput.getSingleInteger();
//                        nthEvenFibonacciNumber.evenFibonacciNumberAtN(inputInter);
//
//                break;
//
//            default:
//
//                String miscellaneousInputString = processStringInput.getString();
//                printArrayUtil.printString(processStringInput.getString());
//
//                break;
//        }
//
//            System.out.println ("Continue Further ? y or n");
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//            if (reader.readLine().equals("n"))
//            command = "exit";
//        }
//    }
//}
