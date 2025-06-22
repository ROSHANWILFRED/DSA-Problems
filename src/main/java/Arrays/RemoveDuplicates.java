package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {

    static void removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1;j<arr.length;j++) {
            if (arr[i]!=arr[j]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println(i+1);
        System.out.println(Arrays.toString(arr));
    }

    static void shiftZeroToEnd(int[] arr) {
        int i = 0;
        for (int j = 0;j<arr.length;j++) {
            if (arr[j]!=0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {2,2,4,4,5,5,5};
        removeDuplicates(arr);
        int[] arr1 = {0,0,3,0,5,0,0,7,0};
        shiftZeroToEnd(arr1);
    }
}
