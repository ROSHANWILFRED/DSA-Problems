package Recursion;

public class BinarySearch {

    static int binarySearch(int[] arr, int low, int high,int target) {
        if (low>high) return -1;
        int mid = (low+high)/2;
        if (arr[mid]==target) return mid;
        if (arr[mid]<target) return binarySearch(arr,mid+1,high,target);
        if (arr[mid]>target) return binarySearch(arr,low,mid-1,target);
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n  = arr.length-1;
        System.out.println(binarySearch(arr,0,n,8));
        System.out.println(binarySearch(arr,0,n,5));
        System.out.println(binarySearch(arr,0,n,9));
    }
}
