package DynamicProgramming;

public class UniquePath {

    static int uniquePath(int i,int j,int[][] grid,int[][] dp) {
        if (i<0 || j<0) return 0;
        if (grid[i][j]==-1) return 0;
        if (i==0 && j==0) return 1;
        if (dp[i][j]!=0) return dp[i][j];
        int right = uniquePath(i,j-1,grid,dp);
        int down = uniquePath(i-1,j,grid,dp);
        dp[i][j] = right + down;
        return dp[i][j];
    }

    public static void main(String[] args) {
        int i = 3;
        int j = 3;
        int[][] grid = {{0,0,-1},{-1,0,0},{-1,0,0}};
        int[][] dp = new int[i][j];
        System.out.println(uniquePath(i-1,j-1,grid,dp));
    }
}
