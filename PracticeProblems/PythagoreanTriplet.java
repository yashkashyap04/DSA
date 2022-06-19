package PracticeProblems;

import java.util.Scanner;

public class PythagoreanTriplet {

    public static boolean isPythagoreanTriplet (int a, int b, int c) {
        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        return (a * a + b * b + c * c == 2 * max * max);
    }

    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        System.out.println("Pythagorean Triplet? " + isPythagoreanTriplet (a, b, c));

        scanner.close();
    }
}
