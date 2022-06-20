package Sorting;

import Queue.*;

public class RadixSort {
    public static void main(String[] args) {
        int array [] = {347, 3495, 439, 1902, 34, 86, 1, 376};
        sort(array, 4);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void sort(int[] array, int maxDigits) {
        QueueSLL bins [] = new QueueSLL [10];
        
        int factor = 1;
        while (factor < Math.pow(factor*10, maxDigits)) {
            for (int i = 0; i < bins.length; i++)
                bins[i] = new QueueSLL();

            for (int i = 0; i < array.length; i++) {
                int digit = (array[i] / factor) % 10;
                bins[digit].enqueue(array[i]);
            }
            factor *= 10;
            int k = 0;
            for (int i = 0; i < 10; i++) {
                while (bins[i].getSize() != 0) {
                    array[k++] = bins[i].dequeue();
                }
            }
        }
    }
}
