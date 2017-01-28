package SortingAlgos;

/**
 * Created by aditya.mullela on 05/11/16.
 */
public class BubbleSort {

    private int length;

    public Integer[] doBubbleSort(Integer[] array) {

        if(array == null || array.length == 0) {
            return null;
        }


        length = array.length;

        int temp;

        for(int j=0; j<length-1 ; j++){
        for (int i=0; i<length-j-1; i++) {
            if(array[i] > array[i+1]) {
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
            }
        }

        return array;
    }

    }
