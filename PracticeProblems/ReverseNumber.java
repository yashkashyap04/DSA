package PracticeProblems;

import java.util.Scanner;

public class ReverseNumber {

    public static int reverseNumber (int number) {
        int reversed = 0;

        while (number > 0) {
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = (int)(number / 10);
        }

        return reversed;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int reversed = reverseNumber(number);

        System.out.println("Reverse of " + number + " is " + reversed + ".");
        scanner.close();
    }
}
