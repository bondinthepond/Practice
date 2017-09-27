package SortingAlgos;

/**
 * Created by aditya.mullela on 04/11/16.
 */
public class MergeSort {

    private Integer[] array;
    private Integer[] helper;

    private int length;

    public Integer[] doMergeSort (Integer[] inputArray) {

        if(inputArray == null || inputArray.length == 0) {
            return null;
        }

        this.array = inputArray;

        length = inputArray.length;

        this.helper = new Integer[length];

        mergeSortBetween (0 , length-1);

        return inputArray;
    }

    public void mergeSortBetween(int low, int high) {

        System.out.println("Merger Sort Between " + low + " and " + high);
        if (low < high) {

            int middle = low + (high - low) / 2;

            mergeSortBetween(low, middle);

            mergeSortBetween(middle + 1, high);

            merge(low, middle, high);
        }
    }

    public void merge (int low, int middle, int high) {
        System.out.println("Merger Low " + low + " high " + high + " mid " + middle);
        for(int i = low;  i<=high; i++) {
            helper[i] = array[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;

        while(i<= middle && j <= high){

            if(helper[i] <= helper[j]) { //to sort in descending order, change the comparision operator
                array[k] = helper[i];
                i++;
            } else {
                array[k] = helper[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            array[k] = helper[i];
            k++;
            i++;
        }
        }
}
