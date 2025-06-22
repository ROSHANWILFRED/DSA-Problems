package DynamicProgramming;

import java.util.Arrays;

public class MinimumPathSum {

    static int minPath(int i, int j, int[][] grid, int[][] dp) {
        if (i < 0 || j < 0)
            return Integer.MAX_VALUE;

        if (i == 0 && j == 0)
            return grid[0][0];

        if (dp[i][j] != 0)
            return dp[i][j];

        int down = minPath(i - 1, j, grid, dp);
        int right = minPath(i, j - 1, grid, dp);

        dp[i][j] = grid[i][j] + Math.min(down, right);
        return dp[i][j];
    }

    public static void main(String[] args) {
        int i = 3;
        int j = 3;
        int[][] grid = {{2,5,7},{2,1,2},{7,3,6}};
        int[][] dp = new int[i][j];
        System.out.println(minPath(i-1,j-1,grid,dp));
        for (int[] num: dp) {
            System.out.println(Arrays.toString(num));
        }
    }
}
