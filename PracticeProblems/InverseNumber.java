package PracticeProblems;

import java.util.Scanner;

public class InverseNumber {

    public static int inverseNumber (int number) {
        int arrayedNumber[] = NumberUtils.numberToArray(number);
        int size = arrayedNumber.length;

        int inversedArray[] = new int[size];

        for (int i = 0; i < size; i++) {
            inversedArray[arrayedNumber[(size - 1) - i] - 1] = i + 1;
        }

        int inversedNumber = NumberUtils.arrayToNumber(inversedArray);
        return inversedNumber;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int inversed = inverseNumber(number);

        System.out.println("Reverse of " + number + " is " + inversed);
        scanner.close();
    }
}
