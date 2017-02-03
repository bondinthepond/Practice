package Miscellaneous;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aditya.mullela on 31/01/17.
 */
public class SpiralTraversalOfMatrix {

    public static void traverseMatrixInASpiralOrder(int[][] matrix){

        if(matrix.length == 0)
            return;
        // Initialize our four indexes
        int top = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;


        while (true) {

            // Print top row
            for(int j = left; j <= right; j++)
                System.out.print(matrix[top][j] + " ");
            top++;

            if (top > down || left > right) break;

            //Print the rightmost column
            for(int i = top; i <= down; i++)
                System.out.print(matrix[i][right] + " ");
            right--;

            if (top > down || left > right) break;

            //Print the bottom row
            for(int j = right; j >= left; --j)
                System.out.print(matrix[down][j] + " ");
            down--;

            if (top > down || left > right) break;

            //Print the leftmost column
            for(int i = down; i >= top; --i)
                System.out.print(matrix[i][left] + " ");
            left++;
            if(top > down || left > right) break;
        }
    }

    public static void traverseMatrixInASpiral(List<ArrayList<Integer>> a){
        ArrayList<Integer> result = new ArrayList<Integer>();
        // Populate result;
        int top = 0;
        int down = a.size();
        int left = 0;
        int right = a.get(0).size();

        while(true){

            for(int j = left; j <= right; j++)
                System.out.print(a.get(top).get(j) + " ");
            top++;

            if (top > down || left > right) break;

            //Print the rightmost column
            for(int i = top; i <= down; i++)
                System.out.print(a.get(i).get(right) + " ");
            right--;

            if (top > down || left > right) break;

            //Print the bottom row
            for(int j = right; j >= left; --j)
                System.out.print(a.get(down).get(j) + " ");
            down--;

            if (top > down || left > right) break;

            //Print the leftmost column
            for(int i = down; i >= top; --i)
                System.out.print(a.get(i).get(left) + " ");
            left++;
            if(top > down || left > right) break;
        }
        }
    }

