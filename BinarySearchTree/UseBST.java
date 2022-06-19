package BinarySearchTree;

import java.util.Scanner;

public class UseBST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BST tree = new BST();
        int choice;

        do {
            System.out.println("MENU");
            System.out.println("1. INSERT");
            System.out.println("2. DELETE");
            System.out.println("3. SEARCH");
            System.out.println("4. PREORDER");
            System.out.println("5. POSTORDER");
            System.out.println("6. INORDER");

            System.out.println("\nENTER CHOICE: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter the value to be inserted: ");
                    tree.insertNode(tree.getRootNode(), scanner.nextInt());
                }; break;

                case 2: {
                    System.out.println("Enter the value to be deleted: ");
                    tree.deleteNode(tree.getRootNode(), scanner.nextInt());
                }; break;

                case 3: {
                    System.out.println("Search value: ");
                    System.out.println(tree.isPresent(tree.getRootNode(), scanner.nextInt()));
                }; break;

                case 4: {
                    System.out.print("Preorder: ");
                    tree.preOrderTraversal(tree.getRootNode());
                    System.out.println();
                }; break;

                case 5: {
                    System.out.print("Postorder: ");
                    tree.postOrderTraversal(tree.getRootNode());
                    System.out.println();
                }; break;

                case 6: {
                    System.out.print("Inorder: ");
                    tree.inOrderTraversal(tree.getRootNode());
                    System.out.println();
                }; break;
            }
        } while (choice >= 1 && choice <= 6);
        scanner.close();
    }
}
