package Arrays;

import java.util.ArrayList;

public class IntersectionOfArrays {

    static void intersectionOfArrays(int[] arr1,int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        int i = 0,j=0;
        while (i<n && j<m) {
            if (arr1[i]==arr2[j]) {
                result.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i]<arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 3, 4, 5, 6, 6, 7};
        int[] arr2 = {4, 5, 6, 7, 8, 8};
        intersectionOfArrays(arr1,arr2);
    }
}
