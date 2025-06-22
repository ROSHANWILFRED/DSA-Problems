package Sorting;

import java.util.Arrays;

public class InsertionSort {

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1;i<n;i++) {
            int j = i;
            while (j>=1 && arr[j-1]>arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        insertionSort(arr);
    }
}
