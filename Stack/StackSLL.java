package Stack;

import LinkedList.*;

public class StackSLL {
    private LinkedList list;
    private int size;
    private Node top;

    public StackSLL () {
        size = 0;
        top = null;
        list = new LinkedList();
    }

    public void push (int value) {
        list.addToHead(value);
        top = list.getHeadNode();
        size++;
    }

    public int pop () {
        if (top != null) {
            int value = top.getData();
            list.removeFromHead();
            top = list.getHeadNode();
            size--;
            return value;
        }
        else {
            System.out.println("Underflow!");
            return -999;
        }
    }

    public int peek () {
        if (top != null) {
            return top.getData();
        }
        else {
            System.out.println("Empty Stack!");
            return -999;
        }
    }

    public void displayStack () {
        list.displayList();
    }

    public int getSize() {
        return size;
    }
}
