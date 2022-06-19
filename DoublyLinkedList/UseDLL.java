package DoublyLinkedList;

import java.util.Scanner;

public class UseDLL {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("MENU:");
            System.out.println("1. ADD TO HEAD");
            System.out.println("2. ADD TO TAIL");
            System.out.println("3. ADD TO INDEX");
            System.out.println("4. REMOVE FROM HEAD");
            System.out.println("5. REMOVE FROM TAIL");
            System.out.println("6. REMOVE FROM INDEX");
            System.out.println("7. DISPLAY LIST");
            
            System.out.print("\nENTER CHOICE: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter the value to be added: ");
                    int value = scanner.nextInt();
                    list.addToHead(value);
                }; break;

                case 2: {
                    System.out.print("Enter the value to be added: ");
                    int value = scanner.nextInt();
                    list.addToTail(value);
                }; break;

                case 3: {
                    System.out.print("Enter the value to be added: ");
                    int value = scanner.nextInt();
                    System.out.print("Enter the index: ");
                    int index = scanner.nextInt();
                    list.addToIndex(value, index);
                }; break;

                case 4: {
                    list.removeFromHead();
                }; break;

                case 5: {
                    list.removeFromTail();
                }; break;

                case 6: {
                    System.out.println("Enter the index: ");
                    int index = scanner.nextInt();

                    list.removeFromIndex(index);
                }; break;

                case 7: {
                    list.displayList();
                }
            }
        } while (choice <= 7 && choice >= 1);

        scanner.close();
    }
}
