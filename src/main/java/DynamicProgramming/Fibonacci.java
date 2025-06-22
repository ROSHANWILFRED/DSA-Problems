package DynamicProgramming;

import java.util.Arrays;

public class Fibonacci {

    static int fibo(int[] dp,int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        if (dp[n]!=0) return dp[n];
        dp[n] = fibo(dp,n-1) + fibo(dp,n-2);
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        System.out.println(fibo(dp,n));

    }
}
