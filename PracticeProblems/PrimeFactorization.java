package PracticeProblems;

import java.util.Scanner;

public class PrimeFactorization {
    public static void primeFactorization (int number) {
        int primeFactor = 2;
        while (number > 1) {
            if (NumberUtils.isPrime(primeFactor) && number % primeFactor == 0) {
                number = (int)(number / primeFactor);
                System.out.print(primeFactor + " ");
            }
            else {
                primeFactor = primeFactor % 2 == 0 ? primeFactor + 1 : primeFactor + 2;
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        primeFactorization(number);

        scanner.close();
    }
}
