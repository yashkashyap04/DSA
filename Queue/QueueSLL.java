package Queue;

import LinkedList.*;

public class QueueSLL {
    private LinkedList list;
    private Node front, rear;
    private int size;

    public QueueSLL () {
        list = new LinkedList();
        front = null; rear = null;
        size = 0;
    }

    public void enqueue (int value) {
        list.addToTail (value);
        front = list.getHeadNode();
        rear = list.getTailNode();
        size++;
    }
    
    public int dequeue () {
        if (rear != null) {
            int value = front.getData();
            list.removeFromHead();
            front = list.getHeadNode();
            rear = list.getTailNode();
            size--;
            return value;
        }
        else {
            System.out.println("Underflow.");
            return -999;
        }
    }

    public int peek () {
        if (front != null) {
            return front.getData();
        }
        else {
            System.out.println("Underflow.");
            return -999; 
        }
    }

    public boolean contains (int value) {
        Node curr = front;
        while (curr != null) {
            if (curr.getData() == value)
                return true;
            curr = curr.getNext();
        }
        return false;
    }

    public void displayQueue () {
        list.displayList();
    }

    public int getSize() {
        return size;
    }

    public Node getFront() {
        return front;
    }

    public Node getRear() {
        return rear;
    }
}
