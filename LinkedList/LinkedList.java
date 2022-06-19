package LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;

    private int size;

    public LinkedList () {
        head = null;
        tail = null;
        size = 0;
    }

    public void addToHead (int value) {
        if (head != null) {
            Node newNode = new Node (value);
            newNode.setNext(head);
            head = newNode;
        }
        else {
            head = new Node (value);
            tail = head;
        }
        size++;
    }

    public void addToTail (int value) {
        if (tail != null) {
            Node newNode = new Node (value);
            tail.setNext (newNode);
            tail = newNode;
        }
        else {
            tail = new Node (value);
            head = tail;
        }
        size++;
    }

    public void addToIndex (int value, int index) {
        if (index >= 0 && index <= size) {
            Node newNode = new Node (value);

            if (head == null) {
                addToHead(value);
            }
            
            else {
                Node curr = head;
                int count = 0;
                while (count <= index - 2) {
                    curr = curr.getNext();
                    count++;
                }
    
                newNode.setNext(curr.getNext());
                curr.setNext(newNode);
            }

            size++;
        }
        else {
            System.out.println("Invalid Index.");
        }
    }

    public boolean removeFromHead () {
        if (head != null) {
            Node temp = head;
            head = head.getNext();
            temp.setNext(null);

            size--;

            return true;
        }
        else {
            return false;
        }
    }

    public boolean removeFromTail () {
        if (tail != null) {
            Node curr = head;
            while (curr.getNext() != tail) {
                curr = curr.getNext();
            }
            tail = curr;
            curr.setNext(null);

            size--;

            return true;
        }
        else {
            return false;
        }
    }

    public boolean removeFromIndex (int index) {
        if (head != null && index >= 0 && index <= size) {
            if (index == 0)
                removeFromHead();
            else {
                Node prev = null;
                Node curr = head;
                int count = 0;

                while (count < index) {
                    prev = curr;
                    curr = curr.getNext();
                    count++;
                }

                prev.setNext(curr.getNext());
                curr.setNext(null);

                size--;
            }
            return true;
        }
        else {
            return false;
        }
    }

    public void displayList () {
        if (head != null) {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.getData() + " -> ");
                curr = curr.getNext();
            }
            System.out.println("NULL");
        }
        else 
            System.out.println("Empty list.");
    }

    public Node getHeadNode () {
        return this.head;
    }

    public Node getTailNode () {
        return this.tail;
    }
}