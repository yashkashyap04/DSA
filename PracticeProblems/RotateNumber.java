package PracticeProblems;

import java.util.Scanner;

public class RotateNumber {

    public static int rotateNumber (int number, int factor) {
        int arrayedNumber[] = NumberUtils.numberToArray(number);
        int size = arrayedNumber.length;

        if (factor < 0) {
            factor = size + (factor % size);
        }

        else {
            factor = factor % size;
        }

        int i = size - factor;
        int j = 0;

        int [] rotated = new int[size];
        do {
            rotated[j] = arrayedNumber[i];
            i = (i + 1) % size; j++;
        } while (i != size - factor);

        return NumberUtils.arrayToNumber(rotated);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        System.out.println("Enter the rotation factor: ");
        int factor = scanner.nextInt();

        int rotated = rotateNumber(number, factor);

        System.out.println("Rotated number: " + rotated);

        scanner.close();
    }
}
