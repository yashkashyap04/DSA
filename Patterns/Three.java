package Patterns;

import java.util.Scanner;

public class Three {

    public static void printPattern (int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("N: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        printPattern(n);

        scanner.close();
    }
}
