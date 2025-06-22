package Patterns;

public class PascalTriangle {

    static void pascalTriangle(int n) {
        for (int i = 0;i<n;i++) {
            int val = 1;
            for (int s = 0;s<n-i-1;s++) {
                System.out.print(" ");
            }
            for (int j = 0;j<=i;j++) {
                System.out.print(val + " ");
                val = val * (i-j) / (j+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 10;
        pascalTriangle(n1);
        System.out.println();
        pascalTriangle(n2);
    }
}
