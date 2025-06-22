package Arrays;

import java.util.HashMap;

public class LongestSubArrayWithSum {

    static int longestSubArrayWithSum(int[] arr, int target) {
        int max = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<arr.length;i++) {
            sum+=arr[i];
            if (sum == target) {
                max = i + 1;
            }
            if (map.containsKey(sum-target)) {
                int len = i - map.get(sum-target);
                if (len>max) {
                    max = len;
                }
            }
            if (!map.containsKey(sum)) {
                map.put(sum,i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 3, 1, 1, 2, 1, 4};
        int target = 9;
        System.out.println(longestSubArrayWithSum(arr,target));
    }
}
