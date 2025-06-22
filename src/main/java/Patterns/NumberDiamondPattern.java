package Patterns;

public class NumberDiamondPattern {

    static void numberDiamondPattern(int n) {
        for (int i = 1;i<n;i++) {
            int currentNum = (i*(i+1))/2;
            for (int s = n; s>i;s--) {
                System.out.print(" ");
            }
            for (int j = 0;j<i;j++) {
                System.out.print(currentNum-- + " ");
            }
            System.out.println();
        }
        for (int i = n;i>=1;i--) {
            int currentNum = (i*(i+1))/2;
            for (int s = n; s>i;s--) {
                System.out.print(" ");
            }
            for (int j = 0;j<i;j++) {
                System.out.print(currentNum-- + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        numberDiamondPattern(n);
    }
}
