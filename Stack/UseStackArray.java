package Stack;

import java.util.Scanner;

public class UseStackArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the desired size of stack: ");
        StackArray stack = new StackArray(scanner.nextInt());

        System.out.println();

        int choice;

        do {
            System.out.println("MENU: ");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. PEEK");
            System.out.println("4. DISPLAY");
            
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter the value to be pushed: ");
                    stack.push(scanner.nextInt());
                }; break;
                
                case 2: {
                    int value = stack.pop();
                    if (value != -999) {
                        System.out.println("Value Deleted: " + value);
                    }
                }; break;

                case 3: {
                    int value = stack.peek();
                    if (value != -999) {
                        System.out.println("Value on top: " + value);
                    }
                }; break;

                case 4: {
                    stack.displayStack();
                }
            }
        } while (choice >= 1 && choice <= 4);

        scanner.close();
    }
}
