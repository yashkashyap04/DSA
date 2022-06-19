package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int array [] = {8,2,5,3,1,4,9};
        sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int j = i + 1;
            int minIndex = i;
            while (j < array.length) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
                j++;
            }
            array[minIndex] = array[i];
            array[i] = min;
        }
    }
}
