package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int array [] = {8,2,5,3,1,4,9};
        sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i]; 
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[++j] = key;
        }
    }
}
