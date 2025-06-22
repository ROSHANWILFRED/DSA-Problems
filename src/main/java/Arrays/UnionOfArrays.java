package Arrays;

import java.util.ArrayList;

public class UnionOfArrays {

    static void unionOfArrays(int[] arr1,int[] arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr1.length;
        int m = arr2.length;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (ans.isEmpty() || !ans.get(ans.size() - 1).equals(arr1[i]))
                    ans.add(arr1[i]);
                i++;
            }
            else {
                if (ans.isEmpty() || !ans.get(ans.size() - 1).equals(arr2[j]))
                    ans.add(arr2[j]);
                j++;
            }
        }

        while (j < m) {
            if (ans.isEmpty() || !ans.get(ans.size() - 1).equals(arr2[j]))
                ans.add(arr2[j]);
            j++;
        }

        while (i < n) {
            if (ans.isEmpty() || !ans.get(ans.size() - 1).equals(arr1[i]))
                ans.add(arr1[i]);
            i++;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 3, 4, 5, 6, 6, 7};
        int[] arr2 = {4, 5, 6, 7, 8, 8};
        unionOfArrays(arr1,arr2);
    }
}
