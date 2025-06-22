package DynamicProgramming;

public class HouseRob {

    static int houseRob(int[] arr,int n, int[] dp) {
        if (n==0) return arr[0];
        if (n==1) return Math.max(arr[0],arr[1]);
        if (dp[n]!=0) return dp[n];
        int pick = arr[n] + houseRob(arr,n-2,dp);
        int notPick = houseRob(arr,n-1,dp);
        dp[n] = Math.max(pick,notPick);
        return dp[n];
    }

    static int tabulationHouseRob(int[] arr,int n) {
        int[] dp = new int[n+1];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        for (int i = 2;i<=n; i++) {
            int pick = arr[i] + dp[i-2];
            int notPick = dp[i-1];
            dp[i] = Math.max(pick,notPick);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int[] arr = {20,40,10,50};
        int n = 4;
        System.out.println(houseRob(arr,n-1,new int[n]));
        System.out.println(tabulationHouseRob(arr,n-1));
    }
}
