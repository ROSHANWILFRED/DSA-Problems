package Sorting;

import java.util.Arrays;

public class MergeSort {

    static void mergeSort(int[] arr, int left, int right) {
        if (left == right) return;
        int mid = (left+right)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int i = left;
        int j = mid+1;
        int k = 0;
        int n = right-left+1;
        int[] newArr = new int[n];
        while (i<=mid && j<=right) {
            if (arr[i]<arr[j]) {
                newArr[k] = arr[i];
                i++;
            } else {
                newArr[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
            newArr[k] = arr[i];
            k++;
            i++;
        }
        while (j<=right) {
            newArr[k] = arr[j];
            k++;
            j++;
        }
        System.arraycopy(newArr, 0, arr, left, n);
    }

    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
