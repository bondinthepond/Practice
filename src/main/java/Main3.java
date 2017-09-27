import Miscellaneous.Employee;
import SortingAlgos.MergeSort;

import java.util.*;

/**
 * Created by aditya.mullela on 31/01/17.
 */
public class Main3 {

    public static void main(String[] args) {

//        BST<Integer> binarySearchTree = new BST();
//
//
//        binarySearchTree.put(3);
//        binarySearchTree.put(1);
//        binarySearchTree.put(2);
//        binarySearchTree.put(0);
//
////        System.out.println(binarySearchTree.findMinElement(root).data);
//
//        binarySearchTree.put(5);
//        binarySearchTree.put(6);
//        binarySearchTree.put(4);


//        binarySearchTree.printInOrder(root);
//
//        binarySearchTree.printPreOrder(root);

//        binarySearchTree.printLevelOrder(root);

//        binarySearchTree.printBoundaryLeft(root);

//        binarySearchTree.printBoundaryRight(root);

//        binarySearchTree.printBoundary(root);

//        System.out.println(binarySearchTree.findMaxElement(root).data);
//
//        System.out.println(binarySearchTree.findMinElement(root).data);

//        System.out.println(binarySearchTree.findHeight(root));

//        TreeNode node = new TreeNode(1);
//
//        System.out.println(binarySearchTree.findLevelOfGivenNode(root, node, 0));

//        MergeSort mergeSort = new MergeSort();
//
//        Integer[] inputArray = {2, 5,1,6,3,7};
//
//        Integer[] outputarray = mergeSort.doMergeSort(inputArray);
//
//        for(int i = 0; i< outputarray.length; i++) {
//            System.out.println(outputarray[i]);
//        }

        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        Date date1 = new Date();

        Employee employee1 = new Employee("aditya", 1770000, new Date(2011, 11, 24));
        Employee employee2 = new Employee("tridisha", 1870000, new Date(2011, 12, 24));
        Employee employee3 = new Employee("aditya", 1770000, new Date(24/1/2011));
        Employee employee4 = new Employee("tridish", 2770000, new Date(24/12/2011));

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        Collections.sort(employeeList);

        for (int i = 0 ; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i).toString());
        }

    }

    }

