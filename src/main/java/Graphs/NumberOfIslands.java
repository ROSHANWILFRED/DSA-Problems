package Graphs;

public class NumberOfIslands {

    static int countOfIslands(char[][] grid) {
        int count = 0;
        for (int r = 0; r<grid.length;r++) {
           for (int c = 0; c<grid[r].length;c++) {
               if (grid[r][c] == 'L') {
                   dfs(grid,r,c);
                   count++;
               }
           }
        }
        return count;
    }

    static void dfs(char[][] grid,int r,int c) {
        if (r<0 || c<0 || r>=grid.length || c>=grid[r].length || grid[r][c]!='L') {
            return;
        }
        grid[r][c] = 'V';

        // Vertically
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);

        // Horizontally
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);

        // Diagonally
        dfs(grid,r+1,c+1);
        dfs(grid,r-1,c-1);
        dfs(grid,r+1,c-1);
        dfs(grid,r-1,c+1);
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'L', 'L', 'W', 'W', 'W', 'L', 'W', 'W', 'L', 'L'},
                {'L', 'W', 'W', 'L', 'W', 'L', 'W', 'L', 'L', 'W'},
                {'W', 'W', 'L', 'L', 'W', 'W', 'W', 'W', 'W', 'W'},
                {'W', 'L', 'W', 'W', 'L', 'L', 'W', 'L', 'W', 'W'},
                {'L', 'W', 'W', 'L', 'L', 'W', 'W', 'W', 'W', 'W'},
                {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'L', 'L', 'L'},
                {'L', 'L', 'W', 'W', 'L', 'W', 'W', 'L', 'W', 'W'},
                {'L', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'L', 'L'},
                {'W', 'W', 'L', 'W', 'W', 'L', 'L', 'W', 'W', 'W'},
                {'L', 'W', 'W', 'W', 'W', 'W', 'W', 'L', 'W', 'W'}
        };
        System.out.println(countOfIslands(grid));
    }
}
