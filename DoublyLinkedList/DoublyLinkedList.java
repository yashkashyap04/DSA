package DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList () {
        head = null; tail = null; size = 0;
    }

    public void addToHead (int value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        else {
            head = newNode;
            tail = newNode;
        }
        size++;
    }

    public void addToTail (int value) {
        Node newNode = new Node(value);
        if (tail != null) {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
        }
        else {
            head = newNode;
            tail = newNode;
        }
        size++;
    }

    public void addToIndex(int value, int index) {
        if (index >= 0 && index <= size) {
            Node newNode = new Node(value);
            if (head != null) {
                int fCount = 0; int rCount = size - 1;
                
                Node tailTracker = tail, headTracker = head;
                while (fCount != index - 1 && rCount != index - 1) {
                    headTracker = headTracker.getNext(); fCount++;
                    tailTracker = tailTracker.getPrevious(); rCount++;
                }

                if (fCount == index - 1) {
                    newNode.setNext(headTracker.getNext());
                    newNode.setPrevious(headTracker);
                    newNode.getNext().setPrevious(newNode);
                    headTracker.setNext(newNode);
                }

                else if (rCount == index - 1) {
                    newNode.setPrevious(tailTracker.getPrevious());
                    newNode.setNext(tailTracker);
                    newNode.getPrevious().setNext(newNode);
                    tailTracker.setPrevious(newNode);
                }
                size++;
            }
            else {
                addToHead(value);
            }
        }
        else {
            System.out.println("Invalid Index.");
        }
    }

    public void removeFromHead () {
        if (head != null) {
            head = head.getNext();
            if (head != null) {
                head.getPrevious().setNext(null);
                head.setPrevious(null);
            }
            size --;
        }
        else {
            System.out.println("Underflow!");
        }
    }

    public void removeFromTail () {
        if (tail != null) {
            tail = tail.getPrevious();
            if (tail != null) {
                tail.getNext().setPrevious(null);
                tail.setNext(null);
            }

            size --;
        }
        else {
            System.out.println("Underflow");
        }
    }

    public void removeFromIndex (int index) {
        if (head != null) {
            if (index >= 0 && index < size) {
                if (index == 0) {
                    removeFromHead();
                }
                else if (index == size - 1) {
                    removeFromTail();
                }
                else {
                    int fCount = 1, rCount = size - 2;
                    Node headTracker = head.getNext(), tailTracker = tail.getPrevious();
                    while (fCount != index && rCount != index) {
                        headTracker = headTracker.getNext(); fCount++;
                        tailTracker = tail.getNext(); rCount--;
                    }
                    if (fCount == index) {
                        headTracker.getPrevious().setNext(headTracker.getNext());
                        headTracker.getNext().setPrevious(headTracker.getPrevious());
                        headTracker.setNext(null);
                        headTracker.setPrevious(null);
                    }
                    if (rCount == index) {
                        tailTracker.getPrevious().setNext(tailTracker.getNext());
                        tailTracker.getNext().setPrevious(tailTracker.getPrevious());
                        tailTracker.setNext(null);
                        tailTracker.setPrevious(null);
                    }
                    size--;
                }
            }
            else {
                System.out.println("Invalid Index.");
            }
        }
        else {
            System.out.println("Underflow!");
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
        else {
            System.out.println("Empty List.");
        }
    }
}
