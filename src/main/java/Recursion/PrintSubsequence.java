package Recursion;

import java.util.ArrayList;

public class PrintSubsequence {

    static void printSubsequence(int[] arr, int index, ArrayList<Integer> list) {
        if (index>=arr.length) {
            if (list.isEmpty()) return;
            System.out.println(list);
            return;
        }
        int num = arr[index];
        list.add(num);
        printSubsequence(arr,index+1,list);
        list.remove(list.size()-1);
        printSubsequence(arr,index+1,list);
    }

    static void printSubsequenceWithSum(int[] arr, int index, ArrayList<Integer> list,int target) {
        if (index>=arr.length) {
            if (target==0) {
                System.out.println(list);
            }
            return;
        }
        int num = arr[index];
        list.add(num);
        printSubsequenceWithSum(arr,index+1,list,target-num);
        list.remove(list.size()-1);
        printSubsequenceWithSum(arr,index+1,list,target);
    }

    static int countSubsequenceWithSum(int[] arr, int index, ArrayList<Integer> list,int target) {
        if (index>=arr.length) {
            if (target==0) {
                return 1;
            }
            return 0;
        }
        int num = arr[index];
        list.add(num);
        int left = countSubsequenceWithSum(arr,index+1,list,target-num);
        list.remove(list.size()-1);
        int right = countSubsequenceWithSum(arr,index+1,list,target);
        return left+right;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        printSubsequenceWithSum(arr,0,new ArrayList<>(),10);
        System.out.println(countSubsequenceWithSum(arr,0,new ArrayList<>(),10));
    }
}
