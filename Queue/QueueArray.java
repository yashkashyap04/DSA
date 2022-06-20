package Queue;

public class QueueArray {
    private int front;
    private int rear;
    private int array[];
    private int size;

    public QueueArray (int max) {
        this.size = 0;
        front = -1; rear = -1;
        array = new int[max];
    }

    public void enqueue (int value) {
        if (rear == array.length - 1) {
            System.out.println("Overflow!");
        }
        else {
            array[++rear] = value;
            if (rear == 0)
                front = rear;
            size++;
        }
    }

    public int dequeue () {
        if (front == -1) {
            System.out.println("Underflow!");
            return -999;
        }
        else {
            int value = array[front++];
            size--;
            if (front > rear) {
                rear = -1;
                front = -1;
            }
            return value;
        }
    }

    public int peek () {
        if (front == -1) {
            System.out.println("Empty Queue.");
            return -999;
        }
        else {
            return array[front];
        }
    } 

    public void displayQueue () {
        if (front != -1) {
            for (int i = front; i <= rear; i++) {
                System.out.print(array[i] + " - ");
            }
        }
        else {
            System.out.println("Empty Queue.");
        }
    }

    public int getSize() {
        return size;
    }
}
