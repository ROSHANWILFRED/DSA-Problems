package Arrays;

public class SecondLargestElement {

    static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num>max) {
                secondMax = max;
                max = num;
            } else if (num>secondMax && num!=max) {
                secondMax = num;
            }
        }
        if (secondMax==Integer.MIN_VALUE) return max;
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr1 = {8,2,5,6,2,9};
        int[] arr2 = {5,5,4};
        System.out.println(secondLargest(arr1));
        System.out.println(secondLargest(arr2));
    }
}
