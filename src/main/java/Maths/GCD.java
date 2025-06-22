package Maths;

public class GCD {

    static int findGCD(int a,int b) {
        if (b==0) {
            return a;
        }
        return findGCD(b,a%b);
    }

    static int findLCM(int a,int b) {
        return (a*b)/findGCD(a,b);
    }

    static int findGCDOfArray(int[] arr) {
        int result = arr[0];
        for (int i=1;i<arr.length;i++) {
            result = findGCD(result,arr[i]);
            if (result==1) {
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr= {5,10,15,20};
        System.out.println(findGCDOfArray(arr));
    }
}
