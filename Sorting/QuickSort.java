package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int array [] = {8,2,5,3,1,4,9};
        sort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static int partition (int[] array, int start, int end) {
        int pivot = array[start];
        int i = start, j = end;
        while (i < j) {
            do {
                i++;
            } while (array[i] <= pivot);

            do {
                j--;
            } while (array[j] > pivot);

            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[start];
        array[start] = array[j];
        array[j] = temp;
        
        return j;
    }

    public static void sort (int array[], int start, int end) {
        if (start < end) {
            int index = partition(array, start, end);
            sort(array, start, index);
            sort(array, index + 1, end);
        }
    }
}
