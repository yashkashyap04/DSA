package DoublyLinkedList;

public class Node {
    private int data;
    private Node previousNode;
    private Node nextNode;

    public Node (int value) {
        data = value;
        previousNode = null;
        nextNode = null;
    }

    public Node getPrevious () {
        return previousNode;
    }

    public Node getNext () {
        return nextNode;
    }

    public int getData () {
        return data;
    }

    public void setPrevious (Node node) {
        previousNode = node;
    }

    public void setNext (Node node) {
        nextNode = node;
    }
}
