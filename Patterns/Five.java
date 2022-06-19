package Patterns;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        System.out.print("N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPattern(n);
        scanner.close();
    }

    private static void printPattern(int n) {
        int n1 = (int)(n / 2);
        int n2 = n - n1;

        for (int i = 1; i <= n2; i++) {
            for (int j = i; j < n2; j++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            for (int j = 1; j < i; j++)
                System.out.print("* ");
            System.out.println();
        }

        for (int i = 1; i <= n1; i++) {
            System.out.print("  ");
            for (int j = 1; j < i; j++)
                System.out.print("  ");
            for (int j = i; j <= n1; j++)
                System.out.print("* ");
            for (int j = i; j < n1; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
