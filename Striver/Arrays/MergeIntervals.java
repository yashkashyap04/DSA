package Striver.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class SortByFirstValue implements Comparator<int[]> {

    @Override
    public int compare(int[] o1, int[] o2) {
        return o1[0] - o2[0];
    }
    
}

class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> mergedIntervals = new ArrayList<>();
        int top = 0;
        
        Arrays.sort(intervals, new SortByFirstValue());
        mergedIntervals.add(intervals[0]);
        
        for (int i = 1; i < intervals.length; i++) {
            if (mergedIntervals.get(top)[1] >= intervals[i][0]) {
                int low = mergedIntervals.get(top)[0];
                int high = 0;
                
                if (mergedIntervals.get(top)[1] > intervals[i][1]) {
                    high = mergedIntervals.get(top)[1];
                }
                else {
                    high = intervals[i][1];
                }
                
                int[] common = {low, high};
                mergedIntervals.set(top, common);
            }
            else {
                mergedIntervals.add(intervals[i]); top++;
            }
        }
        
        
        int [][] mergedArray = new int [mergedIntervals.size()][2];
        for (int i = 0; i < mergedArray.length; i++)
            mergedArray[i] = mergedIntervals.get(i);
        return mergedArray;
    }

    public static void main(String[] args) {
        MergeIntervals object = new MergeIntervals();
        int[][] intervals = {
            {1,4}, {0,4}
        };
        object.merge(intervals);
        for (int i[]: object.merge(intervals)) {
            System.out.println(i[0] + " " + i[1]);
        }
    }
}