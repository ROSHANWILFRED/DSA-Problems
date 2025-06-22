package Searching;

public class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid]<target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    static int missingNumber(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]!=mid+1) {
                if (mid==0 || arr[mid-1]==mid)
                    return mid+1;
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    static int firstOccurence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]==target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid]>target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int lastOccurence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]==target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid]>target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int squareRoot(int n) {
        if (n<=1) return n;
        int low = 0;
        int high = n;
        int ans = -1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (mid<=n/mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,4,6,7};
        System.out.println(squareRoot(6));
    }
}
