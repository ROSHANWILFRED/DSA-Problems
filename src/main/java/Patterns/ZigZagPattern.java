package Patterns;

public class ZigZagPattern {

    static void printZigZag(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        for (int d = 0; d < n + m - 1; d++) {
            int row, col;

            if (d % 2 == 0) {
                row = (d < n) ? d : n - 1;
                col = d - row;

                while (row >= 0 && col < m) {
                    System.out.print(mat[row][col] + " ");
                    row--;
                    col++;
                }
            } else {
                col = (d < m) ? d : m - 1;
                row = d - col;

                while (col >= 0 && row < n) {
                    System.out.print(mat[row][col] + " ");
                    row++;
                    col--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        printZigZag(mat);
    }
}
