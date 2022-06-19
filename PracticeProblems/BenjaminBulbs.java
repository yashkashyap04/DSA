package PracticeProblems;

import java.util.Scanner;

public class BenjaminBulbs {
    
    public static int numToggledOn (int numBulbs) {
        return (int)(Math.sqrt(numBulbs));
    }
    
    public static void main(String[] args) {
        System.out.print("Enter the number of bulbs/fluctuations: ");
        Scanner scanner = new Scanner(System.in);

        int numBulbs = scanner.nextInt();
        System.out.println("Number of bulbs toggled on after " + numBulbs + " fluctuations: " + numToggledOn(numBulbs));
        scanner.close();
    }
}

// 0 0 0 0 0 0 0 0 0 0

// 1 1 1 1 1 1 1 1 1 1
// 1 0 1 0 1 0 1 0 1 0
// 1 0 0 0 1 1 1 0 0 0
// 1 0 0 1 1 1 1 1 0 0
// 1 0 0 1 0 1 1 1 0 1
// 1 0 0 1 0 0 1 1 0 1
// 1 0 0 1 0 0 0 1 0 1
// 1 0 0 1 0 0 0 0 0 1
// 1 0 0 1 0 0 0 0 1 1
// 1 0 0 1 0 0 0 0 1 0
