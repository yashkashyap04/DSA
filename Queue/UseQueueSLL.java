package Queue;

import java.util.Scanner;

public class UseQueueSLL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        QueueSLL queue = new QueueSLL();

        int choice;

        do {
            System.out.println("MENU: ");
            System.out.println("1. ENQUEUE");
            System.out.println("2. DEQUEUE");
            System.out.println("3. PEEK");
            System.out.println("4. DISPLAY");
            
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter the value to be pushed: ");
                    queue.enqueue(scanner.nextInt());
                }; break;
                
                case 2: {
                    int value = queue.dequeue();
                    if (value != -999) {
                        System.out.println("Value Deleted: " + value);
                    }
                }; break;

                case 3: {
                    int value = queue.peek();
                    if (value != -999) {
                        System.out.println("Value on top: " + value);
                    }
                }; break;

                case 4: {
                    queue.displayQueue();
                }
            }
        } while (choice >= 1 && choice <= 4);
        scanner.close();
    }
}
