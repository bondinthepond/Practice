import DataStructures.Trees.BST.BST;
import DataStructures.Trees.TreeNode;

/**
 * Created by aditya.mullela on 31/01/17.
 */
public class Main3 {

    public static void main(String[] args) {

        BST<Integer> binarySearchTree = new BST();


        binarySearchTree.put(3);
        binarySearchTree.put(1);
        binarySearchTree.put(2);
        binarySearchTree.put(0);

//        System.out.println(binarySearchTree.findMinElement(root).data);

        binarySearchTree.put(5);
        binarySearchTree.put(6);
        binarySearchTree.put(4);

        TreeNode root = binarySearchTree.getRootNode();

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
    }

    }

