package Arrays;

import java.util.*;

public class MergeInterval {

    static int[][] merge(int[][] intervals) {
        ArrayList<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int[] current = intervals[0];
        result.add(current);
        for (int[] interval : intervals) {
            int currentEnd = current[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
            if (nextStart<=currentEnd) {
                current[1] = Math.max(currentEnd,nextEnd);
            } else {
                current = interval;
                result.add(current);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3},
                {7, 10},
                {2, 6},
                {10, 18}
        };

        int[][] merged = merge(intervals);

        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
