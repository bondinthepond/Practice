package SortingAlgos;

/**
 * Created by aditya.mullela on 05/11/16.
 */
public class InsertionSort {

    public Integer[] doInsertionSort(Integer[] integers){

        if(integers == null || integers.length == 0){
            return null;
        }

        for(int i = 1; i < integers.length; i++) {

            int currentInteger = integers[i];
            int j = i - 1;

            while (j >= 0 && integers[j] > currentInteger) {

                integers[j + 1] = integers[j];
                j = j - 1;
            }

            integers[j + 1] = currentInteger;
        }
        return integers;
    }

}
