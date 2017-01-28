package DataStructures;

/**
 * Created by aditya.mullela on 08/11/16.
 */
public class SinglyLinkedList<T> {

    private OneEndNode headNode;
    private OneEndNode tailNode;

    public void add(T element){
        OneEndNode<T> node = new OneEndNode<T>();
        node.setValue(element);
        System.out.println("Adding Element" + element);

        if(headNode == null){
            headNode = node;
            tailNode = node;
        } else {
            tailNode.setNextNode(node);
            tailNode = node;
        }
    }

    public void deleteFront(){

        if(headNode == null){
            System.out.println("LnkedList Empty");
        }

        OneEndNode<T> tempNode = headNode;
        headNode = headNode.getNextNode();
        if(headNode == null){
            tailNode = null;
        }
        System.out.println("Deleted Value" + tempNode.getValue());
    }


}
