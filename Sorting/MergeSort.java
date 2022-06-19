package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int array [] = {8,2,5,3,1,4,9};
        int merged [] = sort(array, 0, array.length - 1);
        for (int i : merged) {
            System.out.print(i + " ");
        }
    }

    
}
