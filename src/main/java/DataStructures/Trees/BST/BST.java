package DataStructures.Trees.BST;

import DataStructures.Trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by aditya.mullela on 01/02/17.
 */

//No Duplicates
public class BST<T extends Comparable<T>> {

    private TreeNode<T> root;

    public void putRootNode(T value) {

        if(root == null) {
            root = new TreeNode<T>(value);
        } else {
            System.out.println(" Already a root present, adding as a node in the tree");
            put(root, value);
        }
    }

    public TreeNode getRootNode(){
        return root;
    }

    public void put(T value) {
        if (root == null){
            putRootNode(value);
        } else {
            root = put(root, value);
        }
    }



    public TreeNode put(TreeNode currentNode, T value) {

        if (currentNode == null) return new TreeNode(value);

        if (currentNode.data.compareTo(value) > 0)
            currentNode.left = put(currentNode.left, value);
        else if (currentNode.data.compareTo(value) < 0)
            currentNode.right = put(currentNode.right, value);
        else
            currentNode.data =  value;
        return currentNode;
    }

    public TreeNode findMinElement(TreeNode root){

        if (root.left == null)
            return root;
        else
            return findMinElement(root.left);
    }

    public TreeNode findMaxElement(TreeNode root){

        if(root.right == null)
            return root;
        else
            return findMaxElement(root.right);
    }
//    public TreeNode get(T value){
//    //Cost of searching for a key = 1 + depth of the node compare
//        TreeNode x = root;
//        while (x != null){
//            if(x.data.compareTo(value) < 0)
//                x = x.left;
//            else if(x.data.compareTo(value) < 0)
//                x = x.right;
//            else return x;
//        }
//        return null;
//    }



    public void delete(T value){

        TreeNode currentNode = root;
        while(currentNode.data.compareTo(value) != 0) {
            if (currentNode.data.compareTo(value) > 0) {
                currentNode = currentNode.left;
            } else if (currentNode.data.compareTo(value) < 0) {
                currentNode = currentNode.right;
            }
        }

        if(currentNode.right == null && currentNode.left == null) {
            currentNode = null;
        } else if(currentNode.right != null && currentNode.left == null) {
            currentNode = currentNode.right;
        } else if(currentNode.left != null && currentNode.right == null) {
            currentNode = currentNode.left;
        } else if(currentNode.right != null && currentNode.left != null) {

            TreeNode temp = currentNode;
            TreeNode minNodeOnRight = findMinElement(temp.right);
            currentNode.data = minNodeOnRight.data;
            delete((T) currentNode.right.data);
        }
    }

    public void printInOrder(TreeNode root){
        // left, centre, right

        if(root == null){
            return;
        }
        printInOrder(root.left);
        System.out.println(root.data);
        printInOrder(root.right);
    }

    public void printPostOrder(TreeNode root){
        //left, right, centre

        if(root == null){
            return;
        }

        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.println(root.data);
    }

    public void printPreOrder(TreeNode root){
        //centre, left, right
        if(root == null){
            return;
        }

        System.out.println(root.data);
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public void printLevelOrder(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
            System.out.println(tempNode.data);
            if(tempNode.left!=null)
                queue.add(tempNode.left);
            if(tempNode.right!=null)
                queue.add(tempNode.right);
        }
    }

    public void printSpiralOrder(TreeNode root){

//        O(n) time and O(n) extra space

        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();

        stack1.push(root);


        while(!stack1.isEmpty() || !stack2.isEmpty()){

            while(!stack1.isEmpty()){
                TreeNode tempNode = stack1.pop();

                System.out.println(tempNode.data);

                if(tempNode.left != null)
                stack2.push(tempNode.left);

                if(tempNode.right != null)
                stack2.push(tempNode.right);
            }

            while(!stack2.isEmpty()){
                TreeNode tempNode = stack2.pop();

                System.out.println(tempNode.data);

                if(tempNode.right != null)
                    stack1.push(tempNode.right);

                if(tempNode.left != null)
                    stack1.push(tempNode.left);

            }
        }

    }

    public void printBoundary(TreeNode root){

        if (root != null)
        {
            System.out.print(root.data + " ");

            // Print the left boundary in top-down manner.
            printBoundaryLeft(root.left);

            // Print all leaf nodes
            printLeaves(root.left);
            printLeaves(root.right);

            // Print the right boundary in bottom-up manner
            printBoundaryRight(root.right);
        }
    }

    public void printBoundaryLeft(TreeNode node){

        if (node != null) {

            if (node.left != null) {

                System.out.print(node.data + " ");

                printBoundaryLeft(node.left);

            } else if (node.right != null) {

                System.out.print(node.data + " ");

                printBoundaryLeft(node.right);
            }
        }
    }

    public void printBoundaryRight(TreeNode node)
    {
        if (node != null) {

            if (node.right != null) {

                printBoundaryRight(node.right);

                System.out.print(node.data + " ");

            } else if (node.left != null) {

                printBoundaryRight(node.left);

                System.out.print(node.data + " ");
            }
        }
    }

    public void printLeaves(TreeNode node) {

        if (node != null)
        {
            printLeaves(node.left);

            if (node.left == null && node.right == null) System.out.print(node.data + " ");

            printLeaves(node.right);
        }
    }

    public int findHeight(TreeNode node){

        int height;

        if(node == null) {
            return 0;
        } else {

            int leftDepth = findHeight(node.left);
            int rightDepth = findHeight(node.right);

            if(leftDepth > rightDepth) height = leftDepth + 1;
            else height = rightDepth + 1;
        }
        return height;
    }

    public void printNodeAtLevel(int height, TreeNode node){

        if(node == null) {
            return;
        } if(height == 0) {
            System.out.println(node.data);
            return;
        } else {
            printNodeAtLevel(height-1, node.left);
            printNodeAtLevel(height-1, node.right);
        }
    }

    public int findLevelOfGivenNode(TreeNode root, TreeNode node, int level) {

        if (root == null) {
            return 0;
        } if(root.data == node.data) {
            return level;
        }

        int result = findLevelOfGivenNode(root.left, node, level + 1);

        if(result!=0) {
            return result;
        }

        result = findLevelOfGivenNode(root.right, node, level+1);
        return result;
    }
}
