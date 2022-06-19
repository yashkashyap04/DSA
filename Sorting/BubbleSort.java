package Sorting;

public class BubbleSort {

    // 8 2 5 3 1 4 9
    public static void sort (int [] array) {
        for (int i = array.length - 1; i >= 0 ; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int array [] = {8,2,5,3,1,4,9};
        sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
