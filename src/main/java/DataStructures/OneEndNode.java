package DataStructures;

/**
 * Created by aditya.mullela on 08/11/16.
 */
public class OneEndNode<T> {

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public OneEndNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(OneEndNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    private T value;
    private OneEndNode<T> nextNode;
}
