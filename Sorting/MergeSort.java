package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int array [] = {8,2,5,3,1,4,9};
        sort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void sort (int array[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort (array, start, mid);
            sort (array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    // 8,2,5,3,1,4,9
    public static void merge (int array[], int start, int mid, int end) {
        int leftSize = mid - start + 1;
        int rightSize = end - mid;

        int leftArray[] = new int[leftSize];
        int rightArray[] = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = array[start + i];
        }

        for (int i = 0; i < rightSize; i++) {
            rightArray[i] = array[mid + 1 + i];
        }

        int i = 0, j = 0, k = start;
        for (; i < leftSize && j < rightSize; k++) {
            if (leftArray[i] <= rightArray[j])
                array[k] = leftArray[i++];
            else
                array[k] = rightArray[j++];
        }

        while (i < leftSize) {
            array[k] = leftArray[i];
            k++;
            i++;
        }

        while (j < rightSize) {
            array[k] = rightArray[j];
            k++;
            j++;
        }
    }    
}
