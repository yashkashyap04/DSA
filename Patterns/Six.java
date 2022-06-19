package Patterns;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        System.out.print("N: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        printPattern(n);

        scanner.close();
    }

// * * *   * * * 
// * *       * * 
// *           *
// * *       * *
// * * *   * * *
 
    private static void printPattern(int n) {
        int stars = n - (int)(n / 2);
        int spaces = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= stars; j++)
                System.out.print("* ");
            for (int j = 1; j <= spaces; j++)
                System.out.print("  ");
            for (int j = 1; j <= stars; j++)
                System.out.print("* ");
            System.out.println();

            if (i < n / 2.0) {
                spaces += 2;
                stars--;
            }
            else {
                spaces -= 2;
                stars++;
            }
        }
    }
}
