package Patterns;

public class SpiralPattern {

    static void printSpiralMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int left = 0, right = m-1, top = 0, down = n-1;
        while (left<=right && top<=down) {
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;
            for (int i = top; i <= down; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;
            if (top <= down) {
                for (int i = right; i >= left; i--) {
                    System.out.print(mat[down][i] + " ");
                }
                down--;
            }
            if (left <= right) {
                for (int i = down; i >= top; i--) {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        printSpiralMatrix(mat);
    }
}
