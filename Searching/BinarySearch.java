package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int array[] = {1, 34, 86, 347, 376, 439, 1902, 3495};
        int value = 439;
        int index = binarySearch(array, value, 0, array.length);
        System.out.println(index);
    }

    private static int binarySearch (int[] array, int value, int low, int high) {
        if (low < high) {
            int mid = (high + low) / 2;
            if (array[mid] == value)
                return mid;
            else if (array[mid] > value) {
                return binarySearch(array, value, low, mid);
            }
            else {
                return binarySearch(array, value, mid + 1, high);
            }
        }
        else {
            return -1;
        }
    }
}
