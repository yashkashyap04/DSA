package LinkedList;

public class Node {
    private int data;
    private Node next;

    public Node (int value) {
        data = value;
        next = null;
    }

    public void setNext (Node node) {
        this.next = node;
    }

    public int getData () {
        return data;
    }

    public Node getNext () {
        return next;
    }
}
