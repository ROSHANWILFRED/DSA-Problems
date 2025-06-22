package Searching;

public class LinearSearch {

    static int linearSearch(int[] arr, int target) {
        for (int i = 0;i<arr.length;i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2};
        System.out.println(linearSearch(arr,6));
        System.out.println(linearSearch(arr,4));
    }
}
