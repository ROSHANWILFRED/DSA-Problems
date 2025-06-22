package Recursion;

import java.util.Arrays;

public class ReverseAndPalindrome {

    static void reverse(int index,int[] arr, int n) {
        if (index >= n/2) return;
        int temp = arr[index];
        arr[index] = arr[n-index-1];
        arr[n-index-1] = temp;
        reverse(index+1,arr,n);
    }

    static boolean palindrome(int i,String s) {
        int n = s.length();
        if (i>=n/2) return true;
        if (s.charAt(i) != s.charAt(n-i-1)) return false;
        return palindrome(i+1,s);
    }

    public static void main(String[] args) {
        int[] arr = {1,4,7,5,2,1};
        reverse(0,arr,arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(palindrome(0,"level"));
    }
}
