package Arrays;

public class KadaneAlgorithm {

    static int maximumSumSubArray(int[] arr) {
        int currentMax = arr[0];
        int globalMax = arr[0];
        for (int i = 1;i<arr.length;i++) {
            currentMax = Math.max(arr[i],currentMax+arr[i]);
            globalMax = Math.max(currentMax,globalMax);
        }
        return globalMax;
    }

    static int maximumProductSubArray(int[] arr) {
        int maxProduct = arr[0];
        int minSoFar = arr[0];
        int maxSoFar = arr[0];
        for (int i = 1; i<arr.length; i++) {
            int current = arr[i];
            if (current<0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }
            maxSoFar = Math.max(current,maxSoFar*current);
            minSoFar = Math.min(current,minSoFar*current);
            maxProduct = Math.max(maxProduct,maxSoFar);
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -5, 4};
        System.out.println(maximumSumSubArray(nums));
        System.out.println(maximumProductSubArray(nums));
    }
}
