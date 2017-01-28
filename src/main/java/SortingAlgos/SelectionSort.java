package SortingAlgos;

/**
 * Created by aditya.mullela on 05/11/16.
 */
public class SelectionSort {

    public Integer[] doSelectionSort(Integer[] integers){

        if(integers == null || integers.length == 0){
            return null;
        }

        for(int i = 0; i < integers.length; i++){

            int min_index = i;

            for(int j = i+1 ; j < integers.length; j++) {
                if (integers[j] < integers[min_index]) {
                    min_index = j;
                }
            }
                int temp = integers[min_index];
                integers[min_index] = integers[i];
                integers[i] = temp;
        }
        return integers;
    }

}
