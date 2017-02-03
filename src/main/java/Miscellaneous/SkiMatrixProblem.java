package Miscellaneous;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by aditya.mullela on 31/01/17.
 */
public class SkiMatrixProblem {

    public static class Cell {

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getCurrentRow() {
            return currentRow;
        }

        public void setCurrentRow(int currentRow) {
            this.currentRow = currentRow;
        }

        public int getCurrentColumn() {
            return currentColumn;
        }

        public void setCurrentColumn(int currentColumn) {
            this.currentColumn = currentColumn;
        }

        int value;

        int currentRow;
        int currentColumn;

        Cell[] adjacentCells = new Cell[4];

        //left, right, up, down

        public void populateAdjacentCells(int totalRows, int totalColumns, Cell[][] matrix) {
            if (currentColumn == 0) {
                adjacentCells[0] = null;
            } else {
                adjacentCells[0] = matrix[currentRow][currentColumn - 1];
            }

            if (currentColumn == totalColumns - 1) {
                adjacentCells[1] = null;
            } else {
                adjacentCells[1] = matrix[currentRow][currentColumn + 1];
            }

            if (currentRow == 0) {
                adjacentCells[2] = null;
            } else {
                adjacentCells[2] = matrix[currentRow - 1][currentColumn];
            }

            if (currentRow == totalRows - 1) {
                adjacentCells[3] = null;
            } else {
                adjacentCells[3] = matrix[currentRow + 1][currentColumn];
            }
        }

        public Cell findLowestCell() {

            Cell lowestCell;
            if(adjacentCells[0] != null)
                lowestCell = adjacentCells[0];
            else
                lowestCell = adjacentCells[1];

            int i = 1;
            while(adjacentCells[i]!= null && i<adjacentCells.length){
                if (adjacentCells[i].getValue() < lowestCell.getValue()) {
                    lowestCell = this.adjacentCells[i];
                }
                i++;
            }
            return lowestCell;
        }
    }

    public static void main(String[] args) {

        int rows = 0;
        int columns = 0;
        Cell[][] matrixOfArea = null;
        try {
            Scanner scan = new Scanner(System.in);

            rows = scan.nextInt();
            columns = scan.nextInt();

            matrixOfArea = new Cell[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrixOfArea[i][j] = new Cell();
                    matrixOfArea[i][j].value = scan.nextInt();
                    matrixOfArea[i][j].setCurrentRow(i);
                    matrixOfArea[i][j].setCurrentColumn(j);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        matrixOfArea = fillUpAllFieldsOfTheMatrix(matrixOfArea);

        findLongestPath(matrixOfArea);
    }

    public static Cell[][] fillUpAllFieldsOfTheMatrix(Cell[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j].populateAdjacentCells(matrix.length, matrix[i].length, matrix);
            }
        }
        return matrix;
    }

    public static void findLongestPath(Cell[][] matrixOfArea) {

        ArrayList<Cell> tempPath = new ArrayList<Cell>();
        ArrayList<Cell> finalPath = new ArrayList<Cell>();

        for (int i = 0; i < matrixOfArea.length; i++) {
            for (int j = 0; j < matrixOfArea[i].length; j++) {

                Cell lowestCell = matrixOfArea[i][j];
                int maxLength = finalPath.size();

                while (lowestCell != null) {
                    tempPath.add(lowestCell);
                    lowestCell = lowestCell.findLowestCell();
                }
            }
        }
        for (int i = 0; i < tempPath.size(); i++) {
            System.out.println(tempPath.get(i));
        }
    }
}

