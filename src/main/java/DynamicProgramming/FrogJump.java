package DynamicProgramming;

public class FrogJump {

    static int frogJump(int[] height,int n,int[] dp) {
        if (n==0) return 0;
        if (n==1) return Math.abs(height[1]-height[0]);
        if (dp[n]!=0) return dp[n];
        int s1 = Math.abs(height[n]-height[n-1]) + frogJump(height,n-1,dp);
        int s2 = Math.abs(height[n]-height[n-2]) + frogJump(height,n-2,dp);
        dp[n] = Math.min(s1,s2);
        return dp[n];
    }

    static int tabulationFrogJump(int[] height, int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = Math.abs(height[1]-height[0]);
        for (int i = 2; i<=n;i++) {
            int s1 = Math.abs(height[i]-height[i-1]) + dp[i-1];
            int s2 = Math.abs(height[i]-height[i-2]) + dp[i-2];
            dp[i] = Math.min(s1,s2);
        }
        return dp[n];
    }

    static int frogJumpKSteps(int[] height,int[] dp,int n,int k) {
        if (n==0) return 0;
        if (dp[n]!=0) return dp[n];
        int min = Integer.MAX_VALUE;
        for (int i = 1;i<=k;i++) {
            if (n-i>=0) {
                int energy = Math.abs(height[n]-height[n-i]) + frogJumpKSteps(height,dp,n-i,k);
                min = Math.min(min,energy);
            }
        }
        dp[n] = min;
        return dp[n];
    }

    public static void main(String[] args) {
        int[] height = {10,30,40,50,20};
        int n = 5;
        System.out.println(frogJump(height,n-1,new int[n]));
        System.out.println(frogJumpKSteps(height,new int[n],n-1,3));
    }
}
