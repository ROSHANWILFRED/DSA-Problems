package Sorting;

import java.util.Arrays;

public class QuickSort {

    static int partition(int[] arr,int left,int right) {
        int i = left;
        int j = right;
        while (i<j) {
            while (arr[i]<=arr[left] && i<=right-1) {
                i++;
            }
            while (arr[j]>arr[left] && j>=1) {
                j--;
            }
            if (i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[left];
        arr[left] = arr[j];
        arr[j] = temp;
        return j;
    }

    static void quickSort(int[] arr, int left, int right) {
        if (left<right) {
            int par = partition(arr,left,right);
            quickSort(arr,left,par-1);
            quickSort(arr,par+1,right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,6,3,5,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
