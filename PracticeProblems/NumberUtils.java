package PracticeProblems;

public class NumberUtils {
    public static boolean isPrime (int number) {
        for (int i = 2; i < Math.sqrt(number); i++)
            if (number % i == 0)
                return false;
        return true;
    }

    public static int countDigits (int number) {
        int count = 0;
        while (number > 0) {
            number = (int)(number / 10);
            count++;
        }
        return count;
    }

    public static int arrayToNumber (int array[]) {
        int number = 0;

        for (int i = 0; i < array.length; i++) {
            number = number * 10 + array[i];
        }

        return number;
    }

    public static int[] numberToArray (int number) {
        int size = countDigits(number);
        int arrayed[] = new int[size];

        int index = size - 1;

        while (number > 0) {
            int remainder = number % 10;
            arrayed[index] = remainder;
            number = (int)(number / 10);

            index--;
        }

        return arrayed;
    }
}
