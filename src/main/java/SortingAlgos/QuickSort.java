package SortingAlgos;

/**
 * Created by aditya.mullela on 03/11/16.
 */
public class QuickSort {

    private Integer[] array;

    public Integer[] doQuickSort (Integer[] inputArray) {

        if(inputArray == null || inputArray.length == 0) {
            return null;
        }

        this.array = inputArray;

        int length = inputArray.length;

        quickSortBetween (0 , length-1);

        return inputArray;
    }

    public void quickSortBetween (int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];

        while(i <= j) {

            while (array[i] < pivot) {  //change the comparision operators to sort in a descending order
                i++ ;
            }
            while (array[j] > pivot) { //change the comparision operators to sort in a descending order
                j--;
            }
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }

        if (lowerIndex < j)
            quickSortBetween(lowerIndex, j);
        if (i < higherIndex)
            quickSortBetween(i, higherIndex);
    }

    private void exchange(int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
