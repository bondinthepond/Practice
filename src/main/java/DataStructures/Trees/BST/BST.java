package DataStructures.Trees.BST;

/**
 * Created by aditya.mullela on 01/02/17.
 */
public class BST {

    private class Node {

        private int key;
        private String value;

        private Node left, right;

        public Node(int key, String value)
        {
            this.key = key;
            this.value = value;
        }
    }
    private Node root;

    public void put(int key, String value){
        root = put(root, key, value);
    }

    private Node put(Node currentNode, int key, String value) {

        if (currentNode == null) return new Node(key, value); //

        if (currentNode.key < key)
            currentNode.left = put(currentNode.left, key, value);
        else if (currentNode.key > key)
            currentNode.right = put(currentNode.right, key, value);
        else
            currentNode.value = value;
        return currentNode;
    }


    public String get(int key){
    //Cost of searching for a key = 1 + depth of the node compare
        Node x = root;
        while (x != null){
            if(key < x.key)
                x = x.left;
            else if(key > x.key)
                x = x.right;
            else return x.value;
        }
        return null;
    }

    public Node findMinElement(Node root){

        if (root.left == null)
            return root;
        else
         return findMinElement(root.left);
    }

    public void delete(int key){

        Node currentNode = root;
        while(currentNode.key != key) {
            if (key < currentNode.key) {
                currentNode = currentNode.left;
            } else if (key > currentNode.key) {
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

            Node temp = currentNode;
            Node minNodeOnRight = findMinElement(temp.right);
            currentNode.value = minNodeOnRight.value;
            delete(currentNode.right.key);
        }
    }
}
