package Sorting;

import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            int minIndex = i;
            for (int j = i;j<n;j++) {
                if (arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,1,5,2,4,3};
        selectionSort(arr);
    }
}
