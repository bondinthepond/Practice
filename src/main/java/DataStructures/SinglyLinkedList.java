package DataStructures;

/**
 * Created by aditya.mullela on 08/11/16.
 */
public class SinglyLinkedList<T> {

    public OneEndNode getHeadNode() {
        if(headNode == null){
            System.out.println("its empty");
            return null;
        } else {
            System.out.println("Head Node : " + headNode.getData());
            return headNode;
        }
    }

    public void setHeadNode(OneEndNode headNode) {
        this.headNode = headNode;
    }

    public OneEndNode getTailNode() {
        System.out.println("Tail Node : " + tailNode.getData());
        return tailNode;
    }

    public void setTailNode(OneEndNode tailNode) {
        this.tailNode = tailNode;
    }

    private OneEndNode headNode;
    private OneEndNode tailNode;

    //traverse through list till node.next is null
    //then add new node to node.next
    public void insertAtTail(T element){
        OneEndNode<T> node = new OneEndNode<T>();
        node.setData(element);
        System.out.println("Adding Element" + element);

        if(headNode == null){
            headNode = node;
            tailNode = node;
        } else {
            tailNode.setNextNode(node);
            tailNode = node;
        }
    }

    public void insertAtHead(T element){
        OneEndNode<T> node = new OneEndNode<T>();
        node.setData(element);
        System.out.println("Adding Element" + element);

        if(headNode == null){
            headNode = node;
            tailNode = node;
        } else {
            node.setNextNode(headNode);
            headNode = node;
        }
    }

//    public void insertNewNodeAtTail(OneEndNode headNode, int data) {
//
//        OneEndNode node = new OneEndNode();
//        node.setData(data);
//        System.out.println("Adding Node " + node.getData());
//
//        if (headNode == null) {
//            headNode = node;
//
//        } else {
//            while (headNode.getNextNode() != null) {
//                headNode = headNode.getNextNode();
//            }
//            getHeadNode().setNextNode(node);
//        }
//    }
//
//    public void insertNewNodeAtHead(OneEndNode headNode, int data) {
//
//        OneEndNode node = new OneEndNode();
//        node.setData(data);
//        System.out.println("Adding Node " + node.getData());
//
//        if (headNode == null) {
//            setHeadNode(node);
//        } else {
//
//            node.setNextNode(headNode);
//            setHeadNode(node);
//        }
//    }
//
//    public void insertGivenNodeAtTail(OneEndNode headNode, OneEndNode node){
//
//        System.out.println("Adding Node " + node.getData());
//
//        if (headNode == null) {
//            setHeadNode(node);
//        } else {
//            while (headNode.getNextNode() != null) {
//                setHeadNode(getHeadNode().getNextNode());
//            }
//            getHeadNode().setNextNode(node);
//        }
//    }
//
//    public void insertGivenNodeAtHead(OneEndNode headNode, OneEndNode node){
//
//        System.out.println("Adding Node " + node.getData());
//
//        if (headNode == null) {
//            setHeadNode(node);
//        } else {
//
//            node.setNextNode(headNode);
//            setHeadNode(node);
//        }
//    }

    public void addElementAtIndex(T element, int index){
        int counter = 0;
        OneEndNode node = new OneEndNode();
        node.setData(element);

        if(headNode == null){
            System.out.println("Can't be added as no index");
            return;
        }
        OneEndNode tempNode = headNode;
        if(index < 0) {
            System.out.println(" Index should be greater than or equal to 0");
        } else if(index == 0){
            insertAtHead(element);
        } else {
            while(counter < index - 1){
                counter++;
                if(tempNode.getNextNode() == null){
                    System.out.println("Index out of Bounds");
                    return;
                } else {
                    tempNode = tempNode.getNextNode();
                }
            }

            node.setNextNode(tempNode.getNextNode());
            tempNode.setNextNode(node);
        }
    }

//    public void addNodeAtIndex(OneEndNode node, int index){
//        int counter = 0;
//
//        OneEndNode tempNode = headNode;
//        if(index < 0) {
//            System.out.println(" Index should be greater than or equal to 0");
//        } else if(index == 0){
//            insertNodeAtHead(node);
//        } else {
//            while(counter < index - 1){
//                counter++;
//                if(tempNode.getNextNode() == null){
//                    System.out.println("Index out of Bounds");
//                    return;
//                } else {
//                    tempNode = tempNode.getNextNode();
//                }
//            }
//
//            node.setNextNode(tempNode.getNextNode());
//            tempNode.setNextNode(node);
//        }
//    }

    public void deleteFront(){

        if(headNode == null){
            System.out.println("LinkedList Empty");
        }

        OneEndNode<T> tempNode = headNode;
        headNode = headNode.getNextNode();
        if(headNode == null){
            tailNode = null;
        }
        System.out.println("Deleted Value" + tempNode.getData());
    }

    public void deleteFromBack(){

        if(headNode == null){
            System.out.println("LinkedList Empty");
        }

        OneEndNode<T> tailNode = headNode;

        while(tailNode.getNextNode().getNextNode() != null){
            tailNode = tailNode.getNextNode();
        }

        System.out.println("Deleted Value" + tailNode.getNextNode().getData());
        tailNode.setNextNode(null);
    }

    public void printGivenHeadNode(OneEndNode head){

        if(head == null){

        } else {
            while(head!= null) {
                System.out.println(head.getData());
                head = head.getNextNode();
            }
        }
    }

    public void printEntireListGivenList(SinglyLinkedList singlyLinkedList){

        OneEndNode oneEndNode = singlyLinkedList.headNode;

        while(oneEndNode != null) {
            System.out.println(oneEndNode.getData());
            oneEndNode = oneEndNode.getNextNode();
        }
    }
}
