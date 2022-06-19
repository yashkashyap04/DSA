package Stack;

public class StackArray {
    private int top;
    private int array[];
    private int size;

    public StackArray (int size) {
        this.size = size;
        array = new int [size];
        top = -1;
    }

    public void push (int value) {
        if (top == size - 1) {
            System.out.println("Overflow!");
        }
        else {
            array[++top] = value;
        }
    }

    public int pop () {
        if (top == -1) {
            System.out.println("Underflow!");
            return -999;
        }
        int value = array[top--];
        return value;
    }

    public int peek () {
        if (top == -1) {
            System.out.println("Empty Stack");
            return -999;
        } 
        return array[top];
    }

    public void displayStack () {
        if (top != -1) {
            for (int i = 0; i <= top; i++) {
                System.out.print(array[i] + " > ");
            }
            System.out.println("TOP");
        }
        else {
            System.out.println("Empty Stack.");
        }
    }
}
